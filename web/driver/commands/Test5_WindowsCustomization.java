package web.driver.commands;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test5_WindowsCustomization {

	public static void main(String[] args) throws InterruptedException {
		//launch firefox browser 
		
		System.setProperty("webdriver.gecko.driver", "C:\\RENU\\Testing\\Selenium\\Required software\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://www.amazon.ca/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//TS13-customize the Browser Window wrt dimensions
		Dimension custwin=new Dimension(300,1200);
		driver.manage().window().setSize(custwin);
		Thread.sleep(5000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		//customize the Browser Window wrt axis
		Point p=new Point(80,80);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		driver.close();
		
		
		
		//TS14-Maximize the Browser Winodw
		//TS15-Click on Image Link 
		//TS16-Switch from 0th window to 1st Window
		//TS17-Get the URL of Page
		//TS18-Switch from 1st Window to 0th Winodow
		//TS19-Get the URL of Page
		//TS20-Close the Entire Browser Session

	}

}
