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

import jadinec.test.api.config.TestConfig;
import jadinec.test.api.utils.ConfigFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class UpdateOrChangeMonthPlanItemTest {

	// 修改或变更月计划项
	@Test
	public void updateOrChangeMonthPlanItemTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.updateOrChangeMonthPlanItemUrl);
		System.out.println(TestConfig.updateOrChangeMonthPlanItemUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		JSONObject param3 = new JSONObject();
		JSONObject param4 = new JSONObject();

		param3.put("year", "2020");// 年份
		param3.put("month", "12");// 月份
		param3.put("monthRatio", "100");// 月占比

		param4.put("year", "2020");
		param4.put("month", "11");
		param4.put("monthRatio", "0");

		List<JSONObject> listParam = new ArrayList<JSONObject>();
		listParam.add(param3);
		listParam.add(param4);

		param2.put("id", 15421);// 计划项id
		param2.put("operation", 2);// 操作 1、修改 2、变更
		param2.put("afterOptPerson", "738");// 计划实施人
		param2.put("afterBeginTime", "2019-11-21");// 计划开始时间
		param2.put("afterFinishTime", "2019-12-20");// 计划完成时间
		param2.put("outPutChangeOrUpdateVOList", listParam);// 计划产值占比
		
		List<JSONObject> listResult = new ArrayList<JSONObject>();
		listResult.add(param2);

		param1.put("content", listResult);

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
