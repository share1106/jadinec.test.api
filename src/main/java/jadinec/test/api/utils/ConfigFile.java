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
		testUrl = address + uri;
		return testUrl;
	}
}

