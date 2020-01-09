package com.zhuhong.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>Description: [时间段比较实体类]</p>
 * Created on 2019/11/28 
 * @author  <a href="mailto: cuichunsong@camelotchina.com">崔春松 </a>
 * @version 1.0
 * Copyright (c) 2019 北京柯莱特科技有限公司
 */
@Data
public class DateCompare implements Serializable {

	private Date startDate;

	private Date endDate;

	private Long startTime;

	private Long endTime;

	public Long getStartTime(){
		return startDate.getTime();
	}
	public Long getEndTime(){
		return endDate.getTime();
	}
}
