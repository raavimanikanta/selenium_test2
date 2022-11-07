package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {
    public static String baseUrl = "https://www.sitebuilderreport.com/inspiration/small-business-websites";
    public static WebDriver driver;
    public static void main(String[] args) {									
    		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","F:\\selenium_test2\\demo\\resources\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();					
       					
        driver.get(baseUrl);
        //img[contains(@src,'https://ucarecdn.com/a3a4486f-6db4-4299-8718-36297463b033/-/scale_crop/1060x570/')]	
        driver.findElement(By.xpath("//a[text()='More Examples']")).click();   // example of the xpath with text();
        driver.findElement(By.xpath("//img[contains(@src,'https://ucarecdn.com/a3a4486f-6db4-4299-8718-36297463b033/-/scale_crop/1060x570/')]")).click();   // example of the xpath with text();
       // String basicXpath =  driver.findElement(By.xpath("//h1[@class='name']")).getText();
        driver.findElement(By.xpath("//a[@href='http://www.hamiltonsnowber.com/' or @target='blank']")).click();
        //img[@alt='MAINE COAST' and @id='yui_3_17_2_1_1667565636307_547']
        // driver.findElement(By.xpath("//img[@alt='MAINE COAST' and @id='yui_3_17_2_1_1667565636307_547']")).click();
}
}
