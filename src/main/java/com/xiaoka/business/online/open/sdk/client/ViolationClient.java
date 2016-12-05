package com.xiaoka.business.online.open.sdk.client;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaoka.business.online.open.sdk.output.BaseListOutput;
import com.xiaoka.business.online.open.sdk.output.ViolationQueryConditionOutput;
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
}
