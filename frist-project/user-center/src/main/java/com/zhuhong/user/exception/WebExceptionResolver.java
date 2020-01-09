package com.zhuhong.user.exception;

import com.alibaba.fastjson.JSON;
import com.zhuhong.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * Description: [统一异常处理]
 * </p>
 * Created on 2019-11-01
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0 Copyright (c) 2019 北京柯莱特科技有限公司
 */
@Slf4j
@Component
public class WebExceptionResolver implements HandlerExceptionResolver {

    /**
     * 请求响应头
     */
    private static final String JSON_CONTENT_TYPE = "application/json;charset=UTF-8";

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        String url = request.getRequestURL().toString();
        try {
            response.setStatus(HttpStatus.OK.value());
            response.setCharacterEncoding("UTF-8");
            response.setContentType(JSON_CONTENT_TYPE);

            Result result = new Result();

            if (ex instanceof BusinessException) {
                result.setCode(((BusinessException) ex).getCode());
                result.setMsg(ex.getMessage());
            } else {
                result.setCode(ErrorCodeEnum.GENERAL_EXCEPTION.getCode());
                result.setMsg(ErrorCodeEnum.GENERAL_EXCEPTION.getDescription());

            }
            log.error("异常日志, url:{}" + url, ex);
            response.getWriter().println(JSON.toJSONString(result));
            response.getWriter().flush();
            response.getWriter().close();
        } catch (Exception e) {
            log.error("unknow exception, url:{}" + url, e);
        }

        return new ModelAndView();
    }
}
