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

public class UpdateWeighingListTest {

	// 更新称重单数量
	@Test
	public void updateWeighingListTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.updateWeighingListUrl);
		System.out.println(TestConfig.updateWeighingListUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
		JSONObject param3 = new JSONObject();
		JSONObject param4 = new JSONObject();
		
		param3.put("accountId", 776);
		param3.put("headImg", "");
		param3.put("id", 301);
		param3.put("realName", "邢月蓉8");
		param3.put("roleName", "经营部副部长8");
		param3.put("choosed", true);
		
		param4.put("accountId", 886);
		param4.put("headImg", "http://jadinec-test.celerate.aliyuncs.com/admin/87928f545cdc4493af795f6cbdfaeda8.jpg");
		param4.put("id", 301);
		param4.put("realName", "李雅8");
		param4.put("roleName", "经营部主办8");
		param4.put("choosed", true);
		
		List<JSONObject> listParam = new ArrayList<JSONObject>();
		listParam.add(param3);
		listParam.add(param4);

		param2.put("id", 231);// 记录ID
		param2.put("documentNumber", "FLD202006306691");// 出厂单编号
		param2.put("accountId", 2375);// 发料员用户ID
		param2.put("signature", "admin/a58bbe4995514971b04dff79fb3b.jpg"); // 发料员签名
		param2.put("deptId", 1312);// 部门ID
		param2.put("deptName", "洞渣加工厂8");// 部门名称
		param2.put("destinationId", "1288");// 目的地ID
		param2.put("deviceId", "603");// 设备ID
		param2.put("driverAccountId", 1169);// 司机ID
		param2.put("copyPerson", listParam);// 抄送人 - 可以是JOSN字符串

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
