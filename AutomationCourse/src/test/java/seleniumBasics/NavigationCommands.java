package seleniumBasics;

public class NavigationCommands extends Base 
{
	public void navigationCommands()
	{
		//To navigate to the specified URL
		driver.navigate().to("https://www.amazon.in/");
		
		//To navigate back to the previous page
		driver.navigate().back();
		
		//To navigate forward
		driver.navigate().forward();
		
		//To refresh the current page
		driver.navigate().refresh();
	}

	public static void main(String[] args) 
	{
		NavigationCommands navigation=new NavigationCommands();
		
		navigation.initializeBrowser();
		navigation.navigationCommands();
		navigation.driverCloseAndQuit();

	}

}
