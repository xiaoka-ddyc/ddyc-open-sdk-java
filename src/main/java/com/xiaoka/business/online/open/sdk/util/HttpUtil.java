package com.xiaoka.business.online.open.sdk.util;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;

/**
 * @author huskar
 * @create 2016/9/1
 */
public class HttpUtil {
//	private static final String HOST = "http://openapi.ddyc.com";//正式环境
//	private static final String HOST = "http://intb-open.ddyc.com:8090";
	private static final String HOST = "http://localhost:8080/open";

	private static Charset UTF_8 = Charset.forName("UTF-8");
	private static Logger logger = LoggerFactory.getLogger(HttpUtil.class);

	public static String post(String url, String requestBody, String appKey, String appSecret) throws Exception {
		StringBuilder sburl = new StringBuilder(HttpUtil.HOST).append(url);
		String firstStr = url.contains("?") ? "&" : "?";
		sburl = sburl.append(firstStr).append("app_key=").append(appKey).append("&timestamp=")
		             .append(System.currentTimeMillis());
		String sign = SignUtil.createSign(appKey, appSecret, sburl.toString(), requestBody);
		sburl = sburl.append("&sign=").append(sign);

		logger.debug("request url : " + sburl);
		logger.debug("request body :\n" + requestBody);

		CloseableHttpResponse httpResponse = null;
		String responseText = null;
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(sburl.toString());
			httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");
			httpPost.setEntity(new StringEntity(requestBody, UTF_8));
			httpResponse = httpClient.execute(httpPost);
			responseText = EntityUtils.toString(httpResponse.getEntity(), UTF_8);
			logger.debug("reseponse text :\n" + responseText);
		} finally {
			if (httpResponse != null) {
				httpResponse.close();
			}
		}
		return responseText;
	}

	public static String get(String url, String appKey, String appSecret) throws Exception {
		StringBuilder sburl = new StringBuilder(HttpUtil.HOST).append(url);
		String firstStr = url.contains("?") ? "&" : "?";
		sburl = sburl.append(firstStr).append("app_key=").append(appKey).append("&timestamp=")
		             .append(System.currentTimeMillis());
		String sign = SignUtil.createSign(appKey, appSecret, sburl.toString());
		sburl = sburl.append("&sign=").append(sign);

		logger.debug("request url : " + sburl.toString());
		CloseableHttpResponse httpResponse = null;
		String responseText = null;
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet httpGet = new HttpGet(sburl.toString());
			httpGet.addHeader("Content-Type", "application/json;charset=UTF-8");
			httpResponse = httpClient.execute(httpGet);
			responseText = EntityUtils.toString(httpResponse.getEntity(), UTF_8);
			logger.debug("reseponse text :\n" + responseText);
		} finally {
			if (httpResponse != null) {
				httpResponse.close();
			}
		}
		return responseText;
	}

}
