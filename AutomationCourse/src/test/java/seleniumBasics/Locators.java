package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public void locators() {
		// to go to the input form page of Obsqura Testing Application
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");

		// locate using id
		WebElement messageField = driver.findElement(By.id("single-input-field"));
		
		// locate using class
		WebElement messageField1 = driver.findElement(By.className("form-control"));
		
		// locate using tag name
		WebElement showMessageBox = driver.findElement(By.tagName("button"));
		
		// locate using name
		WebElement headName = driver.findElement(By.name("viewport"));
		
		// locate using link name
		WebElement linkName = driver.findElement(By.linkText("Checkbox Demo"));
		// locate using partial link name
		WebElement linkNamePartial = driver.findElement(By.partialLinkText("Checkbox"));
		
		// locate using css selector ,Syntax : tagname[attribute=’value’]
		WebElement cssLocator = driver.findElement(By.cssSelector("button[id='button-one']"));
		
		// locate using Xpath syntax : //tagname[@attribute=’value’]
		// locate using Xpath of Enter Show Message field
		WebElement button = driver.findElement(By.xpath("//button[@id='button-one']"));
		// locate using Xpath of Enter Value A field
		WebElement enterValue = driver.findElement(By.xpath("//input[@id='value-a']"));
		// locate using Xpath of Get Total field
		WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
		// locate using Xpath of Enter Value A field for lengthy id attribute
		WebElement enterValuePartial = driver.findElement(By.xpath("//input[contains(@id,'-a')]"));
		// locate xpath using text message
		WebElement showButtonUsingText = driver.findElement(By.xpath("//button[text()='Show Message']"));
		// locate xpath using partial text message
		WebElement showButtonUsingPartialText = driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));

	}

	public static void main(String[] args) {
		Locators locator = new Locators();
		locator.initializeBrowser();
		locator.locators();
		locator.driverCloseAndQuit();

	}

}
