package hemsecri.api.automation.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hemsecri.api.automation.helpers.SecurityInformationHelper;
import io.restassured.RestAssured;

public class testGETSecurityInformation {

	
private SecurityInformationHelper securityInformationHelper;
	
	@BeforeClass
	public void init() {
		System.out.println("in init");
		RestAssured.baseURI="http://40.75.76.166/hemaecriapi";
		//securityInformationHelper = new SecurityInformationHelper();
		
	}
	
	@Test
	public void testgetSecurityInformation() {
		securityInformationHelper.getSecurityInformation();
		
	}
}
