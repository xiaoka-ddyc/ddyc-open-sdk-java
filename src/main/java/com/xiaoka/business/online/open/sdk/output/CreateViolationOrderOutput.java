package com.xiaoka.business.online.open.sdk.output;

import java.io.Serializable;

/**
 * @author huskar
 * @create 2016/8/13
 */
public class CreateViolationOrderOutput implements Serializable {
	private static final long serialVersionUID = -1L;

	private Integer orderId;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
