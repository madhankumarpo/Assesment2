package com.Selenium;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
public static void main(String[] args) throws InterruptedException, ParseException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhankumarpo\\eclipse-workspace\\Maven_Project\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		
		 String min;
         double m=0,r=0;
         
       //No. of Columns
         List  col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
         
         System.out.println("Total No of columns are : " +col.size());
         
         //No.of rows
         List  rows = driver.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
         System.out.println("Total No of rows are : " + rows.size());
         
         for (int i =1;i<rows.size();i++)
         {    
             min= driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
             
             NumberFormat f =NumberFormat.getNumberInstance();
             

             Number num = f.parse(min);
             
             min = num.toString();
             m = Double.parseDouble(min);
             
             if(m>r)
             {    
                r=m;
             }
        }
        System.out.println("Minium current price is : "+ r);
		
		
		
		
}
}
