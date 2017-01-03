package com.xiaoka.business.online.open.sdk.test;

import com.xiaoka.business.online.open.sdk.client.OfflineClient;
import com.xiaoka.business.online.open.sdk.input.NearbyShopListInput;
import com.xiaoka.business.online.open.sdk.input.OfflineCancelOrderInput;
import com.xiaoka.business.online.open.sdk.input.OfflineCreateOrderInput;
import com.xiaoka.business.online.open.sdk.input.PagingInput;
import com.xiaoka.business.online.open.sdk.output.BaseObjectOutput;
import com.xiaoka.business.online.open.sdk.output.OfflineCreateOrderOutput;
import com.xiaoka.business.online.open.sdk.output.OfflineNearbyShopListOutput;
import com.xiaoka.business.online.open.sdk.output.OfflineShopGetdataOutput;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author huskar
 * @create 2016/12/5
 */
public class OfflineClientTest {
	private String appKey = "offline-test";
	private String appSecret = "8ACFGDSVRN1UC6A6QR4TJBJOIBKMSXBF";

	@Test
	public void testShopGetdata() throws Exception {
		PagingInput pagingInput = new PagingInput();
		pagingInput.setPageIndex(1);
		pagingInput.setPageSize(20);
		BaseObjectOutput<OfflineShopGetdataOutput> baseObjectOutput = OfflineClient
				.shopGetdata(appKey, appSecret, pagingInput);

		Assert.assertNotNull(baseObjectOutput);
		Assert.assertTrue(baseObjectOutput.getSuccess());
		Assert.assertNotNull(baseObjectOutput.getData());
	}

	@Test
	public void testNearbyShopList() throws Exception {
		NearbyShopListInput input = new NearbyShopListInput();
		input.setPageIndex(1);
		input.setPageSize(20);
		input.setLat("24.325185");
		input.setLng("132.123213");
		input.setDistance(50);
		BaseObjectOutput<OfflineNearbyShopListOutput> baseObjectOutput = OfflineClient
				.nearbyShopList(appKey, appSecret, input);
		Assert.assertNotNull(baseObjectOutput);
		Assert.assertTrue(baseObjectOutput.getSuccess());
		Assert.assertNotNull(baseObjectOutput.getData());
	}

	@Test
	public void testCreateOrder() throws Exception {
		OfflineCreateOrderInput input = new OfflineCreateOrderInput();
		input.setOutOrderNo("9238SD8F732");
		input.setPhone("15088631212");
		input.setPlateNumber("浙A88888");
		input.setCarBrand("宝马");
		input.setCarSeries("5系");
		input.setCarModel("2013天窗版");
		input.setShopId(5646);
		input.setLv1ServiceTypeId(1);
		input.setLv2ServiceTypeId(1001);
		input.setServiceName("普洗");
		BigDecimal price = new BigDecimal(20.00);
		input.setPrice(price);
		BaseObjectOutput<OfflineCreateOrderOutput> baseObjectOutput = OfflineClient
				.createOrder(appKey, appSecret, input);
		Assert.assertNotNull(baseObjectOutput);
		Assert.assertTrue(baseObjectOutput.getSuccess());
		Assert.assertNotNull(baseObjectOutput.getData());
	}
	@Test
	public void testCancelOrder() throws Exception {
		OfflineCancelOrderInput input = new OfflineCancelOrderInput();
		input.setConsumerCode("123012128619");
		input.setOutOrderNo("9238SD8F732");
		BaseObjectOutput baseObjectOutput = OfflineClient
				.cancelOrder(appKey, appSecret, input);
		Assert.assertNotNull(baseObjectOutput);
		Assert.assertTrue(baseObjectOutput.getSuccess());
		Assert.assertNotNull(baseObjectOutput.getData());
	}

}
