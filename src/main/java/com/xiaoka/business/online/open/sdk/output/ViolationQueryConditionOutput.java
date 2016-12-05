/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * Author:  忽忽(huhu)
 * Date:    16/6/20 下午7:08
 * Description: 
 */
package com.xiaoka.business.online.open.sdk.output;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * 违章查询条件输出参数
 *
 * @author huskar
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViolationQueryConditionOutput implements Serializable {

	private String city;

	private String engineNoLength;

	private String vinLength;

	private String cityPrefix;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEngineNoLength() {
		return engineNoLength;
	}

	public void setEngineNoLength(String engineNoLength) {
		this.engineNoLength = engineNoLength;
	}

	public String getVinLength() {
		return vinLength;
	}

	public void setVinLength(String vinLength) {
		this.vinLength = vinLength;
	}

	public String getCityPrefix() {
		return cityPrefix;
	}

	public void setCityPrefix(String cityPrefix) {
		this.cityPrefix = cityPrefix;
	}
}
