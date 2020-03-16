package framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.SignInPage;
import resources.base;

public class HomePage extends base {

	private static Logger Log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialise() throws IOException {
		driver = initializeDriver();
		driver.get("https://www.facebook.com/");
		Log.info("user succesfuly browsing facebook.com");
	}

	@Test//(dataProvider="getData")
	public void basePagenavigation() throws IOException {

		// you can access methods of another class by inheritance or by making an object
		// of that class

		//driver.findElement(By.xpath("//a[@class='color0-hov selected']")).click();
		LandingPage lp = new LandingPage(driver);
		//lp.getClick().click();
		lp.getUsername().sendKeys("priyankadighe2224@gmail.com");// similar to driver.findelement by.
		Log.info("user is on lading page");
		
		lp.getPassword().sendKeys("OMSHANTI");
		
		lp.getLogin().click();
		
		/*SignInPage sn = new SignInPage(driver);
		sn.SignInEmail();
		Log.info("user succesfuly logged in");
		
		lp.DisplayCart();
		Log.info("shopping cart is displayed after signin");*/

	}
	/*@DataProvider
	public Object[][] getData()
	{
		//row stands for how many different datatypes test should run
		//coloms stands for how many values per each test
		Object[][] data=new Object[1][3];
		//0th row
		data[0][0]="nonrestricted user@qa.com";
		data[0][1]="123454";
		data[0][2]="restricted user";
		//1st row
		data[1][0]="restricted user@qa.com";
		data[1][1]="893454";
		data[1][2]="nonrestricted user";
		
		return data;
	}*/

	/*@AfterTest
	public void tearDown() {
		
		driver.close();
		driver = null; /// to minimize use of memory driver should make null

	}*/

}
