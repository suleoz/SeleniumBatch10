package com.SelenuimHOMEWORKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW7Task1 {

    //Go to https://demoqa.com/browser-windows
    //click on New Tab and print the text from new tab in the console
    //click on New Window and print the text from new window in the console
    //click on New Window Message and print the text from new window in the console
    //Verify the title is displayed
    //Print out the title of the all pages


    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPage = driver.getWindowHandle();

        WebElement newTab = driver.findElement(By.id("tabButton"));
        newTab.click();
        System.out.println(newTab.getText());

        WebElement newWindow = driver.findElement(By.id("windowButton"));
        newWindow.click();
        System.out.println(newWindow.getText());

        WebElement newMessage = driver.findElement(By.id("messageWindowButton"));
        newMessage.click();
        System.out.println(newMessage.getText());

        Set<String> getAll= driver.getWindowHandles();





    }
}
