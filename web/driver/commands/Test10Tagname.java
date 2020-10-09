package web.driver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test10Tagname {

	public static void main(String[] args) throws InterruptedException {
		
		// TS1- Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\RENU\\Testing\\Selenium\\Required software\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				// TS1- Launch facebook page
				driver.get("https://www.facebook.com/");
				Thread.sleep(5000);
				// Click on Create new account link button
				
				driver.findElement(By.linkText("Create New Account")).click();
				
				// Fill firstname with Textbox with input
				
				driver.findElement(By.name("firstname")).sendKeys("Renu");
				Thread.sleep(3000);
				driver.findElement(By.name("lastname")).sendKeys("Sharma");
				Thread.sleep(5000);
				driver.findElement(By.name("reg_email_")).sendKeys("99999999");
				
				// Automating dropdown
				Select day= new Select(driver.findElement(By.id("day")));
				// Selecting the input by the help of Value
				day.selectByValue("12");
				Thread.sleep(2000);
				
				Select month= new Select(driver.findElement(By.name("birthday_month")));
				month.selectByIndex(3);
				month.selectByVisibleText("Apr");
				Thread.sleep(2000);
				
				Select year= new Select(driver.findElement(By.id("year")));
				year.selectByVisibleText("2020");
				Thread.sleep(2000);
				
				//Click on Sign up 
				driver.findElement(By.name("websubmit")).click();
				Thread.sleep(5000);
				driver.close();
				
				
	}

	

}
