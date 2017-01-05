package com.xiaoka.business.online.open.sdk.output;

import java.math.BigDecimal;

/**
 * @author taotao@xiaokakeji.com
 * @date 2016/12/29.
 * @copy xiaokakeji
 * @description:
 */
public class OfflineShopGetdataItemServiceOutput {
	/**
	 * 一级类目ID
	 */
	private Integer lv1ServiceTypeId;
	/**
	 * 二级类目ID
	 */
	private Integer lv2ServiceTypeId;
	/**
	 * 服务名称
	 */
	private String serviceName;
	/**
	 * 门市价，到门店现金支付的价格(10,2)
	 */
	private BigDecimal price;

	public Integer getLv1ServiceTypeId() {
		return lv1ServiceTypeId;
	}

	public void setLv1ServiceTypeId(Integer lv1ServiceTypeId) {
		this.lv1ServiceTypeId = lv1ServiceTypeId;
	}

	public Integer getLv2ServiceTypeId() {
		return lv2ServiceTypeId;
	}

	public void setLv2ServiceTypeId(Integer lv2ServiceTypeId) {
		this.lv2ServiceTypeId = lv2ServiceTypeId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
