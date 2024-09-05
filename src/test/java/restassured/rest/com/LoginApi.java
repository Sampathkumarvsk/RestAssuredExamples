package restassured.rest.com;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;


public class LoginApi {
	
  public static void main(String[] args)
  {
	  
	  //RestAssured.baseURI = "https://test-exampleapi.com";
	  
	  RestAssured.baseURI = "https://test-exampleapi.com";	  
	  
      
	  
		  String response1 = given().queryParam("key", "qaclick123").header("content-type", "application/json")
		  .body("").when().post("").then().assertThat().statusCode(200).body("scope", equalTo("App"))
		  .extract().response().asString();
		  
		  JsonPath js1 = new JsonPath(response1);
		  js1.getString("place-id");
		  
		  Assert.assertEquals("actualAddress","pacific Ocean");
	  
	  
	  
		  
	  
	  
	  
	  
	  
	  
	  
  }
	

}
