package com.example.ice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFour {
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		WebElement s1=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		s1.sendKeys("Kishore");
		WebElement s2=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		s2.sendKeys("727821tuic017@skct.edu.in");
		WebElement s3=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		s3.sendKeys("Mayank Markande");
		WebElement s4=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		s4.sendKeys("Mayank@gmail.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		WebElement s5=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		s5.sendKeys("Damn!");
		WebElement s6=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		s6.clear();
		s6.sendKeys("4");
		WebElement s7=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input"));
		if(!s7.isSelected())
		s7.click();
		WebElement s8=driver.findElement(By.xpath("//*[@id=\"input-theme-6\"]"));
		s8.click();
		WebElement s9=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button"));
		s9.click();
	}
}
