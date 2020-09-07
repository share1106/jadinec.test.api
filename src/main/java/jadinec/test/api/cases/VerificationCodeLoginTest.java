package jadinec.test.api.cases;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jadinec.test.api.config.TestConfig;
import jadinec.test.api.model.InterfaceName;
import jadinec.test.api.utils.ConfigFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class VerificationCodeLoginTest {

	public static String token = null;
	@BeforeTest
	public void beforeTest() {
		TestConfig.getTokenUrl = ConfigFile.getUrl(InterfaceName.GetToken);
		TestConfig.verificationCodeLoginUrl = ConfigFile.getUrl(InterfaceName.VerificationCodeLogin);
		TestConfig.getAppUpdateUrl = ConfigFile.getUrl(InterfaceName.GetAppUpdate);
		TestConfig.getEngineeringPlaneUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringPlane);
		TestConfig.getUserUrl = ConfigFile.getUrl(InterfaceName.GetUserInfo);
		TestConfig.getEngineeringItemPlaneUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringItemPlane);
		TestConfig.addUserToGroupUrl = ConfigFile.getUrl(InterfaceName.AddUserToGroup);
		TestConfig.getSigUrl = ConfigFile.getUrl(InterfaceName.GetIMSign);
		TestConfig.defaultHttpClient = new DefaultHttpClient();
	}
	
	//非常规设备 短信验证登录
	@Test(groups="verificationCodeLoginSuccess" ,enabled=false)
	public void verificationCodeLoginTest() throws IOException {
		
		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);
		
		String data = null;
		String data1 = null;
		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data = jsonObject.getString("success");
			data1 = jsonObject.getString("data");

		}
		JSONArray ja = new JSONArray();
		JSONArray jsa = ja.element(data1);
		JSONObject jsonObject = new JSONObject();
		jsonObject = (JSONObject) jsa.get(0);
		token = jsonObject.get("accessToken").toString();
		System.out.println(token);
		//验证结果
		Assert.assertEquals("true", data);
		
	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.verificationCodeLoginUrl);
		System.out.println(TestConfig.verificationCodeLoginUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
				
		param2.put("clientId", "app");
		param2.put("phoneNum", "17700000000");
		param2.put("phoneCode", "1012");
		param2.put("deviceId", "35861430-6531-A809-FFFF-FFFFEB4C6F18");
						
		param1.put("client", "android");
		param1.put("content", param2);
		param1.put("version", "1.0");

		post.setHeader("Content-Type", "application/json;charset=UTF-8");
		post.setHeader("access_token", "");
		post.setHeader("client", "android");

		StringEntity entity = new StringEntity(param1.toString(), "UTF-8");
		post.setEntity(entity);

		String result;
		HttpResponse response = TestConfig.defaultHttpClient.execute(post);
		result = EntityUtils.toString(response.getEntity(), "UTF-8");

		List<String> list = Arrays.asList(result);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}
}
