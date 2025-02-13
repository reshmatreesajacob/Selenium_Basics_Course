package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	
	public void handlingAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		
		//Locating the simple alert click button
		WebElement simpleAlert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlert.click();
		
		// to go that alert window
		Alert alert=driver.switchTo().alert();
		alert.accept();// ok entered
		
	}

	public void handlingConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		
		//Locating the confirm alert click button
		WebElement confirmAlert=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmAlert.click();
		
		// to go that alert window
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	public void handlingPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		
		//Locating the prompt alert click button
		WebElement promptAlert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlert.click();
		
		// to go that alert window
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Hello");
		alert.accept();
	}
	
	public static void main(String[] args) {
		
		AlertHandling alert=new AlertHandling();
		
		alert.initializeBrowser();
		
		//alert.handlingAlerts();
		//alert.handlingConfirmAlert();
		alert.handlingPromptAlert();
		
		//alert.driverCloseAndQuit();

	}

}
