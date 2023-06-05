package com.example.ice.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFour {
	public static void main(String[] arg) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		WebElement sendFrom = driver.findElement(By.xpath("//*[@id=\"source\"]"));
		sendFrom.sendKeys("Coimbatore");
		WebElement sendTo = driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		sendTo.sendKeys("Theni");
		WebElement datepick = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','10/06/2023')",datepick);
	}
}
