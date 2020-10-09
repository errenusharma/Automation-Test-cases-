package web.driver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9_AmazonLoginChrome {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser chrome 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		// got to url //www.amazaon.ca
		driver.get("https://www.amazon.ca");
	    Thread.sleep(1000);
	    
	    // maximize window
	    driver.manage().window().maximize();
		
	    // Find Sign in webelement 
		driver.findElement(By.xpath("//a[@id = 'nav-link-accountList']")).click();
		Thread.sleep(2000);
		
		// Fill with mobile phone and clear data 
		driver.findElement(By.xpath("//input[@id ='ap_email']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id ='ap_email']")).clear();
		Thread.sleep(2000);
		
		
		//Fill username with valid emailid 
		driver.findElement(By.xpath("//input[@id ='ap_email']")).sendKeys("testemail4selenium@yahoo.com");
		Thread.sleep(2000);
		
		// Click on Continue
		driver.findElement(By.xpath("//input[@class = 'a-button-input']")).click();
		Thread.sleep(2000);
		
		String plainText = driver.findElement(By.xpath("(//a[@class='a-link-normal'])[4]")).getText();
		System.out.println(plainText);
		Thread.sleep(2000);
		
		//Enter password
		driver.findElement(By.xpath("//input[@id = 'ap_password' or @name= 'password']")).sendKeys("seleniumtesting");
		Thread.sleep(1000);
		
		String plainText1 = driver.findElement(By.xpath("//input[@id = 'ap_password' or @name= 'password']")).getAttribute("value");
		System.out.println(plainText1);
		Thread.sleep(2000);
		// Get Text 
		//String plainText = driver.findElement(By.xpath("//*[ text() ='Details']")).getText();
		
		//String plainText = driver.findElement(By.xpath("remember_me_learn_more_link")).getText();
		//System.out.println(plainText);
		//Thread.sleep(2000);
		
		
		
		
		//Click Sign in 
		driver.findElement(By.xpath("//span[@id ='auth-signin-button']")).click();
		Thread.sleep(2000);
		
		//Refresh the window 
		driver.navigate().refresh();
		Thread.sleep(2000);
		String titleOfPage= driver.getCurrentUrl();
		System.out.println(titleOfPage);
		
		driver.close();
		
		
	}
	
	

}
