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

public class AddMonthPlanItemTest {

	// 添加月计划项
	@Test
	public void addMonthPlanItemTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.addMonthPlanItemUrl);
		System.out.println(TestConfig.addMonthPlanItemUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		JSONObject param3 = new JSONObject();
		JSONObject param4 = new JSONObject();
		
		param3.put("year", "2019");//年份
		param3.put("month", "7");//月份
		param3.put("monthRatio", "30");//月占比
		
		param4.put("year", "2019");
		param4.put("month", "8");
		param4.put("monthRatio", "50");
		
		List<JSONObject> listParam = new ArrayList<JSONObject>();
		listParam.add(param3);
		listParam.add(param4);
		
		param2.put("monthPlanId", 64);// 月计划id
		param2.put("engineeringCode", "JTDQ-1-038-001-001-010-019-026");// 工程编号
		param2.put("beginTime", "2019-06-21");// 开始时间
		param2.put("finishTime", "2019-09-20");// 完成时间
		param2.put("workDay", "90");// 工期
		param2.put("year", "2019");// 年份
		param2.put("month", "7");// 月份
		param2.put("optPerson", "738");// 计划实施人
		param2.put("optPersonName", "张峰");// 计划实施人名称
		param2.put("isBestraddleMonth", 1);// 是否跨月 0、否 1、是
		param2.put("remark", "");// 备注
		param2.put("monthRatioList", listParam);// 月占比列表
		
		List<JSONObject> listResult = new ArrayList<JSONObject>();
		listResult.add(param2);
		
		param1.put("content", listResult);
		

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
