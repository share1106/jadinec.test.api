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
		if(name == InterfaceName.GetAllMixStation) {
			uri = bundle.getString("getMixingStation.uri");
		}
		if(name == InterfaceName.PostPouringPlanAmount) {
			uri = bundle.getString("savePouring.uri");
		}
		if(name == InterfaceName.GetPouringDetail) {
			uri = bundle.getString("getPouringDetail.uri");
		}
		if(name == InterfaceName.GetBindLineState) {
			uri = bundle.getString("isBinding.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleGetBaseInfo) {
			uri = bundle.getString("getBaseInfo.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleGetMaterialList) {
			uri = bundle.getString("getMaterialList.uri");
		}
		if(name == InterfaceName.GetSlagHoleTaskDetail) {
			uri = bundle.getString("getSlagHoleTaskDetail.uri");
		}
		if(name == InterfaceName.GetSlagHoleTaskDetailByStepId) {
			uri = bundle.getString("getSlagHoleTaskDetailByStepId.uri");
		}
		if(name == InterfaceName.GetOtherMechanicalTypeCode) {
			uri = bundle.getString("getOtherMechanicalTypeCode.uri");
		}
		if(name == InterfaceName.GetProductAllLine) {
			uri = bundle.getString("getMixingStationProdLine.uri");
		}
		if(name == InterfaceName.PostBindProductLine) {
			uri = bundle.getString("bindingMixingStationProdLine.uri");
		}
		if(name == InterfaceName.PostStartProductLine) {
			uri = bundle.getString("startProdLine.uri");
		}
		if(name == InterfaceName.PostPouringListNew) {
			uri = bundle.getString("getPouringArrangeList.uri");
		}
		if(name == InterfaceName.GetTableList) {
			uri = bundle.getString("taskStepTable.uri");
		}
		if(name == InterfaceName.GetTransportList) {
			uri = bundle.getString("obtainTransportForm.uri");
		}
		if(name == InterfaceName.GetFreeTransportCarList) {
			uri = bundle.getString("getFreeCar.uri");
		}
		if(name == InterfaceName.GetTaskTable) {
			uri = bundle.getString("getBussinesTable.uri");
		}
		if(name == InterfaceName.PostGetOptTask) {
			uri = bundle.getString("getProdTask.uri");
		}
		if(name == InterfaceName.ModiPouringBeginTime) {
			uri = bundle.getString("changeWorkBeginTime.uri");
		}
		if(name == InterfaceName.GetConstructionLogPage) {
			uri = bundle.getString("getConstructionLogPage.uri");
		}
		if(name == InterfaceName.GetSpecifiedUserStatisticInfo) {
			uri = bundle.getString("getSpecifiedUserStatisticInfo.uri");
		}
		if(name == InterfaceName.GetDictionaryByGroup) {
			uri = bundle.getString("getDictionaryByGroup.uri");
		}
		if(name == InterfaceName.SwitchPhone) {
			uri = bundle.getString("updatePhoneNum.uri");
		}
		if(name == InterfaceName.GetPouringlist) {
			uri = bundle.getString("getApplyFormItem.uri");
		}
		if(name == InterfaceName.GetPouringInfo) {
			uri = bundle.getString("prodTransCollect.uri");
		}
		if(name == InterfaceName.DelTmpTransportOrder) {
			uri = bundle.getString("delProdTransForm.uri");
		}
		if(name == InterfaceName.AddTmpTransportOrder) {
			uri = bundle.getString("addProdTransForm.uri");
		}
		if(name == InterfaceName.UpdateTransportOrderInfo) {
			uri = bundle.getString("editProdTransForm.uri");
		}
		if(name == InterfaceName.GetTransportTaskList) {
			uri = bundle.getString("getTransTask.uri");
		}
		if(name == InterfaceName.GetNotArrangedMonthPlanNew) {
			uri = bundle.getString("getPlans.uri");
		}
		if(name == InterfaceName.UpdateConfirmMessageStatus) {
			uri = bundle.getString("dealWithNotice.uri");
		}
		if(name == InterfaceName.GetAllocDetailNew) {
			uri = bundle.getString("getAllotDetails.uri");
		}
		if(name == InterfaceName.GetProBuildTextInfo) {
			uri = bundle.getString("getMapTextMark.uri");
		}
		if(name == InterfaceName.GetEngineeringInfo) {
			uri = bundle.getString("getEngineeringDesignDetails.uri");
		}
		if(name == InterfaceName.GetCarExtendInfo) {
			uri = bundle.getString("getMechanicalTrace.uri");
		}
		if(name == InterfaceName.GetPouringlistNew) {
			uri = bundle.getString("getConcreteApplyList.uri");
		}
		if(name == InterfaceName.GetUserInfoDetailEveryDayWorkUserInfo) {
			uri = bundle.getString("getUserInfoDetailEveryDayWorkUserInfo.uri");
		}
		if(name == InterfaceName.GetUserInfoDetailAll) {
			uri = bundle.getString("getUserInfoDetailAll.uri");
		}
		if(name == InterfaceName.GetUserInfoDetail) {
			uri = bundle.getString("getUserInfoDetail.uri");
		}
		if(name == InterfaceName.GetEngineeringRebarDetailNew) {
			uri = bundle.getString("listMaterialDetail.uri");
		}
		if(name == InterfaceName.GetEngineeringRebarDetail) {
			uri = bundle.getString("getEngineeringRebarDetail.uri");
		}
		if(name == InterfaceName.GetProductByWorkarea) {
			uri = bundle.getString("getProductByWorkarea.uri");
		}
		if(name == InterfaceName.GetEquipmentArchives) {
			uri = bundle.getString("getEquipmentArchives.uri");
		}
		if(name == InterfaceName.GetEquipmentDetails) {
			uri = bundle.getString("getEquipmentDetails.uri");
		}
		if(name == InterfaceName.GetEquipmentInfoDetails) {
			uri = bundle.getString("getEquipmentInfoDetails.uri");
		}
		if(name == InterfaceName.GetManagementRedRoundList) {
			uri = bundle.getString("pending.uri");
		}
		if(name == InterfaceName.GetSearchList) {
			uri = bundle.getString("getFacilitiesName.uri");
		}
		if(name == InterfaceName.GetTransportHistory) {
			uri = bundle.getString("getTransDriverPoint.uri");
		}
		if(name == InterfaceName.GetTransportTaskDetail) {
			uri = bundle.getString("getTransDetails.uri");
		}
		if(name == InterfaceName.GetPouringTaskDetail) {
			uri = bundle.getString("concretePouringInform.uri");
		}
		if(name == InterfaceName.GetPouringRateSubmitDetailByStepId) {
			uri = bundle.getString("getConstRatioStepDetail.uri");
		}
		if(name == InterfaceName.GetPouringRateSubmitDetail) {
			uri = bundle.getString("getConstRateDetails.uri");
		}
		if(name == InterfaceName.DealTransportOrderStatus) {
			uri = bundle.getString("driverConfirm.uri");
		}
		if(name == InterfaceName.GetPouringRate) {
			uri = bundle.getString("getConstRateTask.uri");
		}
		if(name == InterfaceName.AddPouringOrder) {
			uri = bundle.getString("sendPouringToken.uri");
		}
		if(name == InterfaceName.GetDailyPlanProcessList) {
			uri = bundle.getString("getProcessBar.uri");
		}
		if(name == InterfaceName.GetOptPersionList) {
			uri = bundle.getString("getOptPersionList.uri");
		}
		if(name == InterfaceName.GetWorkMonthPlanItemInfo) {
			uri = bundle.getString("getWorkMonthPlanItemInfo.uri");
		}
		if(name == InterfaceName.GetEngineeringCodeList) {
			uri = bundle.getString("getEngineeringCodeList.uri");
		}
		if(name == InterfaceName.GetItemStateList) {
			uri = bundle.getString("getItemStateList.uri");
		}
		if(name == InterfaceName.GetWorkMonthPlanItemPageList) {
			uri = bundle.getString("getWorkMonthPlanItemPageList.uri");
		}
		if(name == InterfaceName.QueryEngineeringTypeToCodeList) {
			uri = bundle.getString("queryEngineeringTypeToCodeList.uri");
		}
		if(name == InterfaceName.GetWorkMonthPlanPageList) {
			uri = bundle.getString("getWorkMonthPlanPageList.uri");
		}
		if(name == InterfaceName.AddMonthPlanItem) {
			uri = bundle.getString("addMonthPlanItem.uri");
		}
		if(name == InterfaceName.UpdateOrChangeMonthPlanItem) {
			uri = bundle.getString("updateOrChangeMonthPlanItem.uri");
		}
		if(name == InterfaceName.GetMonthPlanRatioMonth) {
			uri = bundle.getString("getMonthPlanRatioMonth.uri");
		}
		if(name == InterfaceName.GetMonthPlanItemView) {
			uri = bundle.getString("getMonthPlanItemView.uri");
		}
		if(name == InterfaceName.GetMonthPlanViewList) {
			uri = bundle.getString("getMonthPlanViewList.uri");
		}
		if(name == InterfaceName.ReviewTemporaryMoney) {
			uri = bundle.getString("reviewTemporaryMoney.uri");
		}
		if(name == InterfaceName.LaunchTemporaryMoney) {
			uri = bundle.getString("launchTemporaryMoney.uri");
		}
		if(name == InterfaceName.GetTemporaryMoneyByProcessOdd) {
			uri = bundle.getString("getTemporaryMoneyByProcessOdd.uri");
		}
		if(name == InterfaceName.GetTemporaryTypeList) {
			uri = bundle.getString("getTemporaryTypeList.uri");
		}
		if(name == InterfaceName.GetEngineeringItemList) {
			uri = bundle.getString("getEngineeringItemList.uri");
		}
		
		testUrl = address + uri;
		return testUrl;
	}
}

