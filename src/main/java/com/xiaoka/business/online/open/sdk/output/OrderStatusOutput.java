package com.xiaoka.business.online.open.sdk.output;

import java.io.Serializable;
import java.util.List;

/**
 * @author taotao@xiaokakeji.com
 * @date 2016/12/28.
 * @copy xiaokakeji
 * @description:
 */
public class OrderStatusOutput implements Serializable {
	/**
	 * 订单编号
	 */
	private Integer orderId;
	/**
	 * 订单状态
	 */
	private Integer orderStatus;
	/**
	 * 状态变更时间
	 */
	private String orderStatusTime;
	/**
	 * 违章明细
	 */
	private List<OrderStatusOutputItem> violations;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusTime() {
		return orderStatusTime;
	}

	public void setOrderStatusTime(String orderStatusTime) {
		this.orderStatusTime = orderStatusTime;
	}
}
