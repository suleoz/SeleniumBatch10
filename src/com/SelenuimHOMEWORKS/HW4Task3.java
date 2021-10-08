package com.SelenuimHOMEWORKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW4Task3 {
    //Go to ebay.com
    //get all the categories and print them in the console
    //select Computers/Tables & Networking
    //click on search
    //verify the header
    public static String url = "https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);


        WebElement getAllC = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select = new Select(getAllC);
        List<WebElement> allCatogories = select.getOptions();

        int size = allCatogories.size();

        for (WebElement getThemAll: allCatogories){
            String printText=getThemAll.getText();
            System.out.println(printText);
        }

        select.selectByVisibleText("Computers/Tablets & Networking");


//WebElement getComputerTablets= driver.findElement(By.xpath("//option[text()='Computers/Tablets & Networking']"));
//
//getComputerTablets.click();
        Thread.sleep(500);
        WebElement clickSearch = driver.findElement(By.xpath("//input[@id='gh-btn']"));

        String headerText = clickSearch.getText();

        if(headerText.equalsIgnoreCase("Computers/Tablets & Networking")){
            System.out.println("Header confirmed");
        }else{
            System.out.println("No header");
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
