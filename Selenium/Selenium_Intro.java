package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Intro {

	
	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhankumarpo\\eclipse-workspace\\Maven_Project\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://askomdch.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("wp-block-button")).click(); 
		
		driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")).click();
			
		Thread.sleep(5000);
		
		driver.findElement(By.className("search-field")).sendKeys("Blue Denim Shorts");
		
		driver.findElement(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();
		
		//Thread.sleep(5000);
		
		//driver.close();
		
     /* System.setProperty("webdriver.edge.driver", "C:\\Users\\madhankumarpo\\eclipse-workspace\\Maven_Project\\Chrome\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.navigate().to("https://www.javatpoint.com/java-tutorial");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("search")).sendKeys("Java OOPs Concepts");
		
		driver.findElement(By.className("gsc-search-button")).click();*/
		
		
	}
}
