package com.zhuhong.constants;

/**
 * <p>Description: [系统常量]</p>
 * Created on 2019年08月16日
 * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 */
public final class SysConstant {

    /**系统人员ID*/
    public static final Long SYS_USER_ID = 0L;

    /**系统操作*/
    public static final String SYS_USER_NAME = "系统操作";

    /**数值为-1L*/
    public static final Long NEGATIVE_ONE = -1L;

    /**数值为-1*/
    public static final int MINUS_ONE = -1;

    /**数值为0*/
    public static final int ZERO = 0;

    /**数值为1*/
    public static final int ONE = 1;

    /**数值为2*/
    public static final int TWO = 2;

    /**数值为3*/
    public static final int THREE = 3;

    /**数值为4*/
    public static final int FOUR = 4;

    /**数值为5*/
    public static final int FIVE = 5;

    /**数值为6*/
    public static final int SIX = 6;

    /**数值为7*/
    public static final int SEVEN = 7;

    /**数值为8*/
    public static final int EIGHT = 8;

    /**数值为9*/
    public static final int NINE = 9;

    /**数值为10*/
    public static final int TEN = 10;

    /**数值为30*/
    public static final int THIRTY = 30;

    /**数值为60*/
    public static final int SIXTY = 60;
    
    /**数值为15*/
    public static final int FIFTEEN = 15;

    /**数值为1000*/
    public static final int ONE_THOUSAND = 1000;

    /**数值为2000*/
    public static final int TWO_THOUSAND = 2000;

    /**数值为1500*/
    public static final int ONE_THOUSAND_FIVE_HUNDRED = 1500;

    /**数值为60000*/
    public static final int SIXTY_THOUSAND = 60000;

    /**字节长度1024*/
    public static final int BYTE_LENGTH = 1024;

    /**字节纠正256*/
    public static final int BYTE_CORRECT = 256;

    /**数值为201*/
    public static final int TWO_HUNDRED_AND_ONE = 201;

    /**数值为200*/
    public static final int TWO_HUNDRED = 200;

    /**系统编码redis缓存key*/
    public static final String CODEYMDREDISKEY = "SYS_CODE_YMD_REDIS_KEY";

	public static final String WORKFLOW_USER = "workflowUser";
	/**默认分页pageSize*/
    public static final Integer PAGE_SIZE=20;
    /**常量类禁止new创建*/
    private SysConstant() {
        super();
    }

}
