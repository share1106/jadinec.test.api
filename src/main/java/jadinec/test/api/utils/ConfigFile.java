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
	public static String clientPC = bundle.getString("clientPC");
	public static String access_token_pc = bundle.getString("access_token_pc");
	
	
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
		if(name == InterfaceName.GetTemporaryMoneyList) {
			uri = bundle.getString("getTemporaryMoneyList.uri");
		}
		if(name == InterfaceName.GetLedgerList) {
			uri = bundle.getString("getLedgerList.uri");
		}
		if(name == InterfaceName.TunnelWorkTimePlanGetList) {
			uri = bundle.getString("getList.uri");
		}
		if(name == InterfaceName.TunnelGetEngineeringCategoryList) {
			uri = bundle.getString("getEngineeringCategoryList.uri");
		}
		if(name == InterfaceName.TunnelGetEngineeringCategoryTypeList) {
			uri = bundle.getString("getEngineeringTypeList.uri");
		}
		if(name == InterfaceName.TunnelGetProcessStepList) {
			uri = bundle.getString("getProcessStepList.uri");
		}
		if(name == InterfaceName.TunnelAddOrUpdate) {
			uri = bundle.getString("addOrUpdate.uri");
		}
		if(name == InterfaceName.TunnelGetDetail) {
			uri = bundle.getString("getDetail.uri");
		}
		if(name == InterfaceName.TunnelDelete) {
			uri = bundle.getString("delete.uri");
		}
		if(name == InterfaceName.TunnelWallRockGetBasicInfo) {
			uri = bundle.getString("getBasicInfo.uri");
		}
		if(name == InterfaceName.TunnelWallRockListEngineeringLists) {
			uri = bundle.getString("listEngineeringLists.uri");
		}
		if(name == InterfaceName.TunnelWallRockList) {
			uri = bundle.getString("listWallRocks.uri");
		}
		if(name == InterfaceName.TunnelWallRockListLiningTypes) {
			uri = bundle.getString("listLiningTypes.uri");
		}
		if(name == InterfaceName.TunnelWallRockListMaterialInfo) {
			uri = bundle.getString("listMaterialInfo.uri");
		}
		if(name == InterfaceName.TunnelWallRockAddOrUpdateWallRockLevelChange) {
			uri = bundle.getString("addOrUpdateWallRockLevelChange.uri");
		}
		if(name == InterfaceName.TunnelWallRockQueryWallRockInfoByProcessOdd) {
			uri = bundle.getString("queryWallRoackInfoByProcessOdd.uri");
		}
		if(name == InterfaceName.TunnelReviewWallRockLevel) {
			uri = bundle.getString("reviewWallRockLevel.uri");
		}
		if(name == InterfaceName.TunnelWallRockcancelMaterialProcess) {
			uri = bundle.getString("cancelMaterialProcess.uri");
		}
		if(name == InterfaceName.TunnelEffectGetEffectRecordList) {
			uri = bundle.getString("getEffectRecordList.uri");
		}
		if(name == InterfaceName.TunnelEffectGetTechnicianList) {
			uri = bundle.getString("getTechnicianList.uri");
		}
		if(name == InterfaceName.TunnelCancelEffectTechnicianList) {
			uri = bundle.getString("cancelEffectRecordProcess.uri");
		}
		if(name == InterfaceName.TunnelCancelEffectAddPageInitData) {
			uri = bundle.getString("getAddPageInitData.uri");
		}
		if(name == InterfaceName.TunnelEffectGetProcessDetail) {
			uri = bundle.getString("getProcessDetail.uri");
		}
		if(name == InterfaceName.TunnelEffectGetEffectRecordDetail) {
			uri = bundle.getString("getEffectRecordDetail.uri");
		}
		if(name == InterfaceName.TunnelEffectCheck) {
			uri = bundle.getString("reviewEffectRecord.uri");
		}
		if(name == InterfaceName.TunnelEffectExportDataToPath) {
			uri = bundle.getString("exportDataToPath.uri");
		}
		if(name == InterfaceName.StatisticListProjectSeperate) {
			uri = bundle.getString("listProjectSeperate.uri");
		}
		if(name == InterfaceName.StatisticGetProjectLocationSummaryInfo) {
			uri = bundle.getString("getProjectLocationSummaryInfo.uri");
		}
		if(name == InterfaceName.StatisticGetSubcontractorSeperateList) {
			uri = bundle.getString("getSubcontractorSeperateList.uri");
		}
		if(name == InterfaceName.StatisticGetSubcontractorLocationSummary) {
			uri = bundle.getString("getSubcontractorLocationSummary.uri");
		}
		if(name == InterfaceName.StatisticGetEngineeringMaterialSummary) {
			uri = bundle.getString("getEngineeringMaterialSummary.uri");
		}
		if(name == InterfaceName.StatisticGetMaterialConsumeDetail) {
			uri = bundle.getString("getMaterialConsumeDetail.uri");
		}
		if(name == InterfaceName.StatisticGetEngineeringMaterialDetail) {
			uri = bundle.getString("getEngineeringMaterialDetail.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleGetBaseInfo) {
			uri = bundle.getString("getSlagHoleBaseInfo.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleGetMaterialList) {
			uri = bundle.getString("getSlagHoleMaterialList.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleGetDispatchVehicleList) {
			uri = bundle.getString("getDispatchVehicleList.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleSaveDispatch) {
			uri = bundle.getString("saveDispatch.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleGetDispatchList) {
			uri = bundle.getString("getDispatchList.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleGetDispatchDetail) {
			uri = bundle.getString("getDispatchDetail.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleGetReceivingVehicleList) {
			uri = bundle.getString("getReceivingVehicleList.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleGetReceivingList) {
			uri = bundle.getString("getReceivingList.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleGetReceivingDetail) {
			uri = bundle.getString("getReceivingDetail.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleGetWeighingOrderDetail) {
			uri = bundle.getString("getWeighingOrderDetail.uri");
		}
		if(name == InterfaceName.TunnelWallRockpreview) {
			uri = bundle.getString("preview.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleUpdateWeighingList) {
			uri = bundle.getString("updateWeighingList.uri");
		}
		if(name == InterfaceName.TunnelSlagHoleSaveReceiving) {
			uri = bundle.getString("saveReceiving.uri");
		}
		if(name == InterfaceName.GetEarthworkTask) {
			uri = bundle.getString("getEarthworkTask.uri");
		}
		if(name == InterfaceName.GetOnlineMarkList) {
			uri = bundle.getString("getOnlineMarkList.uri");
		}
		if(name == InterfaceName.GetMarkDetailForSlide) {
			uri = bundle.getString("getMarkDetailForSlide.uri");
		}
		if(name == InterfaceName.GetDeviceByDeviceType) {
			uri = bundle.getString("getDeviceByDeviceType.uri");
		}
		if(name == InterfaceName.GetEarthworkBorrowArea) {
			uri = bundle.getString("getEarthworkBorrowArea.uri");
		}
		if(name == InterfaceName.InsertEarthworkTaskToOwner) {
			uri = bundle.getString("insertEarthworkTaskToOwner.uri");
		}
		if(name == InterfaceName.UpdateEarthworkOwnerById) {
			uri = bundle.getString("updateEarthworkOwnerById.uri");
		}
		if(name == InterfaceName.GetTodayStatistic) {
			uri = bundle.getString("getTodayStatistic.uri");
		}
		if(name == InterfaceName.SaveDeviceWorkingInfo) {
			uri = bundle.getString("saveDeviceWorkingInfo.uri");
		}
		if(name == InterfaceName.GetTemporaryTaskType) {
			uri = bundle.getString("getTemporaryTaskType.uri");
		}
		if(name == InterfaceName.InsertTemporaryTask) {
			uri = bundle.getString("insertTemporaryTask.uri");
		}
		if(name == InterfaceName.GetSPTaskList) {
			uri = bundle.getString("getConstTaskList.uri");
		}
		if(name == InterfaceName.GetSplitEngineering) {
			uri = bundle.getString("getSplitTask.uri");
		}
		if(name == InterfaceName.CheckPlanExecState) {
			uri = bundle.getString("checkPlanExecState.uri");
		}
		if(name == InterfaceName.GetEngineeringItemDesignData) {
			uri = bundle.getString("getEngineeringItemDesignData.uri");
		}
		if(name == InterfaceName.GetEngineeringItemDesignLength) {
			uri = bundle.getString("getEngineeringItemDesignLength.uri");
		}
		if(name == InterfaceName.EditSplitTask) {
			uri = bundle.getString("editSplitTask.uri");
		}
		if(name == InterfaceName.DelSplitTask) {
			uri = bundle.getString("delSplitTask.uri");
		}
		if(name == InterfaceName.GetSplitDetail) {
			uri = bundle.getString("getSplitDetail.uri");
		}
		if(name == InterfaceName.GetTaskAndOrderList) {
			uri = bundle.getString("getTaskAndOrderList.uri");
		}
		if(name == InterfaceName.ArrivedExcavateArea) {
			uri = bundle.getString("arrivedExcavateArea.uri");
		}
		if(name == InterfaceName.EnterWjj) {
			uri = bundle.getString("enterWjj.uri");
		}
		if(name == InterfaceName.SaveFillOrder) {
			uri = bundle.getString("saveFillOrder.uri");
		}
		if(name == InterfaceName.DoneFillOrder) {
			uri = bundle.getString("doneFillOrder.uri");
		}
		if(name == InterfaceName.GetTodayWorkOrder) {
			uri = bundle.getString("getTodayWorkOrder.uri");
		}
		if(name == InterfaceName.GetStatisticWorkOrder) {
			uri = bundle.getString("getStatisticWorkOrder.uri");
		}
		if(name == InterfaceName.GetStatisticMonthWorkOrder) {
			uri = bundle.getString("getStatisticMonthWorkOrder.uri");
		}
		if(name == InterfaceName.GetFillOrderDetail) {
			uri = bundle.getString("getFillOrderDetail.uri");
		}
		if(name == InterfaceName.GetStatisticMonthLineWorkOrder) {
			uri = bundle.getString("getStatisticMonthLineWorkOrder.uri");
		}
		if(name == InterfaceName.GetFillTaskDetail) {
			uri = bundle.getString("getFillTaskDetail.uri");
		}
		if(name == InterfaceName.GetSplitEngineering) {
			uri = bundle.getString("getSplitEngineering.uri");
		}
		if(name == InterfaceName.GetPlanCategoryCode) {
			uri = bundle.getString("getPlanCategoryCode.uri");
		}
		if(name == InterfaceName.GetPlanSearchTypeCode) {
			uri = bundle.getString("getPlanSearchTypeCode.uri");
		}
		if(name == InterfaceName.GetSearchElement) {
			uri = bundle.getString("getSearchElement.uri");
		}
		if(name == InterfaceName.GetEngineeringCategory) {
			uri = bundle.getString("getEngineeringCategory.uri");
		}
		if(name == InterfaceName.GetEngineeringLevel) {
			uri = bundle.getString("getEngineeringLevel.uri");
		}
		if(name == InterfaceName.GetWorkAreaCode) {
			uri = bundle.getString("getWorkAreaCode.uri");
		}
		if(name == InterfaceName.GetEngineeringTypeProcess) {
			uri = bundle.getString("getEngineeringTypeProcess.uri");
		}
		if(name == InterfaceName.GetEngineeringType) {
			uri = bundle.getString("getEngineeringType.uri");
		}
		if(name == InterfaceName.FollowUp) {
			uri = bundle.getString("followUp.uri");
		}
		if(name == InterfaceName.Schedule) {
			uri = bundle.getString("schedule.uri");
		}
		if(name == InterfaceName.WebConcretePouringInform) {
			uri = bundle.getString("webConcretePouringInform.uri");
		}
		if(name == InterfaceName.ObtainProdNameList) {
			uri = bundle.getString("obtainProdNameList.uri");
		}
		if(name == InterfaceName.GetManageSlide) {
			uri = bundle.getString("getManageSlide.uri");
		}
		if(name == InterfaceName.GetMergeOrderList) {
			uri = bundle.getString("getMergeOrderList.uri");
		}
		if(name == InterfaceName.CreateMergeSerial) {
			uri = bundle.getString("createMergeSerial.uri");
		}
		if(name == InterfaceName.GetProgress) {
			uri = bundle.getString("getProgress.uri");
		}
		if(name == InterfaceName.GetMergeOrderDetail) {
			uri = bundle.getString("getMergeOrderDetail.uri");
		}
		if(name == InterfaceName.OutputTheSummary) {
			uri = bundle.getString("outputTheSummary.uri");
		}
		if(name == InterfaceName.Logout) {
			uri = bundle.getString("logout.uri");
		}
		if(name == InterfaceName.ToggleProCode) {
			uri = bundle.getString("toggleProCode.uri");
		}
		if(name == InterfaceName.GetOrgList) {
			uri = bundle.getString("getOrgList.uri");
		}
		if(name == InterfaceName.AddContract) {
			uri = bundle.getString("addContract.uri");
		}
		if(name == InterfaceName.GetPageList) {
			uri = bundle.getString("getPageList.uri");
		}
		if(name == InterfaceName.GetContractTotal) {
			uri = bundle.getString("getContractTotal.uri");
		}
		if(name == InterfaceName.GetContractInfo) {
			uri = bundle.getString("getContractInfo.uri");
		}
		if(name == InterfaceName.GetContViewList) {
			uri = bundle.getString("getContViewList.uri");
		}
		if(name == InterfaceName.GetProcessInfo) {
			uri = bundle.getString("getProcessInfo.uri");
		}
		if(name == InterfaceName.GetContEngineeringCount) {
			uri = bundle.getString("getContEngineeringCount.uri");
		}
		if(name == InterfaceName.GetContTeamgCount) {
			uri = bundle.getString("getContTeamgCount.uri");
		}
		if(name == InterfaceName.GetProProcessList) {
			uri = bundle.getString("getProProcessList.uri");
		}
		if(name == InterfaceName.GetContProcessList) {
			uri = bundle.getString("getContProcessList.uri");
		}
		if(name == InterfaceName.GetContAddList) {
			uri = bundle.getString("getContAddList.uri");
		}
		if(name == InterfaceName.AddAwaitCommitContItem) {
			uri = bundle.getString("addAwaitCommitContItem.uri");
		}
		if(name == InterfaceName.AddAllAwaitCommitContItem) {
			uri = bundle.getString("addAllAwaitCommitContItem.uri");
		}
		if(name == InterfaceName.AddAllContItem) {
			uri = bundle.getString("addAllContItem.uri");
		}
		if(name == InterfaceName.EditContract) {
			uri = bundle.getString("editContract.uri");
		}
		if(name == InterfaceName.DeleteContItem) {
			uri = bundle.getString("deleteContItem.uri");
		}
		if(name == InterfaceName.GetContTeamRangeList) {
			uri = bundle.getString("getContTeamRangeList.uri");
		}
		if(name == InterfaceName.AddContTeamItem) {
			uri = bundle.getString("addContTeamItem.uri");
		}
		if(name == InterfaceName.DeleteContTeamItem) {
			uri = bundle.getString("deleteContTeamItem.uri");
		}
		if(name == InterfaceName.DeleteContractorContract) {
			uri = bundle.getString("deleteContractorContract.uri");
		}
		if(name == InterfaceName.DeleteContItemByCondition) {
			uri = bundle.getString("deleteContItemByCondition.uri");
		}
		if(name == InterfaceName.AddContTeamItemByCondition) {
			uri = bundle.getString("addContTeamItemByCondition.uri");
		}
		if(name == InterfaceName.ObtainTeamList) {
			uri = bundle.getString("obtainTeamList.uri");
		}
		if(name == InterfaceName.GetTaskType) {
			uri = bundle.getString("getTaskType.uri");
		}
		if(name == InterfaceName.GetTaskAlterItems) {
			uri = bundle.getString("getTaskAlterItems.uri");
		}
		if(name == InterfaceName.GetHandOverRecord) {
			uri = bundle.getString("getHandOverRecord.uri");
		}
		if(name == InterfaceName.GetRecordDetails) {
			uri = bundle.getString("getRecordDetails.uri");
		}
		if(name == InterfaceName.Search) {
			uri = bundle.getString("search.uri");
		}
		if(name == InterfaceName.GetMergeElements) {
			uri = bundle.getString("getMergeElements.uri");
		}
		if(name == InterfaceName.FaceMatch) {
			uri = bundle.getString("faceMatch.uri");
		}
		if(name == InterfaceName.GetfaceSimilarScore) {
			uri = bundle.getString("getfaceSimilarScore.uri");
		}
		if(name == InterfaceName.GetUserInfoByfaceSimilar) {
			uri = bundle.getString("getUserInfoByfaceSimilar.uri");
		}
		if(name == InterfaceName.GetConstRatioDetail) {
			uri = bundle.getString("getConstRatioDetail.uri");
		}
		if(name == InterfaceName.GetProductProportion) {
			uri = bundle.getString("getProductProportion.uri");
		}
		if(name == InterfaceName.Data) {
			uri = bundle.getString("data.uri");
		}
		if(name == InterfaceName.GetStatisticsGroupWorkArea) {
			uri = bundle.getString("getStatisticsGroupWorkArea.uri");
		}
		if(name == InterfaceName.GetAllUnitProjectByWorkAreaCode) {
			uri = bundle.getString("getAllUnitProjectByWorkAreaCode.uri");
		}
		if(name == InterfaceName.AddTunnelConstTask) {
			uri = bundle.getString("addTunnelConstTask.uri");
		}
		if(name == InterfaceName.GetEngineeringTypeNum) {
			uri = bundle.getString("getEngineeringTypeNum.uri");
		}
		if(name == InterfaceName.GetProductByWorkAreas) {
			uri = bundle.getString("getProductByWorkAreas.uri");
		}
		if(name == InterfaceName.GetProductEngineeringQuantitiesLedger) {
			uri = bundle.getString("getProductEngineeringQuantitiesLedger.uri");
		}
		if(name == InterfaceName.GetContractorProductByDayOrMonthOrHistory) {
			uri = bundle.getString("getContractorProductByDayOrMonthOrHistory.uri");
		}
		if(name == InterfaceName.GetUnitEngineeringAndDept) {
			uri = bundle.getString("getUnitEngineeringAndDept.uri");
		}
		if(name == InterfaceName.GetEngineeringItemLists) {
			uri = bundle.getString("getEngineeringItemLists.uri");
		}
		if(name == InterfaceName.GetEngineeringItemDetail) {
			uri = bundle.getString("getEngineeringItemDetail.uri");
		}
		if(name == InterfaceName.GetStatisticPersonnelInfo) {
			uri = bundle.getString("getStatisticPersonnelInfo.uri");
		}
		if(name == InterfaceName.GetStatisticUserOnlineByDeptId) {
			uri = bundle.getString("getStatisticUserOnlineByDeptId.uri");
		}
		if(name == InterfaceName.GetStatisticDevice) {
			uri = bundle.getString("getStatisticDevice.uri");
		}
		if(name == InterfaceName.GetOutputValueProgress) {
			uri = bundle.getString("getOutputValueProgress.uri");
		}
		if(name == InterfaceName.ListOutputValueProgress) {
			uri = bundle.getString("listOutputValueProgress.uri");
		}
		if(name == InterfaceName.GetProPoint) {
			uri = bundle.getString("getProPoint.uri");
		}
		if(name == InterfaceName.GetChildCompany) {
			uri = bundle.getString("getChildCompany.uri");
		}
		if(name == InterfaceName.GetFeatureValue) {
			uri = bundle.getString("getFeatureValue.uri");
		}
		if(name == InterfaceName.EnterSiteFeatureCompare) {
			uri = bundle.getString("enterSiteFeatureCompare.uri");
		}
		if(name == InterfaceName.GetPsnTabWhistleTable) {
			uri = bundle.getString("getPsnTabWhistleTable.uri");
		}
		if(name == InterfaceName.GetGeneralSingleList) {
			uri = bundle.getString("getGeneralSingleList.uri");
		}
		if(name == InterfaceName.GetSingleOrder) {
			uri = bundle.getString("getSingleOrder.uri");
		}
		if(name == InterfaceName.GetSplitAccording) {
			uri = bundle.getString("getSplitAccording.uri");
		}
		if(name == InterfaceName.AddSplitAccording) {
			uri = bundle.getString("addSplitAccording.uri");
		}
		if(name == InterfaceName.DelSplitOrder) {
			uri = bundle.getString("delSplitOrder.uri");
		}
		if(name == InterfaceName.GetEngineeringPoi) {
			uri = bundle.getString("getEngineeringPoi.uri");
		}
		if(name == InterfaceName.GetWorkAreaList) {
			uri = bundle.getString("getWorkAreaList.uri");
		}
		
		testUrl = address + uri;
		return testUrl;
	}
}

