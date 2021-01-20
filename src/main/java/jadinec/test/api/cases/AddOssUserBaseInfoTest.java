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

public class AddOssUserBaseInfoTest {

	// 添加运营平台人员信息
	@Test
	public void addOssUserBaseInfoTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.addOssUserBaseInfoUrl);
		System.out.println(TestConfig.addOssUserBaseInfoUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		JSONObject param3 = new JSONObject();
		
		param3.put("jobId", "99999642");
		param3.put("isMainJob", 1);
		
		List<JSONObject> listParam = new ArrayList<JSONObject>();
		listParam.add(param3);
		
		String[] listParam1 = {"541"};
		String[] listParam2 = {"1003"};
		int[] listParam3 = {1,2,3};

		param2.put("realName", "TT");
		param2.put("contactNumber", "18600000111");
		param2.put("loginPwd", "123456");
		param2.put("confirmPwd", "123456");
		param2.put("dept", "99461226");
		param2.put("manageJob", "99999642");
		param2.put("manageOrgIds", listParam1);
		param2.put("manageProIds", listParam2);
		param2.put("manageSysIds", listParam3);
		param2.put("enableQueryPrivacy", 0);
		param2.put("manageJobs", listParam);
		param2.put("userType", 0);

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
