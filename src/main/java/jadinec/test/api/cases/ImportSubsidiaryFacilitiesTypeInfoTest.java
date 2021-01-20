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

public class ImportSubsidiaryFacilitiesTypeInfoTest {

	// 运营平台-附属设施类型-导入
	private static RestTemplate restTemplate;
	private static FileSystemResource fileSystemResource;
	private static String filePath;

	// 导入成功
	@Test
	public void importSubsidiaryFacilitiesTypeInfoTest() throws IOException {

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

	// 导入失败(导入文件不存在)
	@Test(enabled = false)
	public void importSubsidiaryFacilitiesTypeInfoFail1Test() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult1();
		System.out.println(result);

		String data = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data = jsonObject.getString("msg");
		}

		// 验证结果
		Assert.assertEquals("The supplied file was empty (zero bytes long)", data);
	}

	// 导入成功
	private JSONArray getJsonResult() throws ClientProtocolException, IOException {

		restTemplate = new RestTemplate();
		filePath = "src/main/resources/附属设施类型管理表.xlsx";

		fileSystemResource = new FileSystemResource(filePath);
		System.out.println(fileSystemResource.getURL());
		if (!fileSystemResource.exists()) {
			System.out.println("文件不存在");
		}

		MediaType type = MediaType.parseMediaType("multipart/form-data");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(type);
		headers.add("accessToken", ConfigFile.access_token_pc);
		headers.add("Accept", ConfigFile.Content_Type);

		// headers.add("Accept", "*/*");
		// headers.add("Accept-Language", "zh-CN,zh;q=0.9");

		MultiValueMap<String, Object> form = new LinkedMultiValueMap<String, Object>();

		form.add("file", fileSystemResource);
		form.add("filename", "附属设施类型管理表.xlsx");
		form.add("Content-Type", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

		HttpEntity<MultiValueMap<String, Object>> files = new HttpEntity<>(form, headers);

		ResponseEntity<String> responseEntity = restTemplate
				.postForEntity(TestConfig.importSubsidiaryFacilitiesTypeInfoUrl, files, String.class);
		System.out.println(TestConfig.importSubsidiaryFacilitiesTypeInfoUrl);
		// System.out.println(responseEntity);
		String result;
		result = responseEntity.getBody();

		// System.out.println(result);
		List<String> list = Arrays.asList(result);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}

	// 导入失败(文件不存在)
	private JSONArray getJsonResult1() throws ClientProtocolException, IOException {

		restTemplate = new RestTemplate();
		filePath = "附属设施类型管理表123.xlsx";
		fileSystemResource = new FileSystemResource(filePath);
		System.out.println(fileSystemResource.getURL());
		if (!fileSystemResource.exists()) {
			System.out.println("文件不存在");
		}

		MediaType type = MediaType.parseMediaType("multipart/form-data");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(type);
		headers.add("access_token", ConfigFile.access_token_pc);

		MultiValueMap<String, Object> form = new LinkedMultiValueMap<String, Object>();

		form.add("file", fileSystemResource);
		form.add("filename", "附属设施类型管理表123.xlsx");
		form.add("Content-Type", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

		HttpEntity<MultiValueMap<String, Object>> files = new HttpEntity<>(form, headers);
		ResponseEntity<String> responseEntity = restTemplate
				.postForEntity(TestConfig.importSubsidiaryFacilitiesTypeInfoUrl, files, String.class, "UTF-8");

		System.out.println(TestConfig.importSubsidiaryFacilitiesTypeInfoUrl);
		String result;

		result = responseEntity.getBody();
		// System.out.println(result);
		List<String> list = Arrays.asList(result);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}
}
