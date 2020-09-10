package jadinec.test.api.utils;

import java.util.Locale;
import java.util.ResourceBundle;

import jadinec.test.api.model.InterfaceName;

public class ConfigFile {

	private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);

	public static String getUrl(InterfaceName name) {
		String address = bundle.getString("test.url");
		String uri = "";
		// 最终测试地址
		String testUrl;
		if (name == InterfaceName.GetToken) {
			uri = bundle.getString("getToken.uri");
		}
		
		if (name == InterfaceName.VerificationCodeLogin) {
			uri = bundle.getString("verificationCodeLogin.uri");
		}
		if(name == InterfaceName.GetAppUpdate) {
			uri = bundle.getString("getAppUpdate.uri");
		}
		if(name == InterfaceName.GetEngineeringPlane) {
			uri = bundle.getString("getEngineeringPlane.uri");
		}
		if(name == InterfaceName.GetUserInfo) {
			uri = bundle.getString("getUser.uri");
		}
		if(name == InterfaceName.GetEngineeringItemPlane) {
			uri = bundle.getString("getEngineeringItemPlane.uri");
		}
		if(name == InterfaceName.AddUserToGroup){
			uri = bundle.getString("addUserToGroup.uri");
		}
		if(name == InterfaceName.GetIMSign) {
			uri = bundle.getString("getSig.uri");
		}
		if(name == InterfaceName.GetORGUserDetail) {
			uri = bundle.getString("getORGUserDetail.uri");
		}
		if(name == InterfaceName.GetTaskItem) {
			uri = bundle.getString("getTaskItems.uri");
		}
		if(name == InterfaceName.SubmitTask) {
			uri = bundle.getString("okForCloseStep.uri");
		}
		if(name == InterfaceName.Submit_Rework) {
			uri = bundle.getString("reworkForStep.uri");
		}
		if(name == InterfaceName.GetEngineeringItemHorizontal) {
			uri = bundle.getString("getEngineeringItemHorizontal.uri");
		}
		if(name == InterfaceName.GetProcessDetail) {
			uri = bundle.getString("getEngineeringProcess.uri");
		}
		if(name == InterfaceName.GetSubEngineeringList) {
			uri = bundle.getString("getEngineeringSubItem.uri");
		}
		if(name == InterfaceName.UpdateTaskReadStatus) {
			uri = bundle.getString("changeTaskRead.uri");
		}
		if(name == InterfaceName.SendVerifyCodeToPhoneUpdatePassword) {
			uri = bundle.getString("sendSmsVerificationCodeUpdatePwd.uri");
		}
		if(name == InterfaceName.UpdatePassword) {
			uri = bundle.getString("updatePwdApi.uri");
		}
		if(name == InterfaceName.GetSysUserDetailInfo) {
			uri = bundle.getString("getUserInfo.uri");
		}
		if(name == InterfaceName.CommitFeedback) {
			uri = bundle.getString("saveOpinion.uri");
		}
		if(name == InterfaceName.SendVerifyCodeToPhoneSwitchPhone) {
			uri = bundle.getString("sendSmsUpdatePhoneNumVerificationCode.uri");
		}
		if(name == InterfaceName.UpdateImage) {
			uri = bundle.getString("updateImg.uri");
		}
		if(name == InterfaceName.GetTaskFormList) {
			uri = bundle.getString("getFormItems.uri");
		}
		if(name == InterfaceName.GetAttendanceRules) {
			uri = bundle.getString("getFacilitiesCode.uri");
		}
		if(name == InterfaceName.CommitClockInRecord) {
			uri = bundle.getString("saveAttendanceRecordInfo.uri");
		}
		if(name == InterfaceName.GetMonthClockInStatistics) {
			uri = bundle.getString("getAttendanceRecordStatistics.uri");
		}
		if(name == InterfaceName.GetTaskTable) {
			uri = bundle.getString("getBussinesTable.uri");
		}
		if(name == InterfaceName.GetEngineeringStepItem) {
			uri = bundle.getString("processItems.uri");
		}
		if(name == InterfaceName.RefreshAccessToken) {
			uri = bundle.getString("refreshToken.uri");
		}
		if(name == InterfaceName.UpdateUserRole) {
			uri = bundle.getString("toggleRole.uri");
		}
		if(name == InterfaceName.GetTaskDetail) {
			uri = bundle.getString("stepForDetails.uri");
		}
		if(name == InterfaceName.GetMessageNotice) {
			uri = bundle.getString("noticeItems.uri");
		}
		if(name == InterfaceName.GetMessageNoticeNew) {
			uri = bundle.getString("getNoticeMessageList.uri");
		}
		if(name == InterfaceName.BatchDealWithMsg) {
			uri = bundle.getString("batchDealWithMsg.uri");
		}
		if(name == InterfaceName.GetAllDevice) {
			uri = bundle.getString("getMechanicalList.uri");
		}
		if(name == InterfaceName.GetLastBindDevice) {
			uri = bundle.getString("obtainBindingState.uri");
		}
		if(name == InterfaceName.UpdateDeviceBindStatus) {
			uri = bundle.getString("bindMechanical.uri");
		}
		if(name == InterfaceName.UpdateDeviceWorkStatus) {
			uri = bundle.getString("toggleMechanical.uri");
		}
		if(name == InterfaceName.UpdateMessageNoticeStatus) {
			uri = bundle.getString("readNotice.uri");
		}
		if(name == InterfaceName.DelMessageNotice) {
			uri = bundle.getString("delNotice.uri");
		}
		if(name == InterfaceName.GetRedoStep) {
			uri = bundle.getString("obtainStepId.uri");
		}
		if(name == InterfaceName.GetMenuList) {
			uri = bundle.getString("obtainMenusForRole.uri");
		}
		if(name == InterfaceName.GetTaskFlowStepList) {
			uri = bundle.getString("obtainStepItem.uri");
		}
		if(name == InterfaceName.GetAllTeams) {
			uri = bundle.getString("getTeamList.uri");
		}
		if(name == InterfaceName.GetTeamCaptainList) {
			uri = bundle.getString("getTeamLeader.uri");
		}
		if(name == InterfaceName.GetTeamStaffList) {
			uri = bundle.getString("getTeamMember.uri");
		}
		if(name == InterfaceName.AddTeam) {
			uri = bundle.getString("saveTeam.uri");
		}
		if(name == InterfaceName.UpdateTeam) {
			uri = bundle.getString("editTeam.uri");
		}
		if(name == InterfaceName.DeleteTeam) {
			uri = bundle.getString("delTeam.uri");
		}
		if(name == InterfaceName.GetPoiData) {
			uri = bundle.getString("getPoiList.uri");
		}
		if(name == InterfaceName.GetAllocTabNew) {
			uri = bundle.getString("getAllotProcessBar.uri");
		}
		if(name == InterfaceName.GetAllocListNew) {
			uri = bundle.getString("getPlanManageTask.uri");
		}
		if(name == InterfaceName.GetTechProcess) {
			uri = bundle.getString("getProcessList.uri");
		}
		if(name == InterfaceName.GetFenEngineeringData) {
			uri = bundle.getString("getEngineeringItemInfo.uri");
		}
		if(name == InterfaceName.GetSignPeopleData) {
			uri = bundle.getString("getOrgAllUserInfo.uri");
		}
		if(name == InterfaceName.GetContratorNick) {
			uri = bundle.getString("getOrgName.uri");
		}
		if(name == InterfaceName.CommitDailyPlans) {
			uri = bundle.getString("savePlanProcess.uri");
		}
		if(name == InterfaceName.GetArrangedMonthPlan) {
			uri = bundle.getString("getDayPlanProcessList.uri");
		}
		if(name == InterfaceName.RevokeDailyPlan) {
			uri = bundle.getString("doRevoke.uri");
		}
		if(name == InterfaceName.GetTechOrSafeCom) {
			uri = bundle.getString("getTechnologySecurityDisclosure.uri");
		}
		if(name == InterfaceName.GetTechOrSafeDetail) {
			uri = bundle.getString("getAppTechnologySecurityDisclosureInfo.uri");
		}
		if(name == InterfaceName.ModiPouringSequenceAll) {
			uri = bundle.getString("applyFormSortForAll.uri");
		}
		if(name == InterfaceName.ModiPouringSequence) {
			uri = bundle.getString("applyFormSortForOne.uri");
		}
		if(name == InterfaceName.ModiPouringStatus) {
			uri = bundle.getString("confirmApplyForm.uri");
		}
		if(name == InterfaceName.ModiPouringBeginTime) {
			uri = bundle.getString("confirmApplyForm.uri");
		}
		
		testUrl = address + uri;
		return testUrl;
	}
}

