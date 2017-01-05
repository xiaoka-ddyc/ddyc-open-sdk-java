package com.xiaoka.business.online.open.sdk.test;

import com.xiaoka.business.online.open.sdk.util.SignUtil;
import org.junit.Test;

import java.util.Date;

/**
 * 签名测试
 * @author huskar
 * @create 2016/12/5
 */
public class SignTest {
	public static String APP_KEY = "EnterYourAppKey";
	public static String APP_SECRET = "EnterYourAppSecret";

	@Test
	public void testSign() {
		String url = "http://openapi.ddyc.com/sign/test?city=123&name=xxx&app_key=TEST&timestamp=";
		url += new Date().getTime();
		System.out.println(url);
		String sign = null;
		try {
			String requestBody = "{\"data\":\"123\"}";
			// request请求体
			sign = SignUtil.createSign(APP_KEY, APP_SECRET, url, requestBody);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(sign);
		System.out.println(url + "&sign=" + sign);
	}
}
