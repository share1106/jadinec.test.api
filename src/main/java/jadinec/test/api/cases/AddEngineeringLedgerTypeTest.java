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

public class AddEngineeringLedgerTypeTest {

	// 增加
	@Test
	public void addEngineeringLedgerTypeTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.addEngineeringLedgerTypeUrl);
		System.out.println(TestConfig.addEngineeringLedgerTypeUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("ledgerTypeName", "混凝土");// 细目种类
		param2.put("ledgerTypeCode", "3");// 细目代码
		param2.put("remark", "测试增加细目种类备注");//备注

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
