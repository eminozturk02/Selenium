package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHWClass2 {
    /*HW1
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser*/
    public static void main(String[] args) throws InterruptedException{


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.firstName")).sendKeys("Mohammad");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Ozturk");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Houston St");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Plano");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.state")).sendKeys("TX");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("75081");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("(695) 897-9803");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.ssn")).sendKeys("123-56-3547");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.username")).sendKeys("Ozmoz123");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.password")).sendKeys("Wert1234$%^&");
        Thread.sleep(2000);
        driver.findElement(By.id("repeatedPassword")).sendKeys( "Wert1234$%^&");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Register")).click();
        driver.quit();
    }
}
