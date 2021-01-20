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

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import jadinec.test.api.config.TestConfig;
import jadinec.test.api.utils.ConfigFile;

public class GetEntireOrgDeptTreeByUserIdTest {

	public static String stringId = null;
	public static String parentStringId = null;

	// 根据userId获取整个组织机构部门树
	@Test
	public void getEntireOrgDeptTreeByUserIdTest() throws IOException {

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
		// System.out.println(data2);

		JSONArray result1 = JSONArray.parseArray(data2);
		// System.out.println(result1);

		for (int j = 0; j < result1.size(); j++) {
			JSONObject jsonObject = result1.getJSONObject(j);
			if (jsonObject.get("orgDeptName").toString().contains("测试添加部门")) {
				stringId = jsonObject.getString("orgDeptId");
				parentStringId = jsonObject.getString("parentOrgDeptId");
			}

		}
		System.out.println(stringId);
		System.out.println(parentStringId);

		// 验证结果
		Assert.assertEquals("执行成功", data1);
	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.getEntireOrgDeptTreeByUserIdUrl);
		System.out.println(TestConfig.getEntireOrgDeptTreeByUserIdUrl);
		JSONObject param1 = new JSONObject();

		param1.put("clientType", 2);
		param1.put("appVersion", 1.9);
		param1.put("serverVersion", 1.9);
		param1.put("content", null);

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
		JSONArray array = JSONArray.parseArray(list.toString());
		return array;
	}
}
