package com.SelenuimHOMEWORKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3Task2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");

        WebElement login = driver.findElement(By.cssSelector("input.button"));
        login.click();

        WebElement display=driver.findElement(By.cssSelector("span#spanMessage"));

        boolean disPlay= display.isDisplayed();
        System.out.println(disPlay);


    }
}
