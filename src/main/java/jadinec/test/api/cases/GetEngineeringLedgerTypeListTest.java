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

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import jadinec.test.api.config.TestConfig;
import jadinec.test.api.utils.ConfigFile;

public class GetEngineeringLedgerTypeListTest {

	public static String stringId = null;
	// 分页列表
	@Test
	public void getEngineeringLedgerTypeListTest() throws IOException {

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
		//System.out.println(data2);

		List<String> list1 = Arrays.asList(data2);
		JSONArray result1 = JSONArray.parseArray(list1.toString());
		//System.out.println(result1);
		
		
		String data3 = null;
		for (int j = 0; j < result1.size(); j++) {
			JSONObject jsonObject = result1.getJSONObject(j);
			data3 = jsonObject.getString("rows");
			}
		//System.out.println(data3);
		
		JSONArray ja = JSONArray.parseArray(data3);
		System.out.println(ja);
		JSONObject jsonObj = null;
		for (int k = 0; k < ja.size(); k++) {
			jsonObj = (JSONObject) JSONObject.parse(ja.get(k).toString());
			if (jsonObj.get("ledgerTypeName").toString().contains("新增细目种类1")) {
				stringId = jsonObj.get("id").toString();
				System.out.println(stringId);
			}

		}

		// 验证结果
		Assert.assertEquals("执行成功", data1);
	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.getEngineeringLedgerTypeListUrl);
		System.out.println(TestConfig.getEngineeringLedgerTypeListUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("pageNum", 1);// 当前页
		param2.put("pageSize", 500);// 页大小

		param1.put("client", ConfigFile.client_pc);
		param1.put("version", ConfigFile.version);
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
		JSONArray array = JSONArray.parseArray(list.toString());
		return array;
	}
}
