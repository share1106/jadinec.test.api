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

public class AddSubsidiaryFacilitiesTypeInfoTest {

	// 增加附属设施成功(正常增加)
	@Test
	public void addSubsidiaryFacilitiesTypeInfoTest() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult1();
		System.out.println(result);

		String msg = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			msg = jsonObject.getString("msg");
		}

		// 验证结果
		Assert.assertEquals("执行成功", msg);
	}

	// 增加附属设施失败(数据已存在)
	@Test
	public void addSubsidiaryFacilitiesTypeInfoFail1Test() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult1();
		System.out.println(result);

		String msg = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			msg = jsonObject.getString("msg");
		}

		// 验证结果
		Assert.assertEquals("设施类型编码已存在", msg);
	}

	// 增加附属设施失败(必填项为空)
	@Test
	public void addSubsidiaryFacilitiesTypeInfoFail2Test() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult2();
		System.out.println(result);

		String msg = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			msg = jsonObject.getString("msg");
		}

		// 验证结果
		Assert.assertEquals("设施类型编码不能空", msg);
	}
	
	
	/**
	 * 	参数正确
	 */
	private JSONArray getJsonResult1() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.addSubsidiaryFacilitiesTypeInfoUrl);
		System.out.println(TestConfig.addSubsidiaryFacilitiesTypeInfoUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		// int rand=(int)(Math.random()*10);
		param2.put("typeName", "测试附属设置类型1");
		param2.put("typeCode", 13);
		param2.put("lineWidth", "2");
		param2.put("lineColor", "#bb1b1b");
		param2.put("lineShape", "solid");
		param2.put("fillColor", "#000000");
		param2.put("geometry", "5");
		param2.put("drawLevel", 2);
		param2.put("lineTransparency", "");
		param2.put("transparency", 0);
		
		param1.put("version", ConfigFile.version);
		param1.put("client", ConfigFile.client_pc);
		param1.put("content", param2);

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

	/**
	 * 	必填字段为空
	 */
	private JSONArray getJsonResult2() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.addSubsidiaryFacilitiesTypeInfoUrl);
		System.out.println(TestConfig.addSubsidiaryFacilitiesTypeInfoUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		// int rand=(int)(Math.random()*10);
		param2.put("typeName", "测试附属设置类型2");
		param2.put("typeCode", null);
		param2.put("lineWidth", "2");
		param2.put("lineColor", "#bb1b1b");
		param2.put("lineShape", "solid");
		param2.put("fillColor", "#000000");
		param2.put("geometry", "5");
		param2.put("drawLevel", 2);
		param2.put("lineTransparency", "");
		param2.put("transparency", 0);
		
		param1.put("version", ConfigFile.version);
		param1.put("client", ConfigFile.client_pc);
		param1.put("content", param2);

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
