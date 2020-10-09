package web.driver.commands;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6_WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\RENU\\Testing\\Selenium\\Required software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://seleniummaster.com/llc/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@id='siteseal']")).click();
		
		//handle windows 
		ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(wins);
		Thread.sleep(4000);
		
		// switch from oth window to 1 window	
		driver.switchTo().window(wins.get(1));
		driver.manage().window().maximize();
		Thread.sleep(4000);
		// get current url 
		String urlOfPage= driver.getCurrentUrl();
		System.out.println(urlOfPage);
		
		// swtich back to window 1 to 0 window 
		driver.switchTo().window(wins.get(0));
		String urlOfPage1= driver.getCurrentUrl();
		System.out.println(urlOfPage1);
		Thread.sleep(4000);
		
		driver.close();
		driver.switchTo().window(wins.get(1));
		driver.close();
		
	}

}
