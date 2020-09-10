package jadinec.test.api.cases;

import java.io.IOException;
import java.util.ArrayList;
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
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class EditTeamTest {

	// 编辑班组
	@Test(enabled=false)
	public void editTeamTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.editTeamUrl);
		System.out.println(TestConfig.editTeamUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		List<String> listParam = new ArrayList<String>();
		listParam.add("1");
		listParam.add("2");
		listParam.add("3");
		listParam.add("4");

		param2.put("proDeptId", "1");
		param2.put("deptName", "班组test");
		param2.put("member", listParam);
		param2.put("leader", "1");

		param1.put("client", "android");
		param1.put("version", "1.0");
		param1.put("content", param2);

		post.setHeader("Content-Type", "application/json;charset=UTF-8");
		post.setHeader("access_token", "5d12f2bf-1538-4f08-b883-58aab1dc86c1");
		post.setHeader("client", "android");

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