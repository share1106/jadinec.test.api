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

public class AddLedgerChangeInfoTest {

	// 变更信息-添加
		@Test
		public void addLedgerChangeInfoTest() throws IOException {

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
			HttpPost post = new HttpPost(TestConfig.addLedgerChangeInfoUrl);
			System.out.println(TestConfig.addLedgerChangeInfoUrl);
			JSONObject param1 = new JSONObject();
			JSONObject param2 = new JSONObject();
			JSONObject param3 = new JSONObject();
			
			param3.put("enclosureName", "3333.png");
			param3.put("enclosureUrl", "operationData/ledgerChangeInfo/cda6345e2dbe41fe8d0c2642a425478f.png");

			List<JSONObject> listParam = new ArrayList<JSONObject>();
			listParam.add(param3);
			
			
			param2.put("changeName", "测试台账变更名称888");
			param2.put("changeCode", "20201888");
			param2.put("changeType", "新增");
			param2.put("changeNum", "201888");
			param2.put("changeTime", "2020-12-09");
			param2.put("meetingNum", "2020888");
			param2.put("stump", "100");
			param2.put("changeReason", "测试");
			param2.put("proCode", "2");
			param2.put("enclosureList", listParam);

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
