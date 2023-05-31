package com.example.ice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskOne 
{
    public static void main( String[] args ) throws InterruptedException
    {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Kishore");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(" V");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727821tuic017@skct.edu.in");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("kishore123");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
    }
}
