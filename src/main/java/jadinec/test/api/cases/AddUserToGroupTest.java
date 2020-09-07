package jadinec.test.api.cases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class AddUserToGroupTest {

	//往群内添加人员
	@Test
	public void addUserToGroupTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.addUserToGroupUrl);
		System.out.println(TestConfig.addUserToGroupUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		Map<String,String> mapParam = new HashMap<String,String>();
		mapParam.put("member_Account", "14");
		mapParam.put("member_Account", "13");
							
		JSONArray jarray = new JSONArray();
		jarray.add(mapParam);
		
		param2.put("groupId", "@TGS#22K62J6FI");
		param2.put("memberList", jarray);

		param1.put("client", "android");
		param1.put("version", "1.0");
		param1.put("content", param2);

		post.setHeader("Content-Type", "application/json;charset=UTF-8");
		post.setHeader("access_token", "13b22fdb-01c6-4925-818b-b702cc3aa33b");
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
