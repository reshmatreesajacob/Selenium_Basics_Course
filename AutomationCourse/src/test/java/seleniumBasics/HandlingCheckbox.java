package seleniumBasics;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class HandlingCheckbox extends Base
{
	public WebDriver driver;
	public void handlingCheckbox()
	{
        // Navigating to the checkbox demo page
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		// Locating a single checkbox using its XPath and clicking on it
		WebElement singleCheckbox1=driver.findElement(By.xpath("//input[@id=\"gridCheck\"]"));
		singleCheckbox1.click();
		
		// Locating multiple checkboxes using a common class attribute
		List<WebElement> multiplecheckbox=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		
		// Using Iterator to go through each checkbox and click it
		Iterator<WebElement> iterator=multiplecheckbox.iterator();
		while(iterator.hasNext())
		{
			WebElement checkbox=iterator.next();
			checkbox.click();
		}
		
		//Using for each loop to go through each checkbox and click it
//		for(WebElement checkbox1:multiplecheckbox)
//		{
//			checkbox1.click();
//		}
		
		// Navigating to the simple form demo page
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		 // Locating the "Show Message" button
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		// Checking if the "Show Message" button is displayed on the page
        // isDisplayed() returns true if the element is visible, otherwise false
		System.out.println(showMessageButton.isDisplayed());
		
		// Navigating to the radio button demo page
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		// Locating a gender radio button and clicking on it
		WebElement genderRadio=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		genderRadio.click();
		
		// Checking if the radio button is selected
        // isSelected() returns true if the element is selected, otherwise false
		System.out.println(genderRadio.isSelected());
		
		//Fluent wait 
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver) // reference
				.withTimeout(Duration.ofSeconds(10))      // time specify
				.pollingEvery(Duration.ofSeconds(3))      // checking times
				.ignoring(NoSuchElementException.class);   //ignore exception
		fluentWait.until(ExpectedConditions.elementToBeSelected(genderRadio));
		
		// Locating the "Show Value" button
		WebElement showValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		// Checking if the "Show Value" button is enabled
        // isEnabled() returns true if the element is enabled, otherwise false
		System.out.println(showValue.isEnabled());
		
	}

	public static void main(String[] args) 
	{
		HandlingCheckbox checkbox=new HandlingCheckbox();
		
		checkbox.initializeBrowser();
		checkbox.handlingCheckbox();
		//checkbox.driverCloseAndQuit();

	}

}
