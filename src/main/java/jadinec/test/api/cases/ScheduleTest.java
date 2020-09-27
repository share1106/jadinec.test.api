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

public class ScheduleTest {

	// 施工进度列表
	@Test
	public void scheduleTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.scheduleUrl);
		System.out.println(TestConfig.scheduleUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		JSONObject param3 = new JSONObject();

		param3.put("state", "");// 施工状态 0-未计划 1-已计划 2-待安排 3-施工中 4-已完成
		param3.put("keyWord", "");// 关键词
		param3.put("bTime", "");// 开始时间
		param3.put("eTime", "");// 结束时间
		param3.put("category", 1);// 调用1562接口     工程类别
		param3.put("workArea", "");// 工区代码
		param3.put("sortKey", "");// 时间：last_update_time 部位：engineering_short_name 状态：exec_state
		param3.put("sortRule", "ASC");// desc、asc

		param2.put("page", 1);// 分页页码
		param2.put("cond", param3);

		param1.put("client", ConfigFile.client);
		param1.put("version", ConfigFile.version);
		param1.put("content", param2);

		post.setHeader("Content-Type", ConfigFile.Content_Type);
		post.setHeader("access_token", ConfigFile.access_token);
		post.setHeader("client", ConfigFile.client);

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
