package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHW2Class2 {
    public static void main(String[] args) throws InterruptedException {


        /*navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser (edited*/
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Ali");
        driver.findElement(By.name("lastname")).sendKeys("Clay");
        driver.findElement(By.name("reg_email__")).sendKeys("aliclay@gmail.com");

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("aliclay@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("qwert123!@#$");
        driver.findElement(By.id("month")).sendKeys("May");
        driver.findElement(By.id("day")).sendKeys("28");
        Thread.sleep(2000);
        driver.findElement(By.id("year")).sendKeys("1987");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
