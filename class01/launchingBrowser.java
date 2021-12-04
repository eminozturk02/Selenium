package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class launchingBrowser {
    public static void main(String[] args) {
        //set the path to the driver Executable
        //for windows user will need to type .exe but mac user don't nees to type.exe
        //Error:The driver Executable does not exist:(Refer that the path to your driver is not correct)Check the path
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        //creating an object of chromedriver
        WebDriver driver=new ChromeDriver();

        //calling a method to get to a particular website
        driver.get("https://www.google.com");

        //returns the current url that is loaded in the browser
        String url=driver.getCurrentUrl();
        System.out.println("The current url loaded in the browser is: "+url);

        //returns the title of loaded page
        String title=driver.getTitle();
        System.out.println("The current title of the page is: "+title);

        //close the browser
        driver.quit();
    }
}
