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

public class AddCrossSectionInfoTest {

	//运营平台-lbs基础配置-添加横断面
	@Test
	public void addCrossSectionInfoTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.addCrossSectionInfoUrl);
		System.out.println(TestConfig.addCrossSectionInfoUrl);
		JSONObject param1 = new JSONObject();

		param1.put("engineeringTypeCode", "FX115");// 工程类型编号
		param1.put("lineColor", "#000");// 线条颜色
		param1.put("completeLineColor", "#000");// 完成线条颜色
		param1.put("lineWidth", 5);// 线条宽度
		param1.put("lineShape", "solid");// 线条形状
		param1.put("lineTransparency", 0.25);// 线透明度
		param1.put("fillColor", "#000");// 填充颜色
		param1.put("completeFillColor", "#000");// 完成填充色
		param1.put("transparency", 0.5);// 透明度
		param1.put("remarks", "备注");// 备注
		param1.put("geometry", "4");// 几何形状

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
