package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LandingPage {

	public WebDriver driver;
	//all variables made private to achieve encapsulation
	private By username=By.xpath("//input[@id='email']");
	private By password=By.xpath("//input[@id='pass']");
	private By login=By.xpath("//input[@type='submit']");
	private By title=By.xpath("//a[@title='Go to Facebook home']");
	
	//constructor
	public LandingPage(WebDriver driver2) {
		this.driver=driver2;
	}
	

	//for signIn
	public WebElement getUsername()
	{
		
		return driver.findElement(username);
	} 
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	//to validate contact us tab present or not
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}


	public WebElement getTitle() {
		// TODO Auto-generated method stub
		return driver.findElement(title);
	}
	
	/*public WebElement DisplayCart()
	{
		WebElement element=driver.findElement(shoppingCart);
		Assert.assertTrue(element.isDisplayed(),"Yes its displayed");
		return element;
	}*/


}
