package hemsecri.api.automation.helpers;

import hemsecri.api.automation.constants.EndPoints;
import hemsecri.api.automation.utils.ConfigManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginHelpers {

	
	private static final String BASE_URL = ConfigManager.getInstance().getString("baseUrl");
	
	public LoginHelpers() {
		RestAssured.baseURI=BASE_URL ;
	}
	
	public void checkLogin() {
		Response response = RestAssured
				.given()
				.contentType(ContentType.JSON)
				.post(EndPoints.postCheckLogin)
				.andReturn();
	}
}
