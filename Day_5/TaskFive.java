package com.example.ice.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFive {
	public static void main(String[] arg)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		WebElement clkSuperAdmin = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]"));
		clkSuperAdmin.click();
		WebElement clkSignin = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button"));
		clkSignin.click();
		String textName = driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span")).getText();
		System.out.print(textName);
		String tagName = driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span")).getTagName();
		System.out.print(tagName);
//		System.out.print(driver.findElement(By.xpath("//*[@id=\"search-btn\"]")).getSize());
////		System.out.print(driver.findElement(By.xpath("//*[@id=\"search-btn\"]")).getCssValue("")
	}
}
