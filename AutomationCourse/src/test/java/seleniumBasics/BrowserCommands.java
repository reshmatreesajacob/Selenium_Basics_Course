package seleniumBasics;

//Inheriting the parent class Base
public class BrowserCommands extends Base {
	public void browserCommands() {
		// to get current URL
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// to get title of the Webpage (Here Obsqura Testing)
		String title = driver.getTitle();
		System.out.println(title);

		// to get window handle id of that webpage
		String handleId = driver.getWindowHandle();
		System.out.println(handleId);

		// to get the source code
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}

	public static void main(String[] args) {
		BrowserCommands browser = new BrowserCommands();

		browser.initializeBrowser(); // Base class Method
		browser.browserCommands();
		browser.driverCloseAndQuit(); // Base class Method

	}

}
