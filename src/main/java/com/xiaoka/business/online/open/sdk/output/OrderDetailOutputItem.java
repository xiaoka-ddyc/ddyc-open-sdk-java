package com.xiaoka.business.online.open.sdk.output;

import java.io.Serializable;

/**
 * @author taotao@xiaokakeji.com
 * @date 2016/12/28.
 * @copy xiaokakeji
 * @description:
 */
public class OrderDetailOutputItem implements Serializable {
	/**
	 * 违章编码,唯一，非违章条例码
	 */
	private String code;
	/**
	 * 违章时间
	 */
	private String time;
	/**
	 * 罚款金额
	 */
	private String fine;
	/**
	 * 违章地址
	 */
	private String address;
	/**
	 * 违章处理原因
	 */
	private String reason;
	/**
	 * 违章扣分
	 */
	private Integer point;
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 服务费
	 */
	private String serviceFee;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFine() {
		return fine;
	}

	public void setFine(String fine) {
		this.fine = fine;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
