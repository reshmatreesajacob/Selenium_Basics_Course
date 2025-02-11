package seleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableClass extends Base {
	public void tableHandling() {

		// Navigating to the rediff site
		driver.navigate().to("https://money.rediff.com/indices/nse");

		// locating the tag and enabling the click function to view full table
		WebElement showMore = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showMore.click();

		// Locating the entire table and printing the entire table
		WebElement tableField = driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(tableField.getText());

		// Locating the 2nd row of the body of table and printing the entire row
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dataTable']//tbody//tr[2]"));
		System.out.println("Value of 2nd row : " + tableRow.getText());
		
	}

	public static void main(String[] args) {
		TableClass table = new TableClass();

		table.initializeBrowser();
		table.tableHandling();
		table.driverCloseAndQuit();

	}

}
