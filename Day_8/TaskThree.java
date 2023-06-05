package com.example.ice.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskThree {
	public static void main(String[] arg) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement sendId = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		sendId.sendKeys("401");
		WebElement clkSubmit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		clkSubmit.click();
		driver.switchTo().alert().dismiss();
//		sendId = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		sendId.clear();
		sendId.sendKeys("402");
		clkSubmit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		clkSubmit.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.print("The Displayed Alert Message is "+ driver.switchTo().alert().getText());
	}
}
