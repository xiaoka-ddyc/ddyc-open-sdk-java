package com.xiaoka.business.online.open.sdk.test;

import com.xiaoka.business.online.open.sdk.client.ViolationClient;
import com.xiaoka.business.online.open.sdk.output.BaseListOutput;
import com.xiaoka.business.online.open.sdk.output.ViolationQueryConditionOutput;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author huskar
 * @create 2016/12/5
 */
public class ViolationClientTest {
	@Test
	public void testCondition() throws Exception {
		BaseListOutput<ViolationQueryConditionOutput> baseListOutput = ViolationClient
				.condition("", "");
		Assert.assertNotNull(baseListOutput);
		Assert.assertTrue(baseListOutput.getSuccess());
		Assert.assertNotNull(baseListOutput.getData());
	}
}
