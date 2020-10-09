package web.driver.commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.AssertionFailed;

public class Test14_PlacingVerifcationPoints {

	/*
	 * TS1-Launch Chrome Browser TS2-Goto Test URL https://www.google.com
	 * TS3-Get the Title of Page TS4-Goto Test URL
	 * https://seleniummaster.com/llc/ TS5-Get the Title of Page TS6-Navigate
	 * one step Back to base URL TS7-Get the Title of Page TS8-Navigate one step
	 * forward TS9-Get the Title of Page TS10-Refresh the Current Page TS11-Get
	 * the Title of Page TS12-Maximize or minimize the Browser Window
	 * TS13-customize the Browser Window TS14-Maximize the Browser Winodw
	 * TS15-Click on Image Link TS16-Switch from 0th window to 1st Window
	 * TS17-Get the URL of Page TS18-Switch from 1st Window to 0th Winodow
	 * TS19-Get the URL of Page TS20-Close the Entire Browser Session
	 */
	public static void main(String[] args) throws InterruptedException {
		// TS1- Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\RENU\\Testing\\Selenium\\Required software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// TS2- GO to https://www.google.com/
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.manage().window().notify();
				// wait
		Thread.sleep(4000);

		// Verfication way 1: TS3- Get the title of Page (to confirm the page)
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		if (titleOfPage.equalsIgnoreCase("gogle"))
		{
			System.out.println("Launched Google, Test Passed");
		}	else {
			System.out.println("Test Failed");
		}
		
		//Verification way 2: check through element 
		boolean linkText= driver.findElement(By.xpath("//a[text()='About']")).isDisplayed();
		if (linkText==true)
		{
			System.out.println("Launched Google, Test Passed");
		}else
		{
		System.out.println("Test Failed");	
		}
		
		// Verification3: through error message using isDisplayed method 
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("aaaa");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		
		boolean err_Msg=driver.findElement(By.xpath("//p[@id='username-error']")).isDisplayed();
		if (err_Msg==true)
		{
			System.out.println("Error meesagedispalyed, Test Passed");
		}else
		{
		System.out.println(" Error Message not Displayed, Test Failed");	
		}
		// Close the browser
		driver.close();

	}

}
