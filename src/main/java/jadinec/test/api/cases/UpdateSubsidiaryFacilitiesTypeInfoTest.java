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

public class UpdateSubsidiaryFacilitiesTypeInfoTest {

	//
	@Test
	public void updateSubsidiaryFacilitiesTypeInfoTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.updateSubsidiaryFacilitiesTypeInfoUrl);
		System.out.println(TestConfig.updateSubsidiaryFacilitiesTypeInfoUrl);
		JSONObject param1 = new JSONObject();

		param1.put("id", "66283932081065984");
		param1.put("typeName", "测试附属设置类型3");
		param1.put("lineWidth", "1");
		param1.put("lineColor", "#000000");
		param1.put("lineShape", "dashed");
		param1.put("fillColor", "#000000");
		param1.put("geometry", "5");
		param1.put("drawLevel", 3);
		param1.put("lineTransparency", 1);
		param1.put("transparency", 1);

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
