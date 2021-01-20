package jadinec.test.api.cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import jadinec.test.api.config.TestConfig;
import jadinec.test.api.utils.ConfigFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ImportEngineeringTypeTest {

	// 运营平台-工程类型-导入

	@Test
	public void importEngineeringTypeTest() throws IOException {

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

		HttpResponse response = null;
		String result = "";
		String filePath = "src/main/resources/工程类型.xlsx";

		if (StringUtils.isNotBlank(TestConfig.importEngineeringTypeUrl)) {
			HttpPost post = new HttpPost(TestConfig.importEngineeringTypeUrl);
			System.out.println(TestConfig.importEngineeringTypeUrl);

			post.setHeader("accessToken", ConfigFile.access_token_pc);

			File file = new File(filePath);
			FileInputStream fileInputStream = new FileInputStream(file);

			org.apache.http.HttpEntity build = MultipartEntityBuilder.create()
					.addBinaryBody("file", fileInputStream, ContentType.DEFAULT_BINARY, file.getName()).build();
			post.setEntity(build);
			response = TestConfig.defaultHttpClient.execute(post);

			int statusCode = response.getStatusLine().getStatusCode();
			//System.out.println(statusCode);
			String str = EntityUtils.toString(response.getEntity(), "UTF-8");

			if (200 == statusCode) {
				result = str;
			}
		} else {
			System.out.println("上传文件为空");
		}

		// System.out.println(result);
		List<String> list = Arrays.asList(result);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}
}
