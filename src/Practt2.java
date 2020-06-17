package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practt2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	//System.out.println(driver.getCurrentUrl());
	//driver.navigate("https://www.iter-india.org/");
//driver.navigate().to("https://www.iter-india.org/");

//System.out.println(driver.getCurrentUrl());

//driver.close();
//System.out.println(driver.getPageSource());
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("asdf");
 WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	pass.clear();
	pass.sendKeys("ewr");
	driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	Thread.sleep(2000);
	WebElement msg=driver.findElement(By.xpath("//*[@id=\"error_box\"]/div[1]"));
	
	System.out.println(msg.getText());
	}

}
