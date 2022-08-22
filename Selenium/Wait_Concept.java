package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Concept {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhankumarpo\\eclipse-workspace\\Maven_Project\\Chrome\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://askomdch.com/store");
		
        driver.manage().window().maximize();
        
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
      //Implicit wait
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
     // Explicity wait-
        //WebDriverWait wait = new WebDriverWait(driver, 10);
       //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"place_order\"]")));
        
        driver.findElement(By.className("search-field")).sendKeys("Blue Denim Shorts");
      
        File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrfile, new File ("Screenshot.png"));
        
	
	}

}
