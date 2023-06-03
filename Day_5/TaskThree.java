package com.example.ice.Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskThree {
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		WebElement clk=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
		clk.click();
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		List<WebElement> ele=driver.findElements(By.xpath("//h2[@class='product-title']"));
		System.out.println(ele.size());
		Thread.sleep(2000);
		for(WebElement k:ele)
		{
			System.out.println(k.getText());
		}
		driver.close();
	}
}
