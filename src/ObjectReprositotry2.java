package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectReprositotry2 {
         WebDriver driver;
         public ObjectReprositotry2(WebDriver driver) {
        	 this.driver=driver;
        	 
         }
         
         By username=By.xpath("//*[@id=\"login1\"]");
         By password=By.xpath("//*[@id=\"password\"]");
        By log= By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]");

public WebElement email() {
	return driver.findElement(username);}
	 public WebElement password () {
	return	driver.findElement(password);
	}
	 public WebElement login() {
		 return driver.findElement(log);
	 }
}








