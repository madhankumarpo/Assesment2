package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhankumarpo\\eclipse-workspace\\Maven_Project\\Chrome\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://demo.guru99.com/test/newtours/register.php");
	    
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.name("postalCode")).sendKeys("90001");
	    
	    driver.findElement(By.name("postalCode")).sendKeys("90001");
	    
	    driver.findElement(By.name("postalCode")).sendKeys("90001");
	    
	    driver.findElement(By.name("postalCode")).sendKeys("90001");
	    
	    driver.findElement(By.name("postalCode")).sendKeys("90001");
	    
	    
	    
	    driver.findElement(By.name("postalCode")).sendKeys("90001");
	    
	    driver.findElement(By.xpath("//option[@value ='AUSTRALIA']"));
	    
	    
	    driver.findElement(By.id("email")).sendKeys("Madhankumar");
	    
	    driver.findElement(By.name("password")).sendKeys("Maddy@123");
	    
	    driver.findElement(By.name("confirmPassword")).sendKeys("Maddy@123");
	    
	    
	    
	    
	}
	
	
}
