package jadinec.test.api.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

public class TestConfig {

	public static String getTokenUrl;
	public static String verificationCodeLoginUrl;
	public static String getAppUpdateUrl;
	public static String getEngineeringPlaneUrl;
	public static String getUserUrl;
	public static String getEngineeringItemPlaneUrl;
	public static String getORGUserDetailUrl;
	public static String getTaskItemsUrl;
	public static String okForCloseStepUrl;
	public static String reworkForStepUrl;
	public static String getEngineeringItemHorizontalUrl;
	public static String getEngineeringSubItemUrl;
	public static String changeTaskReadUrl;
	public static String sendSmsVerificationCodeUpdatePwdUrl;
	public static String updatePwdApiUrl;
	public static String saveOpinionUrl;
	public static String sendSmsUpdatePhoneNumVerificationCodeUrl;
	public static String updateImgUrl;
	public static String getFormItemsUrl;
	public static String getBussinesTableUrl;
	public static String processItemsUrl;
	public static String refreshTokenUrl;
	public static String toggleRoleUrl;
	public static String stepForDetailsUrl;
	public static String getMechanicalListUrl;
	public static String obtainBindingStateUrl;
	public static String bindMechanicalUrl;
	public static String toggleMechanicalUrl;
	public static String obtainStepIdUrl;
	public static String obtainMenusForRoleUrl;
	public static String obtainStepItemUrl;
	public static String getTeamListUrl;
	public static String getTeamLeaderUrl;
	public static String getTeamMemberUrl;
	public static String saveTeamUrl;
	public static String editTeamUrl;
	public static String delTeamUrl;
	public static String getPoiListUrl;
	public static String getAllotProcessBarUrl;
	public static String getPlanManageTaskUrl;
	public static String applyFormSortForAllUrl;
	public static String applyFormSortForOneUrl;
	public static String confirmApplyFormUrl;
	public static String changeWorkBeginTimeUrl;
	public static String getMixingStationUrl;
	public static String savePouringUrl;
	public static String getPouringDetailUrl;
	public static String isBindingUrl;
	public static String getBaseInfoUrl;
	public static String getMaterialListUrl;
	public static String getSlagHoleTaskDetailUrl;
	public static String getSlagHoleTaskDetailByStepIdUrl;
	public static String getOtherMechanicalTypeCodeUrl;
	public static String getMixingStationProdLineUrl;
	public static String bindingMixingStationProdLineUrl;
	public static String startProdLineUrl;
	public static String getPouringArrangeListUrl;
	public static String taskStepTableUrl;
	public static String obtainTransportFormUrl;
	public static String getFreeCarUrl;
	public static String getProdTaskUrl;
	public static String getConstructionLogPageUrl;
	public static String getSpecifiedUserStatisticInfoUrl;
	public static String getDictionaryByGroupUrl;
	public static String updatePhoneNumUrl;
	public static String getApplyFormItemUrl;
	public static String prodTransCollectUrl;
	public static String delProdTransFormUrl;
	public static String addProdTransFormUrl;
	public static String editProdTransFormUrl;
	public static String getTransTaskUrl;
	public static String getPlansUrl;
	public static String dealWithNoticeUrl;
	public static String getAllotDetailsUrl;
	public static String getMapTextMarkUrl;
	public static String getEngineeringDesignDetailsUrl;
	public static String getMechanicalTraceUrl;
	public static String getConcreteApplyListUrl;
	public static String getUserInfoDetailEveryDayWorkUserInfoUrl;
	public static String getUserInfoDetailAllUrl;
	public static String getUserInfoDetailUrl;
	public static String listMaterialDetailUrl;
	public static String getEngineeringRebarDetailUrl;
	public static String getProductByWorkareaUrl;
	public static String getEquipmentArchivesUrl;
	public static String getEquipmentDetailsUrl;
	public static String getEquipmentInfoDetailsUrl;
	public static String pendingUrl;
	public static String getFacilitiesNameUrl;
	public static String getTransDriverPointUrl;
	public static String getTransDetailsUrl;
	public static String concretePouringInformUrl;
	public static String getConstRatioStepDetailUrl;
	public static String getConstRateDetailsUrl;
	public static String driverConfirmUrl;
	public static String getConstRateTaskUrl;
	public static String sendPouringTokenUrl;
	public static String getProcessBarUrl;
	public static String getOptPersionListUrl;
	public static String getWorkMonthPlanItemInfoUrl;
	public static String getEngineeringCodeListUrl;
	public static String getItemStateListUrl;
	public static String getWorkMonthPlanItemPageListUrl;
	public static String queryEngineeringTypeToCodeListUrl;
	public static String getWorkMonthPlanPageListUrl;
	public static String addMonthPlanItemUrl;
	public static String updateOrChangeMonthPlanItemUrl;
	public static String getMonthPlanRatioMonthUrl;
	public static String getMonthPlanItemViewUrl;
	public static String getMonthPlanViewListUrl;
	public static String reviewTemporaryMoneyUrl;
	public static String launchTemporaryMoneyUrl;
	public static String getTemporaryMoneyByProcessOddUrl;
	public static String getTemporaryTypeListUrl;
	public static String getEngineeringItemListUrl;
	public static String getTemporaryMoneyListUrl;
	public static String getLedgerListUrl;
	public static String getListUrl;
	public static String getProcessStepListUrl;
	public static String addOrUpdateUrl;
	public static String getDetailUrl;
	public static String deleteUrl;
	public static String getBasicInfoUrl;
	public static String listEngineeringListsUrl;
	public static String listWallRocksUrl;
	public static String listLiningTypesUrl;
	public static String listMaterialInfoUrl;
	public static String addOrUpdateWallRockLevelChangeUrl;
	public static String queryWallRoackInfoByProcessOddUrl;
	public static String reviewWallRockLevelUrl;
	public static String cancelMaterialProcessUrl;
	public static String getEffectRecordListUrl;
	public static String getTechnicianListUrl;
	public static String cancelEffectRecordProcessUrl;
	public static String getAddPageInitDataUrl;
	public static String getProcessDetailUrl;
	public static String getEffectRecordDetailUrl;
	public static String reviewEffectRecordUrl;
	public static String exportDataToPathUrl;
	public static String listProjectSeperateUrl;
	public static String getProjectLocationSummaryInfoUrl;
	public static String getSubcontractorSeperateListUrl;
	public static String getSubcontractorLocationSummaryUrl;
	public static String getEngineeringMaterialSummaryUrl;
	public static String getMaterialConsumeDetailUrl;
	public static String getEngineeringMaterialDetailUrl;
	public static String getSlagHoleBaseInfoUrl;
	public static String getSlagHoleMaterialListUrl;
	public static String getDispatchVehicleListUrl;
	public static String saveDispatchUrl;
	public static String getDispatchListUrl;
	public static String getDispatchDetailUrl;
	public static String getReceivingVehicleListUrl;
	public static String getReceivingListUrl;
	public static String getReceivingDetailUrl;
	public static String getWeighingOrderDetailUrl;
	public static String previewUrl;
	public static String updateWeighingListUrl;
	public static String saveReceivingUrl;
	public static String getEarthworkTaskUrl;
	public static String getOnlineMarkListUrl;
	public static String getMarkDetailForSlideUrl;
	public static String getDeviceByDeviceTypeUrl;
	public static String getEarthworkBorrowAreaUrl;
	public static String insertEarthworkTaskToOwnerUrl;
	public static String updateEarthworkOwnerByIdUrl;
	public static String getTodayStatisticUrl;
	public static String saveDeviceWorkingInfoUrl;
	public static String getTemporaryTaskTypeUrl;
	public static String insertTemporaryTaskUrl;
	public static String getConstTaskListUrl;
	public static String getSplitTaskUrl;
	public static String checkPlanExecStateUrl;
	public static String getEngineeringItemDesignDataUrl;
	public static String getEngineeringItemDesignLengthUrl;
	public static String addTunnelConstTaskUrl;
	public static String editSplitTaskUrl;
	public static String delSplitTaskUrl;
	public static String getSplitDetailUrl;
	public static String getTaskAndOrderListUrl;
	public static String arrivedExcavateAreaUrl;
	public static String enterWjjUrl;
	public static String saveFillOrderUrl;
	public static String doneFillOrderUrl;
	public static String getTodayWorkOrderUrl;
	public static String getStatisticWorkOrderUrl;
	public static String getStatisticMonthWorkOrderUrl;
	public static String getFillOrderDetailUrl;
	public static String getStatisticMonthLineWorkOrderUrl;
	public static String getFillTaskDetailUrl;
	public static String getSplitEngineeringUrl;
	public static String getPlanCategoryCodeUrl;
	public static String getPlanSearchTypeCodeUrl;
	public static String getSearchElementUrl;
	public static String getEngineeringCategoryUrl;
	public static String getEngineeringLevelUrl;
	public static String getWorkAreaCodeUrl;
	public static String getEngineeringTypeProcessUrl;
	public static String getEngineeringTypeUrl;
	public static String followUpUrl;
	public static String scheduleUrl;
	public static String webConcretePouringInformUrl;
	public static String obtainProdNameListUrl;
	public static String getManageSlideUrl;
	public static String getMergeOrderListUrl;
	public static String createMergeSerialUrl;
	public static String getProgressUrl;
	public static String getMergeOrderDetailUrl;
	public static String outputTheSummaryUrl;
	public static String logoutUrl;
	public static String getVisualProUrl;
	public static String toggleProCodeUrl;
	public static String getOrgListUrl;
	public static String addContractUrl;
	public static String getPageListUrl;
	public static String getContractTotalUrl;
	public static String getContractInfoUrl;
	public static String getContViewListUrl;
	public static String getProcessInfoUrl;
	public static String getContEngineeringCountUrl;
	public static String getContTeamgCountUrl;
	public static String getProProcessListUrl;
	public static String getContProcessListUrl;
	public static String getContAddListUrl;
	public static String addAwaitCommitContItemUrl;
	public static String addAllAwaitCommitContItemUrl;
	public static String addAllContItemUrl;
	public static String editContractUrl;
	public static String deleteContItemUrl;
	public static String getContTeamRangeListUrl;
	public static String addContTeamItemUrl;
	public static String deleteContTeamItemUrl;
	public static String deleteContractorContractUrl;
	public static String deleteContItemByConditionUrl;
	public static String addContTeamItemByConditionUrl;
	public static String deleteContTeamItemByConditionUrl;
	public static String obtainTeamListUrl;
	public static String getTaskTypeUrl;
	public static String getTaskAlterItemsUrl;
	public static String getTogetherDeptUserUrl;
	public static String getHandOverRecordUrl;
	public static String getRecordDetailsUrl;
	public static String searchUrl;
	public static String getMergeElementsUrl;
	public static String faceMatchUrl;
	public static String getfaceSimilarScoreUrl;
	public static String getUserInfoByfaceSimilarUrl;
	public static String getConstRatioDetailUrl;
	public static String getProductProportionUrl;
	public static String dataUrl;
	public static String getStatisticsGroupWorkAreaUrl;
	public static String getAllUnitProjectByWorkAreaCodeUrl;
	public static String getEngineeringTypeNumUrl;
	public static String getProductByWorkAreasUrl;
	public static String getProductEngineeringQuantitiesLedgerUrl;
	public static String getContractorProductByDayOrMonthOrHistoryUrl;
	public static String getUnitEngineeringAndDeptUrl;
	public static String getEngineeringItemListsUrl;
	public static String getEngineeringItemDetailUrl;
	public static String getStatisticPersonnelInfoUrl;
	public static String getStatisticUserOnlineByDeptIdUrl;
	public static String getStatisticDeviceUrl;
	public static String getOutputValueProgressUrl;
	public static String listOutputValueProgressUrl;
	public static String getProPointUrl;
	public static String getChildCompanyUrl;
	public static String getFeatureValueUrl;
	public static String enterSiteFeatureCompareUrl;
	public static String getPsnTabWhistleTableUrl;
	public static String getGeneralSingleListUrl;
	public static String getSingleOrderUrl;
	public static String getSplitAccordingUrl;
	public static String addSplitAccordingUrl;
	public static String delSplitOrderUrl;
	public static String getEngineeringPoiUrl;
	public static String getWorkAreaListUrl;
	public static String getSubsidiaryFacilitiesTypeInfoPageListUrl;
	public static String getAllLineShapeUrl;
	public static String getAllGeometryUrl;
	public static String addSubsidiaryFacilitiesTypeInfoUrl;
	public static String getSubsidiaryFacilitiesTypeInfoUrl;
	public static String updateSubsidiaryFacilitiesTypeInfoUrl;
	public static String delSubsidiaryFacilitiesTypeInfoUrl;
	public static String getExportEmailUrl;
	public static String addExportEmailUrl;
	public static String exportSubsidiaryFacilitiesTypeInfoUrl;
	public static String getCrossSectionInfoPageListUrl;
	public static String getCrossSectionInfoUrl;
	public static String addCrossSectionInfoUrl;
	public static String updateCrossSectionInfoUrl;
	public static String delCrossSectionInfoUrl;
	public static String importCrossSectionInfoUrl;
	public static String exportCrossSectionInfoUrl;
	public static String getCrossSectionInfoListUrl;
	public static String getVerticalSectionInfoPageListUrl;
	public static String getVerticalSectionInfoUrl;
	public static String addVerticalSectionInfoUrl;
	public static String updateVerticalSectionInfoUrl;
	public static String delVerticalSectionInfoUrl;
	public static String importVerticalSectionInfoUrl;
	public static String exportVerticalSectionInfoUrl;
	public static String getVerticalSectionInfoListUrl;
	public static String getGeometryInfoPageListUrl;
	public static String getGeometryInfoUrl;
	public static String addGeometryInfoUrl;
	public static String updateGeometryInfoUrl;
	public static String delGeometryInfoUrl;
	public static String importGeometryInfoUrl;
	public static String exportGeometryInfoUrl;
	public static String getGeometryInfoListUrl;
	public static String getIdentificationLineTypeInfoPageListUrl;
	public static String getIdentificationLineTypeInfoUrl;
	public static String addIdentificationLineTypeInfoUrl;
	public static String updateIdentificationLineTypeInfoUrl;
	public static String delIdentificationLineTypeInfoUrl;
	public static String importIdentificationLineTypeInfoUrl;
	public static String exportIdentificationLineTypeInfoUrl;
	public static String getIdentificationLineTypeInfoListUrl;
	public static String importSubsidiaryFacilitiesTypeInfoUrl;
	public static String getSubsidiaryFacilitiesTypeInfoListUrl;
	public static String getNewEngineeringItemVerticalPointUrl;
	public static String getNewEngineeringItemHorizontalInfoUrl;
	public static String getNewEngineeringPlaneUrl;
	public static String getEngineeringCenterPositionListUrl;
	public static String getEngCenterPositionListUrl;
	public static String getNewEngineeringItemHorizontalUrl;
	public static String getFinishStateEngCodeListUrl;
	public static String getBillCodeListUrl;
	public static String addOrUpdateBillCodeUrl;
	public static String delBillCodeByIdsUrl;
	public static String exportBillCodeUrl;
	public static String importBillCodeUrl;
	public static String getSearchBillCodeListUrl;
	public static String getBillCodecheckUrl;
	public static String getUnitPageListUrl;
	public static String addUnitUrl;
	public static String updateUnitUrl;
	public static String delUnitUrl;
	public static String exportUnitUrl;
	public static String importUnitUrl;
	public static String getUnitListUrl;
	public static String getQuantitiesBillPageListUrl;
	public static String getEngineeringLedgerTypeListUrl;
	public static String addEngineeringLedgerTypeUrl;
	public static String updateEngineeringLedgerTypeUrl;
	public static String delEngineeringLedgerTypeUrl;
	public static String exportEngineeringLedgerTypeUrl;
	public static String importEngineeringLedgerTypeUrl;
	public static String getSearchLedgerTypeUrl;
	public static String addQuantitiesBillUrl;
	public static String updateQuantitiesBillUrl;
	public static String delQuantitiesBillUrl;
	public static String getQuantitiesBillListUrl;
	public static String baseExportUrl;
	public static String getLedgerPageListUrl;
	public static String addLedgerUrl;
	public static String updateLedgerUrl;
	public static String delLedgerUrl;
	public static String getLedgerListsUrl;
	public static String getTaskDesignArgsPageListUrl;
	public static String addTaskDesignArgsUrl;
	public static String updateTaskDesignArgsUrl;
	public static String delTaskDesignArgsUrl;
	public static String getEngineeringSectionListUrl;
	public static String addEngineeringSectionUrl;
	public static String updateEngineeringSectionUrl;
	public static String delEngineeringSectionUrl;
	public static String engineeringSectionUrl;
	public static String getProListUrl;
	public static String getImportModuleListUrl;
	public static String getCommonConstantUrl;
	public static String getMaterialCodeJadinecListUrl;
	public static String getMaterialCategoryListUrl;
	public static String addOrUpdateMaterialCategoryUrl;
	public static String delMaterialCategoryUrl;
	public static String getMaterialCategoryPageListUrl;
	public static String getDrawLevelPageListUrl;
	public static String getDrawLevelListUrl;
	public static String addDrawLevelUrl;
	public static String updateDrawLevelUrl;
	public static String delDrawLevelUrl;
	public static String getImportConfigListUrl;
	public static String addImportConfigUrl;
	public static String updateImportConfigUrl;
	public static String delImportConfigUrl;
	public static String importConfigDetailUrl;
	public static String importConfigUrl;
	public static String importTemplateUrl;
	public static String getExcavationMethodListUrl;
	public static String addOrUpdateExcavationMethodUrl;
	public static String delExcavationMethodUrl;
	public static String exportExcavationMethodUrl;
	public static String importExcavationMethodUrl;
	public static String getBillCodeProcessCodeListUrl;
	public static String addOrUpdateBillCodeToProcessCodeUrl;
	public static String delBillCodeProcessCodeUrl;
	public static String exportBillCodeProcessCodeUrl;
	public static String importBillCodeProcessCodeUrl;
	public static String getFileHistoryListUrl;
	public static String getEngineeringCategoryListUrl;
	public static String updateEngineeringCategoryUrl;
	public static String engineeringCategoryDetailUrl;
	public static String engineeringCategoryUrl;
	public static String getEngineeringLevelListUrl;
	public static String updateEngineeringLevelUrl;
	public static String engineeringLevelDetailUrl;
	public static String getEngineeringTypeListUrl;
	public static String addEngineeringTypeUrl;
	public static String updateEngineeringTypeUrl;
	public static String getLedgerChangeInfoPageListUrl;
	public static String addLedgerChangeInfoUrl;
	public static String updateLedgerChangeInfoUrl;
	public static String delLedgerChangeInfoUrl;
	public static String getLedgerChangeInfoUrl;
	public static String getLedgerChangeDetailPageListUrl;
	public static String getLedgerChangeAmountSumUrl;
	public static String getLedgerPageListsUrl;
	public static String getLedgerChangeListUrl;
	public static String addLedgerChangeUrl;
	public static String updateLedgerChangeUrl;
	public static String delLedgerChangeUrl;
	public static String getBillChangePageListUrl;
	public static String addBillChangeUrl;
	public static String updateBillChangeUrl;
	public static String delBillChangeUrl;
	public static String delEngineeringTypeUrl;
	public static String engineeringTypeUrl;
	public static String engineeringTypeDetailUrl;
	public static String importEngineeringTypeUrl;
	public static String addOrUpdateMaterialCodeUrl;
	public static String delMaterialCodeByIdsUrl;
	public static String getMaterialCodeByIdUrl;
	public static String getMixtureUrl;
	public static String importMaterialCodeUrl;
	public static String exportMaterialCodeUrl;
	public static String addOrUpdateMechanicalTypeUrl;
	public static String delMechanicalByIdUrl;
	public static String importMechanicalUrl;
	public static String exportMechanicalUrl;
	public static String baseImportUrl;
	public static String baseExportsUrl;
	public static String baseGetPageListUrl;
	public static String baseDeleteByIdUrl;
	public static String baseGetByIdUrl;
	public static String addOrUpdateRoadLineUrl;
	public static String findTemplateListUrl;
	public static String getWorkBulletinListUrl;
	public static String getFinishEngineeringListUrl;
	public static String getWorkingEngineeringListUrl;
	public static String exportUrl;
	public static String getReportRegularDetailUrl;
	public static String listUrl;
	public static String tokenUrl;
	public static String getAllOrgNamesUrl;
	public static String addOrgInfoUrl;
	public static String updateOssOrgInfoUrl;
	public static String getOrgInfoByOrgIdUrl;
	public static String delOrgInfoByOrgIdUrl;
	public static String getOrgListByPageUrl;
	public static String updateOssOrgBaseInfoUrl;
	public static String getEntireOrgTreeByOrgIdUrl;
	public static String getAllOrgWithoutDefaultUrl;
	public static String getParentOrgByOrgCategoryUrl;
	public static String getOrgProInfoByProIdUrl;
	public static String addOrgProInfoUrl;
	public static String updateOssOrgProInfoUrl;
	public static String delOrgProInfoByProIdUrl;
	public static String getOrgProListByPageUrl;
	public static String getEntireOrgProTreeByProIdUrl;
	public static String getProsByOrgIdsUrl;
	public static String getSpecifyProOutputValueUrl;
	public static String addOssOrgDeptInfoUrl;
	public static String updateOssDeptInfoUrl;
	public static String getOrgDeptInfoByDeptIdUrl;
	public static String delOrgDeptInfoByDeptIdUrl;
	public static String addOrgDeptInfoUrl;
	public static String updateDeptInfoUrl;
	public static String getEntireOrgDeptTreeByUserIdUrl;
	public static String getOrgDeptsByUserIdUrl;
	public static String getProDeptsByProIdUrl;
	public static String getOrgUsersWithoutWorkerByDeptIdUrl;
	public static String getOrgDeptWithoutProDeptsByOrgIdUrl;
	public static String getEntireProDeptTreeByProIdUrl;
	public static String getProUsersByProDeptIdUrl;
	public static String getDeptTypeByDeptIdUrl;
	public static String addOrgJobInfoUrl;
	public static String updateOrgJobUrl;
	public static String getOrgJobInfoByJobIdUrl;
	public static String delOrgJobInfoByJobIdUrl;
	public static String getOrgJobInfoListByPageUrl;
	public static String getProJobInfoListByPageUrl;
	public static String getOrgJobInfosByOrgDeptIdUrl;
	public static String addOrgRoleInfoUrl;
	public static String getOrgRoleInfoByRoleIdUrl;
	public static String updateOrgRoleInfoUrl;
	public static String delOrgRoleInfoByRoleIdUrl;
	public static String getOrgRoleInfoListByPageUrl;
	public static String getProRoleInfoListByPageUrl;
	public static String updateOrgRole2ResUrl;
	public static String getOrgRolesByOrgIdUrl;
	public static String getProRolesByProIdUrl;
	public static String getOrgResByRoleIdUrl;
	public static String getUserAllInfoByUserIdUrl;
	public static String getUserBaseInfoByUserIdUrl;
	public static String getOrgUserCertificatesByUserIdUrl;
	public static String getOrgUserProExperiencesByUserIdUrl;
	public static String getOrgUserWorkExperiencesByUserIdUrl;
	public static String updateOrgUserBaseInfoUrl;
	public static String getMyOssResListUrl;
	public static String getMyOrgResListUrl;
	public static String getMyProResListUrl;
	public static String getProUserListByPageUrl;
	public static String getOrgUserListByPageUrl;
	public static String delUserInfoUrl;
	public static String disableUserLoginUrl;
	public static String enableUserLoginUrl;
	public static String updateUserLoginPasswordUrl;
	public static String updateCompanyUserInfoUrl;
	public static String updateOssUserInfoUrl;
	public static String getCompanyUserAuthorizationByUserIdUrl;
	public static String getOssUserAuthorizationByUserIdUrl;
	public static String getOrgAdminPageListByOrgIdUrl;
	public static String getProAdminPageListByProIdUrl;
	public static String addAdminUrl;
	public static String updateAdminUrl;
	public static String delAdminUrl;
	public static String updateAdminResUrl;
	public static String sendVerifyCodeUrl;
	public static String updatePwdBySmsUrl;
	public static String updatePhoneBySmsUrl;
	public static String exportOrgUserUrl;
	public static String findProInfoListByUserIdUrl;
	public static String findOrgInfoListByUserIdUrl;
	public static String findOrgInfoByUserIdUrl;
	public static String getAppResListUrl;
	public static String findProUserByProIdUrl;
	public static String findLoginInfoByUserIdUrl;
	public static String findOrgUserByOrgIdUrl;
	public static String getUserOrgAndProListUrl;
	public static String getMyResListBySysIdUrl;
	public static String getOrgResInfoByResIdUrl;
	public static String addResInfoUrl;
	public static String updateOrgResInfoUrl;
	public static String delOrgResInfoByResIdUrl;
	public static String getOrgResInfoListBySysIdUrl;
	public static String getOrgResInfoListByPageUrl;
	public static String getSystemApiUrl;
	public static String enableOrgResUrl;
	public static String getDefaultAdminOrgResUrl;
	public static String findBandsStatMenuUrl;
	public static String findUserMenuUrl;
	public static String findContractorListUrl;
	public static String findContractorDetailsUrl;
	public static String getEnumListUrl;
	public static String getProsByOrgIdUrl;
	public static String getOrgJobDicListByPageUrl;
	public static String addOrgJobDicUrl;
	public static String updateOrgJobDicUrl;
	public static String getOrgJobDicListUrl;
	public static String delOrgJobDicByIdUrl;
	public static String exportProUserUrl;
	public static String addOssUserBaseInfoUrl;
	public static String addCompanyUserInfoUrl;
	public static String listsUrl;
	public static String addsUrl;
	public static String updatesUrl;
	public static String delsUrl;
	public static String getMaterialRecordListUrl;
	
	public static DefaultHttpClient defaultHttpClient;
	public static CookieStore cookieStore;
}
