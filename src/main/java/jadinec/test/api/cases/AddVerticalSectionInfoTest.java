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

public class AddVerticalSectionInfoTest {

	// 运营平台-纵断面-添加
	@Test
	public void addVerticalSectionInfoTest() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);

		String data = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data = jsonObject.getString("success");
		}

		// 验证结果
		Assert.assertEquals("true", data);
	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.addVerticalSectionInfoUrl);
		System.out.println(TestConfig.addVerticalSectionInfoUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("engineeringTypeCode", "FX21");
		param2.put("lineColor", "#627EC9");
		param2.put("completeLineColor", "#7699E7");
		param2.put("lineWidth", 3);
		param2.put("lineShape", "dashed");
		param2.put("lineTransparency", "0.5");
		param2.put("fillColor", "#000000");
		param2.put("completeFillColor", "#000000");
		param2.put("transparency", 0);
		param2.put("remarks", "测试纵断面信息备注");
		param2.put("geometry", "4");
		param2.put("completeFillTransparency", 0);
		
		param1.put("version", ConfigFile.version);
		param1.put("client", ConfigFile.client_pc);
		param1.put("content", param2);

		post.setHeader("Content-Type", ConfigFile.Content_Type);
		post.setHeader("accessToken", ConfigFile.access_token_pc);
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
