package com.example;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Dropdowntest {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","F:\\selenium_test2\\demo\\resources\\drivers\\chromedriver.exe");
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    WebDriver driver = new ChromeDriver();
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		drpCountry.selectByIndex(6);

		//Selecting Items in a Multiple SELECT elements
		// driver.get("http://jsbin.com/osebed/2");
		// Select fruits = new Select(driver.findElement(By.id("fruits")));
		// fruits.selectByVisibleText("Banana");
		// fruits.selectByIndex(1);
		
 }
}

