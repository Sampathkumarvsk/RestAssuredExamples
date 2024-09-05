package files;

public class Payload {

	public static String coursePayload()
	{
		return "{\r\n"
				+ "  \"dashboard\": {\r\n"
				+ "	\"purchaseAmount\" : 535,\r\n"
				+ "	\"website\": \"rahulsettyacademy.com\"\r\n"
				+ "},\r\n"
				+ "  \"courses\": [\r\n"
				+ "	{\r\n"
				+ "		\"title\": \"Selenium Python\",\r\n"
				+ "		\"price\": 50,\r\n"
				+ "		\"copies\": 6\r\n"
				+ "	},\r\n"
				+ "  {\r\n"
				+ "		\"title\": \"Selenium Java\",\r\n"
				+ "		\"price\": 35,\r\n"
				+ "		\"copies\": 5\r\n"
				+ "	},\r\n"
				+ "  {\r\n"
				+ "		\"title\": \"Rest Assured\",\r\n"
				+ "		\"price\": 20,\r\n"
				+ "		\"copies\": 3\r\n"
				+ "	}\r\n"
				+ " ]	\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "";
		
	}
	
	public static String addBook(String aisle, String isbn)
	{
		String payLoad = "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+ isbn +"\",\r\n"
				+ "\"aisle\":\""+ aisle +"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ " ";
		return payLoad;
	}
	
}
