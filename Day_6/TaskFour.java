package com.example.ice.Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFour {
public static void main(String args[])throws InterruptedException{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))).click();
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		String a;
		String actualURL=driver.getCurrentUrl();
		if(actualURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
		{
			a = "The User is logged in";
		}
		else
			a = "The User is not logged in";
		driver.quit();
		System.out.println(a);
		}
}
