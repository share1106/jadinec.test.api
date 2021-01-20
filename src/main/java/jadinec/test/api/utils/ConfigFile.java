package jadinec.test.api.utils;

import java.util.Locale;
import java.util.ResourceBundle;

import jadinec.test.api.model.InterfaceName;

public class ConfigFile {

	private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);
	public static String access_token = bundle.getString("access_token");
	public static String Content_Type = bundle.getString("Content-Type");
	public static String client = bundle.getString("client");
	public static String version = bundle.getString("version");
	public static String client_pc = bundle.getString("client_pc");
	public static String access_token_pc = bundle.getString("access_token_pc");
	public static String access_token_pc_uat = bundle.getString("access_token_pc_uat");
	
	//项目管理后台token
	public static String access_token_pc_pro = bundle.getString("access_token_pc_pro");
	
	public static String getUrl(InterfaceName name) {
		// APP测试地址
		// String address = bundle.getString("test.url");
		// 运营后台测试地址
		String address = bundle.getString("testpc.url");
		String uri = "";
		// 最终测试地址
		String testUrl;
		if (name == InterfaceName.GetToken) {
			uri = bundle.getString("getToken.uri");
		}

		if (name == InterfaceName.VerificationCodeLogin) {
			uri = bundle.getString("verificationCodeLogin.uri");
		}
		if (name == InterfaceName.GetAppUpdate) {
			uri = bundle.getString("getAppUpdate.uri");
		}
		if (name == InterfaceName.GetEngineeringPlane) {
			uri = bundle.getString("getEngineeringPlane.uri");
		}
		if (name == InterfaceName.GetUserInfo) {
			uri = bundle.getString("getUser.uri");
		}
		if (name == InterfaceName.GetEngineeringItemPlane) {
			uri = bundle.getString("getEngineeringItemPlane.uri");
		}

		if (name == InterfaceName.GetORGUserDetail) {
			uri = bundle.getString("getORGUserDetail.uri");
		}
		if (name == InterfaceName.GetTaskItem) {
			uri = bundle.getString("getTaskItems.uri");
		}
		if (name == InterfaceName.SubmitTask) {
			uri = bundle.getString("okForCloseStep.uri");
		}
		if (name == InterfaceName.Submit_Rework) {
			uri = bundle.getString("reworkForStep.uri");
		}
		if (name == InterfaceName.GetEngineeringItemHorizontal) {
			uri = bundle.getString("getEngineeringItemHorizontal.uri");
		}

		if (name == InterfaceName.GetSubEngineeringList) {
			uri = bundle.getString("getEngineeringSubItem.uri");
		}
		if (name == InterfaceName.UpdateTaskReadStatus) {
			uri = bundle.getString("changeTaskRead.uri");
		}
		if (name == InterfaceName.SendVerifyCodeToPhoneUpdatePassword) {
			uri = bundle.getString("sendSmsVerificationCodeUpdatePwd.uri");
		}
		if (name == InterfaceName.UpdatePassword) {
			uri = bundle.getString("updatePwdApi.uri");
		}
		if (name == InterfaceName.CommitFeedback) {
			uri = bundle.getString("saveOpinion.uri");
		}
		if (name == InterfaceName.SendVerifyCodeToPhoneSwitchPhone) {
			uri = bundle.getString("sendSmsUpdatePhoneNumVerificationCode.uri");
		}
		if (name == InterfaceName.UpdateImage) {
			uri = bundle.getString("updateImg.uri");
		}
		if (name == InterfaceName.GetTaskFormList) {
			uri = bundle.getString("getFormItems.uri");
		}

		if (name == InterfaceName.GetTaskTable) {
			uri = bundle.getString("getBussinesTable.uri");
		}
		if (name == InterfaceName.GetEngineeringStepItem) {
			uri = bundle.getString("processItems.uri");
		}
		if (name == InterfaceName.RefreshAccessToken) {
			uri = bundle.getString("refreshToken.uri");
		}
		if (name == InterfaceName.UpdateUserRole) {
			uri = bundle.getString("toggleRole.uri");
		}
		if (name == InterfaceName.GetTaskDetail) {
			uri = bundle.getString("stepForDetails.uri");
		}

		if (name == InterfaceName.GetAllDevice) {
			uri = bundle.getString("getMechanicalList.uri");
		}
		if (name == InterfaceName.GetLastBindDevice) {
			uri = bundle.getString("obtainBindingState.uri");
		}
		if (name == InterfaceName.UpdateDeviceBindStatus) {
			uri = bundle.getString("bindMechanical.uri");
		}
		if (name == InterfaceName.UpdateDeviceWorkStatus) {
			uri = bundle.getString("toggleMechanical.uri");
		}

		if (name == InterfaceName.GetRedoStep) {
			uri = bundle.getString("obtainStepId.uri");
		}
		if (name == InterfaceName.GetMenuList) {
			uri = bundle.getString("obtainMenusForRole.uri");
		}
		if (name == InterfaceName.GetTaskFlowStepList) {
			uri = bundle.getString("obtainStepItem.uri");
		}
		if (name == InterfaceName.GetAllTeams) {
			uri = bundle.getString("getTeamList.uri");
		}
		if (name == InterfaceName.GetTeamCaptainList) {
			uri = bundle.getString("getTeamLeader.uri");
		}
		if (name == InterfaceName.GetTeamStaffList) {
			uri = bundle.getString("getTeamMember.uri");
		}
		if (name == InterfaceName.AddTeam) {
			uri = bundle.getString("saveTeam.uri");
		}
		if (name == InterfaceName.UpdateTeam) {
			uri = bundle.getString("editTeam.uri");
		}
		if (name == InterfaceName.DeleteTeam) {
			uri = bundle.getString("delTeam.uri");
		}
		if (name == InterfaceName.GetPoiData) {
			uri = bundle.getString("getPoiList.uri");
		}
		if (name == InterfaceName.GetAllocTabNew) {
			uri = bundle.getString("getAllotProcessBar.uri");
		}
		if (name == InterfaceName.GetAllocListNew) {
			uri = bundle.getString("getPlanManageTask.uri");
		}

		if (name == InterfaceName.ModiPouringSequenceAll) {
			uri = bundle.getString("applyFormSortForAll.uri");
		}
		if (name == InterfaceName.ModiPouringSequence) {
			uri = bundle.getString("applyFormSortForOne.uri");
		}
		if (name == InterfaceName.ModiPouringStatus) {
			uri = bundle.getString("confirmApplyForm.uri");
		}
		if (name == InterfaceName.ModiPouringBeginTime) {
			uri = bundle.getString("confirmApplyForm.uri");
		}
		if (name == InterfaceName.GetAllMixStation) {
			uri = bundle.getString("getMixingStation.uri");
		}
		if (name == InterfaceName.PostPouringPlanAmount) {
			uri = bundle.getString("savePouring.uri");
		}
		if (name == InterfaceName.GetPouringDetail) {
			uri = bundle.getString("getPouringDetail.uri");
		}
		if (name == InterfaceName.GetBindLineState) {
			uri = bundle.getString("isBinding.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleGetBaseInfo) {
			uri = bundle.getString("getBaseInfo.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleGetMaterialList) {
			uri = bundle.getString("getMaterialList.uri");
		}
		if (name == InterfaceName.GetSlagHoleTaskDetail) {
			uri = bundle.getString("getSlagHoleTaskDetail.uri");
		}
		if (name == InterfaceName.GetSlagHoleTaskDetailByStepId) {
			uri = bundle.getString("getSlagHoleTaskDetailByStepId.uri");
		}
		if (name == InterfaceName.GetOtherMechanicalTypeCode) {
			uri = bundle.getString("getOtherMechanicalTypeCode.uri");
		}
		if (name == InterfaceName.GetProductAllLine) {
			uri = bundle.getString("getMixingStationProdLine.uri");
		}
		if (name == InterfaceName.PostBindProductLine) {
			uri = bundle.getString("bindingMixingStationProdLine.uri");
		}
		if (name == InterfaceName.PostStartProductLine) {
			uri = bundle.getString("startProdLine.uri");
		}
		if (name == InterfaceName.PostPouringListNew) {
			uri = bundle.getString("getPouringArrangeList.uri");
		}
		if (name == InterfaceName.GetTableList) {
			uri = bundle.getString("taskStepTable.uri");
		}
		if (name == InterfaceName.GetTransportList) {
			uri = bundle.getString("obtainTransportForm.uri");
		}
		if (name == InterfaceName.GetFreeTransportCarList) {
			uri = bundle.getString("getFreeCar.uri");
		}
		if (name == InterfaceName.GetTaskTable) {
			uri = bundle.getString("getBussinesTable.uri");
		}
		if (name == InterfaceName.PostGetOptTask) {
			uri = bundle.getString("getProdTask.uri");
		}
		if (name == InterfaceName.ModiPouringBeginTime) {
			uri = bundle.getString("changeWorkBeginTime.uri");
		}
		if (name == InterfaceName.GetConstructionLogPage) {
			uri = bundle.getString("getConstructionLogPage.uri");
		}
		if (name == InterfaceName.GetSpecifiedUserStatisticInfo) {
			uri = bundle.getString("getSpecifiedUserStatisticInfo.uri");
		}
		if (name == InterfaceName.GetDictionaryByGroup) {
			uri = bundle.getString("getDictionaryByGroup.uri");
		}
		if (name == InterfaceName.SwitchPhone) {
			uri = bundle.getString("updatePhoneNum.uri");
		}
		if (name == InterfaceName.GetPouringlist) {
			uri = bundle.getString("getApplyFormItem.uri");
		}
		if (name == InterfaceName.GetPouringInfo) {
			uri = bundle.getString("prodTransCollect.uri");
		}
		if (name == InterfaceName.DelTmpTransportOrder) {
			uri = bundle.getString("delProdTransForm.uri");
		}
		if (name == InterfaceName.AddTmpTransportOrder) {
			uri = bundle.getString("addProdTransForm.uri");
		}
		if (name == InterfaceName.UpdateTransportOrderInfo) {
			uri = bundle.getString("editProdTransForm.uri");
		}
		if (name == InterfaceName.GetTransportTaskList) {
			uri = bundle.getString("getTransTask.uri");
		}
		if (name == InterfaceName.GetNotArrangedMonthPlanNew) {
			uri = bundle.getString("getPlans.uri");
		}
		if (name == InterfaceName.UpdateConfirmMessageStatus) {
			uri = bundle.getString("dealWithNotice.uri");
		}
		if (name == InterfaceName.GetAllocDetailNew) {
			uri = bundle.getString("getAllotDetails.uri");
		}
		if (name == InterfaceName.GetProBuildTextInfo) {
			uri = bundle.getString("getMapTextMark.uri");
		}
		if (name == InterfaceName.GetEngineeringInfo) {
			uri = bundle.getString("getEngineeringDesignDetails.uri");
		}
		if (name == InterfaceName.GetCarExtendInfo) {
			uri = bundle.getString("getMechanicalTrace.uri");
		}
		if (name == InterfaceName.GetPouringlistNew) {
			uri = bundle.getString("getConcreteApplyList.uri");
		}
		if (name == InterfaceName.GetUserInfoDetailEveryDayWorkUserInfo) {
			uri = bundle.getString("getUserInfoDetailEveryDayWorkUserInfo.uri");
		}
		if (name == InterfaceName.GetUserInfoDetailAll) {
			uri = bundle.getString("getUserInfoDetailAll.uri");
		}
		if (name == InterfaceName.GetUserInfoDetail) {
			uri = bundle.getString("getUserInfoDetail.uri");
		}
		if (name == InterfaceName.GetEngineeringRebarDetailNew) {
			uri = bundle.getString("listMaterialDetail.uri");
		}
		if (name == InterfaceName.GetEngineeringRebarDetail) {
			uri = bundle.getString("getEngineeringRebarDetail.uri");
		}
		if (name == InterfaceName.GetProductByWorkarea) {
			uri = bundle.getString("getProductByWorkarea.uri");
		}
		if (name == InterfaceName.GetEquipmentArchives) {
			uri = bundle.getString("getEquipmentArchives.uri");
		}
		if (name == InterfaceName.GetEquipmentDetails) {
			uri = bundle.getString("getEquipmentDetails.uri");
		}
		if (name == InterfaceName.GetEquipmentInfoDetails) {
			uri = bundle.getString("getEquipmentInfoDetails.uri");
		}
		if (name == InterfaceName.GetManagementRedRoundList) {
			uri = bundle.getString("pending.uri");
		}
		if (name == InterfaceName.GetSearchList) {
			uri = bundle.getString("getFacilitiesName.uri");
		}
		if (name == InterfaceName.GetTransportHistory) {
			uri = bundle.getString("getTransDriverPoint.uri");
		}
		if (name == InterfaceName.GetTransportTaskDetail) {
			uri = bundle.getString("getTransDetails.uri");
		}
		if (name == InterfaceName.GetPouringTaskDetail) {
			uri = bundle.getString("concretePouringInform.uri");
		}
		if (name == InterfaceName.GetPouringRateSubmitDetailByStepId) {
			uri = bundle.getString("getConstRatioStepDetail.uri");
		}
		if (name == InterfaceName.GetPouringRateSubmitDetail) {
			uri = bundle.getString("getConstRateDetails.uri");
		}
		if (name == InterfaceName.DealTransportOrderStatus) {
			uri = bundle.getString("driverConfirm.uri");
		}
		if (name == InterfaceName.GetPouringRate) {
			uri = bundle.getString("getConstRateTask.uri");
		}
		if (name == InterfaceName.AddPouringOrder) {
			uri = bundle.getString("sendPouringToken.uri");
		}
		if (name == InterfaceName.GetDailyPlanProcessList) {
			uri = bundle.getString("getProcessBar.uri");
		}
		if (name == InterfaceName.GetOptPersionList) {
			uri = bundle.getString("getOptPersionList.uri");
		}
		if (name == InterfaceName.GetWorkMonthPlanItemInfo) {
			uri = bundle.getString("getWorkMonthPlanItemInfo.uri");
		}
		if (name == InterfaceName.GetEngineeringCodeList) {
			uri = bundle.getString("getEngineeringCodeList.uri");
		}
		if (name == InterfaceName.GetItemStateList) {
			uri = bundle.getString("getItemStateList.uri");
		}
		if (name == InterfaceName.GetWorkMonthPlanItemPageList) {
			uri = bundle.getString("getWorkMonthPlanItemPageList.uri");
		}
		if (name == InterfaceName.QueryEngineeringTypeToCodeList) {
			uri = bundle.getString("queryEngineeringTypeToCodeList.uri");
		}
		if (name == InterfaceName.GetWorkMonthPlanPageList) {
			uri = bundle.getString("getWorkMonthPlanPageList.uri");
		}
		if (name == InterfaceName.AddMonthPlanItem) {
			uri = bundle.getString("addMonthPlanItem.uri");
		}
		if (name == InterfaceName.UpdateOrChangeMonthPlanItem) {
			uri = bundle.getString("updateOrChangeMonthPlanItem.uri");
		}
		if (name == InterfaceName.GetMonthPlanRatioMonth) {
			uri = bundle.getString("getMonthPlanRatioMonth.uri");
		}
		if (name == InterfaceName.GetMonthPlanItemView) {
			uri = bundle.getString("getMonthPlanItemView.uri");
		}
		if (name == InterfaceName.GetMonthPlanViewList) {
			uri = bundle.getString("getMonthPlanViewList.uri");
		}
		if (name == InterfaceName.ReviewTemporaryMoney) {
			uri = bundle.getString("reviewTemporaryMoney.uri");
		}
		if (name == InterfaceName.LaunchTemporaryMoney) {
			uri = bundle.getString("launchTemporaryMoney.uri");
		}
		if (name == InterfaceName.GetTemporaryMoneyByProcessOdd) {
			uri = bundle.getString("getTemporaryMoneyByProcessOdd.uri");
		}
		if (name == InterfaceName.GetTemporaryTypeList) {
			uri = bundle.getString("getTemporaryTypeList.uri");
		}
		if (name == InterfaceName.GetEngineeringItemList) {
			uri = bundle.getString("getEngineeringItemList.uri");
		}
		if (name == InterfaceName.GetTemporaryMoneyList) {
			uri = bundle.getString("getTemporaryMoneyList.uri");
		}
		if (name == InterfaceName.GetLedgerList) {
			uri = bundle.getString("getLedgerList.uri");
		}
		if (name == InterfaceName.TunnelWorkTimePlanGetList) {
			uri = bundle.getString("getList.uri");
		}		
		if (name == InterfaceName.TunnelGetEngineeringCategoryTypeList) {
			uri = bundle.getString("getEngineeringTypeList.uri");
		}
		if (name == InterfaceName.TunnelGetProcessStepList) {
			uri = bundle.getString("getProcessStepList.uri");
		}
		if (name == InterfaceName.TunnelAddOrUpdate) {
			uri = bundle.getString("addOrUpdate.uri");
		}
		if (name == InterfaceName.TunnelGetDetail) {
			uri = bundle.getString("getDetail.uri");
		}
		if (name == InterfaceName.TunnelDelete) {
			uri = bundle.getString("delete.uri");
		}
		if (name == InterfaceName.TunnelWallRockGetBasicInfo) {
			uri = bundle.getString("getBasicInfo.uri");
		}
		if (name == InterfaceName.TunnelWallRockListEngineeringLists) {
			uri = bundle.getString("listEngineeringLists.uri");
		}
		if (name == InterfaceName.TunnelWallRockList) {
			uri = bundle.getString("listWallRocks.uri");
		}
		if (name == InterfaceName.TunnelWallRockListLiningTypes) {
			uri = bundle.getString("listLiningTypes.uri");
		}
		if (name == InterfaceName.TunnelWallRockListMaterialInfo) {
			uri = bundle.getString("listMaterialInfo.uri");
		}
		if (name == InterfaceName.TunnelWallRockAddOrUpdateWallRockLevelChange) {
			uri = bundle.getString("addOrUpdateWallRockLevelChange.uri");
		}
		if (name == InterfaceName.TunnelWallRockQueryWallRockInfoByProcessOdd) {
			uri = bundle.getString("queryWallRoackInfoByProcessOdd.uri");
		}
		if (name == InterfaceName.TunnelReviewWallRockLevel) {
			uri = bundle.getString("reviewWallRockLevel.uri");
		}
		if (name == InterfaceName.TunnelWallRockcancelMaterialProcess) {
			uri = bundle.getString("cancelMaterialProcess.uri");
		}
		if (name == InterfaceName.TunnelEffectGetEffectRecordList) {
			uri = bundle.getString("getEffectRecordList.uri");
		}
		if (name == InterfaceName.TunnelEffectGetTechnicianList) {
			uri = bundle.getString("getTechnicianList.uri");
		}
		if (name == InterfaceName.TunnelCancelEffectTechnicianList) {
			uri = bundle.getString("cancelEffectRecordProcess.uri");
		}
		if (name == InterfaceName.TunnelCancelEffectAddPageInitData) {
			uri = bundle.getString("getAddPageInitData.uri");
		}
		if (name == InterfaceName.TunnelEffectGetProcessDetail) {
			uri = bundle.getString("getProcessDetail.uri");
		}
		if (name == InterfaceName.TunnelEffectGetEffectRecordDetail) {
			uri = bundle.getString("getEffectRecordDetail.uri");
		}
		if (name == InterfaceName.TunnelEffectCheck) {
			uri = bundle.getString("reviewEffectRecord.uri");
		}
		if (name == InterfaceName.TunnelEffectExportDataToPath) {
			uri = bundle.getString("exportDataToPath.uri");
		}
		if (name == InterfaceName.StatisticListProjectSeperate) {
			uri = bundle.getString("listProjectSeperate.uri");
		}
		if (name == InterfaceName.StatisticGetProjectLocationSummaryInfo) {
			uri = bundle.getString("getProjectLocationSummaryInfo.uri");
		}
		if (name == InterfaceName.StatisticGetSubcontractorSeperateList) {
			uri = bundle.getString("getSubcontractorSeperateList.uri");
		}
		if (name == InterfaceName.StatisticGetSubcontractorLocationSummary) {
			uri = bundle.getString("getSubcontractorLocationSummary.uri");
		}
		if (name == InterfaceName.StatisticGetEngineeringMaterialSummary) {
			uri = bundle.getString("getEngineeringMaterialSummary.uri");
		}
		if (name == InterfaceName.StatisticGetMaterialConsumeDetail) {
			uri = bundle.getString("getMaterialConsumeDetail.uri");
		}
		if (name == InterfaceName.StatisticGetEngineeringMaterialDetail) {
			uri = bundle.getString("getEngineeringMaterialDetail.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleGetBaseInfo) {
			uri = bundle.getString("getSlagHoleBaseInfo.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleGetMaterialList) {
			uri = bundle.getString("getSlagHoleMaterialList.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleGetDispatchVehicleList) {
			uri = bundle.getString("getDispatchVehicleList.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleSaveDispatch) {
			uri = bundle.getString("saveDispatch.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleGetDispatchList) {
			uri = bundle.getString("getDispatchList.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleGetDispatchDetail) {
			uri = bundle.getString("getDispatchDetail.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleGetReceivingVehicleList) {
			uri = bundle.getString("getReceivingVehicleList.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleGetReceivingList) {
			uri = bundle.getString("getReceivingList.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleGetReceivingDetail) {
			uri = bundle.getString("getReceivingDetail.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleGetWeighingOrderDetail) {
			uri = bundle.getString("getWeighingOrderDetail.uri");
		}
		if (name == InterfaceName.TunnelWallRockpreview) {
			uri = bundle.getString("preview.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleUpdateWeighingList) {
			uri = bundle.getString("updateWeighingList.uri");
		}
		if (name == InterfaceName.TunnelSlagHoleSaveReceiving) {
			uri = bundle.getString("saveReceiving.uri");
		}
		if (name == InterfaceName.GetEarthworkTask) {
			uri = bundle.getString("getEarthworkTask.uri");
		}
		if (name == InterfaceName.GetOnlineMarkList) {
			uri = bundle.getString("getOnlineMarkList.uri");
		}
		if (name == InterfaceName.GetMarkDetailForSlide) {
			uri = bundle.getString("getMarkDetailForSlide.uri");
		}
		if (name == InterfaceName.GetDeviceByDeviceType) {
			uri = bundle.getString("getDeviceByDeviceType.uri");
		}
		if (name == InterfaceName.GetEarthworkBorrowArea) {
			uri = bundle.getString("getEarthworkBorrowArea.uri");
		}
		if (name == InterfaceName.InsertEarthworkTaskToOwner) {
			uri = bundle.getString("insertEarthworkTaskToOwner.uri");
		}
		if (name == InterfaceName.UpdateEarthworkOwnerById) {
			uri = bundle.getString("updateEarthworkOwnerById.uri");
		}
		if (name == InterfaceName.GetTodayStatistic) {
			uri = bundle.getString("getTodayStatistic.uri");
		}
		if (name == InterfaceName.SaveDeviceWorkingInfo) {
			uri = bundle.getString("saveDeviceWorkingInfo.uri");
		}
		if (name == InterfaceName.GetTemporaryTaskType) {
			uri = bundle.getString("getTemporaryTaskType.uri");
		}
		if (name == InterfaceName.InsertTemporaryTask) {
			uri = bundle.getString("insertTemporaryTask.uri");
		}
		if (name == InterfaceName.GetSPTaskList) {
			uri = bundle.getString("getConstTaskList.uri");
		}
		if (name == InterfaceName.GetSplitEngineering) {
			uri = bundle.getString("getSplitTask.uri");
		}
		if (name == InterfaceName.CheckPlanExecState) {
			uri = bundle.getString("checkPlanExecState.uri");
		}
		if (name == InterfaceName.GetEngineeringItemDesignData) {
			uri = bundle.getString("getEngineeringItemDesignData.uri");
		}
		if (name == InterfaceName.GetEngineeringItemDesignLength) {
			uri = bundle.getString("getEngineeringItemDesignLength.uri");
		}
		if (name == InterfaceName.EditSplitTask) {
			uri = bundle.getString("editSplitTask.uri");
		}
		if (name == InterfaceName.DelSplitTask) {
			uri = bundle.getString("delSplitTask.uri");
		}
		if (name == InterfaceName.GetSplitDetail) {
			uri = bundle.getString("getSplitDetail.uri");
		}
		if (name == InterfaceName.GetTaskAndOrderList) {
			uri = bundle.getString("getTaskAndOrderList.uri");
		}
		if (name == InterfaceName.ArrivedExcavateArea) {
			uri = bundle.getString("arrivedExcavateArea.uri");
		}
		if (name == InterfaceName.EnterWjj) {
			uri = bundle.getString("enterWjj.uri");
		}
		if (name == InterfaceName.SaveFillOrder) {
			uri = bundle.getString("saveFillOrder.uri");
		}
		if (name == InterfaceName.DoneFillOrder) {
			uri = bundle.getString("doneFillOrder.uri");
		}
		if (name == InterfaceName.GetTodayWorkOrder) {
			uri = bundle.getString("getTodayWorkOrder.uri");
		}
		if (name == InterfaceName.GetStatisticWorkOrder) {
			uri = bundle.getString("getStatisticWorkOrder.uri");
		}
		if (name == InterfaceName.GetStatisticMonthWorkOrder) {
			uri = bundle.getString("getStatisticMonthWorkOrder.uri");
		}
		if (name == InterfaceName.GetFillOrderDetail) {
			uri = bundle.getString("getFillOrderDetail.uri");
		}
		if (name == InterfaceName.GetStatisticMonthLineWorkOrder) {
			uri = bundle.getString("getStatisticMonthLineWorkOrder.uri");
		}
		if (name == InterfaceName.GetFillTaskDetail) {
			uri = bundle.getString("getFillTaskDetail.uri");
		}
		if (name == InterfaceName.GetSplitEngineering) {
			uri = bundle.getString("getSplitEngineering.uri");
		}
		if (name == InterfaceName.GetPlanCategoryCode) {
			uri = bundle.getString("getPlanCategoryCode.uri");
		}
		if (name == InterfaceName.GetPlanSearchTypeCode) {
			uri = bundle.getString("getPlanSearchTypeCode.uri");
		}
		if (name == InterfaceName.GetSearchElement) {
			uri = bundle.getString("getSearchElement.uri");
		}
		if (name == InterfaceName.GetEngineeringCategory) {
			uri = bundle.getString("getEngineeringCategory.uri");
		}
		if (name == InterfaceName.GetEngineeringLevel) {
			uri = bundle.getString("getEngineeringLevel.uri");
		}
		if (name == InterfaceName.GetWorkAreaCode) {
			uri = bundle.getString("getWorkAreaCode.uri");
		}
		if (name == InterfaceName.GetEngineeringTypeProcess) {
			uri = bundle.getString("getEngineeringTypeProcess.uri");
		}
		if (name == InterfaceName.GetEngineeringType) {
			uri = bundle.getString("getEngineeringType.uri");
		}
		if (name == InterfaceName.FollowUp) {
			uri = bundle.getString("followUp.uri");
		}
		if (name == InterfaceName.Schedule) {
			uri = bundle.getString("schedule.uri");
		}
		if (name == InterfaceName.WebConcretePouringInform) {
			uri = bundle.getString("webConcretePouringInform.uri");
		}
		if (name == InterfaceName.ObtainProdNameList) {
			uri = bundle.getString("obtainProdNameList.uri");
		}
		if (name == InterfaceName.GetManageSlide) {
			uri = bundle.getString("getManageSlide.uri");
		}
		if (name == InterfaceName.GetMergeOrderList) {
			uri = bundle.getString("getMergeOrderList.uri");
		}
		if (name == InterfaceName.CreateMergeSerial) {
			uri = bundle.getString("createMergeSerial.uri");
		}
		if (name == InterfaceName.GetProgress) {
			uri = bundle.getString("getProgress.uri");
		}
		if (name == InterfaceName.GetMergeOrderDetail) {
			uri = bundle.getString("getMergeOrderDetail.uri");
		}
		if (name == InterfaceName.OutputTheSummary) {
			uri = bundle.getString("outputTheSummary.uri");
		}
		if (name == InterfaceName.Logout) {
			uri = bundle.getString("logout.uri");
		}
		if (name == InterfaceName.ToggleProCode) {
			uri = bundle.getString("toggleProCode.uri");
		}
		if (name == InterfaceName.GetOrgList) {
			uri = bundle.getString("getOrgList.uri");
		}
		if (name == InterfaceName.AddContract) {
			uri = bundle.getString("addContract.uri");
		}
		if (name == InterfaceName.GetPageList) {
			uri = bundle.getString("getPageList.uri");
		}
		if (name == InterfaceName.GetContractTotal) {
			uri = bundle.getString("getContractTotal.uri");
		}
		if (name == InterfaceName.GetContractInfo) {
			uri = bundle.getString("getContractInfo.uri");
		}
		if (name == InterfaceName.GetContViewList) {
			uri = bundle.getString("getContViewList.uri");
		}
		if (name == InterfaceName.GetProcessInfo) {
			uri = bundle.getString("getProcessInfo.uri");
		}
		if (name == InterfaceName.GetContEngineeringCount) {
			uri = bundle.getString("getContEngineeringCount.uri");
		}
		if (name == InterfaceName.GetContTeamgCount) {
			uri = bundle.getString("getContTeamgCount.uri");
		}
		if (name == InterfaceName.GetProProcessList) {
			uri = bundle.getString("getProProcessList.uri");
		}
		if (name == InterfaceName.GetContProcessList) {
			uri = bundle.getString("getContProcessList.uri");
		}
		if (name == InterfaceName.GetContAddList) {
			uri = bundle.getString("getContAddList.uri");
		}
		if (name == InterfaceName.AddAwaitCommitContItem) {
			uri = bundle.getString("addAwaitCommitContItem.uri");
		}
		if (name == InterfaceName.AddAllAwaitCommitContItem) {
			uri = bundle.getString("addAllAwaitCommitContItem.uri");
		}
		if (name == InterfaceName.AddAllContItem) {
			uri = bundle.getString("addAllContItem.uri");
		}
		if (name == InterfaceName.EditContract) {
			uri = bundle.getString("editContract.uri");
		}
		if (name == InterfaceName.DeleteContItem) {
			uri = bundle.getString("deleteContItem.uri");
		}
		if (name == InterfaceName.GetContTeamRangeList) {
			uri = bundle.getString("getContTeamRangeList.uri");
		}
		if (name == InterfaceName.AddContTeamItem) {
			uri = bundle.getString("addContTeamItem.uri");
		}
		if (name == InterfaceName.DeleteContTeamItem) {
			uri = bundle.getString("deleteContTeamItem.uri");
		}
		if (name == InterfaceName.DeleteContractorContract) {
			uri = bundle.getString("deleteContractorContract.uri");
		}
		if (name == InterfaceName.DeleteContItemByCondition) {
			uri = bundle.getString("deleteContItemByCondition.uri");
		}
		if (name == InterfaceName.AddContTeamItemByCondition) {
			uri = bundle.getString("addContTeamItemByCondition.uri");
		}
		if (name == InterfaceName.ObtainTeamList) {
			uri = bundle.getString("obtainTeamList.uri");
		}
		if (name == InterfaceName.GetTaskType) {
			uri = bundle.getString("getTaskType.uri");
		}
		if (name == InterfaceName.GetTaskAlterItems) {
			uri = bundle.getString("getTaskAlterItems.uri");
		}
		if (name == InterfaceName.GetHandOverRecord) {
			uri = bundle.getString("getHandOverRecord.uri");
		}
		if (name == InterfaceName.GetRecordDetails) {
			uri = bundle.getString("getRecordDetails.uri");
		}
		if (name == InterfaceName.Search) {
			uri = bundle.getString("search.uri");
		}
		if (name == InterfaceName.GetMergeElements) {
			uri = bundle.getString("getMergeElements.uri");
		}
		if (name == InterfaceName.FaceMatch) {
			uri = bundle.getString("faceMatch.uri");
		}
		if (name == InterfaceName.GetfaceSimilarScore) {
			uri = bundle.getString("getfaceSimilarScore.uri");
		}
		if (name == InterfaceName.GetUserInfoByfaceSimilar) {
			uri = bundle.getString("getUserInfoByfaceSimilar.uri");
		}
		if (name == InterfaceName.GetConstRatioDetail) {
			uri = bundle.getString("getConstRatioDetail.uri");
		}
		if (name == InterfaceName.GetProductProportion) {
			uri = bundle.getString("getProductProportion.uri");
		}
		if (name == InterfaceName.Data) {
			uri = bundle.getString("data.uri");
		}
		if (name == InterfaceName.GetStatisticsGroupWorkArea) {
			uri = bundle.getString("getStatisticsGroupWorkArea.uri");
		}
		if (name == InterfaceName.GetAllUnitProjectByWorkAreaCode) {
			uri = bundle.getString("getAllUnitProjectByWorkAreaCode.uri");
		}
		if (name == InterfaceName.AddTunnelConstTask) {
			uri = bundle.getString("addTunnelConstTask.uri");
		}
		if (name == InterfaceName.GetEngineeringTypeNum) {
			uri = bundle.getString("getEngineeringTypeNum.uri");
		}
		if (name == InterfaceName.GetProductByWorkAreas) {
			uri = bundle.getString("getProductByWorkAreas.uri");
		}
		if (name == InterfaceName.GetProductEngineeringQuantitiesLedger) {
			uri = bundle.getString("getProductEngineeringQuantitiesLedger.uri");
		}
		if (name == InterfaceName.GetContractorProductByDayOrMonthOrHistory) {
			uri = bundle.getString("getContractorProductByDayOrMonthOrHistory.uri");
		}
		if (name == InterfaceName.GetUnitEngineeringAndDept) {
			uri = bundle.getString("getUnitEngineeringAndDept.uri");
		}
		if (name == InterfaceName.GetEngineeringItemLists) {
			uri = bundle.getString("getEngineeringItemLists.uri");
		}
		if (name == InterfaceName.GetEngineeringItemDetail) {
			uri = bundle.getString("getEngineeringItemDetail.uri");
		}
		if (name == InterfaceName.GetStatisticPersonnelInfo) {
			uri = bundle.getString("getStatisticPersonnelInfo.uri");
		}
		if (name == InterfaceName.GetStatisticUserOnlineByDeptId) {
			uri = bundle.getString("getStatisticUserOnlineByDeptId.uri");
		}
		if (name == InterfaceName.GetStatisticDevice) {
			uri = bundle.getString("getStatisticDevice.uri");
		}
		if (name == InterfaceName.GetOutputValueProgress) {
			uri = bundle.getString("getOutputValueProgress.uri");
		}
		if (name == InterfaceName.ListOutputValueProgress) {
			uri = bundle.getString("listOutputValueProgress.uri");
		}
		if (name == InterfaceName.GetProPoint) {
			uri = bundle.getString("getProPoint.uri");
		}
		if (name == InterfaceName.GetChildCompany) {
			uri = bundle.getString("getChildCompany.uri");
		}
		if (name == InterfaceName.GetFeatureValue) {
			uri = bundle.getString("getFeatureValue.uri");
		}
		if (name == InterfaceName.EnterSiteFeatureCompare) {
			uri = bundle.getString("enterSiteFeatureCompare.uri");
		}
		if (name == InterfaceName.GetPsnTabWhistleTable) {
			uri = bundle.getString("getPsnTabWhistleTable.uri");
		}
		if (name == InterfaceName.GetGeneralSingleList) {
			uri = bundle.getString("getGeneralSingleList.uri");
		}
		if (name == InterfaceName.GetSingleOrder) {
			uri = bundle.getString("getSingleOrder.uri");
		}
		if (name == InterfaceName.GetSplitAccording) {
			uri = bundle.getString("getSplitAccording.uri");
		}
		if (name == InterfaceName.AddSplitAccording) {
			uri = bundle.getString("addSplitAccording.uri");
		}
		if (name == InterfaceName.DelSplitOrder) {
			uri = bundle.getString("delSplitOrder.uri");
		}
		if (name == InterfaceName.GetEngineeringPoi) {
			uri = bundle.getString("getEngineeringPoi.uri");
		}
		if (name == InterfaceName.GetWorkAreaList) {
			uri = bundle.getString("getWorkAreaList.uri");
		}
		if (name == InterfaceName.GetSubsidiaryFacilitiesTypeInfoPageList) {
			uri = bundle.getString("getSubsidiaryFacilitiesTypeInfoPageList.uri");
		}
		if (name == InterfaceName.GetAllLineShape) {
			uri = bundle.getString("getAllLineShape.uri");
		}
		if (name == InterfaceName.GetAllGeometry) {
			uri = bundle.getString("getAllGeometry.uri");
		}
		if (name == InterfaceName.AddSubsidiaryFacilitiesTypeInfo) {
			uri = bundle.getString("addSubsidiaryFacilitiesTypeInfo.uri");
		}
		if (name == InterfaceName.GetSubsidiaryFacilitiesTypeInfo) {
			uri = bundle.getString("getSubsidiaryFacilitiesTypeInfo.uri");
		}
		if (name == InterfaceName.UpdateSubsidiaryFacilitiesTypeInfo) {
			uri = bundle.getString("updateSubsidiaryFacilitiesTypeInfo.uri");
		}
		if (name == InterfaceName.DelSubsidiaryFacilitiesTypeInfo) {
			uri = bundle.getString("delSubsidiaryFacilitiesTypeInfo.uri");
		}
		if (name == InterfaceName.GetExportEmail) {
			uri = bundle.getString("getExportEmail.uri");
		}
		if (name == InterfaceName.AddExportEmail) {
			uri = bundle.getString("addExportEmail.uri");
		}
		if (name == InterfaceName.ExportSubsidiaryFacilitiesTypeInfo) {
			uri = bundle.getString("exportSubsidiaryFacilitiesTypeInfo.uri");
		}
		if (name == InterfaceName.GetCrossSectionInfoPageList) {
			uri = bundle.getString("getCrossSectionInfoPageList.uri");
		}
		if (name == InterfaceName.GetCrossSectionInfo) {
			uri = bundle.getString("getCrossSectionInfo.uri");
		}
		if (name == InterfaceName.AddCrossSectionInfo) {
			uri = bundle.getString("addCrossSectionInfo.uri");
		}
		if (name == InterfaceName.UpdateCrossSectionInfo) {
			uri = bundle.getString("updateCrossSectionInfo.uri");
		}
		if (name == InterfaceName.DelCrossSectionInfo) {
			uri = bundle.getString("delCrossSectionInfo.uri");
		}
		if (name == InterfaceName.ImportCrossSectionInfo) {
			uri = bundle.getString("importCrossSectionInfo.uri");
		}
		if (name == InterfaceName.ExportCrossSectionInfo) {
			uri = bundle.getString("exportCrossSectionInfo.uri");
		}
		if (name == InterfaceName.GetCrossSectionInfoList) {
			uri = bundle.getString("getCrossSectionInfoList.uri");
		}
		if (name == InterfaceName.GetVerticalSectionInfoPageList) {
			uri = bundle.getString("getVerticalSectionInfoPageList.uri");
		}
		if (name == InterfaceName.GetVerticalSectionInfo) {
			uri = bundle.getString("getVerticalSectionInfo.uri");
		}
		if (name == InterfaceName.AddVerticalSectionInfo) {
			uri = bundle.getString("addVerticalSectionInfo.uri");
		}
		if (name == InterfaceName.UpdateVerticalSectionInfo) {
			uri = bundle.getString("updateVerticalSectionInfo.uri");
		}
		if (name == InterfaceName.DelVerticalSectionInfo) {
			uri = bundle.getString("delVerticalSectionInfo.uri");
		}
		if (name == InterfaceName.ImportVerticalSectionInfo) {
			uri = bundle.getString("importVerticalSectionInfo.uri");
		}
		if (name == InterfaceName.ExportVerticalSectionInfo) {
			uri = bundle.getString("exportVerticalSectionInfo.uri");
		}
		if (name == InterfaceName.GetVerticalSectionInfoList) {
			uri = bundle.getString("getVerticalSectionInfoList.uri");
		}
		if (name == InterfaceName.GetGeometryInfoPageList) {
			uri = bundle.getString("getGeometryInfoPageList.uri");
		}
		if (name == InterfaceName.GetGeometryInfo) {
			uri = bundle.getString("getGeometryInfo.uri");
		}
		if (name == InterfaceName.AddGeometryInfo) {
			uri = bundle.getString("addGeometryInfo.uri");
		}
		if (name == InterfaceName.UpdateGeometryInfo) {
			uri = bundle.getString("updateGeometryInfo.uri");
		}
		if (name == InterfaceName.DelGeometryInfo) {
			uri = bundle.getString("delGeometryInfo.uri");
		}
		if (name == InterfaceName.ImportGeometryInfo) {
			uri = bundle.getString("importGeometryInfo.uri");
		}
		if (name == InterfaceName.ExportGeometryInfo) {
			uri = bundle.getString("exportGeometryInfo.uri");
		}
		if (name == InterfaceName.GetGeometryInfoList) {
			uri = bundle.getString("getGeometryInfoList.uri");
		}
		if (name == InterfaceName.GetIdentificationLineTypeInfoPageList) {
			uri = bundle.getString("getIdentificationLineTypeInfoPageList.uri");
		}
		if (name == InterfaceName.GetIdentificationLineTypeInfo) {
			uri = bundle.getString("getIdentificationLineTypeInfo.uri");
		}
		if (name == InterfaceName.AddIdentificationLineTypeInfo) {
			uri = bundle.getString("addIdentificationLineTypeInfo.uri");
		}
		if (name == InterfaceName.UpdateIdentificationLineTypeInfo) {
			uri = bundle.getString("updateIdentificationLineTypeInfo.uri");
		}
		if (name == InterfaceName.DelIdentificationLineTypeInfo) {
			uri = bundle.getString("delIdentificationLineTypeInfo.uri");
		}
		if (name == InterfaceName.ImportIdentificationLineTypeInfo) {
			uri = bundle.getString("importIdentificationLineTypeInfo.uri");
		}
		if (name == InterfaceName.ExportIdentificationLineTypeInfo) {
			uri = bundle.getString("exportIdentificationLineTypeInfo.uri");
		}
		if (name == InterfaceName.GetIdentificationLineTypeInfoList) {
			uri = bundle.getString("getIdentificationLineTypeInfoList.uri");
		}
		if (name == InterfaceName.ImportSubsidiaryFacilitiesTypeInfo) {
			uri = bundle.getString("importSubsidiaryFacilitiesTypeInfo.uri");
		}
		if (name == InterfaceName.GetSubsidiaryFacilitiesTypeInfoList) {
			uri = bundle.getString("getSubsidiaryFacilitiesTypeInfoList.uri");
		}
		if (name == InterfaceName.GetNewEngineeringItemVerticalPoint) {
			uri = bundle.getString("getNewEngineeringItemVerticalPoint.uri");
		}
		if (name == InterfaceName.GetNewEngineeringItemHorizontalInfo) {
			uri = bundle.getString("getNewEngineeringItemHorizontalInfo.uri");
		}
		if (name == InterfaceName.GetNewEngineeringPlane) {
			uri = bundle.getString("getNewEngineeringPlane.uri");
		}
		if (name == InterfaceName.GetEngineeringCenterPositionList) {
			uri = bundle.getString("getEngineeringCenterPositionList.uri");
		}
		if (name == InterfaceName.GetEngCenterPositionList) {
			uri = bundle.getString("getEngCenterPositionList.uri");
		}
		if (name == InterfaceName.GetNewEngineeringItemHorizontal) {
			uri = bundle.getString("getNewEngineeringItemHorizontal.uri");
		}
		if (name == InterfaceName.GetFinishStateEngCodeList) {
			uri = bundle.getString("getFinishStateEngCodeList.uri");
		}
		if (name == InterfaceName.GetBillCodeList) {
			uri = bundle.getString("getBillCodeList.uri");
		}
		if (name == InterfaceName.AddOrUpdateBillCode) {
			uri = bundle.getString("addOrUpdateBillCode.uri");
		}
		if (name == InterfaceName.DelBillCodeByIds) {
			uri = bundle.getString("delBillCodeByIds.uri");
		}
		if (name == InterfaceName.ExportBillCode) {
			uri = bundle.getString("exportBillCode.uri");
		}
		if (name == InterfaceName.ImportBillCode) {
			uri = bundle.getString("importBillCode.uri");
		}
		if (name == InterfaceName.GetSearchBillCodeList) {
			uri = bundle.getString("getSearchBillCodeList.uri");
		}
		if (name == InterfaceName.GetBillCodecheck) {
			uri = bundle.getString("getBillCodecheck.uri");
		}
		if (name == InterfaceName.GetUnitPageList) {
			uri = bundle.getString("getUnitPageList.uri");
		}
		if (name == InterfaceName.AddUnit) {
			uri = bundle.getString("addUnit.uri");
		}
		if (name == InterfaceName.UpdateUnit) {
			uri = bundle.getString("updateUnit.uri");
		}
		if (name == InterfaceName.DelUnit) {
			uri = bundle.getString("delUnit.uri");
		}
		if (name == InterfaceName.ExportUnit) {
			uri = bundle.getString("exportUnit.uri");
		}
		if (name == InterfaceName.ImportUnit) {
			uri = bundle.getString("importUnit.uri");
		}
		if (name == InterfaceName.GetUnitList) {
			uri = bundle.getString("getUnitList.uri");
		}
		if (name == InterfaceName.GetQuantitiesBillPageList) {
			uri = bundle.getString("getQuantitiesBillPageList.uri");
		}
		if (name == InterfaceName.AddQuantitiesBill) {
			uri = bundle.getString("addQuantitiesBill.uri");
		}
		if (name == InterfaceName.UpdateQuantitiesBill) {
			uri = bundle.getString("updateQuantitiesBill.uri");
		}

		if (name == InterfaceName.GetEngineeringLedgerTypeList) {
			uri = bundle.getString("getEngineeringLedgerTypeList.uri");
		}
		if (name == InterfaceName.AddEngineeringLedgerType) {
			uri = bundle.getString("addEngineeringLedgerType.uri");
		}
		if (name == InterfaceName.UpdateEngineeringLedgerType) {
			uri = bundle.getString("updateEngineeringLedgerType.uri");
		}
		if (name == InterfaceName.DelEngineeringLedgerType) {
			uri = bundle.getString("delEngineeringLedgerType.uri");
		}

		if (name == InterfaceName.ExportEngineeringLedgerType) {
			uri = bundle.getString("exportEngineeringLedgerType.uri");
		}
		if (name == InterfaceName.ImportEngineeringLedgerType) {
			uri = bundle.getString("importEngineeringLedgerType.uri");
		}
		if (name == InterfaceName.GetSearchLedgerType) {
			uri = bundle.getString("getSearchLedgerType.uri");
		}
		if (name == InterfaceName.DelQuantitiesBill) {
			uri = bundle.getString("delQuantitiesBill.uri");
		}
		if (name == InterfaceName.GetQuantitiesBillList) {
			uri = bundle.getString("getQuantitiesBillList.uri");
		}
		if (name == InterfaceName.BaseExport) {
			uri = bundle.getString("baseExport.uri");
		}
		if (name == InterfaceName.GetLedgerPageList) {
			uri = bundle.getString("getLedgerPageList.uri");
		}
		if (name == InterfaceName.AddLedger) {
			uri = bundle.getString("addLedger.uri");
		}
		if (name == InterfaceName.UpdateLedger) {
			uri = bundle.getString("updateLedger.uri");
		}
		if (name == InterfaceName.DelLedger) {
			uri = bundle.getString("delLedger.uri");
		}
		if (name == InterfaceName.GetLedgerLists) {
			uri = bundle.getString("getLedgerLists.uri");
		}
		if (name == InterfaceName.GetTaskDesignArgsPageList) {
			uri = bundle.getString("getTaskDesignArgsPageList.uri");
		}
		if (name == InterfaceName.AddTaskDesignArgs) {
			uri = bundle.getString("addTaskDesignArgs.uri");
		}
		if (name == InterfaceName.UpdateTaskDesignArgs) {
			uri = bundle.getString("updateTaskDesignArgs.uri");
		}
		if (name == InterfaceName.DelTaskDesignArgs) {
			uri = bundle.getString("delTaskDesignArgs.uri");
		}
		if (name == InterfaceName.GetEngineeringSectionList) {
			uri = bundle.getString("getEngineeringSectionList.uri");
		}
		if (name == InterfaceName.AddEngineeringSection) {
			uri = bundle.getString("addEngineeringSection.uri");
		}
		if (name == InterfaceName.UpdateEngineeringSection) {
			uri = bundle.getString("updateEngineeringSection.uri");
		}
		if (name == InterfaceName.DelEngineeringSection) {
			uri = bundle.getString("delEngineeringSection.uri");
		}
		if (name == InterfaceName.EngineeringSection) {
			uri = bundle.getString("engineeringSection.uri");
		}
		if (name == InterfaceName.GetImportModuleList) {
			uri = bundle.getString("getImportModuleList.uri");
		}
		if (name == InterfaceName.GetCommonConstant) {
			uri = bundle.getString("getCommonConstant.uri");
		}
		if (name == InterfaceName.GetMaterialCodeJadinecList) {
			uri = bundle.getString("getMaterialCodeJadinecList.uri");
		}
		if (name == InterfaceName.GetMaterialCategoryList) {
			uri = bundle.getString("getMaterialCategoryList.uri");
		}
		if (name == InterfaceName.AddOrUpdateMaterialCategory) {
			uri = bundle.getString("addOrUpdateMaterialCategory.uri");
		}
		if (name == InterfaceName.DelMaterialCategory) {
			uri = bundle.getString("delMaterialCategory.uri");
		}
		if (name == InterfaceName.GetMaterialCategoryPageList) {
			uri = bundle.getString("getMaterialCategoryPageList.uri");
		}
		if (name == InterfaceName.GetDrawLevelPageList) {
			uri = bundle.getString("getDrawLevelPageList.uri");
		}
		if (name == InterfaceName.GetDrawLevelList) {
			uri = bundle.getString("getDrawLevelList.uri");
		}
		if (name == InterfaceName.AddDrawLevel) {
			uri = bundle.getString("addDrawLevel.uri");
		}
		if (name == InterfaceName.UpdateDrawLevel) {
			uri = bundle.getString("updateDrawLevel.uri");
		}
		if (name == InterfaceName.DelDrawLevel) {
			uri = bundle.getString("delDrawLevel.uri");
		}
		if (name == InterfaceName.GetImportConfigList) {
			uri = bundle.getString("getImportConfigList.uri");
		}
		if (name == InterfaceName.AddImportConfig) {
			uri = bundle.getString("addImportConfig.uri");
		}
		if (name == InterfaceName.UpdateImportConfig) {
			uri = bundle.getString("updateImportConfig.uri");
		}
		if (name == InterfaceName.DelImportConfig) {
			uri = bundle.getString("delImportConfig.uri");
		}
		if (name == InterfaceName.ImportConfigDetail) {
			uri = bundle.getString("importConfigDetail.uri");
		}
		if (name == InterfaceName.ImportConfig) {
			uri = bundle.getString("importConfig.uri");
		}
		if (name == InterfaceName.ImportTemplate) {
			uri = bundle.getString("importTemplate.uri");
		}
		if (name == InterfaceName.GetExcavationMethodList) {
			uri = bundle.getString("getExcavationMethodList.uri");
		}
		if (name == InterfaceName.AddOrUpdateExcavationMethod) {
			uri = bundle.getString("addOrUpdateExcavationMethod.uri");
		}
		if (name == InterfaceName.DelExcavationMethod) {
			uri = bundle.getString("delExcavationMethod.uri");
		}
		if (name == InterfaceName.ExportExcavationMethod) {
			uri = bundle.getString("exportExcavationMethod.uri");
		}
		if (name == InterfaceName.ImportExcavationMethod) {
			uri = bundle.getString("importExcavationMethod.uri");
		}
		if (name == InterfaceName.GetBillCodeProcessCodeList) {
			uri = bundle.getString("getBillCodeProcessCodeList.uri");
		}
		if (name == InterfaceName.AddOrUpdateBillCodeToProcessCode) {
			uri = bundle.getString("addOrUpdateBillCodeToProcessCode.uri");
		}
		if (name == InterfaceName.DelBillCodeProcessCode) {
			uri = bundle.getString("delBillCodeProcessCode.uri");
		}
		if (name == InterfaceName.ExportBillCodeProcessCode) {
			uri = bundle.getString("exportBillCodeProcessCode.uri");
		}
		if (name == InterfaceName.ImportBillCodeProcessCode) {
			uri = bundle.getString("importBillCodeProcessCode.uri");
		}
		if (name == InterfaceName.GetFileHistoryList) {
			uri = bundle.getString("getFileHistoryList.uri");
		}
		if (name == InterfaceName.GetEngineeringCategoryList) {
			uri = bundle.getString("getEngineeringCategoryList.uri");
		}
		if (name == InterfaceName.UpdateEngineeringCategory) {
			uri = bundle.getString("updateEngineeringCategory.uri");
		}
		if (name == InterfaceName.EngineeringCategoryDetail) {
			uri = bundle.getString("engineeringCategoryDetail.uri");
		}
		if (name == InterfaceName.EngineeringCategory) {
			uri = bundle.getString("engineeringCategory.uri");
		}
		if (name == InterfaceName.GetEngineeringLevelList) {
			uri = bundle.getString("getEngineeringLevelList.uri");
		}
		if (name == InterfaceName.UpdateEngineeringLevel) {
			uri = bundle.getString("updateEngineeringLevel.uri");
		}
		if (name == InterfaceName.EngineeringLevelDetail) {
			uri = bundle.getString("engineeringLevelDetail.uri");
		}
		if (name == InterfaceName.GetEngineeringTypeList) {
			uri = bundle.getString("getEngineeringTypeList.uri");
		}
		if (name == InterfaceName.AddEngineeringType) {
			uri = bundle.getString("addEngineeringType.uri");
		}
		if (name == InterfaceName.UpdateEngineeringType) {
			uri = bundle.getString("updateEngineeringType.uri");
		}
		if (name == InterfaceName.GetLedgerChangeInfoPageList) {
			uri = bundle.getString("getLedgerChangeInfoPageList.uri");
		}
		if (name == InterfaceName.AddLedgerChangeInfo) {
			uri = bundle.getString("addLedgerChangeInfo.uri");
		}
		if (name == InterfaceName.UpdateLedgerChangeInfo) {
			uri = bundle.getString("updateLedgerChangeInfo.uri");
		}
		if (name == InterfaceName.DelLedgerChangeInfo) {
			uri = bundle.getString("delLedgerChangeInfo.uri");
		}
		if (name == InterfaceName.GetLedgerChangeInfo) {
			uri = bundle.getString("getLedgerChangeInfo.uri");
		}
		if (name == InterfaceName.GetLedgerChangeDetailPageList) {
			uri = bundle.getString("getLedgerChangeDetailPageList.uri");
		}
		if (name == InterfaceName.GetLedgerChangeAmountSum) {
			uri = bundle.getString("getLedgerChangeAmountSum.uri");
		}
		if (name == InterfaceName.GetLedgerPageLists) {
			uri = bundle.getString("getLedgerPageLists.uri");
		}
		if (name == InterfaceName.GetLedgerChangeList) {
			uri = bundle.getString("getLedgerChangeList.uri");
		}
		if (name == InterfaceName.AddLedgerChange) {
			uri = bundle.getString("addLedgerChange.uri");
		}
		if (name == InterfaceName.UpdateLedgerChange) {
			uri = bundle.getString("updateLedgerChange.uri");
		}
		if (name == InterfaceName.DelLedgerChange) {
			uri = bundle.getString("delLedgerChange.uri");
		}
		if (name == InterfaceName.GetBillChangePageList) {
			uri = bundle.getString("getBillChangePageList.uri");
		}
		if (name == InterfaceName.AddBillChange) {
			uri = bundle.getString("addBillChange.uri");
		}
		if (name == InterfaceName.UpdateBillChange) {
			uri = bundle.getString("updateBillChange.uri");
		}
		if (name == InterfaceName.DelBillChange) {
			uri = bundle.getString("delBillChange.uri");
		}
		if (name == InterfaceName.DelEngineeringType) {
			uri = bundle.getString("delEngineeringType.uri");
		}
		if (name == InterfaceName.EngineeringType) {
			uri = bundle.getString("engineeringType.uri");
		}
		if (name == InterfaceName.EngineeringTypeDetail) {
			uri = bundle.getString("engineeringTypeDetail.uri");
		}
		if (name == InterfaceName.ImportEngineeringType) {
			uri = bundle.getString("importEngineeringType.uri");
		}
		if (name == InterfaceName.AddOrUpdateMaterialCode) {
			uri = bundle.getString("addOrUpdateMaterialCode.uri");
		}
		if (name == InterfaceName.DelMaterialCodeByIds) {
			uri = bundle.getString("delMaterialCodeByIds.uri");
		}
		if (name == InterfaceName.GetMaterialCodeById) {
			uri = bundle.getString("getMaterialCodeById.uri");
		}
		if (name == InterfaceName.GetMixture) {
			uri = bundle.getString("getMixture.uri");
		}
		if (name == InterfaceName.ImportMaterialCode) {
			uri = bundle.getString("importMaterialCode.uri");
		}
		if (name == InterfaceName.ExportMaterialCode) {
			uri = bundle.getString("exportMaterialCode.uri");
		}
		if (name == InterfaceName.AddOrUpdateMechanicalType) {
			uri = bundle.getString("addOrUpdateMechanicalType.uri");
		}
		if (name == InterfaceName.DelMechanicalById) {
			uri = bundle.getString("delMechanicalById.uri");
		}
		if (name == InterfaceName.ImportMechanical) {
			uri = bundle.getString("importMechanical.uri");
		}
		if (name == InterfaceName.ExportMechanical) {
			uri = bundle.getString("exportMechanical.uri");
		}
		if (name == InterfaceName.GetProList) {
			uri = bundle.getString("getProList.uri");
		}
		if (name == InterfaceName.BaseImport) {
			uri = bundle.getString("baseImport.uri");
		}
		if (name == InterfaceName.BaseExports) {
			uri = bundle.getString("baseExports.uri");
		}
		if (name == InterfaceName.BaseGetPageList) {
			uri = bundle.getString("baseGetPageList.uri");
		}
		if (name == InterfaceName.BaseDeleteById) {
			uri = bundle.getString("baseDeleteById.uri");
		}
		if (name == InterfaceName.BaseGetById) {
			uri = bundle.getString("baseGetById.uri");
		}
		if (name == InterfaceName.AddOrUpdateRoadLine) {
			uri = bundle.getString("addOrUpdateRoadLine.uri");
		}
		if (name == InterfaceName.FindTemplateList) {
			uri = bundle.getString("findTemplateList.uri");
		}
		if (name == InterfaceName.GetWorkBulletinList) {
			uri = bundle.getString("getWorkBulletinList.uri");
		}
		if (name == InterfaceName.GetFinishEngineeringList) {
			uri = bundle.getString("getFinishEngineeringList.uri");
		}
		if (name == InterfaceName.GetWorkingEngineeringList) {
			uri = bundle.getString("getWorkingEngineeringList.uri");
		}
		if (name == InterfaceName.Export) {
			uri = bundle.getString("export.uri");
		}
		if (name == InterfaceName.GetReportRegularDetail) {
			uri = bundle.getString("getReportRegularDetail.uri");
		}
		if (name == InterfaceName.List) {
			uri = bundle.getString("list.uri");
		}
		if (name == InterfaceName.Token) {
			uri = bundle.getString("token.uri");
		}
		if (name == InterfaceName.GetAllOrgNames) {
			uri = bundle.getString("getAllOrgNames.uri");
		}
		if (name == InterfaceName.AddOrgInfo) {
			uri = bundle.getString("addOrgInfo.uri");
		}
		if (name == InterfaceName.UpdateOssOrgInfo) {
			uri = bundle.getString("updateOssOrgInfo.uri");
		}
		if (name == InterfaceName.GetOrgInfoByOrgId) {
			uri = bundle.getString("getOrgInfoByOrgId.uri");
		}
		if (name == InterfaceName.DelOrgInfoByOrgId) {
			uri = bundle.getString("delOrgInfoByOrgId.uri");
		}
		if (name == InterfaceName.GetOrgListByPage) {
			uri = bundle.getString("getOrgListByPage.uri");
		}
		if (name == InterfaceName.UpdateOssOrgBaseInfo) {
			uri = bundle.getString("updateOssOrgBaseInfo.uri");
		}
		if (name == InterfaceName.GetEntireOrgTreeByOrgId) {
			uri = bundle.getString("getEntireOrgTreeByOrgId.uri");
		}
		if (name == InterfaceName.GetAllOrgWithoutDefault) {
			uri = bundle.getString("getAllOrgWithoutDefault.uri");
		}
		if (name == InterfaceName.GetParentOrgByOrgCategory) {
			uri = bundle.getString("getParentOrgByOrgCategory.uri");
		}
		if (name == InterfaceName.GetOrgProInfoByProId) {
			uri = bundle.getString("getOrgProInfoByProId.uri");
		}
		if (name == InterfaceName.AddOrgProInfo) {
			uri = bundle.getString("addOrgProInfo.uri");
		}
		if (name == InterfaceName.UpdateOssOrgProInfo) {
			uri = bundle.getString("updateOssOrgProInfo.uri");
		}
		if (name == InterfaceName.DelOrgProInfoByProId) {
			uri = bundle.getString("delOrgProInfoByProId.uri");
		}
		if (name == InterfaceName.GetOrgProListByPage) {
			uri = bundle.getString("getOrgProListByPage.uri");
		}
		if (name == InterfaceName.GetEntireOrgProTreeByProId) {
			uri = bundle.getString("getEntireOrgProTreeByProId.uri");
		}
		if (name == InterfaceName.GetProsByOrgIds) {
			uri = bundle.getString("getProsByOrgIds.uri");
		}
		if (name == InterfaceName.GetSpecifyProOutputValue) {
			uri = bundle.getString("getSpecifyProOutputValue.uri");
		}
		if (name == InterfaceName.AddOssOrgDeptInfo) {
			uri = bundle.getString("addOssOrgDeptInfo.uri");
		}
		if (name == InterfaceName.UpdateOssDeptInfo) {
			uri = bundle.getString("updateOssDeptInfo.uri");
		}
		if (name == InterfaceName.GetOrgDeptInfoByDeptId) {
			uri = bundle.getString("getOrgDeptInfoByDeptId.uri");
		}
		if (name == InterfaceName.DelOrgDeptInfoByDeptId) {
			uri = bundle.getString("delOrgDeptInfoByDeptId.uri");
		}
		if (name == InterfaceName.AddOrgDeptInfo) {
			uri = bundle.getString("addOrgDeptInfo.uri");
		}
		if (name == InterfaceName.UpdateDeptInfo) {
			uri = bundle.getString("updateDeptInfo.uri");
		}
		if (name == InterfaceName.GetEntireOrgDeptTreeByUserId) {
			uri = bundle.getString("getEntireOrgDeptTreeByUserId.uri");
		}
		if (name == InterfaceName.GetOrgDeptsByUserId) {
			uri = bundle.getString("getOrgDeptsByUserId.uri");
		}
		if (name == InterfaceName.GetProDeptsByProId) {
			uri = bundle.getString("getProDeptsByProId.uri");
		}
		if (name == InterfaceName.GetOrgUsersWithoutWorkerByDeptId) {
			uri = bundle.getString("getOrgUsersWithoutWorkerByDeptId.uri");
		}
		if (name == InterfaceName.GetOrgDeptWithoutProDeptsByOrgId) {
			uri = bundle.getString("getOrgDeptWithoutProDeptsByOrgId.uri");
		}
		if (name == InterfaceName.GetEntireProDeptTreeByProId) {
			uri = bundle.getString("getEntireProDeptTreeByProId.uri");
		}
		if (name == InterfaceName.GetProUsersByProDeptId) {
			uri = bundle.getString("getProUsersByProDeptId.uri");
		}
		if (name == InterfaceName.GetDeptTypeByDeptId) {
			uri = bundle.getString("getDeptTypeByDeptId.uri");
		}
		if (name == InterfaceName.AddOrgJobInfo) {
			uri = bundle.getString("addOrgJobInfo.uri");
		}
		if (name == InterfaceName.UpdateOrgJob) {
			uri = bundle.getString("updateOrgJob.uri");
		}
		if (name == InterfaceName.GetOrgJobInfoByJobId) {
			uri = bundle.getString("getOrgJobInfoByJobId.uri");
		}
		if (name == InterfaceName.DelOrgJobInfoByJobId) {
			uri = bundle.getString("delOrgJobInfoByJobId.uri");
		}
		if (name == InterfaceName.GetOrgJobInfoListByPage) {
			uri = bundle.getString("getOrgJobInfoListByPage.uri");
		}
		if (name == InterfaceName.GetProJobInfoListByPage) {
			uri = bundle.getString("getProJobInfoListByPage.uri");
		}
		if (name == InterfaceName.GetOrgJobInfosByOrgDeptId) {
			uri = bundle.getString("getOrgJobInfosByOrgDeptId.uri");
		}
		if (name == InterfaceName.AddOrgRoleInfo) {
			uri = bundle.getString("addOrgRoleInfo.uri");
		}
		if (name == InterfaceName.GetOrgRoleInfoByRoleId) {
			uri = bundle.getString("getOrgRoleInfoByRoleId.uri");
		}
		if (name == InterfaceName.UpdateOrgRoleInfo) {
			uri = bundle.getString("updateOrgRoleInfo.uri");
		}
		if (name == InterfaceName.DelOrgRoleInfoByRoleId) {
			uri = bundle.getString("delOrgRoleInfoByRoleId.uri");
		}
		if (name == InterfaceName.GetOrgRoleInfoListByPage) {
			uri = bundle.getString("getOrgRoleInfoListByPage.uri");
		}
		if (name == InterfaceName.GetProRoleInfoListByPage) {
			uri = bundle.getString("getProRoleInfoListByPage.uri");
		}
		if (name == InterfaceName.UpdateOrgRole2Res) {
			uri = bundle.getString("updateOrgRole2Res.uri");
		}
		if (name == InterfaceName.GetOrgRolesByOrgId) {
			uri = bundle.getString("getOrgRolesByOrgId.uri");
		}
		if (name == InterfaceName.GetProRolesByProId) {
			uri = bundle.getString("getProRolesByProId.uri");
		}
		if (name == InterfaceName.GetOrgResByRoleId) {
			uri = bundle.getString("getOrgResByRoleId.uri");
		}
		if (name == InterfaceName.GetUserAllInfoByUserId) {
			uri = bundle.getString("getUserAllInfoByUserId.uri");
		}
		if (name == InterfaceName.GetUserBaseInfoByUserId) {
			uri = bundle.getString("getUserBaseInfoByUserId.uri");
		}
		if (name == InterfaceName.GetOrgUserCertificatesByUserId) {
			uri = bundle.getString("getOrgUserCertificatesByUserId.uri");
		}
		if (name == InterfaceName.GetOrgUserProExperiencesByUserId) {
			uri = bundle.getString("getOrgUserProExperiencesByUserId.uri");
		}
		if (name == InterfaceName.GetOrgUserWorkExperiencesByUserId) {
			uri = bundle.getString("getOrgUserWorkExperiencesByUserId.uri");
		}
		if (name == InterfaceName.UpdateOrgUserBaseInfo) {
			uri = bundle.getString("updateOrgUserBaseInfo.uri");
		}
		if (name == InterfaceName.GetMyOssResList) {
			uri = bundle.getString("getMyOssResList.uri");
		}
		if (name == InterfaceName.GetMyOrgResList) {
			uri = bundle.getString("getMyOrgResList.uri");
		}
		if (name == InterfaceName.GetMyProResList) {
			uri = bundle.getString("getMyProResList.uri");
		}
		if (name == InterfaceName.GetProUserListByPage) {
			uri = bundle.getString("getProUserListByPage.uri");
		}
		if (name == InterfaceName.GetOrgUserListByPage) {
			uri = bundle.getString("getOrgUserListByPage.uri");
		}
		if (name == InterfaceName.DelUserInfo) {
			uri = bundle.getString("delUserInfo.uri");
		}
		if (name == InterfaceName.DisableUserLogin) {
			uri = bundle.getString("disableUserLogin.uri");
		}
		if (name == InterfaceName.EnableUserLogin) {
			uri = bundle.getString("enableUserLogin.uri");
		}
		if (name == InterfaceName.UpdateUserLoginPassword) {
			uri = bundle.getString("updateUserLoginPassword.uri");
		}
		if (name == InterfaceName.UpdateCompanyUserInfo) {
			uri = bundle.getString("updateCompanyUserInfo.uri");
		}
		if (name == InterfaceName.UpdateOssUserInfo) {
			uri = bundle.getString("updateOssUserInfo.uri");
		}
		if (name == InterfaceName.GetCompanyUserAuthorizationByUserId) {
			uri = bundle.getString("getCompanyUserAuthorizationByUserId.uri");
		}
		if (name == InterfaceName.GetOssUserAuthorizationByUserId) {
			uri = bundle.getString("getOssUserAuthorizationByUserId.uri");
		}
		if (name == InterfaceName.GetOrgAdminPageListByOrgId) {
			uri = bundle.getString("getOrgAdminPageListByOrgId.uri");
		}
		if (name == InterfaceName.GetProAdminPageListByProId) {
			uri = bundle.getString("getProAdminPageListByProId.uri");
		}
		if (name == InterfaceName.AddAdmin) {
			uri = bundle.getString("addAdmin.uri");
		}
		if (name == InterfaceName.UpdateAdmin) {
			uri = bundle.getString("updateAdmin.uri");
		}
		if (name == InterfaceName.DelAdmin) {
			uri = bundle.getString("delAdmin.uri");
		}
		if (name == InterfaceName.UpdateAdminRes) {
			uri = bundle.getString("updateAdminRes.uri");
		}
		if (name == InterfaceName.SendVerifyCode) {
			uri = bundle.getString("sendVerifyCode.uri");
		}
		if (name == InterfaceName.UpdatePwdBySms) {
			uri = bundle.getString("updatePwdBySms.uri");
		}
		if (name == InterfaceName.UpdatePhoneBySms) {
			uri = bundle.getString("updatePhoneBySms.uri");
		}
		if (name == InterfaceName.ExportOrgUser) {
			uri = bundle.getString("exportOrgUser.uri");
		}
		if (name == InterfaceName.FindProInfoListByUserId) {
			uri = bundle.getString("findProInfoListByUserId.uri");
		}
		if (name == InterfaceName.FindOrgInfoListByUserId) {
			uri = bundle.getString("findOrgInfoListByUserId.uri");
		}
		if (name == InterfaceName.FindOrgInfoByUserId) {
			uri = bundle.getString("findOrgInfoByUserId.uri");
		}
		if (name == InterfaceName.GetAppResList) {
			uri = bundle.getString("getAppResList.uri");
		}
		if (name == InterfaceName.FindProUserByProId) {
			uri = bundle.getString("findProUserByProId.uri");
		}
		if (name == InterfaceName.FindLoginInfoByUserId) {
			uri = bundle.getString("findLoginInfoByUserId.uri");
		}
		if (name == InterfaceName.FindOrgUserByOrgId) {
			uri = bundle.getString("findOrgUserByOrgId.uri");
		}
		if (name == InterfaceName.GetUserOrgAndProList) {
			uri = bundle.getString("getUserOrgAndProList.uri");
		}
		if (name == InterfaceName.GetMyResListBySysId) {
			uri = bundle.getString("getMyResListBySysId.uri");
		}
		if (name == InterfaceName.GetOrgResInfoByResId) {
			uri = bundle.getString("getOrgResInfoByResId.uri");
		}
		if (name == InterfaceName.AddResInfo) {
			uri = bundle.getString("addResInfo.uri");
		}
		if (name == InterfaceName.UpdateOrgResInfo) {
			uri = bundle.getString("updateOrgResInfo.uri");
		}
		if (name == InterfaceName.DelOrgResInfoByResId) {
			uri = bundle.getString("delOrgResInfoByResId.uri");
		}
		if (name == InterfaceName.GetOrgResInfoListBySysId) {
			uri = bundle.getString("getOrgResInfoListBySysId.uri");
		}
		if (name == InterfaceName.GetOrgResInfoListByPage) {
			uri = bundle.getString("getOrgResInfoListByPage.uri");
		}
		if (name == InterfaceName.GetSystemApi) {
			uri = bundle.getString("getSystemApi.uri");
		}
		if (name == InterfaceName.EnableOrgRes) {
			uri = bundle.getString("enableOrgRes.uri");
		}
		if (name == InterfaceName.GetDefaultAdminOrgRes) {
			uri = bundle.getString("getDefaultAdminOrgRes.uri");
		}
		if (name == InterfaceName.FindBandsStatMenu) {
			uri = bundle.getString("findBandsStatMenu.uri");
		}
		if (name == InterfaceName.FindUserMenu) {
			uri = bundle.getString("findUserMenu.uri");
		}
		if (name == InterfaceName.FindContractorList) {
			uri = bundle.getString("findContractorList.uri");
		}
		if (name == InterfaceName.FindContractorDetails) {
			uri = bundle.getString("findContractorDetails.uri");
		}
		if (name == InterfaceName.GetEnumList) {
			uri = bundle.getString("getEnumList.uri");
		}
		if (name == InterfaceName.GetProsByOrgId) {
			uri = bundle.getString("getProsByOrgId.uri");
		}
		if (name == InterfaceName.GetOrgJobDicListByPage) {
			uri = bundle.getString("getOrgJobDicListByPage.uri");
		}
		if (name == InterfaceName.AddOrgJobDic) {
			uri = bundle.getString("addOrgJobDic.uri");
		}
		if (name == InterfaceName.UpdateOrgJobDic) {
			uri = bundle.getString("updateOrgJobDic.uri");
		}
		if (name == InterfaceName.GetOrgJobDicList) {
			uri = bundle.getString("getOrgJobDicList.uri");
		}
		if (name == InterfaceName.DelOrgJobDicById) {
			uri = bundle.getString("delOrgJobDicById.uri");
		}
		if (name == InterfaceName.ExportProUser) {
			uri = bundle.getString("exportProUser.uri");
		}
		if (name == InterfaceName.AddOssUserBaseInfo) {
			uri = bundle.getString("addOssUserBaseInfo.uri");
		}
		if (name == InterfaceName.AddCompanyUserInfo) {
			uri = bundle.getString("addCompanyUserInfo.uri");
		}
		if (name == InterfaceName.Lists) {
			uri = bundle.getString("lists.uri");
		}
		if (name == InterfaceName.Adds) {
			uri = bundle.getString("adds.uri");
		}
		if (name == InterfaceName.Updates) {
			uri = bundle.getString("updates.uri");
		}
		if (name == InterfaceName.Dels) {
			uri = bundle.getString("dels.uri");
		}
		if (name == InterfaceName.GetMaterialRecordList) {
			uri = bundle.getString("getMaterialRecordList.uri");
		}
		
		testUrl = address + uri;
		return testUrl;
	}
}
