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

	// 修改附属设施成功(正常修改)
	@Test
	public void updateSubsidiaryFacilitiesTypeInfoTest() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);

		String data = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data = jsonObject.getString("msg");
		}

		// 验证结果
		Assert.assertEquals("执行成功", data);
	}

	
	// 修改附属设施失败(必填参数为空)
	@Test
	public void updateSubsidiaryFacilitiesTypeInfoFailTest() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult1();
		System.out.println(result);

		String data = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data = jsonObject.getString("msg");
		}

		// 验证结果
		Assert.assertEquals("设施类型编码不能空", data);
	}
	

	// 参数正确
	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.updateSubsidiaryFacilitiesTypeInfoUrl);
		System.out.println(TestConfig.updateSubsidiaryFacilitiesTypeInfoUrl);
		JSONObject param1 = new JSONObject();

		param1.put("id", GetSubsidiaryFacilitiesTypeInfoPageListTest.stringId);
		param1.put("typeName", "测试附属设置类型3");
		param1.put("typeCode", 13);
		param1.put("lineWidth", "1");
		param1.put("lineColor", "#bb1b1b");
		param1.put("lineShape", "dashed");
		param1.put("fillColor", "#000000");
		param1.put("geometry", "5");
		param1.put("drawLevel", 3);
		param1.put("lineTransparency", "");
		param1.put("transparency", 0);

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

	
	// 必填项为空
	private JSONArray getJsonResult1() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.updateSubsidiaryFacilitiesTypeInfoUrl);
		System.out.println(TestConfig.updateSubsidiaryFacilitiesTypeInfoUrl);
		JSONObject param1 = new JSONObject();

		param1.put("id", GetSubsidiaryFacilitiesTypeInfoPageListTest.stringId);
		param1.put("typeName", "测试附属设置类型3");
		param1.put("typeCode", null);
		param1.put("lineWidth", "1");
		param1.put("lineColor", "#bb1b1b");
		param1.put("lineShape", "dashed");
		param1.put("fillColor", "#000000");
		param1.put("geometry", "5");
		param1.put("drawLevel", 3);
		param1.put("lineTransparency", "");
		param1.put("transparency", 0);

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
