package com.xiaoka.business.online.open.sdk.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author taotao@xiaokakeji.com
 * @date 2016/12/28.
 * @copy xiaokakeji
 * @description:
 */
public class OrderDetailOutput implements Serializable {
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
	private String orderCreateTime;
	/**
	 * 订单支付时间
	 */
	private String orderPayTime;
	/**
	 * 订单关闭时间，只有关闭的订单才返回
	 */
	private String orderCloseTime;
	/**
	 * 订单金额 (10,2)
	 */
	private BigDecimal orderPrice;
	/**
	 * 第三方支付跳转链接
	 */
	private String payUrl;
	/**
	 * 车牌号码
	 */
	private String plateNumber;
	/**
	 * 违章明细
	 */
	private List<OrderDetailOutputItem> violations;

	public String getOrderCreateTime() {
		return orderCreateTime;
	}

	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderPayTime() {
		return orderPayTime;
	}

	public void setOrderPayTime(String orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public String getOrderCloseTime() {
		return orderCloseTime;
	}

	public void setOrderCloseTime(String orderCloseTime) {
		this.orderCloseTime = orderCloseTime;
	}

	public BigDecimal getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getPayUrl() {
		return payUrl;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public List<OrderDetailOutputItem> getViolations() {
		return violations;
	}

	public void setViolations(List<OrderDetailOutputItem> violations) {
		this.violations = violations;
	}

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

}
