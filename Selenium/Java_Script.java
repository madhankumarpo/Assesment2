package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Java_Script {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhankumarpo\\eclipse-workspace\\Maven_Project\\Chrome\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		driver.get("https://askomdch.com/store");
		
        driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		
		//driver.findElement(By.className("search-field")).sendKeys("Blue Denim Shorts");
		
		//driver.findElement(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();
	
		
		js.executeScript("window.scrollBy(0,700)");
		
		//js.executeScript("window.scrollBy(0,-659");
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[5]/div[2]/a[2]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[5]/div[2]/a[3]")).click(); 
		
		js.executeScript("window.scrollBy(0,700)");
		
		driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
		
		js.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("Virat");
		driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("Kohli");		
		
		Thread.sleep(3000);
		
	
		driver.findElement(By.className("select2-selection__rendered")).click();
		
		driver.findElement(By.id("select2-billing_country-container")).click();
		
		driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("No:5/7, abc street");
		driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("ABCD");
		driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("90001");
		driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("Maddy1218@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"select2-billing_state-container\"]")).click();	

		
		driver.findElement(By.id("payment_method_cod")).click();
		
		driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
		
	}
}
