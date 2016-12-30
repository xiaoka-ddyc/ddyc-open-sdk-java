package com.xiaoka.business.online.open.sdk.output;

import java.util.List;

/**
 * @author taotao@xiaokakeji.com
 * @date 2016/12/30.
 * @copy xiaokakeji
 * @description:
 */
public class OfflineNearbyShopListItemOutput {
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 区域
	 */
	private String district;
	/**
	 * 商家ID
	 */
	private Integer shopId;
	/**
	 * 商家名称
	 */
	private String shopName;
	/**
	 * 经度
	 */
	private Double shopLng;
	/**
	 * 维度
	 */
	private Double shopLat;
	/**
	 * 商家头像
	 */
	private String shopAvator;
	/**
	 * 商家联系电话
	 */
	private String shopTel;
	/**
	 * 商家地址
	 */
	private String shopAddress;
	/**
	 * 商家服务列表
	 */
	private List<OfflineNearbyShopListItemServiceOutput> list;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Double getShopLng() {
		return shopLng;
	}

	public void setShopLng(Double shopLng) {
		this.shopLng = shopLng;
	}

	public Double getShopLat() {
		return shopLat;
	}

	public void setShopLat(Double shopLat) {
		this.shopLat = shopLat;
	}

	public String getShopAvator() {
		return shopAvator;
	}

	public void setShopAvator(String shopAvator) {
		this.shopAvator = shopAvator;
	}

	public String getShopTel() {
		return shopTel;
	}

	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public List<OfflineNearbyShopListItemServiceOutput> getList() {
		return list;
	}

	public void setList(List<OfflineNearbyShopListItemServiceOutput> list) {
		this.list = list;
	}
}
