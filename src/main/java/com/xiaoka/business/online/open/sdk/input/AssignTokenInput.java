/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * Author:  忽忽(huhu)
 * Date:    16/6/5 下午1:55
 * Description: 
 */
package com.xiaoka.business.online.open.sdk.input;

/**
 * @author huskar
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AssignTokenInput {

	private String phone;
	private String plateNumber;
	private String vin;
	private String engineNo;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
}
