package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends Base {

	public void mouseActions() {
		// Navigating to the webpage with draggable elements
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");

		// Locating the element to right-click
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));

		// Performing right-click action with the help of Actions Interface
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).build().perform();
	}

	public void mouseAction2() {
		// No need to navigate again as driver is on the same page

		// Locating the element to perform mouse hover
		WebElement mouseHover = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));

		// Performing mouse hover action
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHover).build().perform();
	}

	public void keyBoardAction() throws AWTException {

		// Creating an instance of Robot class to simulate keyboard actions
		Robot robot = new Robot();

		// Simulating CTRL + T key press to open a new tab
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {

		ActionsClass action = new ActionsClass();

		action.initializeBrowser();

		// Executing different action methods
		// action.mouseActions();
		// action.mouseAction2();
		try {
			action.keyBoardAction();
		} catch (AWTException e) {
			e.printStackTrace(); // Handling exception for Robot class
		}
		// action.driverCloseAndQuit();
	}
}
