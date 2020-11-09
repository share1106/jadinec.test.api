package jadinec.test.api.cases;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import jadinec.test.api.config.TestConfig;
import jadinec.test.api.utils.ConfigFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ImportUnitTest {

	// 运营平台-单位管理-导入

	private static RestTemplate restTemplate;
	private static FileSystemResource fileSystemResource;
	private static String filePath;

	@Test
	public void importUnitTest() throws IOException {

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

		restTemplate = new RestTemplate();
		filePath = "src/main/resources/单位管理.xlsx";
		fileSystemResource = new FileSystemResource(filePath);
		System.out.println(fileSystemResource.getURL());
		if (!fileSystemResource.exists()) {
			System.out.println("文件不存在");
		}

		MediaType type = MediaType.parseMediaType("multipart/form-data");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(type);
		headers.add("access_token", ConfigFile.access_token_pc);
		headers.add("Accept", ConfigFile.Content_Type);

		MultiValueMap<String, Object> form = new LinkedMultiValueMap<String, Object>();

		form.add("file", fileSystemResource);
		form.add("filename", "单位管理.xlsx");
		form.add("Content-Type", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

		HttpEntity<MultiValueMap<String, Object>> files = new HttpEntity<>(form, headers);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(TestConfig.importUnitUrl, files,
				String.class, "UTF-8");
		System.out.println(TestConfig.importUnitUrl);
		String result;
		result = responseEntity.getBody();
		// System.out.println(result);
		List<String> list = Arrays.asList(result);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}
}
