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

public class UpdateOssOrgInfoTest {

	// 修改运营平台组织机构
	@Test
	public void updateOssOrgInfoTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.updateOssOrgInfoUrl);
		System.out.println(TestConfig.updateOssOrgInfoUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		String[] addr = { "120000", "120100", "120101" };
		
		param2.put("orgId", GetAllOrgNamesTest.stringId);

		param2.put("orgName", "测试新增公司2");
		param2.put("nickName", "新增公司");
		param2.put("unifiedSocialCreditCode", "20201215002");
		param2.put("orgCategory", 1);
		param2.put("regCapital", "5000");
		param2.put("orgType", 1);
		param2.put("incorporationDate", "2020-12-01");
		param2.put("operatingStatus", 2);
		param2.put("adminLoginName", "18700000000");
		param2.put("address", addr);
		param2.put("industry", 7);
		param2.put("regAddress", "天津市高丽区");
		param2.put("businessScope", "紧急集合");
		param2.put("province", "天津市");
		param2.put("city", "市辖区");
		param2.put("area", "和平区");

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
