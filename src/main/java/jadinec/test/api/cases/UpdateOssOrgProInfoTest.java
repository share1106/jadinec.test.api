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

public class UpdateOssOrgProInfoTest {

	// 修改运营平台项目部
	@Test
	public void updateOssOrgProInfoTest() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);

		String data = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data = jsonObject.getString("msg");
		}

		// 验证结果
		Assert.assertEquals("执行成功", data);
	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.updateOssOrgProInfoUrl);
		System.out.println(TestConfig.updateOssOrgProInfoUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		String[] addr = { "130000", "130200", "130203" };

		param2.put("proId", GetOrgProListByPageTest.stringId);
		param2.put("proName", "测试新增项目3");
		param2.put("proNickName", "新增项目3");
		param2.put("orgId", GetAllOrgNamesTest.stringId);
		param2.put("address", addr);
		param2.put("proType", 1);
		param2.put("projectPrevDepart", "");
		param2.put("proBidAmount", "2000");
		param2.put("proTotalMileage", "200");
		param2.put("proBeginDate", "2020-12-01");
		param2.put("proWorkMonth", "240");
		param2.put("centerLng", "118.179124");
		param2.put("centerLat", "39.629079");
		param2.put("westNorthLng", "116.557702");
		param2.put("westNorthLat", "39.833936");
		param2.put("eastSouthLng", "117.260827");
		param2.put("eastSouthLat", "38.98512");
		param2.put("adminLoginName", "18600000013");
		param2.put("proProfile", "测试项目新增");
		param2.put("remark", "测试项目备注");
		param2.put("province", "河北省");
		param2.put("city", "唐山市");
		param2.put("area", "路北区");

		param1.put("clientType", 2);
		param1.put("appVersion", 1.9);
		param1.put("serverVersion", 1.9);
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
