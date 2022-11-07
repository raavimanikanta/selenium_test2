package com.example;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;	

public class imageclick {
   	

			
    		
    public static void main(String[] args) throws InterruptedException {									
        String baseUrl = "https://demo.automationtesting.in/";					
        System.setProperty("webdriver.chrome.driver","F:\\selenium_test2\\demo\\resources\\drivers\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
       					

			//verify that we are now back on Facebook's homepage		
	    driver.get(baseUrl);                    
        driver.findElement(By.id("entering")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='image not displaying']")).click();                    
        // driver.close();   
    }		
}
    

