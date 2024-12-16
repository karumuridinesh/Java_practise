package com.amazon.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
  public static void main(String[] args) {
    System.out.println("..................Intialization................");
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize(); 
    try {
		driver.wait(10);
	    driver.quit();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  }
}
