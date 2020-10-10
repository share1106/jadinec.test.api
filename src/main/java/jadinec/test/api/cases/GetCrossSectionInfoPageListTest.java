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

public class GetCrossSectionInfoPageListTest {

	public static String id ;
	//运营平台-lbs基础配置-横断面分页列表
	@Test
	public void getCrossSectionInfoPageListTest() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);

		String data1 = null;
		String data2 = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data1 = jsonObject.getString("success");
			data2 = jsonObject.getString("data");
		}
		//System.out.println(data2);
		List<String> list1 = Arrays.asList(data2);
		JSONArray array = JSONArray.fromObject(list1);
		String data = null;
		for (int j = 0; j < array.size(); j++) {
			JSONObject jsonObject = array.getJSONObject(j);
			data = jsonObject.getString("list");
			
		}

		
		// 验证结果
		Assert.assertEquals("true", data1);
	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.getCrossSectionInfoPageListUrl);
		System.out.println(TestConfig.getCrossSectionInfoPageListUrl);
		JSONObject param1 = new JSONObject();

		param1.put("lineShape", "");//线条形状
		param1.put("geometry", "");//几何形状
		param1.put("keyWords", "");//查询条件
		param1.put("pageNum", 1);//当前页 默认1
		param1.put("pageSize", 10);//页大小 默认10

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
