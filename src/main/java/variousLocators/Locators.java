package variousLocators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	@Test
	public void launchBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// we want to goto https://objectspy.space website

		driver.get("https://objectspy.space");
		driver.manage().window().maximize();
		// locator name
		driver.findElement(By.name("firstname")).sendKeys("Meryem");
		// locator id for Radio Button
		// driver.findElement(By.id("sex-0")).click();

		// locator class for file upload button
		// ????driver.findElement(By.className("input-file")).click();

		// locator linkText for hyperlink
		// driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		// locator Partial linkText for hyperlink
		// driver.findElement(By.partialLinkText("Product Backend")).click();

		// CSS Selector tagName#value # represent id, for multiple Radio Button press
		// ctrl+F on the left, # represent id
		driver.findElement(By.cssSelector("input#sex-0")).click();

		// CSS Selector tagName.value . represent class, for file upload profile Button
		// ????driver.findElement(By.cssSelector("input.input-file")).click();

		// CSS tagName[attribute='value'] for Multible CheckBoxes
		driver.findElement(By.cssSelector("input[value='Manual Tester']")).click();

		Thread.sleep(2000);

		// XPATH syntax: //tagName[@AttributeNode='value'] for last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Srinivasulu");
		Thread.sleep(2000);
		
		// XPATH syntax: //tagName[@AttributeNode='value' and @AttributeNode='value']
		// for Multiple Radio button
		driver.findElement(By.xpath("//input[@name='exp' and @value='4']")).click();
		
		// XPATH syntax: //tagName[text()='value']  
		// for link-1 way   When we use double code "" inside of '' single code in the DOM,
		// then we paste on the Eclipse, it automatically puts \ back slash front end end.  
		driver.findElement(By.xpath("//strong[text()=\"Link Test : New Page\"]")).click();
		
		// XPATH syntax: //tagName[contains(text(),'value')]
		// for link-2 way
		driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : New Page')]")).click();
		
		driver.close(); // Closes the browser
		
		driver.quit(); // Kills the webDriver/ process // you can not continue testing 
		
		
		

	}

}
