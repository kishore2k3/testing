package com.example.ice.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFive {
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		WebDriver driver2 = new EdgeDriver();
		WebDriver driver3 = new EdgeDriver();
		driver1.get("https://www.google.com/");
		driver2.get("https://www.google.com/");
		driver3.get("https://www.google.com/");
		driver1.manage().window().maximize();
		driver2.manage().window().maximize();
		driver3.manage().window().maximize();
		WebElement apple = driver1.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		apple.sendKeys("Apple");
		apple.sendKeys(Keys.ENTER);
		WebElement selenium = driver2.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		selenium.sendKeys("selenium");
		selenium.sendKeys(Keys.ENTER);
		WebElement cucumber = driver3.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		cucumber.sendKeys("cucumber");
		cucumber.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String id1 = driver1.getWindowHandle();
		String id2 = driver2.getWindowHandle();
		String id3 = driver3.getWindowHandle();
		String title1 = driver1.getTitle();
		String title2 = driver2.getTitle();
		String title3 = driver3.getTitle();
		System.out.println("Browser 1 id ="+id1);
		System.out.println("Browser 2 id ="+id2);
		System.out.println("Browser 3 id ="+id3);
		System.out.println(title1);
		System.out.println(title2);
		System.out.println(title3);
	}
}
