package com.zhuhong.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>Description: [HTTP返回]</p>
 * Created on 2019年09月04日
 * @author <a href="mailto: hexiaobo@camelotchina.com">贺小波</a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 */
@Getter
@Setter
@ToString
public class HttpResp implements Serializable {

    private static final long serialVersionUID = 5484010247103459372L;

    /**http状态码*/
    private String httpCode;

    /**错误描述*/
    private String errorMsg;

    /**响应字符集*/
    private String date;

}
