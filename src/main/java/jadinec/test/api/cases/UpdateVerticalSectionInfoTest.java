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

public class UpdateVerticalSectionInfoTest {

	// 运营平台-纵断面-修改
	@Test
	public void updateVerticalSectionInfoTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.updateVerticalSectionInfoUrl);
		System.out.println(TestConfig.updateVerticalSectionInfoUrl);
		JSONObject param1 = new JSONObject();

		param1.put("id", "69869765157588992");
		param1.put("engineeringTypeCode", "FX115");
		param1.put("lineColor", "#627EC9");
		param1.put("completeLineColor", "#7699E7");
		param1.put("lineWidth", "1");
		param1.put("lineShape", "solid");
		param1.put("lineTransparency", "0.5");
		param1.put("fillColor", "#DFE4F4");
		param1.put("completeFillColor", "#7699E7");
		param1.put("transparency", "1");
		param1.put("remarks", "备注2");
		param1.put("geometry", "4");

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