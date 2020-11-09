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

public class GetNewEngineeringItemVerticalPointTest {

	// 纵断面,在原1050接口上，修改请求参数格式，去除响应样式”builds”属性
	@Test
	public void getNewEngineeringItemVerticalPointTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.getNewEngineeringItemVerticalPointUrl);
		System.out.println(TestConfig.getNewEngineeringItemVerticalPointUrl);
		JSONObject param1 = new JSONObject();

		param1.put("minLng", "106.463967");//最小经度
		param1.put("minLat", "29.562235");//最小纬度
		param1.put("maxLng", "106.471665");//最大经度
		param1.put("maxLat", "29.566757");//最大纬度
		param1.put("roadLine", "1");//线路
		param1.put("leftRightId", "1");//左右幅
		param1.put("proCode", "5");//项目编码

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
