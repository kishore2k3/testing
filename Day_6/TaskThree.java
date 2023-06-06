package com.example.ice.Day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskThree {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("kishore@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("kishore123");
	    WebElement computerAcc=driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Keyboard\"]"));
	    computerAcc.click();
	    boolean b=computerAcc.isEnabled();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	  	js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
		driver.close();
		System.out.println("The Check is selected = "+b);
	}
}
