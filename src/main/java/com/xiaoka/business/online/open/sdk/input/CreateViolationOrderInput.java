/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * Author:  忽忽(huhu)
 * Date:    16/6/5 下午1:55
 * Description: 
 */
package com.xiaoka.business.online.open.sdk.input;

import java.util.List;

/**
 * @author huskar
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CreateViolationOrderInput {

	/**
	 * 用户身份标识
	 */
	private String token;

	/**
	 * 违章记录唯一编码，查询出违章的每一个 code
	 */
	private List<String> violationCodes;
	/**
	 * 代办总金额（罚款金额+服务费）
	 */
	private String totalPrice;
	/**
	 * 第三方订单流水号
	 */
	private String outOrderNo;
	/**
	 * 下单时用户所在地经度
	 */
	private Double lng;

	/**
	 * 下单时用户所在地维度
	 */
	private Double lat;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<String> getViolationCodes() {
		return violationCodes;
	}

	public void setViolationCodes(List<String> violationCodes) {
		this.violationCodes = violationCodes;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOutOrderNo() {
		return outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

}
