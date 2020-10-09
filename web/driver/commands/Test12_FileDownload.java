package web.driver.commands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test12_FileDownload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver gdriver = new FirefoxDriver();
		
		// TS1- launch webpage:https://www.selenium.dev/downloads/ 
		gdriver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		// Maximize Window
		gdriver.manage().window().maximize();
		
		
		// TS2-Select Element Java-Download
		
		gdriver.findElement(By.xpath("//div[@class='container basic dark-background']/table[1]/tbody[1]/tr[2]/td[6]/a[1]")).click();
		
		Thread.sleep(2000);
	
		//Use Robot to handle handle Window application
		Robot r= new Robot();
				
		
		//Perform downward selection 
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		//Perform Enter opetation 
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(4000);
				
			
	}

}
