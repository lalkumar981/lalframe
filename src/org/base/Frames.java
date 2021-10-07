package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
private void tc1() {
	System.out.println("tc1");
	

}
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\BasicSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		 driver.get("https://www.redbus.in/info/redcare");
		 
		 driver.manage().window().maximize();
		 
		 //Switch to frame
		 WebElement element = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		 
		 driver.switchTo().frame(element);
		 
		 WebElement hd = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		 hd.sendKeys("9600539757");
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
