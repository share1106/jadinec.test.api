package jadinec.test.api.config;

import org.testng.TestNG;

import jadinec.test.api.cases.GetAppUpdateTest;
import jadinec.test.api.cases.GetEngineeringItemPlaneTest;
import jadinec.test.api.cases.GetEngineeringPlaneTest;
import jadinec.test.api.cases.GetTokenTest;
import jadinec.test.api.cases.GetUserTest;
import jadinec.test.api.cases.VerificationCodeLoginTest;

public class Entry {

	public static void main(String[] args) {
		TestNG testNG = new TestNG();
		Class[] classes = { GetTokenTest.class,VerificationCodeLoginTest.class,
				GetAppUpdateTest.class,GetEngineeringItemPlaneTest.class,
				GetEngineeringPlaneTest.class,GetUserTest.class};
		testNG.setTestClasses(classes);
		testNG.run();

	}

}
