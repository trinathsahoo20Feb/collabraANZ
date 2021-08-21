package com.sahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CollabraANZTest {
	public static void main(String[] args) {
		System.setProperty("“webdriver. gecko. driver”", "D:\\trinath\\OTHERS_INFO\\shammiJha\\browserDrivers\\geckodriver-v0.29.1-win64.zip\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //Launch FireFox driver
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); // delete all cookies
		
		//open the url
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		driver.findElement(By.xpath("//input[@id='application_type_single']")).click();
		driver.findElement(By.xpath("//div[@class='borrow__question__answer borrow__question__answer--select']/select")).click();
		driver.findElement(By.xpath("//input[@id='borrow_type_home']")).click();
		
	    driver.findElement(By.xpath("//input[@value='0']")).click();
	    driver.findElement(By.xpath("//input[@value='0']")).clear();
	    driver.findElement(By.xpath("//input[@value='0']")).sendKeys("80,000");
	    driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/input")).sendKeys("10,000");
	    driver.findElement(By.id("expenses")).click();
	    driver.findElement(By.id("expenses")).clear();
	    driver.findElement(By.id("expenses")).sendKeys("500");
	    driver.findElement(By.id("homeloans")).click();
	    driver.findElement(By.id("homeloans")).clear();
	    driver.findElement(By.id("homeloans")).sendKeys("0");
	    driver.findElement(By.id("otherloans")).click();
	    driver.findElement(By.id("otherloans")).clear();
	    driver.findElement(By.id("otherloans")).sendKeys("100");
	    driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div/div[4]/div/input")).click();
	    driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div/div[4]/div/input")).clear();
	    driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div/div[4]/div/input")).sendKeys("0");
	    driver.findElement(By.id("credit")).click();
	    driver.findElement(By.id("credit")).clear();
	    driver.findElement(By.id("credit")).sendKeys("10000");
	    driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div")).click();
	    driver.findElement(By.id("btnBorrowCalculater")).click();
	    driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div")).click();
	    driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div[2]/button")).click();
	    driver.findElement(By.id("btnBorrowCalculater")).click();
	    driver.findElement(By.id("expenses")).clear();
	    driver.findElement(By.id("expenses")).sendKeys("1");
	    driver.findElement(By.id("btnBorrowCalculater")).click();
	    driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div[3]/div")).click();
	}

}
