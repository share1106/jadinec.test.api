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

public class LaunchTemporaryMoneyTest {

	// 发起流程
	@Test
	public void launchTemporaryMoneyTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.launchTemporaryMoneyUrl);
		System.out.println(TestConfig.launchTemporaryMoneyUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		JSONObject param3 = new JSONObject();
		JSONObject param4 = new JSONObject();

		param3.put("ledgerName", "细目名称1");//细目名称
		param3.put("ledgerCode", "清单编号1");//清单编号
		param3.put("unit", "元");//单位
		param3.put("price", "10.1");//单价
		param3.put("number", "10");//数量
		param3.put("temporaryTypeCode", "sdf1");//临时费类型编号
		param3.put("temporaryTypeName", "扫地费1");//临时费类型名称

		param4.put("ledgerName", "细目名称2");
		param4.put("ledgerCode", "清单编号2");
		param4.put("unit", "元");
		param4.put("price", "20.2");
		param4.put("number", "10");
		param4.put("temporaryTypeCode", "sdf2");
		param4.put("temporaryTypeName", "扫地费2");

		List<JSONObject> listParam = new ArrayList<JSONObject>();
		listParam.add(param3);
		listParam.add(param4);

		param2.put("sectionNumber", 300);//章节号
		param2.put("engineeringCode", "JTDQ-1-038-001-001-031-019-021");// 工程编号
		param2.put("callSign", "签名。。。");//签名
		param2.put("copyPerson", "");//抄送人
		param2.put("detailList", listParam);//明细集合
		
		param1.put("client", ConfigFile.client_pc);
		param1.put("version", ConfigFile.version);
		param1.put("content", param2);

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
