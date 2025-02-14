package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	
	public void handlingAlerts()
	{
		// Navigating to the webpage
		driver.navigate().to("https://demoqa.com/alerts");
		
		// Locating and clicking the simple alert button
		WebElement simpleAlert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlert.click();
		
		// Switching to the alert window
		Alert alert=driver.switchTo().alert();
		alert.accept();  // Clicking OK on the alert
		
	}

	public void handlingConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		
		// Locating and clicking the confirm alert button
		WebElement confirmAlert=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmAlert.click();
		
		// Switching to the alert window
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText()); // Printing alert text
		alert.accept(); // Clicking OK on the confirm alert
	}
	
	public void handlingPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		
		// Locating and clicking the prompt alert button
		WebElement promptAlert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlert.click();
		
		// Switching to the alert window
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Hello");  // Sending text input to the prompt alert
		alert.accept();  // Clicking OK on the prompt alert
	}
	
	public static void main(String[] args) {
		
		AlertHandling alert=new AlertHandling();
		
		alert.initializeBrowser();
		
		// Executing alert handling methods
		//alert.handlingAlerts();
		//alert.handlingConfirmAlert();
		alert.handlingPromptAlert();
		
		//alert.driverCloseAndQuit();

	}
}
