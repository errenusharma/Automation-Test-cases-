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

public class Test11_HandlingWindowAlerts {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver gdriver = new FirefoxDriver();
		
		// TS1- launch webpage:https://smallpdf.com/word-to-pdf 
		gdriver.get("https://smallpdf.com/word-to-pdf");
		Thread.sleep(2000);
		
		// TS2-Select Element Choose file
		gdriver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		Thread.sleep(2000);
		
	//Put the Path of file in clipboard: Desktop
		StringSelection s= new StringSelection("C:\\Users\\Renu\\Desktop\\InNearTerm.docx");
		// Send data from Clipboard to screen
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//Perform Paste: Ctrl+V 
		//Use Robot to handle handle Window application
		Robot r= new Robot();
		// Perform Key press and release operation by Robot Class
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		//Perform Enter opetation 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		// Give Explicit Wait to check for condition
			Thread.sleep(9000);
			
		//WebDriverWait w= new WebDriverWait(gdriver, 10);
		//w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Download'")));
		
		// Click on download 
		//gdriver.findElement(By.xpath("//span[text()='Download']")).click();
		
		gdriver.findElement(By.className("wnolmd-3 etAptB")).click();
		
		// take cursor two times down to save to drive 
		
		

		
			
	}

}
