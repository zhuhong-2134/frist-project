package com.zhuhong.common;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Description: [查询分页对象]
 * </p>
 * Created on 2019-08-22
 *
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0 Copyright (c) 2019 北京柯莱特科技有限公司
 */
@Data
public class QueryPage implements Serializable {
    private static final long serialVersionUID = -5726901340988594316L;
    //开始页数
    private int startPage = 0;
    //每页展示条数
    private int pageSize = 10;
    //开始条数
    private int startPageNum;

    public int getStartPageNum() {
        return (startPage-1) * pageSize;
    }

}
