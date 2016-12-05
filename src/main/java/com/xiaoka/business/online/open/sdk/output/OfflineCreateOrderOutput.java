package com.xiaoka.business.online.open.sdk.output;

import java.util.Date;

/**
 * Created by 豆芽 on 2016/9/18.
 * <p>
 * 功能说明：
 */
public class OfflineCreateOrderOutput {
	/**
	 * 消费码
	 */
	private String consumerCode;
	/**
	 * 过期时间
	 **/
	private Date expiredTime;

	public OfflineCreateOrderOutput() {
	}

	public String getConsumerCode() {
		return consumerCode;
	}

	public void setConsumerCode(String consumerCode) {
		this.consumerCode = consumerCode;
	}

	public Date getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}
}

