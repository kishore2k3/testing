package com.example.ice.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskOne {
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		String verifyTitle="Home";
		if(verifyTitle.equals(title))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		WebElement cloth=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
		cloth.click();
		Thread.sleep(1000);
		verifyTitle="Shop";
		title=driver.getTitle();
		driver.close();
		if(verifyTitle.equals(title))
		{
			System.out.print(true);
		}
		else
		{
			System.out.print(false);
		}
	}
}
