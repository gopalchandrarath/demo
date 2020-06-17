package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Testcases2 {
	public static void main(String[] args) throws InterruptedException {
	//public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		ObjectReprositotry rd=new ObjectReprositotry(driver);
		rd.email().sendKeys("sai");
		rd.password().sendKeys("shraddha");
		rd.login().click();
		Homepage hr=new Homepage(driver);
		hr.lin().click();
	}

}
//}