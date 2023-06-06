package com.example.ice.Day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {
	@SuppressWarnings("deprecation")
	public static void main(String[] arg)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Kishore");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys(" V");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("kishore@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("kishore123");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		WebElement datepick=driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]"));
		js.executeScript("arguments[0].setAttribute('value','10/06/2023')",datepick);
		driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"phone_1665627880\"]")).sendKeys("(323)439-4393");
		driver.findElement(By.xpath("//*[@id=\"country_1665629257\"]")).sendKeys("india");
		driver.findElement(By.xpath("//*[@id=\"phone_1665627865\"]")).sendKeys("(222)222-2222");
		datepick=driver.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]"));
		js.executeScript("arguments[0].setAttribute('value','10/06/2023')",datepick);
		driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Single Room\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665628131_None\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
		driver.close();
	}
}
