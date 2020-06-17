package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Navigating to URL
		driver.get("https://simplebilling.in:8443/resetPassword/changePassword?token=QAgDH5YDoMwrUgOcPHug0ppOKTDBsxmu");
		// maximizing the window
		driver.manage().window().maximize();
		WebElement log = driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
		log.sendKeys("admin");
		WebElement pas = driver.findElement(By.xpath("//*[@id=\"j_password\"]"));
		pas.sendKeys("Gopal@123");
		WebElement comp = driver.findElement(By.cssSelector("#j_client_id"));
		comp.sendKeys("test");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[2]/ul/li/a/span"));
		login.click();
		WebElement add = driver.findElement(By.xpath("//*[@id=\"column1\"]/div[3]/a/span"));
		add.click();
		WebElement sel = driver.findElement(
				By.cssSelector("#column1 > div > div.box.sub-box > div > div > ul > li:nth-child(1) > a > span"));
		sel.click();
		driver.findElement(By.id("user.userName")).sendKeys("rahulkant");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy", "document.body.scrollHeight");

		String s = "//*[@id=\"main\"]/div[5]/ul/li[1]/a";
		System.out.println(driver.findElement(By.xpath(s)).isDisplayed());

		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(s)));
	}

}
