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

public class AddContractTest {

	// 添加合同信息
	@Test
	public void addContractTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.addContractUrl);
		System.out.println(TestConfig.addContractUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("contCode", "HT-00001");
		param2.put("contAmount", "654265.33");
		param2.put("contName", "测试合同11");
		param2.put("contDate", "2019-03-25");
		param2.put("orgId", "2");
		param2.put("beginTime", "2019-04-01");
		param2.put("endTime", "2020-10-01");
		param2.put("legalRepPerso", "张三");
		param2.put("contContactWay", "12345678988");
		param2.put("contType", "7");
		param2.put("procAddress", "2xxxxx");
		param2.put("contFile", "233333");
		param2.put("remake", "2");

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
