package web.driver.commands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_BrowserAutomation {

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
		// wait
		Thread.sleep(4000);

		// TS3- Get the title of Page (to confirm the page)
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);

		// TS4-Goto Test URL https://seleniummaster.com/llc/
		driver.navigate().to("https://seleniummaster.com/llc");
		// wait
		Thread.sleep(4000);

		// TS5-Get the Title of Page
		String titleOfPage1 = driver.getTitle();
		System.out.println(titleOfPage1);
		Thread.sleep(4000);

		// TS6-Navigate one step Back to base URL
		driver.navigate().back();
		// wait
		Thread.sleep(4000);
		// TS7-Get the Title of Page
		String titleOfPage2 = driver.getTitle();
		System.out.println(titleOfPage2);

		// TS8-Navigate one step forward
		driver.navigate().forward();
		// wait
		Thread.sleep(4000);
		// TS9-Get the Title of Page
		String titleOfPage3 = driver.getTitle();
		System.out.println(titleOfPage3);

		// TS10-Refresh the Current Page
		driver.navigate().refresh();
		// wait
		Thread.sleep(4000);
		// TS11-Get the Title of Page
		String titleOfPage4 = driver.getTitle();
		System.out.println(titleOfPage4);
		// TS12-Maximize or minimize the Browser Window
		driver.manage().window().maximize();
		// wait
		Thread.sleep(4000);
		// Close the browser
		driver.close();

	}

}
