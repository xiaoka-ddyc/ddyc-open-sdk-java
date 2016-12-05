package com.xiaoka.business.online.open.sdk.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SignUtil {

	public static String sortUrlParam(String url) {
		List<String> paramList = new ArrayList<>();
		url = url.substring(url.indexOf("?") + 1, url.length());
		String[] urlParam = url.split("&");
		for (String param : urlParam) {
			paramList.add(param);
		}
		Collections.sort(paramList, new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				return arg0.split("=")[0].compareTo(arg1.split("=")[0]);
			}
		});
		url = StringUtils.join(paramList, "&");
		return url;
	}

	public static String sign(String appKey, String appSecret, String requestParam)
	        throws Exception {
		StringBuilder sb = new StringBuilder(appKey).append(appSecret).append(requestParam);
		String sign = StringUtils.reverse(sb.toString());
		sign = DigestUtils.md5Hex(sign);
		sign = sign.toUpperCase();
		return sign;
	}


	public static String createSign(String appKey, String appSecret, String requestUrl, String requestBody)
	        throws Exception {
		String requestParam = sortUrlParam(requestUrl);
		if (StringUtils.isNotBlank(requestBody)) {
			requestParam = requestParam + requestBody;
		}
		String sign = sign(appKey, appSecret, requestParam);

		return sign;
	}

	public static String createSign(String appKey, String appSecret, String requestUrl) throws Exception {
		return createSign(appKey, appSecret, requestUrl, null);
	}
}
