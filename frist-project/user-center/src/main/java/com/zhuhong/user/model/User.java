package com.zhuhong.user.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>Description: [用户实体类]</p>
 * Created on 2020-01-08
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 **/
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -2612211407584244194L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 账号
     */
    private String userName;

    /**
     * 称呼
     */
    private String personName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户编码
     */
    private String userCode;

    /**
     * 会员等级
     */
    private Integer vip;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mailbox;

    /**
     * 1 未启用 0 启用
     */
    private Integer state;

    /**
     * 版本号 乐观锁
     */
    private Integer var;

    /**
     * 删除标识 1 删除 0 未删除
     */
    private Integer delSta;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String updateBy;

}
