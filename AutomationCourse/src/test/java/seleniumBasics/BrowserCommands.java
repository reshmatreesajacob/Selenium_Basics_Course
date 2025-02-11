package seleniumBasics;

//Inheriting the parent class Base
public class BrowserCommands extends Base 
{
	public void browserCommands()
	{
		//To get current URL
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//To get the title of Webpage(Here Obsqura Testing)
		String title=driver.getTitle();
		System.out.println(title);
		
		//To get the window Handle Id of that webpage
		String handleId=driver.getWindowHandle();
		System.out.println(handleId);
		
		//To get the source code
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}

	public static void main(String[] args) 
	{
		BrowserCommands browser=new BrowserCommands();
		
		browser.initializeBrowser();
		browser.browserCommands();
		//browser.driverCloseAndQuit();

	}

}
