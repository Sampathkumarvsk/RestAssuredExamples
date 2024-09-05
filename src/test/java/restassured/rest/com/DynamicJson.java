package restassured.rest.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DynamicJson {

	@Test(dataProvider="BookData")
	public void addBook(String aisle, String isbn) throws IOException
	{
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().header("content-type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Dell\\Documents\\payload.json"))))
		.when()
		.post("Library/Addbook.php").then().assertThat().statusCode(200).extract()
		.response().asString();
		
		JsonPath js1 = ReusableMethods.rawToJson(response);
		String id = js1.getString("ID");
		System.out.println(id);
		
	}
	
	@DataProvider(name="BookData")
	public Object[][] getData()
	{
		return new Object[][] {{"abcd","13456"},{"defa","45621"},{"deef","45417"}};
	}
	
	
}
