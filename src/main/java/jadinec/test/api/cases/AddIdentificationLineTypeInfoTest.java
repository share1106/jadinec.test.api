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
import jadinec.test.api.utils.DataProviderMethod;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class AddIdentificationLineTypeInfoTest {

	// 添加几何信息
	@Test(dataProvider="noNameMethod",dataProviderClass=DataProviderMethod.class)
	public void addIdentificationLineTypeInfoTest(String typeName,String typeCode) throws IOException {

		// 发送请求
		JSONArray result = getJsonResult(typeName,typeCode);
		System.out.println(result);

		String data = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data = jsonObject.getString("success");
		}

		// 验证结果
		Assert.assertEquals("true", data);
	}

	private JSONArray getJsonResult(String typeName,String typeCode) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.addIdentificationLineTypeInfoUrl);
		System.out.println(TestConfig.addIdentificationLineTypeInfoUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("typeName", typeName);// 标识线类型名称
		param2.put("typeCode", typeCode);
		param2.put("lineWidth", 2);
		param2.put("lineColor", "#ec0cbb");
		param2.put("lineShape", "solid");
		param2.put("remarks", "测试标识线类型备注");
		param2.put("drawLevel", 1);
		
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
