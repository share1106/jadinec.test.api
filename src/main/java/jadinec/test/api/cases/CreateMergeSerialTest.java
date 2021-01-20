package jadinec.test.api.cases;

import java.io.IOException;
import java.util.ArrayList;
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

public class CreateMergeSerialTest {

	// 创建并单
	@Test
	public void createMergeSerialTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.createMergeSerialUrl);
		System.out.println(TestConfig.createMergeSerialUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		JSONObject param3 = new JSONObject();
		JSONObject param4 = new JSONObject();
		JSONObject param5 = new JSONObject();
		JSONObject param6 = new JSONObject();
		JSONObject param7 = new JSONObject();
		JSONObject param8 = new JSONObject();
		JSONObject param9 = new JSONObject();
		JSONObject param10 = new JSONObject();

		param4.put("select:4", "203");
				
		param5.put("select:1", "206");
				
		param8.put("sysref:beginWorkTime", "2020-05-22");
				
		param9.put("sysref:concrete", "27.13");
				
		param10.put("sysref:content", "");
				
		List<JSONObject> paramList1 = new ArrayList<JSONObject>();
		paramList1.add(param4);
		paramList1.add(param5);
		paramList1.add(param8);
		paramList1.add(param9);
		paramList1.add(param10);
		
		param6.put("engineeringCode", "JTSG-1-002-001-001-001-001-000");
		param6.put("processCode", "GX0201");
		param6.put("designConcrete", 13.56);
		
		param7.put("engineeringCode", "JTSG-1-002-001-001-001-001-000");//基准单分项
		param7.put("processCode", "GX0202");//基准单工序
		param7.put("designConcrete", 13.56);
		
		List<JSONObject> paramList2 = new ArrayList<JSONObject>();
		paramList2.add(param6);
		paramList2.add(param7);

		param3.put("args", paramList1);
		param3.put("engineeringList", paramList2);//合并单列表
		
		param2.put("engineeringCode", "JTSG-1-002-001-001-001-001-000");
		param2.put("processCode", "GX0201");
		param2.put("form", param3);
		
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
