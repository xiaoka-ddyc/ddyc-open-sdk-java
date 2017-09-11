package com.xiaoka.business.online.open.sdk.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaoka.business.online.open.sdk.input.*;
import com.xiaoka.business.online.open.sdk.output.*;
import com.xiaoka.business.online.open.sdk.util.HttpUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * @author huskar
 * @create 2016/12/5
 */
public class ViolationClient {

	public static BaseListOutput<ViolationQueryConditionOutput> condition(String appKey, String appSecret)
			throws Exception {
		String responseText = HttpUtil.get("/violation/condition", appKey, appSecret);
		if (StringUtils.isBlank(responseText)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory()
		                          .constructType(BaseListOutput.class, ViolationQueryConditionOutput.class);
		BaseListOutput<ViolationQueryConditionOutput> output = new ObjectMapper().readValue(responseText, javaType);
		return output;
	}

	public static BaseListOutput<ViolationQueryConditionAllOutput> conditionAll(String appKey, String appSecret)
			throws Exception {
		String responseText = HttpUtil.get("/violation/condition/all/1.0", appKey, appSecret);
		if (StringUtils.isBlank(responseText)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory()
		                          .constructType(BaseListOutput.class, ViolationQueryConditionAllOutput.class);
		BaseListOutput<ViolationQueryConditionAllOutput> output = new ObjectMapper().readValue(responseText, javaType);
		return output;
	}

	public static BaseObjectOutput query(String appKey, String appSecret,
			QueryViolationInput queryViolationInput)
			throws Exception {
		String responseText = HttpUtil.post("/violation/query/1.0", serialize(queryViolationInput), appKey, appSecret);
		if (StringUtils.isBlank(responseText)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory()
		                          .constructType(BaseObjectOutput.class, QueryViolationOutput.class);
		BaseObjectOutput output = new ObjectMapper().readValue(responseText, javaType);
		return output;
	}

	public static BaseObjectOutput assignToken(String appKey, String appSecret,
			AssignTokenInput assignTokenInput)
			throws Exception {
		String responseText = HttpUtil.post("/violation/assign/token", serialize(assignTokenInput), appKey, appSecret);
		if (StringUtils.isBlank(responseText)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory()
		                          .constructType(BaseObjectOutput.class, String.class);
		BaseObjectOutput output = new ObjectMapper().readValue(responseText, javaType);
		return output;
	}

	public static BaseObjectOutput createOrder(String appKey, String appSecret,
			CreateViolationOrderInput createViolationOrderInput) throws Exception {
		String responseText = HttpUtil.post("/violation/create/order", serialize(createViolationOrderInput), appKey, appSecret);
		if (StringUtils.isBlank(responseText)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory()
		                          .constructType(BaseObjectOutput.class, String.class);
		BaseObjectOutput output = new ObjectMapper().readValue(responseText, javaType);
		return output;
	}

	public static BaseObjectOutput orderStatus(String appKey, String appSecret,OrderStatusInput orderStatusInput) throws Exception {
		String url =  "/violation/order/status"+"?token="+orderStatusInput.getToken()+"&orderId="+orderStatusInput.getOrderId();
		String responseText = HttpUtil.get(url, appKey, appSecret);
		if (StringUtils.isBlank(responseText)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory()
		                          .constructType(BaseObjectOutput.class, OrderStatusOutput.class);
		BaseObjectOutput output = new ObjectMapper().readValue(responseText, javaType);
		return output;
	}

	public static BaseObjectOutput orderDetail(String appKey, String appSecret,OrderDetailInput orderDetailInput) throws Exception {
		String url =  "/violation/order/detail"+"?token="+orderDetailInput.getToken()+"&orderId="+orderDetailInput.getOrderId();
		String responseText = HttpUtil.get(url, appKey, appSecret);
		if (StringUtils.isBlank(responseText)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory()
		                          .constructType(BaseObjectOutput.class, OrderDetailOutput.class);
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
}
