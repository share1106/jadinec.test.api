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

public class ImportCrossSectionInfoTest {

	// 运营平台-横断面-导入
	@Test(enabled=false)
	public void importCrossSectionInfoTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.importCrossSectionInfoUrl);
		System.out.println(TestConfig.importCrossSectionInfoUrl);
		JSONObject param1 = new JSONObject();
		
		param1.put("filename", "C:/Users/ganggang/Desktop/10.12/工程几何信息管理表.xlsx");
		//param1.put("name", "file");
		param1.put("Content-Type", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		param1.put("Content-Disposition", "form-data");
		param1.put("Content-Transfer-Encoding", "binary");
		
		//post.setHeader("Content-Type", "multipart/form-data");
		post.setHeader("access_token", ConfigFile.access_token_pc);
		//post.setHeader("client", ConfigFile.client_pc);

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
