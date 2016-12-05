package com.xiaoka.business.online.open.sdk.output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 违章查询条件输出参数
 * @author lietian
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViolationQueryConditionAllOutput implements Serializable {

    private int provinceId;

    private String  province;

    @JsonProperty("list")
    private List<ViolationQueryConditionInfoOutput> conditionList;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public List<ViolationQueryConditionInfoOutput> getConditionList() {
        return conditionList;
    }

    public void setConditionList(List<ViolationQueryConditionInfoOutput> conditionList) {
        this.conditionList = conditionList;
    }

}
