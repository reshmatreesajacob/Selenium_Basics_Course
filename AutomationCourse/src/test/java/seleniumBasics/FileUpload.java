package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileUploadUsingSendKeys() {
		
		// Navigating to the file upload webpage
		driver.navigate().to("https://demo.guru99.com/test/upload/");

		// Locating the file input element and providing the file path
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFile.sendKeys(
				"C:\\Users\\RESHMA\\git\\Selenium_Basics_Course\\AutomationCourse\\src\\test\\resources\\dummy.pdf");
		
		// Locating and clicking the checkbox for terms agreement
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='terms']"));
		checkBox.click();
		
		// Locating and clicking the submit button
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitButton.click();
	}

	public void fileUploadusingRobot() throws AWTException {
		
		// Navigating to the file upload webpage
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		
		// Locating and clicking the file upload button
		WebElement pdfUpload = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		pdfUpload.click();
		
		// Copying the file path to clipboard
		
		//StringSelection is a class used to handle clipboard operations.
		StringSelection s = new StringSelection(
				"C:\\Users\\RESHMA\\git\\Selenium_Basics_Course\\AutomationCourse\\src\\test\\resources\\dummy.pdf");
		 
		//Toolkit is a class in that provides a way to interact with the files
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		// Creating an instance of Robot class
		Robot robot = new Robot();
		
		// Adding delay to allow file dialog to open
		robot.delay(2500);
		
		// Simulating ENTER key press to focus file input field
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		// Simulating CTRL + V to paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		// Simulating ENTER key press to confirm file upload
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		FileUpload file = new FileUpload();

		file.initializeBrowser();
		
		// Executing file upload methods
		// file.fileUploadUsingSendKeys();
		try {
			file.fileUploadusingRobot();
		} catch (AWTException e) {
			e.printStackTrace();  // Handling exception for Robot class
		}
		// file.driverCloseAndQuit();
		// TODO Auto-generated method stub

	}
}


