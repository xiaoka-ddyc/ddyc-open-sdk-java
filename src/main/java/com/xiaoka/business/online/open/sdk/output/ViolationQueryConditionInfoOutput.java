package com.xiaoka.business.online.open.sdk.output;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * Created by hawei on 2016/10/14.
 */

/**
 * 违章全部查询条件子集城市输出参数
 *
 * @author lietian
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViolationQueryConditionInfoOutput implements Serializable {
    private int cityId;

    private String city;

    private String vinLength;

    private String engineNoLength;

    private String cityPrefix;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVinLength() {
        return vinLength;
    }

    public void setVinLength(String vinLength) {
        this.vinLength = vinLength;
    }

    public String getEngineNoLength() {
        return engineNoLength;
    }

    public void setEngineNoLength(String engineNoLength) {
        this.engineNoLength = engineNoLength;
    }

    public String getCityPrefix() {
        return cityPrefix;
    }

    public void setCityPrefix(String cityPrefix) {
        this.cityPrefix = cityPrefix;
    }

}
