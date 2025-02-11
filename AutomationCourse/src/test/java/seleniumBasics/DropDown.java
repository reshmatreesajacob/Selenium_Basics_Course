package seleniumBasics;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base
{
	public void handlingDropDown()
	{
		// Navigate to the specified URL containing dropdown elements
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		// Using selectByIndex() to select an option from the first dropdown
		WebElement dropDown1=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(dropDown1);
		select.selectByIndex(1);//Index starts from 0,1,2,3
		
		// Using selectByVisibleText()
		WebElement dropDown2=driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select1=new Select(dropDown2);
		select1.selectByVisibleText("TestNG");
		
		// Using selectByValue()
		WebElement dropDown3=driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select2=new Select(dropDown3);
		select2.selectByValue("javascript");
	}

	public static void main(String[] args) 
	{
		DropDown drop=new DropDown();
		
		drop.initializeBrowser();
		drop.handlingDropDown();
		//drop.driverCloseAndQuit();

	}

}
