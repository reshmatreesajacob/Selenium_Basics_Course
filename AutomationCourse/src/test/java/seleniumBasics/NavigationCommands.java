package seleniumBasics;

public class NavigationCommands extends Base {
	// methods for navigate functions
	public void navigationCommands() {
		// to navigate to the specified URL
		driver.navigate().to("https://www.amazon.in/");
		// to navigate back to the previous page
		driver.navigate().back();
		// To navigate forward to the page
		driver.navigate().forward();
		// to refresh the current page
		driver.navigate().refresh();

	}

	public static void main(String[] args) {
		NavigationCommands navigation = new NavigationCommands();
		navigation.initializeBrowser();
		navigation.navigationCommands();
		// navigation.driverCloseAndQuit();

	}

}