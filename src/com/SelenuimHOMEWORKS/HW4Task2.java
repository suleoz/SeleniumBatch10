package com.SelenuimHOMEWORKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4Task2 {
    public static String url="https://www.facebook.com/";

    //Go to facebook sign up page
    //Fill out the whole form
    //Click signup

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createNewA = driver.findElement(By.xpath("//a[text()='Create New Account']"));
        createNewA.click();
        Thread.sleep(1000);

WebElement firstName=driver.findElement(By.name("firstname"));
firstName.sendKeys("Mustafa");
Thread.sleep(1000);
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Ata");
        Thread.sleep(1000);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("atamizindeyiz@gmail.com");
        Thread.sleep(1000);

        WebElement reEnteremail=driver.findElement(By.name("reg_email_confirmation__"));
        reEnteremail.sendKeys("atamizindeyiz@gmail.com");
        Thread.sleep(1000);

        WebElement password=driver.findElement(By.xpath("//input[@id='password_step_input']"));
        password.sendKeys("cumhuriyet");
        Thread.sleep(1000);
        WebElement selectMonth = driver.findElement(By.xpath("//option[text()='Oct']"));
        selectMonth.click();

        WebElement selectDay = driver.findElement(By.xpath("//option[text()='29']"));
        selectDay.click();
        Thread.sleep(1000);
        WebElement selectYear = driver.findElement(By.xpath("//option[text()='1923']"));
        selectYear.click();

        WebElement gender= driver.findElement(By.xpath("//label[text()='Male']"));
        gender.click();

        Thread.sleep(2000);


        driver.quit();






    }
    }
