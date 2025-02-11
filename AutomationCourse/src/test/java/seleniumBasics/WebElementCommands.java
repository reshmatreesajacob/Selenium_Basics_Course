package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base
{
	public void webElementCommands()
	{
		// Navigate to the Simple Form Demo page
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		// Locate the input field using XPath
		WebElement messageField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		// Enter the text "Reshma" in the input field
		messageField.sendKeys("Reshma");
		
		// Locate the "Show Message" button
        WebElement messageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		
        // Click on the "Show Message" button
		messageButton.click();
		
		// To Clear the input field 
        // messageField.clear();
		
		// Locate the element where the displayed message appears
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		
		// Retrieve and print the displayed message
		String message=yourMessage.getText();//to get the message in console output
		System.out.println(message);
		
		// Locate the "Show Message" button again
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		// Get and print the background color of the button
		System.out.println(showMessageButton.getCssValue("background-color"));
		
		// Get and print the size (width & height) of the button
		System.out.println(showMessageButton.getSize());
		
		// Get and print the tag name of the button element
		System.out.println(showMessageButton.getTagName());	
		
	}

	public static void main(String[] args) 
	{
		WebElementCommands element=new WebElementCommands();
		
		element.initializeBrowser();
		element.webElementCommands();
		element.driverCloseAndQuit();
	}

}
