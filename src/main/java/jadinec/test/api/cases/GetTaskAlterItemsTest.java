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

public class GetTaskAlterItemsTest {

	// 任务交接列表
	@Test
	public void getTaskAlterItemsTest() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);

		String data1 = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data1 = jsonObject.getString("success");
		}

		// 验证结果
		Assert.assertEquals("true", data1);

	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.getTaskAlterItemsUrl);
		System.out.println(TestConfig.getTaskAlterItemsUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		
		String[] paramStr = {"1"};
		param2.put("taskType", paramStr);// 暂不支持多个，如果传多个值默认值获取第一个作为查询条件
		param2.put("keyWord", "关键词");
		param2.put("page", 1);

		param1.put("client", ConfigFile.client);
		param1.put("version", ConfigFile.version);
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
