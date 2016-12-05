/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * Author:  忽忽(huhu)
 * Date:    16/5/30 下午4:44
 * Description: 
 */
package com.xiaoka.business.online.open.sdk.input;

import java.io.Serializable;

/**
 * 违章查询输入参数
 *
 * @author huskar
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class OfflineCancelOrderInput implements Serializable {

	private static final long serialVersionUID = 6772482876561031307L;
	/**
	 * 第三方订单流水号
	 */
	private String outOrderNo;

	/**
	 * 消费凭证（验证码）
	 * 备注：在取消订单的场景中作参数
	 */
	private String consumerCode;

	public String getOutOrderNo() {
		return outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getConsumerCode() {
		return consumerCode;
	}

	public void setConsumerCode(String consumerCode) {
		this.consumerCode = consumerCode;
	}
}
