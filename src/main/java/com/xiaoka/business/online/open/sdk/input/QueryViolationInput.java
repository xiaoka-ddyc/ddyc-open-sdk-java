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
 * @author huskar
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class QueryViolationInput implements Serializable {

    private String plateNumber;

    /**
     * 车架号
     */
    private String vin;

    /**
     * 发动机编号
     */
    private String engineNo;

    /**
     * 手机号码
     */
    private String phone;

	/**
     * 是否返回代办费用
     */
    private Boolean needFee = false;

	/**
     * 查询城市
     */
    private String city;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getNeedFee() {
        return needFee;
    }

    public void setNeedFee(Boolean needFee) {
        this.needFee = needFee;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
