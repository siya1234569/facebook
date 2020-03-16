package pageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

	public WebDriver driver;
	
	//constructor
	public SignInPage(WebDriver driver2) {
	this.driver=driver2;
	}
  

	By Email=By.xpath("//span[contains(text(),'Sign in with email')]");
	 
	
	

	public void SignInEmail()
	{
		WebDriverWait w = new WebDriverWait(driver, 120);
		WebElement element = w.until(ExpectedConditions.elementToBeClickable(Email));
		element.click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("priyankadighe2224@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("priyanka");
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	} 
 

}

