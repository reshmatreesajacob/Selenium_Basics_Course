package seleniumBasics;

//Imports the WebDriver interface to do operations in the browser
import org.openqa.selenium.WebDriver;

//Imports the ChromeDriver class to interact with the Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	// Declares a WebDriver instance named driver
	public WebDriver driver;
	
	// Method to initialize the browser
	public void initializeBrowser()
	{
		// Creates a new instance of a browser
		//driver = new EdgeDriver();
	    //driver = new FirefoxDriver();
		driver=new ChromeDriver(); 
		
		// Opens the specified URL in minimize screen
		driver.get("https://selenium.qabible.in/"); 
		driver.manage().window().maximize(); // to maximize the screen
	}
	
	//Method to close the opened window in a session
	public void driverCloseAndQuit()
	{
		//driver.close(); // to close a single window(Latest one)
		driver.quit(); // to close all window in current session
	}
	
	public static void main(String[] args) 
	{
		Base base=new Base();
		
		// Calls the initializeBrowser() method to launch Chrome
		base.initializeBrowser();
		
		base.driverCloseAndQuit();

	}
}
