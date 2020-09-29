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

public class GetfaceSimilarScoreTest {

	// 图片与特征值对比 返回相似度
	@Test
	public void getfaceSimilarScoreTest() throws IOException {

		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);

		String data1 = null;

		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data1 = jsonObject.getString("success");
		}

		// 验证结果
		Assert.assertEquals("true", data1);

	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.getfaceSimilarScoreUrl);
		System.out.println(TestConfig.getfaceSimilarScoreUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();

		param2.put("headImage", "‪/admin/f892d7f146164846abcd77d50208b772.jpg");
		param2.put("faceFeature", "‪0080FA440000A041A9A907BE5A78273C6800BDBD95A131BD8257903D46EF2B3C4327C8BD4118B2BC1B0121BD43279A3DA5F207BEBE38253E71F95ABCBBD6A03D07E7F8BCDDF251BD2AFACC3D0D8A70BBCAA2D5BDC619AFBD52551CBDAD0BC53D36DAD83C872CC23D22B50EBCA8C53D3E3BDFD0BDFA0C8FBDADEC093B486FF63BC86606BD602BAF3D69E5DC3D25349F3D65E1A43DA77768BCB4178BBB9256823D5551D6BDCA8725BDC6923B3D075485BC0169C43CE6C19FBCD0A3C1BC453C46BD0523D93D2F27ED3D77BEC43DA60937BD59D6ADBD0F460BBDF92F8CBC4AD421BD551264BDDBBB463D2970DF3BFFF52E3DE117B4BD2E6B9CBD796919BCFD0B26BDDD4D5BBD993B4CBC0113B83CCB438EBC7E4EFABB89AB1C3D39F4223B8E5658BAAFC0EB3DD7EC39BD8169723B15407A3DB5E10F3EBECD94BD3EF65B3DAF40C0BD13CB7ABDA08DA6BDB631AABD42A85DBDB331E23DFB92873D6334F4BD47B286BC562D543CDBDDED3C9BC6D0BC41ACA83DB3F48CBD3A06913D61BC84BD5215993CAA1FD2BAE5AF1F3D55CB4ABD62D811BD9A0BADBCB780E0B861D616BD50E4EDBD30F8B23C65528BBD232A0A3CF1A985BCD3A481BB713F923DE51791BD9D6839BD3247473CAD1701BE6901A53D5A41CE3C9D2911BD3089653C5D6EDE3C1726C93DF91D50BD41675DBC7AA0373DC3D240BDCDB832BD4AF9073E152CADBD3E1C4ABCB128103DC96F363D6366963C568613BDA87B5EBD702173BC4D2B243D5790793DC2DF06BD3343513D18C6553D985FEC3C0D7AA23CDB8094BDE312273DF9AF7B3C9658473D40E4813D0E474C3D2E283C3DA2E562BDF332753C9DC4AA3D4FB663BDCB82033CAD96C23DE56B97BB129EF1BD0E2D2ABBF7F3C33CDBDB87BD300D763DD7F4A83DC87006BE4932E5BC6A5D4B3D15C9333C4E90053CB7247BBB40EBA73D4E13FBBC3A0A453C47CB403D22799ABDED7162BC2A0ED03C3B2DA23DDF90DB3CC8F42B3D5FABA33C33A7AFBD2787983D1FEC83BBC5F9503DFDEE833D3F0D5DBC3E09F83D184B953DB94289BD02C40DBEA038C03C6A3AA23DF8FFF73DFC0D0D3C5A2F42BDE5F4FFBAC9167DBD5F33E13DD3060B3D61A8F93DC3827F3D2D5244BEF117533D091718BEE31D34BD6D27BFBC8E0200BC49E9893B306D29BD4D96423DA2E0C83DD03027BC88A6283DBF64E13DB2A7A7BC82F72FBD024DAEBCC6454ABD1A4EE03DB2E7AEBD4A4DAA3D8344FA3CA1EBA2BC9DBCADBCFADFF93DFF341B3DA26743BDBB9B813D7640553D6EA18B3DFFF091BAAD66803DB78270BDEE3E12BDE5282B3E8258013EA9D4DB3B1BF6573DD6C8533C924A1D3D995E333B9E93BD3CA06A36BD97E494BCD0DE71BB8D4A14BBE170993DDE78D0BDE283A23D15649EBC2AA9133CAD9E673D4996503D6DA7183B9969B9BC71DF4ABDF9F20BBE2FB72ABD19D310BDE58544BB");

		param1.put("client", ConfigFile.client);
		param1.put("version", ConfigFile.version);
		param1.put("content", param2);

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
