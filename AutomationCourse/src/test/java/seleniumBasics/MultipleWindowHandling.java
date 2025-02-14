package seleniumBasics;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
	public void handlingMultipleWindow() {
		
		// Navigating to the webpage containing multiple windows
		driver.navigate().to("https://demo.guru99.com/popup.php");
        
		// Storing the parent window handle ID(Main Page)
		String parentWindowHandleId = driver.getWindowHandle();
		System.out.println("Parent Window Handle ID: "+parentWindowHandleId);
        
		// Locating and clicking the link to open a new window
		WebElement clickField = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickField.click();

		// set to get all window handles of all childs in that webpage
		Set<String> handleIds = driver.getWindowHandles();
		Iterator<String> values = handleIds.iterator();
		
		// Iterating through all window handles
		while (values.hasNext()) {
			String currentId = values.next();
			
			// Switching to child window if it's not the parent
			if (!currentId.equals(parentWindowHandleId)) 
			{
				driver.switchTo().window(currentId);

				// Locating the email input field and entering an email
				WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("treesa@gmail.com");

				// Locating and clicking the submit button
				WebElement submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit.click();
			}
		}
	}

	public static void main(String[] args) {
		MultipleWindowHandling multiple = new MultipleWindowHandling();

		multiple.initializeBrowser();
		
		// Handling multiple windows
		multiple.handlingMultipleWindow();
		
		// multiple.driverCloseAndQuit();
	}
}
