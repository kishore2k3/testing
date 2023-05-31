package com.example.ice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url="https://demo.opencart.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement S1=driver.findElement(By.name("search"));
		S1.sendKeys("mobile");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3800)", "");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Returns")).click();
		js.executeScript("window.scrollBy(0,3800)", "");
		Thread.sleep(3000);
		WebElement S2=driver.findElement(By.linkText("Gift Certificates"));
		S2.click();
		driver.close();
	}
}
