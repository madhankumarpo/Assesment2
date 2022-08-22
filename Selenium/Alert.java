package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhankumarpo\\eclipse-workspace\\Maven_Project\\Chrome\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		
        Thread.sleep(6000);
		
		driver.switchTo().alert().accept();
		
        driver.findElement(By.id("confirmButton")).click();
		
        Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
        driver.findElement(By.id("promtButton")).click();
		
        Thread.sleep(1000);
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.sendKeys("Madhan");
		Thread.sleep(1000);
		alert.accept();
		
		
}
}
