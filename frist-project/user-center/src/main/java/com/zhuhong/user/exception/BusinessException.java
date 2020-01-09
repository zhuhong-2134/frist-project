package com.zhuhong.user.exception;

import lombok.Data;

/**
 * <p>
 * Description: [自定义异常类]
 * </p>
 * Created on 2019-11-01
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0 Copyright (c) 2019 北京柯莱特科技有限公司
 */
@Data
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -4761252579069229045L;

    private Integer code;

    /**
     * 校验参数或者查询结果无果是可用该方法抛出
     *
     * @param message 自定义异常信息
     * @param code    自定义异常编码
     */
    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * 校验参数或者查询结果无果是可用该方法抛出
     *
     * @param errorCodeEnum 自定义异常编码
     */
    public BusinessException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getDescription());
        this.code = errorCodeEnum.getCode();
    }

    /**
     * 捕获异常时可用该方法将异常抛出
     *
     * @param message 自定义异常信息
     * @param cause   异常信息
     * @param code    自定义异常编码
     */
    public BusinessException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

}
