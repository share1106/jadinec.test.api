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

public class SaveDeviceWorkingInfoTest {

	// 保存特种设备工作记录
	@Test
	public void saveDeviceWorkingInfoTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.saveDeviceWorkingInfoUrl);
		System.out.println(TestConfig.saveDeviceWorkingInfoUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		
		param2.put("taskOdd", "TSF190723143250251559");//任务编码
		param2.put("workingType", "1");//1-早上打卡；2-晚上打卡
		param2.put("deviceId", 29);//设备ID
		param2.put("deviceType", 1);//1-设备；2-车辆
		param2.put("photoPath", "ASF/ca80ca1c658f4941a463e3ad3d379747.jpg");//照片
		param2.put("recordId", 1);//记录ID，为workingType=2时必填

		param1.put("client", ConfigFile.client_pc);
		param1.put("version", ConfigFile.version);
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
