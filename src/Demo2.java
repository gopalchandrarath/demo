package com.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("hiiiiiiiiiiii");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oracle.com/in/index.html");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srecfile=ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\screenshot\\amazon.png");
		   //copy(srecfile,destfile);
		Files.copy(srecfile, destfile);
		driver.close();
		//Thread.sleep(5000);
		//this x path for isro
		//driver.findElement(By.xpath("//a[text()='About']")).click();
		
		Thread.sleep(5000);
		//driver.quit();
	}
}
	

