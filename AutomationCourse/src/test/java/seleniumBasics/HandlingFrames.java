package seleniumBasics;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {

	public void handlingFrames() {

		// Navigating to the specified webpage
		driver.navigate().to("https://demoqa.com/frames");

		// Finding all iframe elements on the webpage
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		int framesCount = iframes.size(); // Counting the number of frames present
		System.out.println(framesCount); // Printing the number of frames found

		// Locating the first frame using XPath by its ID
		WebElement firstFrame = driver.findElement(By.xpath(" //iframe[@id='frame1']"));

		// Switching to the located frame
		driver.switchTo().frame(firstFrame);// to switch the driver to that frame

		// Locating an element inside the frame
		WebElement frameText = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameText.getText()); // Printing the text inside the frame

		// Switching back to the main webpage from the frame
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		HandlingFrames frames = new HandlingFrames();

		frames.initializeBrowser();

		// Calling the method to handle frames
		frames.handlingFrames();

		frames.driverCloseAndQuit();
	}
}
