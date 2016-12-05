/*
 * Copyright (C), 2014-2016, 杭州小卡科技有限公司
 * Author:  huskar
 * Date:    16/08/10 下午3:10
 * Description: 
 */
package com.xiaoka.business.online.open.sdk.output;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * 违章查询输出参数
 * @author huskar
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryViolationOutput {

	private String token;

	/**
	 * 未处理总罚款
	 */
	private String totalFine;

	/**
	 * 未处理总分数
	 */
	private Integer totalPoints;

	/**
	 * 未处理条数
	 */
	private Integer untreated;

	/**
	 * 违章记录
	 */
	private List<QueryViolationItemOutput> violations;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTotalFine() {
		return totalFine;
	}

	public void setTotalFine(String totalFine) {
		this.totalFine = totalFine;
	}

	public Integer getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(Integer totalPoints) {
		this.totalPoints = totalPoints;
	}

	public Integer getUntreated() {
		return untreated;
	}

	public void setUntreated(Integer untreated) {
		this.untreated = untreated;
	}

	public List<QueryViolationItemOutput> getViolations() {
		return violations;
	}

	public void setViolations(List<QueryViolationItemOutput> violations) {
		this.violations = violations;
	}
}
