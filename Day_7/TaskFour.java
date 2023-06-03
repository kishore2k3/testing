package com.example.ice.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFour {
	WebDriver driver;
  @Test
  public void TestCase1() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  driver.get(url);
	  Thread.sleep(2000);
	  WebElement enterEmail = driver.findElement(By.name("username"));
	  enterEmail.sendKeys("Admin");
	  WebElement enterPass = driver.findElement(By.name("password"));
	  enterPass.sendKeys("admin123");
	  Thread.sleep(3000);
	  WebElement clkLogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  clkLogin.click();
	  String actualURL = driver.getCurrentUrl();
	  Assert.assertEquals(actualURL, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	  Thread.sleep(3000);
  }
  @Test
  public void TestCase2() throws InterruptedException{
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Logout")).click();
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.close();
  }
}
