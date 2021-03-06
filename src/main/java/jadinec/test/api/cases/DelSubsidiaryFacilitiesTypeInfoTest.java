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

public class DelSubsidiaryFacilitiesTypeInfoTest {

	//删除附属设施类型成功
	@Test
	public void delSubsidiaryFacilitiesTypeInfoTest() throws IOException {

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
	
	//删除附属设施类型失败(参数不存在)
		@Test
		public void delSubsidiaryFacilitiesTypeInfoFail1Test() throws IOException {

			// 发送请求
			JSONArray result = getJsonResult1();
			System.out.println(result);

			String data = null;

			for (int i = 0; i < result.size(); i++) {
				JSONObject jsonObject = result.getJSONObject(i);
				data = jsonObject.getString("msg");
			}

			// 验证结果
			Assert.assertEquals("参数不存在", data);
		}

	//删除附属类型成功
	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.delSubsidiaryFacilitiesTypeInfoUrl);
		System.out.println(TestConfig.delSubsidiaryFacilitiesTypeInfoUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		String id = GetSubsidiaryFacilitiesTypeInfoPageListTest.stringId;
		String[] paramStr = {id};
		param2.put("ids", paramStr);
		
		param1.put("version", ConfigFile.version);
		param1.put("client", ConfigFile.client_pc);
		param1.put("content", param2);
		
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
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}
	
	//删除附属类型失败(参数不存在)
		private JSONArray getJsonResult1() throws ClientProtocolException, IOException {
			HttpPost post = new HttpPost(TestConfig.delSubsidiaryFacilitiesTypeInfoUrl);
			System.out.println(TestConfig.delSubsidiaryFacilitiesTypeInfoUrl);
			JSONObject param1 = new JSONObject();
			JSONObject param2 = new JSONObject();

			String id = "88888888";
			String[] paramStr = {id};
			param2.put("ids", paramStr);
			
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
