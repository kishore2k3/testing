package com.example.ice.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFive {
	WebDriver driver;
  @Test(groups = "SmokeTest")
  public void TestCase01() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl,"https://www.godaddy.com/en-in");
	  driver.close();
  }
  @SuppressWarnings("deprecation")
@Test(groups="RegressionTestCase")
  public void TestCase02() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  WebElement clkDomain = driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button"));
	  clkDomain.click();
	  WebElement clkSearch = driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a"));
	  clkSearch.click();
	  driver.close();
  }
  @SuppressWarnings("deprecation")
@Test(groups="RegressionTestCase")
  public void TestCase03() throws InterruptedException{
//	  WebDriverManager.chromedriver().setup();
//	  driver = new ChromeDriver();
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  WebElement clkDomain = driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button"));
	  clkDomain.click();
	  WebElement clkSearch = driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a"));
	  clkSearch.click();
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, "GoDaddy Domain Search - Buy and Register Available Domain Names", "GoDaddy Domain Search - Buy and Register Available Domain Names" );
	  
//	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\\\"]/section/div/div/section/div/div[1]/div/div/div[2]/button")));
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).isDisplayed();
	  driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).isDisplayed();
	  driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).sendKeys("mydomain");
	  driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).click();
	  
//	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"search-app\\\"]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/button"))).click();
	  
	  Thread.sleep(20000);
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,300)", "");
	  driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/button")).isDisplayed();
	  driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/button")).click();
	  driver.navigate().refresh();
	  WebElement clkCart = driver.findElement(By.xpath("//*[@id=\"hcCartIcon\"]"));
	  clkCart.click();
	  driver.findElement(By.xpath("//*[@id=\"hcFlyout\"]/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/span")).isDisplayed();
	  driver.findElement(By.xpath("//*[@id=\"hcFlyout\"]/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div[3]/div[1]/div[2]/span[1]")).isDisplayed();
  }
}
