package web.driver.commands;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8_FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/");
		driver.manage().window().maximize();
		
		//Switch to oth frame
		driver.switchTo().frame(0);
				
		//Now Find the element 
		driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']")).click();
		Thread.sleep(2000);
		
		//To switch to from Frame 0to Frame 1 , switch to default content 
		driver.switchTo().defaultContent();
		
		//Now switch to Frame1 
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		// Click on Command Processor 
		driver.findElement(ByXPath.xpath("//span[text()='CommandProcessor']")).click();
		Thread.sleep(5000);
		
		//switch back to defaultcontent to switch to frame 2 
		driver.switchTo().defaultContent();
		//swith to frame 2 
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		//Click on Tree 
		//driver.findElement(By.xpath("(//*[@class='navBarCell1Rev'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Tree'])[1]")).click();
		Thread.sleep(5000);
				
		driver.close();
		
	
	}

}
