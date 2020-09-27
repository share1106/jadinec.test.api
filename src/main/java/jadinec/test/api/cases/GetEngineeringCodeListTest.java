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

public class GetEngineeringCodeListTest {

	// 工作月计划添加分项数据列表
	@Test
	public void getEngineeringCodeListTest() throws IOException {

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
		HttpPost post = new HttpPost(TestConfig.getEngineeringCodeListUrl);
		System.out.println(TestConfig.getEngineeringCodeListUrl);
		JSONObject param1 = new JSONObject();
		
		List<String> listParam1 = new ArrayList<String>();
		listParam1.add("1");
		listParam1.add("2");
		listParam1.add("3");
		
		List<String> listParam2 = new ArrayList<String>();
		listParam2.add("JTDQ-1-011-001-002-201-001-000");
		listParam2.add("JTDQ-1-011-001-002-201-002-000");
		listParam2.add("JTDQ-1-011-001-002-201-003-000");
		
		List<String> listParam3 = new ArrayList<String>();
		listParam3.add("FX01");
		listParam3.add("FX02");
		listParam3.add("FX03");
		
		param1.put("workAreaDeptId", 313);// 工区部门id
		param1.put("engineeringCategoryCodeList", listParam1);//工程类别
		param1.put("engineeringList", listParam2);//工程编码code
		param1.put("engineeringTypeCodeList", listParam3);//分项类型
		param1.put("keyWords", ""); //关键字
		param1.put("pageNum", 1);//页数
		param1.put("pageSize", 10); //每页条数
		param1.put("engineeringCodeList", null);//分项code   已经选中的分项

		post.setHeader("Content-Type", ConfigFile.Content_Type);
		post.setHeader("access_token", ConfigFile.access_token);
		post.setHeader("client", ConfigFile.client);
		

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
