package hemsecri.api.automation;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

public class getSecurityInformation {
	
	static RequestSpecification getCommonRequestSpec() {
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://40.75.76.166/hemaecriapi");
		builder.setBasePath("api/Login/GetSecurityInformation");
		
		RequestSpecification requestSpec = builder.build();
		return requestSpec ;
		
	}
	
	static ResponseSpecification getCommonResponseSpec() {
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		builder.expectStatusCode(200);
		
		ResponseSpecification responseSpec = builder.build();
		return responseSpec;
		
	}

	@BeforeSuite
	void setup() {
		System.out.println("Setup");
	}
	
	@Test (enabled = false)
	void getSecurityInformation() {
		RestAssured.baseURI = "http://40.75.76.166/hemaecriapi";
		RestAssured.basePath = "api/Login/GetSecurityInformation";
		given().when().get().then().log().all().statusCode(200);
		
	}
	
	@Test(enabled = false)
	void getSecurityInformation1() {
		String url = "http://40.75.76.166/hemaecriapi/api/Login/GetSecurityInformation";
		Response response = RestAssured.given().get(url).andReturn();
		response.getBody().prettyPrint();
		assertTrue(response.getStatusCode()==200);
		JsonPath jpath = response.jsonPath();
		//String result = jpath.get();
		System.out.println(jpath);
		
	}
	
	@Test(enabled = true)
	void getSecurityInformation2() {
		Response response = (Response) RestAssured.given().spec(getCommonRequestSpec()).when().get();
		assertTrue(response.statusCode()==200);
		response.getBody().prettyPrint();
		
	}
	
	
	
	@AfterSuite
	void teardown() {
		System.out.println("TearDown");
	}
	
	
	
	
}
