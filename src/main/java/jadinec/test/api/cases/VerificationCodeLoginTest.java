package jadinec.test.api.cases;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jadinec.test.api.config.TestConfig;
import jadinec.test.api.model.InterfaceName;
import jadinec.test.api.utils.ConfigFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class VerificationCodeLoginTest {

	public static String token = null;
	public static String refreshToken = null;
	@BeforeTest
	public void beforeTest() {
		TestConfig.getTokenUrl = ConfigFile.getUrl(InterfaceName.GetToken);
		TestConfig.verificationCodeLoginUrl = ConfigFile.getUrl(InterfaceName.VerificationCodeLogin);
		TestConfig.getAppUpdateUrl = ConfigFile.getUrl(InterfaceName.GetAppUpdate);
		TestConfig.getEngineeringPlaneUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringPlane);
		TestConfig.getUserUrl = ConfigFile.getUrl(InterfaceName.GetUserInfo);
		TestConfig.getEngineeringItemPlaneUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringItemPlane);
		TestConfig.addUserToGroupUrl = ConfigFile.getUrl(InterfaceName.AddUserToGroup);
		TestConfig.getSigUrl = ConfigFile.getUrl(InterfaceName.GetIMSign);
		TestConfig.getORGUserDetailUrl = ConfigFile.getUrl(InterfaceName.GetORGUserDetail);
		TestConfig.getTaskItemsUrl = ConfigFile.getUrl(InterfaceName.GetTaskItem);
		TestConfig.okForCloseStepUrl = ConfigFile.getUrl(InterfaceName.SubmitTask);
		TestConfig.reworkForStepUrl = ConfigFile.getUrl(InterfaceName.Submit_Rework);
		TestConfig.getEngineeringItemHorizontalUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringItemHorizontal);
		TestConfig.getEngineeringProcessUrl = ConfigFile.getUrl(InterfaceName.GetProcessDetail);
		TestConfig.getEngineeringSubItemUrl = ConfigFile.getUrl(InterfaceName.GetSubEngineeringList);
		TestConfig.changeTaskReadUrl = ConfigFile.getUrl(InterfaceName.UpdateTaskReadStatus);
		TestConfig.sendSmsVerificationCodeUpdatePwdUrl = ConfigFile.getUrl(InterfaceName.SendVerifyCodeToPhoneUpdatePassword);
		TestConfig.updatePwdApiUrl = ConfigFile.getUrl(InterfaceName.UpdatePassword);
		TestConfig.getUserInfoUrl = ConfigFile.getUrl(InterfaceName.GetSysUserDetailInfo);
		TestConfig.saveOpinionUrl = ConfigFile.getUrl(InterfaceName.CommitFeedback);
		TestConfig.sendSmsUpdatePhoneNumVerificationCodeUrl = ConfigFile.getUrl(InterfaceName.SendVerifyCodeToPhoneSwitchPhone);
		TestConfig.updateImgUrl = ConfigFile.getUrl(InterfaceName.UpdateImage);
		TestConfig.getTaskItemsUrl = ConfigFile.getUrl(InterfaceName.GetTaskFormList);
		TestConfig.getFacilitiesCodeUrl = ConfigFile.getUrl(InterfaceName.GetAttendanceRules);
		TestConfig.saveAttendanceRecordInfoUrl = ConfigFile.getUrl(InterfaceName.CommitClockInRecord);
		TestConfig.getAttendanceRecordStatisticsUrl = ConfigFile.getUrl(InterfaceName.GetMonthClockInStatistics);
		TestConfig.processItemsUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringStepItem);
		TestConfig.refreshTokenUrl = ConfigFile.getUrl(InterfaceName.RefreshAccessToken);
		TestConfig.toggleRoleUrl = ConfigFile.getUrl(InterfaceName.UpdateUserRole);
		TestConfig.stepForDetailsUrl = ConfigFile.getUrl(InterfaceName.GetTaskDetail);
		TestConfig.noticeItemsUrl = ConfigFile.getUrl(InterfaceName.GetMessageNotice);
		TestConfig.getNoticeMessageListUrl = ConfigFile.getUrl(InterfaceName.GetMessageNoticeNew);
		TestConfig.batchDealWithMsgUrl = ConfigFile.getUrl(InterfaceName.BatchDealWithMsg);
		TestConfig.getMechanicalListUrl = ConfigFile.getUrl(InterfaceName.GetAllDevice);
		TestConfig.obtainBindingStateUrl = ConfigFile.getUrl(InterfaceName.GetLastBindDevice);
		TestConfig.bindMechanicalUrl = ConfigFile.getUrl(InterfaceName.UpdateDeviceBindStatus);
		TestConfig.toggleMechanicalUrl = ConfigFile.getUrl(InterfaceName.UpdateDeviceWorkStatus);
		TestConfig.readNoticeUrl = ConfigFile.getUrl(InterfaceName.UpdateMessageNoticeStatus);
		TestConfig.delNoticeUrl = ConfigFile.getUrl(InterfaceName.DelMessageNotice);
		TestConfig.obtainStepIdUrl = ConfigFile.getUrl(InterfaceName.GetRedoStep);
		TestConfig.obtainMenusForRoleUrl = ConfigFile.getUrl(InterfaceName.GetMenuList);
		TestConfig.obtainStepItemUrl = ConfigFile.getUrl(InterfaceName.GetTaskFlowStepList);
		TestConfig.getTeamListUrl = ConfigFile.getUrl(InterfaceName.GetAllTeams);
		TestConfig.getTeamLeaderUrl = ConfigFile.getUrl(InterfaceName.GetTeamCaptainList);
		TestConfig.getTeamMemberUrl = ConfigFile.getUrl(InterfaceName.GetTeamStaffList);
		TestConfig.saveTeamUrl = ConfigFile.getUrl(InterfaceName.AddTeam);
		TestConfig.editTeamUrl = ConfigFile.getUrl(InterfaceName.UpdateTeam);
		TestConfig.delTeamUrl = ConfigFile.getUrl(InterfaceName.DeleteTeam);
		TestConfig.getPoiListUrl = ConfigFile.getUrl(InterfaceName.GetPoiData);
		TestConfig.getAllotProcessBarUrl = ConfigFile.getUrl(InterfaceName.GetAllocTabNew);
		TestConfig.getPlanManageTaskUrl = ConfigFile.getUrl(InterfaceName.GetAllocListNew);
		TestConfig.getProcessListUrl = ConfigFile.getUrl(InterfaceName.GetTechProcess);
		TestConfig.getEngineeringItemInfoUrl = ConfigFile.getUrl(InterfaceName.GetFenEngineeringData);
		TestConfig.getOrgAllUserInfoUrl = ConfigFile.getUrl(InterfaceName.GetSignPeopleData);
		TestConfig.getOrgNameUrl = ConfigFile.getUrl(InterfaceName.GetContratorNick);
		TestConfig.savePlanProcessUrl = ConfigFile.getUrl(InterfaceName.CommitDailyPlans);
		TestConfig.getDayPlanProcessListUrl = ConfigFile.getUrl(InterfaceName.GetArrangedMonthPlan);
		TestConfig.doRevokeUrl = ConfigFile.getUrl(InterfaceName.RevokeDailyPlan);
		TestConfig.getTechnologySecurityDisclosureUrl = ConfigFile.getUrl(InterfaceName.GetTechOrSafeCom);
		TestConfig.getAppTechnologySecurityDisclosureInfoUrl = ConfigFile.getUrl(InterfaceName.GetTechOrSafeDetail);
		TestConfig.applyFormSortForAllUrl = ConfigFile.getUrl(InterfaceName.ModiPouringSequenceAll);
		TestConfig.applyFormSortForOneUrl = ConfigFile.getUrl(InterfaceName.ModiPouringSequence);
		TestConfig.confirmApplyFormUrl = ConfigFile.getUrl(InterfaceName.ModiPouringStatus);
		TestConfig.changeWorkBeginTimeUrl = ConfigFile.getUrl(InterfaceName.ModiPouringBeginTime);
		
		TestConfig.defaultHttpClient = new DefaultHttpClient();
	}
	
	//非常规设备 短信验证登录
	@Test(groups="verificationCodeLoginSuccess",enabled=false)
	public void verificationCodeLoginTest() throws IOException {
		
		// 发送请求
		JSONArray result = getJsonResult();
		System.out.println(result);
		
		String data = null;
		String data1 = null;
		
		for (int i = 0; i < result.size(); i++) {
			JSONObject jsonObject = result.getJSONObject(i);
			data = jsonObject.getString("success");
			data1 = jsonObject.getString("data");
			

		}
		JSONArray ja = new JSONArray();
		JSONArray jsa = ja.element(data1);
		JSONObject jsonObject = new JSONObject();
		jsonObject = (JSONObject) jsa.get(0);
		token = jsonObject.get("accessToken").toString();
		refreshToken = jsonObject.get("refreshToken").toString();
		System.out.println(token);
		//System.out.println(refreshToken);
		//验证结果
		Assert.assertEquals("true", data);
		
	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.verificationCodeLoginUrl);
		System.out.println(TestConfig.verificationCodeLoginUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
				
		param2.put("clientId", "app");
		param2.put("phoneNum", "17700000000");
		param2.put("phoneCode", "1537");
		param2.put("deviceId", "35861430-6531-A809-FFFF-FFFFEB4C6F18");
						
		param1.put("client", "android");
		param1.put("content", param2);
		param1.put("version", "1.0");

		post.setHeader("Content-Type", "application/json;charset=UTF-8");
		post.setHeader("access_token", "");
		post.setHeader("client", "android");

		StringEntity entity = new StringEntity(param1.toString(), "UTF-8");
		post.setEntity(entity);

		String result;
		HttpResponse response = TestConfig.defaultHttpClient.execute(post);
		result = EntityUtils.toString(response.getEntity(), "UTF-8");

		List<String> list = Arrays.asList(result);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}
}
