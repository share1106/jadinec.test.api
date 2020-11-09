package jadinec.test.api.cases;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import jadinec.test.api.config.TestConfig;
import jadinec.test.api.utils.ConfigFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class AddLedgerTest {

	// 增加
	@Test
	public void addLedgerTest() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);

		String data1 = null;
		String data2 = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data1 = jsonObject.getString("msg");
			data2 = jsonObject.getString("data");
		}
		System.out.println(data2);
		JSONArray jArray = new JSONArray();
		jArray.add(data2);

		// 验证结果
		Assert.assertEquals("执行成功", data1);
	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.addLedgerUrl);
		System.out.println(TestConfig.addLedgerUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("engineeringCode", "78272319910449152");//工程编号
		param2.put("sectionNumber", "400");// 章节号编号
		param2.put("ledgerCode", "400-1-2-3");// 项目清单编号
		param2.put("ledgerName", "钢筋");// 细目名称
		param2.put("unit", "dw002");// 单位编号
		param2.put("price", "5");// 清单单价
		param2.put("designQuantity", 12.3);// 原合同单价
		param2.put("engineeringDrawing", "");// 原合同数量
		param2.put("formula", "");// 原合同金额
		param2.put("remarks", "测试新增项目工程量清单3");
		param2.put("proCode", "7");
		param2.put("stump", "7");//桩号

		param1.put("version", ConfigFile.version);
		param1.put("client", ConfigFile.client_pc);
		param1.put("content", param2);

		post.setHeader("Content-Type", ConfigFile.Content_Type);
		post.setHeader("access_token", ConfigFile.access_token_pc);
		post.setHeader("client", ConfigFile.client_pc);

		StringEntity entity = new StringEntity(param1.toString(), "UTF-8");
		post.setEntity(entity);

		String result;
		HttpResponse response = TestConfig.defaultHttpClient.execute(post);
		result = EntityUtils.toString(response.getEntity(), "UTF-8");
		// System.out.println(result);
		List<String> list = Arrays.asList(result);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}
}
