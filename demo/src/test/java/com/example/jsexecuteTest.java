package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;	
public class jsexecuteTest {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver","F:\\selenium_test2\\demo\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/"); 
    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
}
}