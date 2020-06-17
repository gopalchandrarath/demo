package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Navigating to URL
		driver.get("https://branch5.cloodon.com/media/downloads/are-you-happy.html");
		// maximizing the window
		driver.manage().window().maximize();
		//click on " how it work links?"
		driver.findElement(By.xpath("/html/body/div[3]/a")).click();
		//closing the window
		driver.close();

	}


}
