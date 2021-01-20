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

public class GetWorkingEngineeringListTest {

	// pc查询施工中分项列表
	@Test
	public void getWorkingEngineeringListTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.getWorkingEngineeringListUrl);
		System.out.println(TestConfig.getWorkingEngineeringListUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("proCode", "2");// 项目编号
		param2.put("startDate", "2020-08-05");//开始日期
		param2.put("endDate", "2020-10-20");//结束日期
		param2.put("pageNum", 1);// 当前页 默认1
		param2.put("pageSize", 10);// 页大小 默认10
		param2.put("engineeringCategoryCode", "2");// 工程类别编码
		param2.put("engineeringTypeCode", "FX05");// 工程类型编码

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
		JSONArray array = JSONArray.parseArray(list.toString());
		return array;
	}
}
