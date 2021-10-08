package com.SelenuimHOMEWORKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW3Task3 {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        List<WebElement> allLinks =driver.findElements(By.tagName("a"));
        System.out.println("Number of links "+ allLinks.size());

       for(WebElement getlinks: allLinks){

           String linkText= getlinks.getText();
           String links=getlinks.getAttribute("href");
           if(!linkText.isEmpty()) {
               System.out.println(linkText + "      " + links);
           }
       }


    }
}
