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

public class BaseImportTest {

	// 导入

	private static RestTemplate restTemplate;
	private static FileSystemResource fileSystemResource;
	private static String filePath;
	
	@Test
	public void baseImportTest() throws IOException {

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
		filePath = "src/main/resources/项目路线信息表.xlsx";
		fileSystemResource = new FileSystemResource(filePath);
		System.out.println(fileSystemResource.getURL());
		if(!fileSystemResource.exists()) {
			System.out.println("文件不存在");
		}
		
		MediaType type = MediaType.parseMediaType("multipart/form-data");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(type);
		headers.add("access_token", ConfigFile.access_token_pc);
				
		MultiValueMap<String,Object> form = new LinkedMultiValueMap<String,Object>();
		
		form.add("file", fileSystemResource);
		form.add("filename", "项目路线信息表.xlsx");
		form.add("Content-Type", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		form.add("importType", "1");
		form.add("proCode", "2");
		form.add("type", "roadLine");
		
		HttpEntity<MultiValueMap<String,Object>> files = new HttpEntity<>(form,headers);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(TestConfig.baseImportUrl, files,String.class);
		System.out.println(TestConfig.baseImportUrl);
		String result;
		result = responseEntity.getBody();
		// System.out.println(result);
		List<String> list = Arrays.asList(result);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}
}
