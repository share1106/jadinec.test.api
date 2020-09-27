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

public class AddOrUpdateTest {

	// 新增或者修改工时方案
	@Test
	public void addOrUpdateTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.addOrUpdateUrl);
		System.out.println(TestConfig.addOrUpdateUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		JSONObject param3 = new JSONObject();
		JSONObject param4 = new JSONObject();
		
		param3.put("processCode", "GX0101");//工序编码
		param3.put("processName", "桩基成孔（挖孔灌注桩）");//工序名称
		param3.put("stepCode", "BZ0201");//步骤编码
		param3.put("stepName", "测量放样");//步骤名称
		param3.put("hourNum", "1");//小时数量
		param3.put("minuteNum", "1");//分钟数量
		
		param4.put("processCode", "GX0101");//工序编码
		param4.put("processName", "桩基成孔（挖孔灌注桩）");//工序名称
		param4.put("stepCode", "BZ0301");//步骤编码
		param4.put("stepName", "挖孔开始");//步骤名称
		param4.put("hourNum", "2");//小时数量
		param4.put("minuteNum", "2");//分钟数量
		
		List<JSONObject> listParam = new ArrayList<JSONObject>();
		listParam.add(param3);
		listParam.add(param4);
		
		param2.put("id", 1);
		param2.put("engineeringCategoryCode", "2");//工程类别编码
		param2.put("engineeringCategoryName", "桥梁");//工程类别名称
		param2.put("engineeringTypeCode", "FX01");//工程类型编码
		param2.put("engineeringTypeName", "桩基（挖孔桩）");//工程类型名称
		param2.put("totalHourNum", 8);//总小时数量
		param2.put("totalMinuteNum", 8);//总分钟数量
		param2.put("stepList", listParam);//步骤详细集合

		param1.put("client", "android");
		param1.put("version", "1.0");
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
