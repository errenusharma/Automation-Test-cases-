package web.driver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test10_FirefoxWebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver gdriver = new FirefoxDriver();
		
		gdriver.get("https://mail.yahoo.com/");
		Thread.sleep(2000);
		
		//gdriver.findElement(By.cssSelector("html body#signin-main div.header.clearfix a.fuji-button-link.fuji-button-text.fuji-button-inverted")).click();
		//gdriver.findElement(By.linkText("Sign in")).click();
		//gdriver.findElement(By.tagName("span")).click();
		gdriver.findElement(By.xpath("/html/body/div[1]/a[2]/span")).click();
		Thread.sleep(2000);
		System.out.println(gdriver.getCurrentUrl());
		WebElement element = gdriver.findElement(By.id("login-username"));
		String attr= element.getAttribute("Class");
		System.out.println(attr);
		element.sendKeys("testemail4selenium@yahoo.com");
		gdriver.findElement(By.xpath("/html/body/div[1]")).click();
		
	
		
		
	}

}
