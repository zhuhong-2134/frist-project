package com.zhuhong.user.exception;

/**
 * <p>
 * Description: [自定义异常编码]
 * </p>
 * Created on 2019-11-01
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0 Copyright (c) 2019 北京柯莱特科技有限公司
 */
public enum ErrorCodeEnum {

    /**
     * 系统异常
     */
    GENERAL_EXCEPTION(100001, "系统异常"),

    PASSWORD_IS_NOT_NULL(100002,"密码不能为空"),

    USERNAME_IS_NOT_NULL(100003,"账号不能为空"),

    PASSWORD_USERNAME_IS_INCORRECT(100004,"账号或密码不正确"),

    PHONE_INCORRECT_FORMAT(100005,"手机号格式不正确"),

    ;


    private Integer code;

    private String description;

    ErrorCodeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    /**
     * 根据编码查询枚举。
     *
     * @param value 编码
     * @return
     */
    public static String getDescription(Integer value) {
        ErrorCodeEnum[] businessModeEnums = values();
        for (ErrorCodeEnum businessModeEnum : businessModeEnums) {
            if (businessModeEnum.getCode().equals(value)) {
                return businessModeEnum.getDescription();
            }
        }
        return "不知名错误(" + value + "),系统异常";
    }
}
