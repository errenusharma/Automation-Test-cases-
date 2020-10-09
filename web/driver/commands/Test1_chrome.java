package web.driver.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_chrome {

	public static void main(String[] args) throws InterruptedException {
		// 
		
	System.setProperty("webdriver.chrome.driver","C:\\RENU\\Testing\\Selenium\\Required software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		Thread.sleep(5000);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.close();

	}

}
