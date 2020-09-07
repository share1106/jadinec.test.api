package jadinec.test.api.config;

import org.testng.TestNG;

import jadinec.test.api.cases.GetTokenTest;
import jadinec.test.api.cases.VerificationCodeLoginTest;

public class Entry {

	public static void main(String[] args) {
		TestNG testNG = new TestNG();
		Class[] classes = { GetTokenTest.class,VerificationCodeLoginTest.class };
		testNG.setTestClasses(classes);
		testNG.run();

	}

}
