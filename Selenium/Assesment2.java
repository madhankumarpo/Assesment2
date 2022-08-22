package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Assesment2 {

	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		// Launch browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhankumarpo\\eclipse-workspace\\Maven_Project\\Chrome\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Madhan");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("6354372813");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Maddy@1218@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("ABC st, NG Nagar");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("600031");

		WebElement country = driver.findElement(By.xpath("//select//option[13]"));
		country.click();

		// Assertion
		Assert.assertTrue(driver.findElement(By.xpath("//select//option[13]")).isSelected());  
		System.out.println(driver.findElement(By.xpath("//select//option[13]")).isSelected());  

		/*driver.findElement(By.xpath("//input[@name='email']")).sendKeys("madhankumarpo");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Madhan@123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Maddy@123");
		
		//Nagative Scenario ScreenShot		
		
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrfile, new File ("C:\\Users\\madhankumarpo\\Pictures\\Screenshot.png"));*/

		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("viratkohliv");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Virat@123");
		
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Virat@123");
		
		for (int i = 2; i <= 15; i++) {
			String text1 = driver.findElement(By.xpath("//td/form//tr[" + i + "]")).getText();
			System.out.println(text1);
			if (i == 10) {
				break;
			}
		}

		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//ScrennShot
		
		File scrfile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrfile1, new File ("C:\\Users\\madhankumarpo\\Pictures\\Screenshots\\Screenshot.png"));

		
		}

	}


