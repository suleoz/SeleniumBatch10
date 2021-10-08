package com.SelenuimHOMEWORKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        //fill out the form
        //click on register
        //close the browser

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("ButterCup");
        WebElement surname = driver.findElement(By.id("customer.lastName"));
        surname.sendKeys("Power");
        WebElement address = driver.findElement(By.name("customer.address.street"));
        address.sendKeys("107 Pokey Oaks South");
        WebElement city=driver.findElement(By.name("customer.address.city"));
        city.sendKeys("Townsville");
        WebElement state = driver.findElement(By.id("customer.address.state"));
        state.sendKeys("NC");
        WebElement zipCode = driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("33445");
        WebElement phoneN = driver.findElement(By.id("customer.phoneNumber"));
        phoneN.sendKeys("1122334455");
        WebElement ssn = driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("123 456 5678");
        WebElement username = driver.findElement(By.id("customer.username"));
        username.sendKeys("PowerPopGirls");
        WebElement password = driver.findElement(By.id("customer.password"));
        password.sendKeys("trouble");
        WebElement reEnter = driver.findElement(By.id("repeatedPassword"));
        reEnter.sendKeys("trouble");
        Thread.sleep(500);
        WebElement register=driver.findElement(By.className("button"));
        register.click();
        Thread.sleep(2000);
        driver.quit();



    }
}
