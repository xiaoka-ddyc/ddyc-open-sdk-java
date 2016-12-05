package com.xiaoka.business.online.open.sdk.output;

import java.util.List;

/**
 * @author huskar
 * @create 2016/12/5
 */
public class BaseListOutput<T> extends BaseOutput {
	private List<T> data;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
