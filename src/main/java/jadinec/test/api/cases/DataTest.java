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

public class DataTest {

	// 新版大屏刘海页首页统计
	@Test
	public void dataTest() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);

		String data1 = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data1 = jsonObject.getString("success");
		}

		// 验证结果
		Assert.assertEquals("true", data1);

	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.dataUrl);
		System.out.println(TestConfig.dataUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("1703", "project_cumulative");// 查询开累总产值权限
		param2.put("1704", "project_month_cumulative");// 查询月产值权限
		param2.put("1705", "project_day_cumulative");// 查询日产值权限
		param2.put("1706", "subcontract_cumulative");// 查询分包金额权限
		param2.put("1707", "subcontract_month_cumulative");// 查询月分包金额
		param2.put("1708", "subcontract_day_cumulative");//查询日分包金额
		param2.put("1709", "online_user_manager"); // 查询在线管理人员
		param2.put("1710", "online_user_worker");// 查询进场工人
		param2.put("1711", "online_device");// 查询进场设备
		param2.put("1900", "material_cumulative"); // 查询物料金额
		param2.put("1901", "material_month_cumulative");// 查询月物料金额
		param2.put("1902", "material_day_cumulative");// 查询日物料金额
		param2.put("proCode", "5");// 项目编号

		param1.put("client", ConfigFile.client_pc);
		param1.put("version", ConfigFile.version);
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
