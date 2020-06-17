package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage2 {
	WebDriver driver ;
	public Homepage2(WebDriver driver) {
		this.driver=driver;
	}
By li=By.xpath("//*[@id=\"news_container\"]/div[2]/div/div[4]/h4/a");

public WebElement lin() {
	 return driver.findElement(li);
}
}
