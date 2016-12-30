package com.xiaoka.business.online.open.sdk.test;

import com.xiaoka.business.online.open.sdk.client.ViolationClient;
import com.xiaoka.business.online.open.sdk.input.*;
import com.xiaoka.business.online.open.sdk.output.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huskar
 * @create 2016/12/5
 */
public class ViolationClientTest {
	private String appKey = "violation-test";
	private String appSecret = "YQGFCWXAIMAOLY5RVCK5SYEV7TRGDOH0";

	@Test
	public void testCondition() throws Exception {
		BaseListOutput<ViolationQueryConditionOutput> baseListOutput = ViolationClient
				.condition(appKey, appSecret);
		Assert.assertNotNull(baseListOutput);
		Assert.assertTrue(baseListOutput.getSuccess());
		Assert.assertNotNull(baseListOutput.getData());
	}

	@Test
	public void testconditionAll() throws Exception {
		BaseListOutput<ViolationQueryConditionAllOutput> baseListOutput = ViolationClient
				.conditionAll(appKey, appSecret);
		Assert.assertNotNull(baseListOutput);
		Assert.assertTrue(baseListOutput.getSuccess());
		Assert.assertNotNull(baseListOutput.getData());
	}

	@Test
	public void testQuery() throws Exception {
		QueryViolationInput input = new QueryViolationInput();
		input.setEngineNo("");
		input.setPlateNumber("");
		input.setVin("");
		input.setPhone("");
		input.setCity("");
		BaseObjectOutput baseObjectOutput = ViolationClient
				.query(appKey, appSecret, input);
		Assert.assertNotNull(baseObjectOutput);
		Assert.assertTrue(baseObjectOutput.getSuccess());
		Assert.assertNotNull(baseObjectOutput.getData());
	}

	@Test
	public void testQueryWithFee() throws Exception {
		QueryViolationInput input = new QueryViolationInput();
		input.setEngineNo("");
		input.setPlateNumber("");
		input.setVin("");
		input.setPhone("");
		input.setCity("");
		input.setNeedFee(true);// 和Query区别就在此一行
		BaseObjectOutput baseObjectOutput = ViolationClient
				.query(appKey, appSecret, input);
		Assert.assertNotNull(baseObjectOutput);
		Assert.assertTrue(baseObjectOutput.getSuccess());
		Assert.assertNotNull(baseObjectOutput.getData());
	}

	@Test
	public void testAssignToken() throws Exception {
		AssignTokenInput input = new AssignTokenInput();
		input.setPhone("");
		input.setPlateNumber("");
		input.setEngineNo("");
		input.setVin("");
		BaseObjectOutput baseObjectOutput = ViolationClient
				.assignToken(appKey, appSecret, input);
		Assert.assertNotNull(baseObjectOutput);
		Assert.assertTrue(baseObjectOutput.getSuccess());
		Assert.assertNotNull(baseObjectOutput.getData());
	}

	@Test
	public void testCreateOrder() throws Exception {
		CreateViolationOrderInput input = new CreateViolationOrderInput();
		List<String> violationCodes = new ArrayList<>();
		violationCodes.add("");
		violationCodes.add("");
		input.setToken("");
		input.setViolationCodes(violationCodes);
		input.setTotalPrice("");
		input.setLat(24.325185);
		input.setLng(132.123213);
		input.setOutOrderNo("");
		BaseObjectOutput baseObjectOutput = ViolationClient
				.createOrder(appKey, appSecret, input);
		Assert.assertNotNull(baseObjectOutput);
		Assert.assertTrue(baseObjectOutput.getSuccess());
		Assert.assertNotNull(baseObjectOutput.getData());
	}

	@Test
	public void testOrderStatus() throws Exception {
		OrderStatusInput input = new OrderStatusInput();
		input.setToken("");
		input.setOrderId(7924458);
		BaseObjectOutput baseObjectOutput = ViolationClient
				.orderStatus(appKey, appSecret, input);
		Assert.assertNotNull(baseObjectOutput);
		Assert.assertTrue(baseObjectOutput.getSuccess());
		Assert.assertNotNull(baseObjectOutput.getData());
	}

	@Test
	public void testOrderDetail() throws Exception {
		OrderDetailInput input = new OrderDetailInput();
		input.setToken("");
		input.setOrderId(7924458);
		BaseObjectOutput baseObjectOutput = ViolationClient
				.orderDetail(appKey, appSecret, input);
		Assert.assertNotNull(baseObjectOutput);
		Assert.assertTrue(baseObjectOutput.getSuccess());
		Assert.assertNotNull(baseObjectOutput.getData());
	}
}
