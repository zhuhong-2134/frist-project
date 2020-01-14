package com.zhuhong.constants;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 按主键查询的基类
 *
 * @author 应颂浩
 */
@Data
public class QueryIdBaseReq implements Serializable {

    private static final long serialVersionUID = -3373778355213462264L;

    /** 主键 */
    @NotNull(message = "未选择对象")
    private Long id;
}
