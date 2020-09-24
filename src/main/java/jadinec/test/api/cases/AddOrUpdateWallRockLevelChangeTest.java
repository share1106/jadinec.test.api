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

public class AddOrUpdateWallRockLevelChangeTest {

	// 新增围岩级别变更
	@Test(enabled=false)
	public void addOrUpdateWallRockLevelChangeTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.addOrUpdateWallRockLevelChangeUrl);
		System.out.println(TestConfig.addOrUpdateWallRockLevelChangeUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("changeRockLevel", "IV");// 变更围岩等级
		param2.put("changeLiningType", "SIVc");// 衬砌类型编码
		param2.put("changeLength", 65);// 变更长度
		param2.put("engineeringCode", "ZH-10-500-001-002-001-001-000");
		param2.put("changeNo", "WYBG202007244131");
		param2.put("deptId", 1300);
		param2.put("changeStartStake", "124395.0");// 变更起始桩号
		param2.put("changeEndStake", "124425.0");// 变更结束桩号
		param2.put("changeDetail", "");
		param2.put("copyPerson", "");
		param2.put("signature", "");

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
