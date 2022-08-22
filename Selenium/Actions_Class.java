package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhankumarpo\\eclipse-workspace\\Maven_Project\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
	
		Actions acc = new Actions(driver);
		/*WebElement txtUsername = driver.findElement(By.name("q"));
		org.openqa.selenium.interactions.Action seriesOfActions = acc
        .moveToElement(txtUsername)
        .click()
        .keyDown(txtUsername, Keys.SHIFT)
        .sendKeys(txtUsername, "hello")
        .keyUp(txtUsername, Keys.SHIFT)
        .doubleClick(txtUsername)
        .contextClick()
        .build();*/
        
    //seriesOfActions.perform() ;
		
		WebElement search = driver.findElement(By.name("q"));
		
		
		
}
}