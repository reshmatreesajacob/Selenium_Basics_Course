package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {

	public void handlingMultipleWindow() {
		driver.navigate().to("https://demo.guru99.com/popup.php");

		String parentWindowHandleId = driver.getWindowHandle();
		System.out.println(parentWindowHandleId);

		WebElement clickField = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickField.click();

		// set to get all window handles of all childs in that webpage
		Set<String> handleIds = driver.getWindowHandles();
		Iterator<String> values = handleIds.iterator();
		while (values.hasNext()) {
			String currentId = values.next();
			// not same as parent id
			if (!currentId.equals(parentWindowHandleId)) {
				driver.switchTo().window(currentId);

				// go to that particular child
				WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("treesa@gmail.com");

				// to submit
				WebElement submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit.click();
			}
		}
	}

	public static void main(String[] args) {
		MultipleWindowHandling multiple = new MultipleWindowHandling();

		multiple.initializeBrowser();
		multiple.handlingMultipleWindow();
		// multiple.driverCloseAndQuit();

	}

}
