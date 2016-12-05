package com.xiaoka.business.online.open.sdk.output;

import java.io.Serializable;

/**
 * @author huskar
 * @create 2016/12/5
 */
public class BaseOutput<T> implements Serializable{
	private Boolean success;
	private Integer errCode;
	private String message;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getErrCode() {
		return errCode;
	}

	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
