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

public class UpdateQuantitiesBillTest {

	// 增加
	@Test
	public void updateQuantitiesBillTest() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);

		String data1 = null;
		
		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data1 = jsonObject.getString("msg");
		}
		
		// 验证结果
		Assert.assertEquals("执行成功", data1);
	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.updateQuantitiesBillUrl);
		System.out.println(TestConfig.updateQuantitiesBillUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("id", GetQuantitiesBillPageListTest.stringId);
		param2.put("sectionNumber", "200");// 章节号编号
		param2.put("ledgerCode", "202-1-a");// 项目清单编号
		param2.put("ledgerName", "清理现场");// 细目名称
		param2.put("unit", "DW008");//单位编号
		param2.put("price", "10");//清单单价
		param2.put("contPrice", 5);//原合同单价
		param2.put("contQuantity", 2);//原合同数量
		param2.put("contAmount", 10);//原合同金额
		param2.put("remarks", "测试新增项目工程量清单");
		param2.put("proCode", "2");
		
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
