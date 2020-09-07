package jadinec.test.api.cases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jadinec.test.api.config.TestConfig;
import jadinec.test.api.model.InterfaceName;
import jadinec.test.api.utils.ConfigFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class GetTokenTest {

	//令牌获取
	@Test(dependsOnGroups = { "verificationCodeLoginSuccess" },enabled=false)
	public void getTokenTest() throws IOException {
		
		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);
		
		String data = null;
		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data = jsonObject.getString("success");

		}
		
		//验证结果
		Assert.assertEquals("true", data);
	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.getTokenUrl);
		System.out.println(TestConfig.getTokenUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		JSONObject param3 = new JSONObject();
		
		param3.put("deviceId", "35861430-6531-A809-FFFF-FFFFEB4C6F18");
		param3.put("model", "Redmi 7A");
		param3.put("osVersion", "9");
		param3.put("manufacturer", "Xiaomi");
		
		param2.put("clientId", "app");
		param2.put("clientSecret", "9bd2e1b3f0604e52b02bb8018bebb0de");
		param2.put("permsSystem", "3");
		param2.put("username", "17700000000");
		param2.put("password", "2019");
		param2.put("extra", param3);
				
		param1.put("client", "android");
		param1.put("content", param2);
		param1.put("version", "1.0");
		String access_token = VerificationCodeLoginTest.token;
		post.setHeader("Content-Type", "application/json;charset=UTF-8");
		post.setHeader("access_token",access_token);
		post.setHeader("client", "android");
		System.out.println(VerificationCodeLoginTest.token);
		StringEntity entity = new StringEntity(param1.toString(), "UTF-8");
		post.setEntity(entity);

		String result;
		HttpResponse response = TestConfig.defaultHttpClient.execute(post);
		result = EntityUtils.toString(response.getEntity(), "UTF-8");
		System.out.println(result);
		List<String> list = Arrays.asList(result);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}

}

