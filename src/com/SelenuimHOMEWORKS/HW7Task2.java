package com.SelenuimHOMEWORKS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW7Task2 {

    //navigate to http://www.uitestpractice.com/Students/Contact
    //click on the link
    //get text
    //print out in the console

    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

String text= driver.getTitle();
        System.out.println(text);

    }
}