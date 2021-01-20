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

public class AddGeometryInfoTest {

	// 添加几何信息
	@Test
	public void addGeometryInfoTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.addGeometryInfoUrl);
		System.out.println(TestConfig.addGeometryInfoUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("engineeringTypeCode", "FX235");// 工程类型编号
		param2.put("lineColor", "#dc1b1b");// 线条颜色
		param2.put("completeLineColor", "#22e215");// 完成线条颜色
		param2.put("lineWidth", 2);// 线条宽度
		param2.put("lineShape", "solid");// 线条形状
		param2.put("lineTransparency", 1);// 线透明度
		param2.put("fillColor", "#000000");// 填充颜色
		param2.put("completeFillColor", "#000000");// 完成填充色
		param2.put("transparency", 0);// 透明度
		param2.put("remarks", "测试几何信息备注");// 备注
		param2.put("geometry", "4");// 几何形状
		param2.put("drawLevel", 2);
		param2.put("isClick", 0);
		param2.put("completeFillTransparency", 0);
		
		param1.put("version", ConfigFile.version);
		param1.put("client", ConfigFile.client_pc);
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
