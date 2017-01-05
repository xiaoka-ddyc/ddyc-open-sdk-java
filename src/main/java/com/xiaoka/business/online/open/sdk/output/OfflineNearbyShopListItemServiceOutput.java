package com.xiaoka.business.online.open.sdk.output;

import java.math.BigDecimal;

/**
 * @author taotao@xiaokakeji.com
 * @date 2016/12/30.
 * @copy xiaokakeji
 * @description:
 */
public class OfflineNearbyShopListItemServiceOutput {
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
	 * 市场价，门市价，用户要付多少钱合作方自己决定(10,2)
	 */
	private BigDecimal price;
	/**
	 * 合作协议价，默认为典典APP支付价(10,2)
	 */
	private BigDecimal promotionPrice;

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

	public BigDecimal getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(BigDecimal promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
}
