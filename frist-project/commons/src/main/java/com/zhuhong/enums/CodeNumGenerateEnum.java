package com.zhuhong.enums;

import java.util.EnumSet;

/**
 * <p>Description: [单据编号生成前缀]</p>
 * Created on 2019/11/14 
 * @author  <a href="mailto: cuichunsong@camelotchina.com">崔春松 </a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 */

public enum CodeNumGenerateEnum {
	NETWORK("WD","incr:network:wd","网点编码"),
	MENU("CD","incr:menu:cd","菜单编码"),
	DATA_BLOCK("SJK","incr:dataBlock:sjk","数据块编码"),
	WORK_BENCH("GZT","incr:workbench:gzt","工作台编码"),
	TEMPORARY_ADJUSTMENT("LSTG","incr:temporaryadjustment:lstg","临时调岗编码"),
	PROXY_CONFIG("DL","incr:proxyconfig:dl","代理配置编码");


	private String code;
	private String key;
	private String description;

	CodeNumGenerateEnum(String code, String key, String description) {
		this.code = code;
		this.key = key;
		this.description = description;
	}

	public static String get(CodeNumGenerateEnum key) {
		for (CodeNumGenerateEnum model : EnumSet.allOf(CodeNumGenerateEnum.class)) {
			if (key == model) {
				return model.key;
			}
		}
		return null;
	}

	/**
	 * 根据Code查找枚举
	 * @param code
	 * @return
	 */
	public static CodeNumGenerateEnum getByCode(String code) {
		if (code == null || code.trim().length() == 0) {
			return null;
		}
		code = code.toUpperCase();
		for (CodeNumGenerateEnum e : CodeNumGenerateEnum.values()) {
			if (e.getCode().equals(code)) {
				return e;
			}
		}
		return null;
	}

	public String getKey() {
		return this.key;
	}

	public String getDescription() {
		return this.description;
	}

	public String getCode(){
		return this.code;
	}
}
