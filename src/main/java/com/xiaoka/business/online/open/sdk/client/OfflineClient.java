package com.xiaoka.business.online.open.sdk.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaoka.business.online.open.sdk.input.NearbyShopListInput;
import com.xiaoka.business.online.open.sdk.input.OfflineCancelOrderInput;
import com.xiaoka.business.online.open.sdk.input.OfflineCreateOrderInput;
import com.xiaoka.business.online.open.sdk.input.PagingInput;
import com.xiaoka.business.online.open.sdk.output.BaseObjectOutput;
import com.xiaoka.business.online.open.sdk.output.OfflineCreateOrderOutput;
import com.xiaoka.business.online.open.sdk.output.OfflineNearbyShopListOutput;
import com.xiaoka.business.online.open.sdk.output.OfflineShopGetdataOutput;
import com.xiaoka.business.online.open.sdk.util.HttpUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * @author taotao
 * @create 2016/12/5
 */
public class OfflineClient {

	public static BaseObjectOutput<OfflineShopGetdataOutput> shopGetdata(String appKey, String appSecret,
			PagingInput pagingInput)
			throws Exception {
		String url = "/offline/shop/getdata?pageIndex=" + pagingInput.getPageIndex() + "&pageSize=" + getPageSize(
				pagingInput.getPageSize());
		String responseText = HttpUtil.get(url, appKey, appSecret);
		if (StringUtils.isBlank(responseText)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory()
		                          .constructType(BaseObjectOutput.class, OfflineShopGetdataOutput.class);
		BaseObjectOutput<OfflineShopGetdataOutput> output = new ObjectMapper().readValue(responseText, javaType);
		return output;
	}

	public static BaseObjectOutput<OfflineNearbyShopListOutput> nearbyShopList(String appKey, String appSecret,
			NearbyShopListInput input)
			throws Exception {
		String url = "/offline/nearby/shop/list";
		url += "?pageIndex=" + input.getPageIndex() + "&pageSize=" + getPageSize(input.getPageSize()) + "&lat=" + input
				.getLat() + "&lng=" + input.getLng() + "&distance=" + getDistance(input.getDistance());

		String responseText = HttpUtil.get(url, appKey, appSecret);
		if (StringUtils.isBlank(responseText)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory()
		                          .constructType(BaseObjectOutput.class, OfflineNearbyShopListOutput.class);
		BaseObjectOutput<OfflineNearbyShopListOutput> output = new ObjectMapper().readValue(responseText, javaType);
		return output;
	}

	public static  BaseObjectOutput<OfflineCreateOrderOutput> createOrder(String appKey, String appSecret,
			OfflineCreateOrderInput input) throws Exception{
		String url = "/offline/create/order";
		String responseText = HttpUtil.post(url, serialize(input),appKey, appSecret);
		if (StringUtils.isBlank(responseText)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory()
		                          .constructType(BaseObjectOutput.class, OfflineCreateOrderOutput.class);
		BaseObjectOutput<OfflineCreateOrderOutput> output = new ObjectMapper().readValue(responseText, javaType);
		return output;
	}

	public static BaseObjectOutput cancelOrder(String appKey, String appSecret,
			OfflineCancelOrderInput input) throws Exception{
		String url = "/offline/cancel/order";
		String responseText = HttpUtil.post(url, serialize(input),appKey, appSecret);
		if (StringUtils.isBlank(responseText)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory()
		                          .constructType(BaseObjectOutput.class, Integer.class);
		BaseObjectOutput output = new ObjectMapper().readValue(responseText, javaType);
		return output;
	}

	public static String serialize(Object ob) {
		ObjectMapper mapper = new ObjectMapper();
		String json;
		try {
			json = mapper.writeValueAsString(ob);
			return json;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

	public static Integer getPageSize(Integer pageSize) {
		if (pageSize != null && pageSize >= 50) {
			return 50;
		}
		return pageSize;
	}

	public static Integer getDistance(Integer distance) {
		if (distance != null && distance >= 50) {
			return 50;
		}
		return distance;
	}
}
