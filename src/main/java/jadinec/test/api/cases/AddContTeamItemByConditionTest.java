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

public class AddContTeamItemByConditionTest {

	// 根据条件添加施工队范围
	@Test
	public void addContTeamItemByConditionTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.addContTeamItemByConditionUrl);
		System.out.println(TestConfig.addContTeamItemByConditionUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		
		String[] paramStr = {"ZH-10-502-001-002-002-001-000"};
		
		param2.put("contId", 162);
		param2.put("deptId", 1323);
		param2.put("deptFunc", 4);
		param2.put("engineeringList", paramStr);

		param1.put("client", ConfigFile.clientPC);
		param1.put("version", ConfigFile.version);
		param1.put("content", param2);

		post.setHeader("Content-Type", ConfigFile.Content_Type);
		post.setHeader("access_token", "913724ca-7dd8-4574-896d-f8781fc76e17");
		post.setHeader("client", ConfigFile.clientPC);

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
