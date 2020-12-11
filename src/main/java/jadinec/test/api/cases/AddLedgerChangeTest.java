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

public class AddLedgerChangeTest {

	// 变更明细-新增项目台账数量变更-提交
	@Test
	public void addLedgerChangeTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.addLedgerChangeUrl);
		System.out.println(TestConfig.addLedgerChangeUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		JSONObject param3 = new JSONObject();

		param3.put("id", "89172653100896256");
		param3.put("stump", "K299+340.013通道左幅0-1桩基");
		param3.put("sectionNumber", "400");
		param3.put("engineeringCode", "JDGF-1-001-001-001-001-041-000");
		param3.put("ledgerCode", "403-2-a");
		param3.put("ledgerName", "	\r\n" + 
				"光圆钢筋（HPB235、HPB300）");              
		param3.put("unit", "kg");
		param3.put("designQuantity", 0);
		param3.put("changeAfterQuantity", "3");
		param3.put("engineeringName", "0-1桩基");
		
		List<JSONObject> listParam = new ArrayList<JSONObject>();
		listParam.add(param3);

		param2.put("changeInfoId", GetLedgerChangeInfoPageListTest.stringId);
		param2.put("proCode", "2");
		param2.put("list", listParam);

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
