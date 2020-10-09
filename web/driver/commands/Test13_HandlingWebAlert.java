package web.driver.commands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test13_HandlingWebAlert {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver gdriver = new FirefoxDriver();
		
		// TS1- launch webpage;https://www.jquery-az.com/javascript/demo.php?ex=151.1_1 
		gdriver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		Thread.sleep(2000);
		
		// Maximize Window
		gdriver.manage().window().maximize();
		
		
		// TS2-Select Element Cick here to show confirm that 
		
		gdriver.findElement(By.xpath("//button[contains(text(), 'Click here')]")).click();
		Thread.sleep(2000);
					
		//get the alert on console
		String x= gdriver.switchTo().alert().getText();
		System.out.println(x);
		
		//Validate alert 
		if (x.contains("Are you sure"))
		{
			System.out.println("Valid alert generated- Test Passed");
		}
		else
		{
			System.out.println("Invalid alert generated- Test Failed");
		}
		

		//Switch to alert and Accept 
		gdriver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		String y= gdriver.switchTo().alert().getText();
		System.out.println(y);
		
		// Accept alert 
		gdriver.switchTo().alert().accept();
		Thread.sleep(2000);
		gdriver.close();
			
	}

}
