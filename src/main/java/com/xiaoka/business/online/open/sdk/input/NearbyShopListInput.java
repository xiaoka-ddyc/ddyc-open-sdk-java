package com.xiaoka.business.online.open.sdk.input;

import com.sun.istack.internal.NotNull;

import java.io.Serializable;

/**
 * @author taotao@xiaokakeji.com
 * @date 2016/12/30.
 * @copy xiaokakeji
 * @description:
 */
public class NearbyShopListInput implements Serializable {
	/**
	 * 分页索引，从1开始递增，直到等于pageLength为止
	 */
	@NotNull
	private Integer pageIndex;
	/**
	 * 每页记录数，最大值50
	 */
	private Integer pageSize;
	/**
	 * 纬度
	 */
	@NotNull
	private String lat;
	/**
	 * 纬度
 	 */
	@NotNull
	private String lng;
	/**
	 * 搜索范围，单位KM，默认50，最大值50
	 */
	private Integer distance;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}
}
