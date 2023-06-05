package com.example.ice.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskOne {
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions ac = new Actions(driver);
		ac.clickAndHold(drag).release(drop).build().perform();
		Thread.sleep(2000);
		driver.close();
	}
}
