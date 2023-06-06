package com.example.ice.Day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskOne {
	@SuppressWarnings("deprecation")
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url="https://demo.opencart.com/index.php?route=account/register&language=en-gb";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Kishore");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(" V");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Kishore@gmail.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Kishore123");
		driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		driver.close();

	}
}
