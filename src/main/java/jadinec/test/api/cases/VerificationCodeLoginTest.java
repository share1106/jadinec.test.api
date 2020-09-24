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
		TestConfig.getORGUserDetailUrl = ConfigFile.getUrl(InterfaceName.GetORGUserDetail);
		TestConfig.getTaskItemsUrl = ConfigFile.getUrl(InterfaceName.GetTaskItem);
		TestConfig.okForCloseStepUrl = ConfigFile.getUrl(InterfaceName.SubmitTask);
		TestConfig.reworkForStepUrl = ConfigFile.getUrl(InterfaceName.Submit_Rework);
		TestConfig.getEngineeringItemHorizontalUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringItemHorizontal);
		TestConfig.getEngineeringSubItemUrl = ConfigFile.getUrl(InterfaceName.GetSubEngineeringList);
		TestConfig.changeTaskReadUrl = ConfigFile.getUrl(InterfaceName.UpdateTaskReadStatus);
		TestConfig.sendSmsVerificationCodeUpdatePwdUrl = ConfigFile.getUrl(InterfaceName.SendVerifyCodeToPhoneUpdatePassword);
		TestConfig.updatePwdApiUrl = ConfigFile.getUrl(InterfaceName.UpdatePassword);
		TestConfig.saveOpinionUrl = ConfigFile.getUrl(InterfaceName.CommitFeedback);
		TestConfig.sendSmsUpdatePhoneNumVerificationCodeUrl = ConfigFile.getUrl(InterfaceName.SendVerifyCodeToPhoneSwitchPhone);
		TestConfig.updateImgUrl = ConfigFile.getUrl(InterfaceName.UpdateImage);
		TestConfig.getTaskItemsUrl = ConfigFile.getUrl(InterfaceName.GetTaskFormList);
		TestConfig.processItemsUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringStepItem);
		TestConfig.refreshTokenUrl = ConfigFile.getUrl(InterfaceName.RefreshAccessToken);
		TestConfig.toggleRoleUrl = ConfigFile.getUrl(InterfaceName.UpdateUserRole);
		TestConfig.stepForDetailsUrl = ConfigFile.getUrl(InterfaceName.GetTaskDetail);
		TestConfig.getMechanicalListUrl = ConfigFile.getUrl(InterfaceName.GetAllDevice);
		TestConfig.obtainBindingStateUrl = ConfigFile.getUrl(InterfaceName.GetLastBindDevice);
		TestConfig.bindMechanicalUrl = ConfigFile.getUrl(InterfaceName.UpdateDeviceBindStatus);
		TestConfig.toggleMechanicalUrl = ConfigFile.getUrl(InterfaceName.UpdateDeviceWorkStatus);
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
		TestConfig.applyFormSortForAllUrl = ConfigFile.getUrl(InterfaceName.ModiPouringSequenceAll);
		TestConfig.applyFormSortForOneUrl = ConfigFile.getUrl(InterfaceName.ModiPouringSequence);
		TestConfig.confirmApplyFormUrl = ConfigFile.getUrl(InterfaceName.ModiPouringStatus);
		TestConfig.changeWorkBeginTimeUrl = ConfigFile.getUrl(InterfaceName.ModiPouringBeginTime);
		TestConfig.getMixingStationUrl = ConfigFile.getUrl(InterfaceName.GetAllMixStation);
		TestConfig.savePouringUrl = ConfigFile.getUrl(InterfaceName.PostPouringPlanAmount);
		TestConfig.getPouringDetailUrl = ConfigFile.getUrl(InterfaceName.GetPouringDetail);
		TestConfig.isBindingUrl = ConfigFile.getUrl(InterfaceName.GetBindLineState);
		TestConfig.getBaseInfoUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleGetBaseInfo);
		TestConfig.getMaterialListUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleGetMaterialList);
		TestConfig.getSlagHoleTaskDetailUrl = ConfigFile.getUrl(InterfaceName.GetSlagHoleTaskDetail);
		TestConfig.getSlagHoleTaskDetailByStepIdUrl = ConfigFile.getUrl(InterfaceName.GetSlagHoleTaskDetailByStepId);
		TestConfig.getOtherMechanicalTypeCodeUrl = ConfigFile.getUrl(InterfaceName.GetOtherMechanicalTypeCode);
		TestConfig.getMixingStationProdLineUrl = ConfigFile.getUrl(InterfaceName.GetProductAllLine);
		TestConfig.bindingMixingStationProdLineUrl = ConfigFile.getUrl(InterfaceName.PostBindProductLine);
		TestConfig.startProdLineUrl = ConfigFile.getUrl(InterfaceName.PostStartProductLine);
		TestConfig.getPouringArrangeListUrl = ConfigFile.getUrl(InterfaceName.PostPouringListNew);
		TestConfig.taskStepTableUrl = ConfigFile.getUrl(InterfaceName.GetTableList);
		TestConfig.obtainTransportFormUrl = ConfigFile.getUrl(InterfaceName.GetTransportList);
		TestConfig.getFreeCarUrl = ConfigFile.getUrl(InterfaceName.GetFreeTransportCarList);
		TestConfig.getBussinesTableUrl = ConfigFile.getUrl(InterfaceName.GetTaskTable);
		TestConfig.getProdTaskUrl = ConfigFile.getUrl(InterfaceName.PostGetOptTask);
		TestConfig.getConstructionLogPageUrl = ConfigFile.getUrl(InterfaceName.GetConstructionLogPage);
		TestConfig.getSpecifiedUserStatisticInfoUrl = ConfigFile.getUrl(InterfaceName.GetSpecifiedUserStatisticInfo);
		TestConfig.getDictionaryByGroupUrl = ConfigFile.getUrl(InterfaceName.GetDictionaryByGroup);
		TestConfig.updatePhoneNumUrl = ConfigFile.getUrl(InterfaceName.SwitchPhone);
		TestConfig.getApplyFormItemUrl = ConfigFile.getUrl(InterfaceName.GetPouringlist);
		TestConfig.prodTransCollectUrl = ConfigFile.getUrl(InterfaceName.GetPouringInfo);
		TestConfig.delProdTransFormUrl = ConfigFile.getUrl(InterfaceName.DelTmpTransportOrder);
		TestConfig.addProdTransFormUrl = ConfigFile.getUrl(InterfaceName.AddTmpTransportOrder);
		TestConfig.editProdTransFormUrl = ConfigFile.getUrl(InterfaceName.UpdateTransportOrderInfo);
		TestConfig.getTransTaskUrl = ConfigFile.getUrl(InterfaceName.GetTransportTaskList);
		TestConfig.getPlansUrl = ConfigFile.getUrl(InterfaceName.GetNotArrangedMonthPlanNew);
		TestConfig.dealWithNoticeUrl = ConfigFile.getUrl(InterfaceName.UpdateConfirmMessageStatus);
		TestConfig.getAllotDetailsUrl = ConfigFile.getUrl(InterfaceName.GetAllocDetailNew);
		TestConfig.getMapTextMarkUrl = ConfigFile.getUrl(InterfaceName.GetProBuildTextInfo);
		TestConfig.getEngineeringDesignDetailsUrl = ConfigFile.getUrl(InterfaceName.GetProBuildTextInfo);
		TestConfig.getMechanicalTraceUrl = ConfigFile.getUrl(InterfaceName.GetCarExtendInfo);
		TestConfig.getConcreteApplyListUrl = ConfigFile.getUrl(InterfaceName.GetPouringlistNew);
		TestConfig.getUserInfoDetailEveryDayWorkUserInfoUrl = ConfigFile.getUrl(InterfaceName.GetUserInfoDetailEveryDayWorkUserInfo);
		TestConfig.getUserInfoDetailAllUrl = ConfigFile.getUrl(InterfaceName.GetUserInfoDetailAll);
		TestConfig.getUserInfoDetailUrl = ConfigFile.getUrl(InterfaceName.GetUserInfoDetail);
		TestConfig.listMaterialDetailUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringRebarDetailNew);
		TestConfig.getEngineeringRebarDetailUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringRebarDetail);
		TestConfig.getProductByWorkareaUrl = ConfigFile.getUrl(InterfaceName.GetProductByWorkarea);
		TestConfig.getEquipmentArchivesUrl = ConfigFile.getUrl(InterfaceName.GetEquipmentArchives);
		TestConfig.getEquipmentDetailsUrl = ConfigFile.getUrl(InterfaceName.GetEquipmentDetails);
		TestConfig.getEquipmentInfoDetailsUrl = ConfigFile.getUrl(InterfaceName.GetEquipmentInfoDetails);
		TestConfig.pendingUrl = ConfigFile.getUrl(InterfaceName.GetManagementRedRoundList);
		TestConfig.getFacilitiesNameUrl = ConfigFile.getUrl(InterfaceName.GetSearchList);
		TestConfig.getTransDriverPointUrl = ConfigFile.getUrl(InterfaceName.GetTransportHistory);
		TestConfig.getTransDetailsUrl = ConfigFile.getUrl(InterfaceName.GetTransportTaskDetail);
		TestConfig.concretePouringInformUrl = ConfigFile.getUrl(InterfaceName.GetPouringTaskDetail);
		TestConfig.getConstRatioStepDetailUrl = ConfigFile.getUrl(InterfaceName.GetPouringRateSubmitDetailByStepId);
		TestConfig.getConstRateDetailsUrl = ConfigFile.getUrl(InterfaceName.GetPouringRateSubmitDetail);
		TestConfig.driverConfirmUrl = ConfigFile.getUrl(InterfaceName.DealTransportOrderStatus);
		TestConfig.getConstRateTaskUrl = ConfigFile.getUrl(InterfaceName.GetPouringRate);
		TestConfig.sendPouringTokenUrl = ConfigFile.getUrl(InterfaceName.AddPouringOrder);
		TestConfig.getProcessBarUrl = ConfigFile.getUrl(InterfaceName.GetDailyPlanProcessList);
		TestConfig.getOptPersionListUrl = ConfigFile.getUrl(InterfaceName.GetOptPersionList);
		TestConfig.getWorkMonthPlanItemInfoUrl = ConfigFile.getUrl(InterfaceName.GetWorkMonthPlanItemInfo);
		TestConfig.getEngineeringCodeListUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringCodeList);
		TestConfig.getItemStateListUrl = ConfigFile.getUrl(InterfaceName.GetItemStateList);
		TestConfig.getWorkMonthPlanItemInfoUrl = ConfigFile.getUrl(InterfaceName.GetWorkMonthPlanItemInfo);
		TestConfig.getWorkMonthPlanItemPageListUrl = ConfigFile.getUrl(InterfaceName.GetWorkMonthPlanItemPageList);
		TestConfig.queryEngineeringTypeToCodeListUrl = ConfigFile.getUrl(InterfaceName.QueryEngineeringTypeToCodeList);
		TestConfig.getWorkMonthPlanPageListUrl = ConfigFile.getUrl(InterfaceName.GetWorkMonthPlanPageList);
		TestConfig.addMonthPlanItemUrl = ConfigFile.getUrl(InterfaceName.AddMonthPlanItem);
		TestConfig.updateOrChangeMonthPlanItemUrl = ConfigFile.getUrl(InterfaceName.UpdateOrChangeMonthPlanItem);
		TestConfig.getMonthPlanRatioMonthUrl = ConfigFile.getUrl(InterfaceName.GetMonthPlanRatioMonth);
		TestConfig.getMonthPlanItemViewUrl = ConfigFile.getUrl(InterfaceName.GetMonthPlanItemView);
		TestConfig.getMonthPlanViewListUrl = ConfigFile.getUrl(InterfaceName.GetMonthPlanViewList);
		TestConfig.reviewTemporaryMoneyUrl = ConfigFile.getUrl(InterfaceName.ReviewTemporaryMoney);
		TestConfig.launchTemporaryMoneyUrl = ConfigFile.getUrl(InterfaceName.LaunchTemporaryMoney);
		TestConfig.getTemporaryMoneyByProcessOddUrl = ConfigFile.getUrl(InterfaceName.GetTemporaryMoneyByProcessOdd);
		TestConfig.getTemporaryTypeListUrl = ConfigFile.getUrl(InterfaceName.GetTemporaryTypeList);
		TestConfig.getEngineeringItemListUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringItemList);
		TestConfig.getTemporaryMoneyListUrl = ConfigFile.getUrl(InterfaceName.GetTemporaryMoneyList);
		TestConfig.getLedgerListUrl = ConfigFile.getUrl(InterfaceName.GetLedgerList);
		TestConfig.getListUrl = ConfigFile.getUrl(InterfaceName.TunnelWorkTimePlanGetList);
		TestConfig.getEngineeringCategoryListUrl = ConfigFile.getUrl(InterfaceName.TunnelGetEngineeringCategoryList);
		TestConfig.getEngineeringTypeListUrl = ConfigFile.getUrl(InterfaceName.TunnelGetEngineeringCategoryTypeList);
		TestConfig.getProcessStepListUrl = ConfigFile.getUrl(InterfaceName.TunnelGetProcessStepList);
		TestConfig.addOrUpdateUrl = ConfigFile.getUrl(InterfaceName.TunnelAddOrUpdate);
		TestConfig.getDetailUrl = ConfigFile.getUrl(InterfaceName.TunnelGetDetail);
		TestConfig.deleteUrl = ConfigFile.getUrl(InterfaceName.TunnelDelete);
		TestConfig.getBasicInfoUrl = ConfigFile.getUrl(InterfaceName.TunnelWallRockGetBasicInfo);
		TestConfig.listEngineeringListsUrl = ConfigFile.getUrl(InterfaceName.TunnelWallRockListEngineeringLists);
		TestConfig.listWallRocksUrl = ConfigFile.getUrl(InterfaceName.TunnelWallRockList);
		TestConfig.listLiningTypesUrl = ConfigFile.getUrl(InterfaceName.TunnelWallRockListLiningTypes);
		TestConfig.listMaterialInfoUrl = ConfigFile.getUrl(InterfaceName.TunnelWallRockListMaterialInfo);
		TestConfig.addOrUpdateWallRockLevelChangeUrl = ConfigFile.getUrl(InterfaceName.TunnelWallRockAddOrUpdateWallRockLevelChange);
		TestConfig.queryWallRoackInfoByProcessOddUrl = ConfigFile.getUrl(InterfaceName.TunnelWallRockQueryWallRockInfoByProcessOdd);
		TestConfig.reviewWallRockLevelUrl = ConfigFile.getUrl(InterfaceName.TunnelReviewWallRockLevel);
		TestConfig.cancelMaterialProcessUrl = ConfigFile.getUrl(InterfaceName.TunnelWallRockcancelMaterialProcess);
		TestConfig.getEffectRecordListUrl = ConfigFile.getUrl(InterfaceName.TunnelEffectGetEffectRecordList);
		TestConfig.getTechnicianListUrl = ConfigFile.getUrl(InterfaceName.TunnelEffectGetTechnicianList);
		TestConfig.cancelEffectRecordProcessUrl = ConfigFile.getUrl(InterfaceName.TunnelCancelEffectTechnicianList);
		TestConfig.getAddPageInitDataUrl = ConfigFile.getUrl(InterfaceName.TunnelCancelEffectAddPageInitData);
		TestConfig.getProcessDetailUrl = ConfigFile.getUrl(InterfaceName.TunnelEffectGetProcessDetail);
		TestConfig.getEffectRecordDetailUrl = ConfigFile.getUrl(InterfaceName.TunnelEffectGetEffectRecordDetail);
		TestConfig.reviewEffectRecordUrl = ConfigFile.getUrl(InterfaceName.TunnelEffectCheck);
		TestConfig.exportDataToPathUrl = ConfigFile.getUrl(InterfaceName.TunnelEffectExportDataToPath);
		TestConfig.listProjectSeperateUrl = ConfigFile.getUrl(InterfaceName.StatisticListProjectSeperate);
		TestConfig.getProjectLocationSummaryInfoUrl = ConfigFile.getUrl(InterfaceName.StatisticGetProjectLocationSummaryInfo);
		TestConfig.getSubcontractorSeperateListUrl = ConfigFile.getUrl(InterfaceName.StatisticGetSubcontractorSeperateList);
		TestConfig.getSubcontractorLocationSummaryUrl = ConfigFile.getUrl(InterfaceName.StatisticGetSubcontractorLocationSummary);
		TestConfig.getEngineeringMaterialSummaryUrl = ConfigFile.getUrl(InterfaceName.StatisticGetEngineeringMaterialSummary);
		TestConfig.getMaterialConsumeDetailUrl = ConfigFile.getUrl(InterfaceName.StatisticGetMaterialConsumeDetail);
		TestConfig.getEngineeringMaterialDetailUrl = ConfigFile.getUrl(InterfaceName.StatisticGetEngineeringMaterialDetail);
		TestConfig.getSlagHoleBaseInfoUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleGetBaseInfo);
		TestConfig.getSlagHoleMaterialListUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleGetMaterialList);
		TestConfig.getDispatchVehicleListUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleGetDispatchVehicleList);
		TestConfig.saveDispatchUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleSaveDispatch);
		TestConfig.getDispatchListUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleGetDispatchList);
		TestConfig.getDispatchDetailUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleGetDispatchDetail);
		TestConfig.getReceivingVehicleListUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleGetReceivingVehicleList);
		TestConfig.getReceivingListUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleGetReceivingList);
		TestConfig.getReceivingDetailUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleGetReceivingDetail);
		TestConfig.getWeighingOrderDetailUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleGetWeighingOrderDetail);
		TestConfig.previewUrl = ConfigFile.getUrl(InterfaceName.TunnelWallRockpreview);
		TestConfig.updateWeighingListUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleUpdateWeighingList);
		TestConfig.saveReceivingUrl = ConfigFile.getUrl(InterfaceName.TunnelSlagHoleSaveReceiving);
		TestConfig.getEarthworkTaskUrl = ConfigFile.getUrl(InterfaceName.GetEarthworkTask);
		TestConfig.getOnlineMarkListUrl = ConfigFile.getUrl(InterfaceName.GetOnlineMarkList);
		TestConfig.getMarkDetailForSlideUrl = ConfigFile.getUrl(InterfaceName.GetMarkDetailForSlide);
		TestConfig.getDeviceByDeviceTypeUrl = ConfigFile.getUrl(InterfaceName.GetDeviceByDeviceType);
		TestConfig.getEarthworkBorrowAreaUrl = ConfigFile.getUrl(InterfaceName.GetEarthworkBorrowArea);
		TestConfig.insertEarthworkTaskToOwnerUrl = ConfigFile.getUrl(InterfaceName.InsertEarthworkTaskToOwner);
		TestConfig.updateEarthworkOwnerByIdUrl = ConfigFile.getUrl(InterfaceName.UpdateEarthworkOwnerById);
		TestConfig.getTodayStatisticUrl = ConfigFile.getUrl(InterfaceName.GetTodayStatistic);
		TestConfig.saveDeviceWorkingInfoUrl = ConfigFile.getUrl(InterfaceName.SaveDeviceWorkingInfo);
		TestConfig.getTemporaryTaskTypeUrl = ConfigFile.getUrl(InterfaceName.GetTemporaryTaskType);
		TestConfig.insertTemporaryTaskUrl = ConfigFile.getUrl(InterfaceName.InsertTemporaryTask);
		TestConfig.getConstTaskListUrl = ConfigFile.getUrl(InterfaceName.GetSPTaskList);
		TestConfig.getSplitTaskUrl = ConfigFile.getUrl(InterfaceName.GetSplitEngineering);
		TestConfig.checkPlanExecStateUrl = ConfigFile.getUrl(InterfaceName.CheckPlanExecState);
		TestConfig.getEngineeringItemDesignDataUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringItemDesignData);
		TestConfig.getEngineeringItemDesignLengthUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringItemDesignLength);
		TestConfig.addTunnelConstTaskUrl = ConfigFile.getUrl(InterfaceName.AddTunnelConstTask);
		TestConfig.editSplitTaskUrl = ConfigFile.getUrl(InterfaceName.EditSplitTask);
		TestConfig.delSplitTaskUrl = ConfigFile.getUrl(InterfaceName.DelSplitTask);
		TestConfig.getSplitDetailUrl = ConfigFile.getUrl(InterfaceName.GetSplitDetail);
		TestConfig.getTaskAndOrderListUrl = ConfigFile.getUrl(InterfaceName.GetTaskAndOrderList);
		TestConfig.arrivedExcavateAreaUrl = ConfigFile.getUrl(InterfaceName.ArrivedExcavateArea);
		TestConfig.enterWjjUrl = ConfigFile.getUrl(InterfaceName.EnterWjj);
		TestConfig.saveFillOrderUrl = ConfigFile.getUrl(InterfaceName.SaveFillOrder);
		TestConfig.doneFillOrderUrl = ConfigFile.getUrl(InterfaceName.DoneFillOrder);
		TestConfig.getTodayWorkOrderUrl = ConfigFile.getUrl(InterfaceName.GetTodayWorkOrder);
		TestConfig.getStatisticWorkOrderUrl = ConfigFile.getUrl(InterfaceName.GetStatisticWorkOrder);
		TestConfig.getStatisticMonthWorkOrderUrl = ConfigFile.getUrl(InterfaceName.GetStatisticMonthWorkOrder);
		TestConfig.getFillOrderDetailUrl = ConfigFile.getUrl(InterfaceName.GetFillOrderDetail);
		TestConfig.getStatisticMonthLineWorkOrderUrl = ConfigFile.getUrl(InterfaceName.GetStatisticMonthLineWorkOrder);
		TestConfig.getFillTaskDetailUrl = ConfigFile.getUrl(InterfaceName.GetFillTaskDetail);
		TestConfig.getSplitEngineeringUrl = ConfigFile.getUrl(InterfaceName.GetSplitEngineering);
		TestConfig.getPlanCategoryCodeUrl = ConfigFile.getUrl(InterfaceName.GetPlanCategoryCode);
		TestConfig.getPlanSearchTypeCodeUrl = ConfigFile.getUrl(InterfaceName.GetPlanSearchTypeCode);
		TestConfig.getSearchElementUrl = ConfigFile.getUrl(InterfaceName.GetSearchElement);
		TestConfig.getEngineeringCategoryUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringCategory);
		TestConfig.getEngineeringLevelUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringLevel);
		TestConfig.getWorkAreaCodeUrl = ConfigFile.getUrl(InterfaceName.GetWorkAreaCode);
		TestConfig.getEngineeringTypeProcessUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringTypeProcess);
		TestConfig.getEngineeringTypeUrl = ConfigFile.getUrl(InterfaceName.GetEngineeringType);
		TestConfig.followUpUrl = ConfigFile.getUrl(InterfaceName.FollowUp);
		TestConfig.scheduleUrl = ConfigFile.getUrl(InterfaceName.Schedule);
		
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
		System.out.println(refreshToken);
		//验证结果
		Assert.assertEquals("true", data);
		
	}

	private JSONArray getJsonResult() throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(TestConfig.verificationCodeLoginUrl);
		System.out.println(TestConfig.verificationCodeLoginUrl);
		JSONObject param1 = new JSONObject();
		JSONObject param2 = new JSONObject();
				
		param2.put("permsSystem", "1728");
		param2.put("phoneNum", "17700000000");
		param2.put("phoneCode", "1722");
		param2.put("deviceId", "35861430-6531-A809-FFFF-FFFFEB4C6F18");
						
		param1.put("client", "android");
		param1.put("content", param2);
		param1.put("version", "1.0");

		post.setHeader("Content-Type", ConfigFile.Content_Type);
		//post.setHeader("access_token", "");
		post.setHeader("client",ConfigFile.client);
		
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
