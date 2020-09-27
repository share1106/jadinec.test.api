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

public class GetEarthworkBorrowAreaTest {

	// 获取挖方区
	@Test
	public void getEarthworkBorrowAreaTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.getEarthworkBorrowAreaUrl);
		System.out.println(TestConfig.getEarthworkBorrowAreaUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("taskOdd", "TSF190722111406062411");
		param2.put("areaType", 1);//类型：1挖方，2填方

		param1.put("client", "android");
		param1.put("version", "1.0");
		param1.put("content", param2);

		post.setHeader("Content-Type", ConfigFile.Content_Type);
		post.setHeader("access_token", ConfigFile.access_token);
		post.setHeader("client", ConfigFile.client);

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
