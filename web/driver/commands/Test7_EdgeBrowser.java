package web.driver.commands;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test7_EdgeBrowser {
	/*
	 * TS1-Launch edge Browser 
	 * TS2-Goto Test URL https://www.google.com
	 * TS3-Get the Title of Page 
	 * TS4-Goto Test URL
	 * https://seleniummaster.com/llc/ 
	 * TS5-Get the Title of Page 
	 * TS6-Navigate one step Back to base URL 
	 * TS7-Get the Title of Page 
	 * TS8-Navigate one step forward 
	 * TS9-Get the Title of Page 
	 * TS10-Refresh the Current Page 
	 * TS11-Get the Title of Page 
	 * TS12-Maximize or minimize the Browser Window
	 * TS13-customize the Browser Window 
	 * TS14-Maximize the Browser Winodw
	 * TS15-Click on Image Link TS16-Switch from 0th window to 1st Window
	 * TS17-Get the URL of Page TS18-Switch from 1st Window to 0th Winodow
	 * TS19-Get the URL of Page TS20-Close the Entire Browser Session
	 */


	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.edge.driver","C:\\RENU\\Testing\\Selenium\\Required software\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		
		driver.navigate().to("https://www.amazon.ca/");
		Thread.sleep(3000);
		
		pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		driver.navigate().back();
		Thread.sleep(3000);
		pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		
		driver.navigate().forward();
		pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		
		driver.navigate().refresh();
		pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().window().setSize(new Dimension(200, 1000));
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
