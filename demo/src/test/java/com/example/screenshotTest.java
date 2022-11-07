package com.example;


import java.io.File;

// import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.google.common.io.Files;

public class screenshotTest {
    @Test


    public static void main(String[] args)  throws Exception{

    	System.setProperty("webdriver.chrome.driver","F:\\selenium_test2\\demo\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //goto url

        driver.get("https://www.snapdeal.com/");

        //Call take screenshot function

        screenshotTest.takeSnapShot(driver, "F:\\selenium_test2\\demo\\Test2.png") ;     

    }

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                Files.copy(SrcFile, DestFile);


    }

}

