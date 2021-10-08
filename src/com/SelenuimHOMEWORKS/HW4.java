package com.SelenuimHOMEWORKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW4 {

    //TC 1: Facebook dropdown verification
    //Open chrome browser
    //Go to "https://www.facebook.com"
    //click on create new account
    //Verify:
    //month dd has 12 month options
    //day dd has 31 day options
    //year dd has 115 year options
    //Select your date of birth
    //Quit browser
    //

    public static String url="https://www.facebook.com/";


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement createNewA= driver.findElement(By.xpath("//a[text()='Create New Account']"));
        createNewA.click();
        Thread.sleep(1000);
        WebElement monthCheck= driver.findElement(By.id("month"));

        Select select =new Select(monthCheck);

        List<WebElement>allmonths= select.getOptions();
        int size= allmonths.size();
        System.out.println(size);

        WebElement dayCheck= driver.findElement(By.id("day"));
        Select select1=new Select(dayCheck);

        List<WebElement>alldays=select1.getOptions();
        int sizeD=alldays.size();
        System.out.println(sizeD);


        WebElement yearCheck= driver.findElement(By.id("year"));
        Select select2=new Select(yearCheck);

        List<WebElement>allyears=select2.getOptions();
        int sizeY= allyears.size();
        System.out.println(sizeY);


        WebElement selectMonth= driver.findElement(By.xpath("//option[text()='Oct']"));
        selectMonth.click();

        WebElement selectDay= driver.findElement(By.xpath("//option[text()='29']"));
        selectDay.click();

        WebElement selectYear= driver.findElement(By.xpath("//option[text()='1923']"));
        selectYear.click();

        Thread.sleep(2000);


        driver.quit();






    }

}
