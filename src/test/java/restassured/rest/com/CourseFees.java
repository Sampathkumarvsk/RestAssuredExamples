package restassured.rest.com;

import org.testng.Assert;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class CourseFees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		JsonPath courseResponse = new JsonPath(Payload.coursePayload());
		
		// print number of course returned by API
		 int noOfCourses = courseResponse.getInt("courses.size()");
		 System.out.println(noOfCourses);
		 
		// print Purchase amt API
		 int purchaseAmt = courseResponse.getInt("dashboard.purchaseAmount");
		 System.out.println(purchaseAmt);
		 
		 // print title of first course
		 String firstCourse = courseResponse.getString("courses[0].title");
		 System.out.println(firstCourse);
		 
		 // Print all courses Fees
		 
		 for(int i=0; i<noOfCourses; i++)
		 {
			 String courseTitle = courseResponse.getString("courses["+i+"].title");
			 int coursePrice = courseResponse.getInt("courses["+i+"].price");
			 int courseCopies = courseResponse.getInt("courses["+i+"].copies");
			 sum = sum + (coursePrice * courseCopies);
			 
		 }
		 
		System.out.println(sum);
		 
		Assert.assertEquals(purchaseAmt, sum);
		
	}

}
