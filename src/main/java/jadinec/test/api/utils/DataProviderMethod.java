package jadinec.test.api.utils;

import org.testng.annotations.DataProvider;

public class DataProviderMethod {

	//无指定数据名称,默认使用方法名
	@DataProvider
	public static Object[][] noNameMethod(){
		return new Object[][] {
			
			{"test1","5"},
			{"test2","6"},
			{"test3","7"}
		};
	}
	
	//无指定数据名称,默认使用方法名
		@DataProvider(name="dataProvider1")
		public static Object[][] dataProvider1(){
			return new Object[][] {
				
				{"test1"},
				{"test2"},
				{"test3"}
			};
		}
}
