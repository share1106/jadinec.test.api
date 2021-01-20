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

public class GetEngineeringItemListsTest {

	// 获取分包商统计四级页面数据
	@Test
	public void getEngineeringItemListsTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.getEngineeringItemListsUrl);
		System.out.println(TestConfig.getEngineeringItemListsUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("type", "history");// history-查询开累产值，month-查询月产值，day-查询当日产值
		param2.put("date", "");// type为month的时候date格式【2019-10】；ype为day的时候date格式【2019-10-10】
		param2.put("engineeringCategoryCode", "2");// 工程类别
		param2.put("engineeringCode", "JTSG-1-050-000-000-000-000-000");// 工程编码
		param2.put("engineeringItemId", 492967);//工程ID
		param2.put("workAreaCodes", "GQ0011");// 工区编码
		param2.put("engineeringName", "");
		param2.put("deptId", 156);// 部门ID
		param2.put("proCode", "5");// 项目编号

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
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}
}
