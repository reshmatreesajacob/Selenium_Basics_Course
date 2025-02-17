package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuterSample extends Base {
	
	// Method to perform JavaScript actions on a web page
	public void javaScriptSample()
	{
		// Navigate to the specified URL
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		// Locate the button element using XPath and assign it to 'showMessage'
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		 
		//This line casts the driver instance to JavascriptExecutor, allowing Selenium WebDriver to execute JavaScript commands directly in the browser.
		// Cast the WebDriver to JavascriptExecutor to enable execution of JavaScript commands
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// Execute a JavaScript click on the button element. 'arguments[0]' refers to the first argument, which is 'showMessage'
		js.executeScript("arguments[0].click();", showMessage);
		
		//----scrolling------ +ve--> down,-ve -->up
		// Execute a JavaScript command to scroll down the page by 350 pixels vertically
		js.executeScript("window.scrollBy(0,350)", "");
		
		//-ve --> up
		// Execute a JavaScript command to scroll up the page by 350 pixels vertically
		js.executeScript("window.scrollBy(0,-350)", "");
		
		
	}

	public static void main(String[] args) 
	{
		JavaScriptExecuterSample javaScript=new JavaScriptExecuterSample();
		
		javaScript.initializeBrowser();
		javaScript.javaScriptSample();
		//javaScript.driverCloseAndQuit();
		
	}

}
