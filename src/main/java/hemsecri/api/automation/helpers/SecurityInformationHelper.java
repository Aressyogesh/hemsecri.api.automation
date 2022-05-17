package hemsecri.api.automation.helpers;

import hemsecri.api.automation.constants.EndPoints;
import hemsecri.api.automation.utils.ConfigManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SecurityInformationHelper {
	
private static final String BASE_URL = ConfigManager.getInstance().getString("baseUrl");
	
/*
 * public SecurityInformationHelper() { RestAssured.baseURI=BASE_URL;
 * RestAssured.useRelaxedHTTPSValidation(); }
 */
	public void getSecurityInformation() {
		Response response = RestAssured
				.given().log().all()
				.contentType(ContentType.JSON)
				.get(EndPoints.getSecurityInformation)
				.andReturn();
	}

}
