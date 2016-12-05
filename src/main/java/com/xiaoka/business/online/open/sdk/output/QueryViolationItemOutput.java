/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * Author:  忽忽(huhu)
 * Date:    16/6/5 下午3:10
 * Description: 
 */
package com.xiaoka.business.online.open.sdk.output;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 违章查询输出参数-违章明细
 * 
 * @author huskar
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryViolationItemOutput {

	/** 违章编码 */
	private String code;

	/** 违章时间 */
	private String time;

	/** 违章地址 */
	private String address;

	/** 违章原因 */
	private String reason;

	/** 罚款金额 */
	private String fine;

	/** 扣分 */
	private Integer point;

	/** 违章省份 */
	private String province;

	/** 违章城市 */
	private String city;

	/** 代办服务费 */
	private String serviceFee;

	/** 是否可以选择 */
	private Integer canSelect;

	/** 违章处理状态 */
	private Integer processStatus;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getFine() {
		return fine;
	}

	public void setFine(String fine) {
		this.fine = fine;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public Integer getCanSelect() {
		return canSelect;
	}

	public void setCanSelect(Integer canSelect) {
		this.canSelect = canSelect;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Integer getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(Integer processStatus) {
		this.processStatus = processStatus;
	}
}
