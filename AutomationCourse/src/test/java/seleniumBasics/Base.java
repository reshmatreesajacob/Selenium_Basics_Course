package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	//Declares a WebDriver instance named driver
	public WebDriver driver;
	
	//Method to initialize the browser
	public void initializeBrowser()
	{
		//Creates a new instnace of a browser
		driver=new ChromeDriver();
		//driver=new EdgeDriver();
		//driver=new FirefoxDriver();
		
		//Opens then specified URL in minimized screen
		driver.get("https://selenium.qabible.in/");
		
		//To maximize the screen
		driver.manage().window().maximize();
	}
	
	//Method to close the openend window in a session
	public void driverCloseAndQuit()
	{
		//To close a single window(Latest one)
		//driver.close();
		
		//To close all windows in current session(i.e multiple screen openened)
		driver.quit();
	}

	public static void main(String[] args) 
	{
		Base base=new Base();
		
		//Calls the initializeBrowser() to launch the browser
		base.initializeBrowser();
		
		//Calls the driverCloseAndQuit() to close the browser window 
		base.driverCloseAndQuit();

	}

}
