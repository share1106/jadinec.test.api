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
	public static String addUserToGroupUrl;
	public static String getSigUrl;
	
	public static DefaultHttpClient defaultHttpClient;
	public static CookieStore cookieStore;
}
