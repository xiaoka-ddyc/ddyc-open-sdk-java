package com.xiaoka.business.online.open.sdk.input;

import com.sun.istack.internal.NotNull;

import java.io.Serializable;

/**
 * @author taotao@xiaokakeji.com
 * @date 2016/12/28.
 * @copy xiaokakeji
 * @description:
 */
public class OrderDetailInput implements Serializable {
	@NotNull
	private String token;
	@NotNull
	private Integer orderId;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
}
