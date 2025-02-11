package seleniumBasics;

import java.rmi.server.LoaderHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base
{
	public void locators()
	{
		//To navigate to the input form page
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		//To locate using Id name
		WebElement messageField=driver.findElement(By.id("single-input-field"));
		
		//To locate using class name
		WebElement messageField1=driver.findElement(By.className("form-control"));
		
		//To locate using tag name
		WebElement showMessageBox=driver.findElement(By.tagName("button"));
		
		//To locate using name
		WebElement headName=driver.findElement(By.name("description"));
		
		//To locate using link name
		WebElement linkName=driver.findElement(By.linkText("Checkbox Demo"));
		
		//To locate using partial link name
		WebElement linkNamePartial=driver.findElement(By.partialLinkText("Checkbox"));
		
		//To locate using CSS selector --> tagname[attribute=’value’]
		WebElement cssLocator=driver.findElement(By.cssSelector("button[id='button-one']"));
		
		//------------------------------- X-path ------------------------
		
		//Using Relative XPath --> //tagname[@attribute=’value’]
		WebElement messageField2=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement showMesaage1=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement valueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement valueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		
		//For lengthy Xpath,we use partial details --> // tagname[contains(@attribute=’value’)]
		driver.findElement(By.xpath("//input[contains(@id,'-b')]"));
		
		//For lengthy text --> //tagname[text()=’value’]
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		
		//Locating partial text --> //tagname[starts-with(text()=’value’)]
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Get')]"));
		
		//Locating with the help of 'and' & 'or'
		//Using 'and' --> //tagname[@attribute=’value’ and @attribute=’value’]
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		
		//Using 'or' --> //tagname[@attribute=’value’ or @attribute=’value’]
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		
		//USing xpath access methods --> //tagname[@attribute=’value’]//axesMethodName::tagname[@attribute=’value’]
		//Using Parent,when you need to find the parent container of a specific element.
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		
		//Using Child,when you know the parent but need a direct child element.
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		
		//Using following,When looking for an element that appears after the current element in the HTML.
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		
		//Using preceding,When you need to find an element before the current one.
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		
		//Using ancestor, we can see all the ancestors above the current one
		//Used when When searching for a common parent container of an element.
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		
	}

	public static void main(String[] args) 
	{
		Locators locator=new Locators();
		
		locator.initializeBrowser();
		locator.locators();
		locator.driverCloseAndQuit();

	}

}
