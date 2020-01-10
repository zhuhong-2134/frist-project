package com.zhuhong.enums;

/**
 * <p>Description: [用户编号]</p>
 * Created on 2020-01-10
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 **/
public enum UserCodeEnum  implements BaseEnum {

    /**用户编号**/
    USERCODE(1, "USERCODE");

    private Integer code;
    private String description;

    private UserCodeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     *
     * @Title: get
     * @Description: [根据code获取枚举]
     * @param @param code
     * @param @return    参数
     * @return StateEnum    返回类型
     * @throws
     */
    public static UserCodeEnum get(Integer code){
        if (code == null) {
            return null;
        }
        for (UserCodeEnum e : UserCodeEnum.values()) {
            if (code == e.getCode()) return e;
        }
        return null;
    }

    /**
     *
     * @Title: get
     * @Description: [根据description获取枚举]
     * @param @param description
     * @param @return    参数
     * @return StateEnum    返回类型
     * @throws
     */
    public static UserCodeEnum get(String description) {
        if (description == null || description.trim().length() == 0) {
            return null;
        }
        for (UserCodeEnum e : UserCodeEnum.values()) {
            if (e.getDescription().equals(description)) return e;
        }
        return null;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
