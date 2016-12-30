/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * Author:  忽忽(huhu)
 * Date:    16/5/30 下午4:44
 * Description: 
 */
package com.xiaoka.business.online.open.sdk.input;

import com.sun.istack.internal.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 违章查询输入参数
 * @author huskar
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class OfflineCreateOrderInput implements Serializable {

    private static final long serialVersionUID = 6772482876561031307L;
    /**
     * 第三方订单流水号
     */
    @NotNull
    private String outOrderNo;

    /**
     * 手机号码
     */
    @NotNull
    private String phone;

    /**
     * 车牌号
     */
    private String plateNumber;

	/**
     * 车品牌
     */
    private String carBrand;

    /**
     * 车型
     */
    private String carModel;

    /**
     * 车系
     */
    private String carSeries;

    /**
     * 商户ID
     */
    @NotNull
    private Integer shopId;

    /**
     * 一级类目ID
     */
    @NotNull
    private Integer lv1ServiceTypeId;

    /**
     * 二级类目ID
     */
    @NotNull
    private Integer lv2ServiceTypeId;

    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 订单金额
     */
    private BigDecimal price;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(String carSeries) {
        this.carSeries = carSeries;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getLv1ServiceTypeId() {
        return lv1ServiceTypeId;
    }

    public void setLv1ServiceTypeId(Integer lv1ServiceTypeId) {
        this.lv1ServiceTypeId = lv1ServiceTypeId;
    }

    public Integer getLv2ServiceTypeId() {
        return lv2ServiceTypeId;
    }

    public void setLv2ServiceTypeId(Integer lv2ServiceTypeId) {
        this.lv2ServiceTypeId = lv2ServiceTypeId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getConsumerCode() {
        return consumerCode;
    }

    public void setConsumerCode(String consumerCode) {
        this.consumerCode = consumerCode;
    }
}
