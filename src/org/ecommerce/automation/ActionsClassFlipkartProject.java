package org.ecommerce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassFlipkartProject {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// got to url https://www.flipkart.com/
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);

		// maximize window
		driver.manage().window().maximize();

		// Find Sign in webelement
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);

		// Refresh the window
		driver.navigate().refresh();
		Thread.sleep(2000);

		// Perform Mousehover action using Actions Class
		WebElement e = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		Actions a = new Actions(driver);
		a.moveToElement(e).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Soft Toys']")).click();
		Thread.sleep(5000);

		// validation of page
		boolean element = driver.findElement(By.xpath("//h1[text()='Soft Toys']")).isDisplayed();
		if (element == true) {
			System.out.println("Soft toys page launched, Test Passed");
		} else {
			System.out.println("Soft toys page not launched, Test Failed");

			driver.findElement(By.xpath("//div[contains(text(),'Age Group')]")).click();

		}

		driver.close();

	}

}
