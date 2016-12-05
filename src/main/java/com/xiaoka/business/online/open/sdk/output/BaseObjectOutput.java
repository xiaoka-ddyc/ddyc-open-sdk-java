package com.xiaoka.business.online.open.sdk.output;

/**
 * @author huskar
 * @create 2016/12/5
 */
public class BaseObjectOutput<T> extends BaseOutput {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
