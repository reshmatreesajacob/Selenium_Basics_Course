package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestNGBase 
{
	
	@Test(priority = 1,description = "User Login Verification with Valid credentials")
	public void verifyUserLoginWithValidUsernameAndValidPassword() 
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
	}
	
	@Test(priority = 4,description = "User Login Verification with Invalid Password")
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() 
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
	}
	
	@Test(priority = 3)
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() 
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
	}
	
	@Test(priority = 2)
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() 
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
	}
	

}
