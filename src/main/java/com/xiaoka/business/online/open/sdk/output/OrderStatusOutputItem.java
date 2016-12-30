package com.xiaoka.business.online.open.sdk.output;

import java.io.Serializable;

/**
 * @author taotao@xiaokakeji.com
 * @date 2016/12/28.
 * @copy xiaokakeji
 * @description:
 */
public class OrderStatusOutputItem implements Serializable {
	/**
	 * 违章编码,唯一，非违章条例码
	 */
	private String code;
	/**
	 * 违章处理状态：1：未处理，2：处理中，3：已处理，4：不支持处理
	 */
	private Integer processStatus;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(Integer processStatus) {
		this.processStatus = processStatus;
	}
}
