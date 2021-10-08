package com.SelenuimHOMEWORKS;

import com.Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW08Task1 {
    //HW
    //
    //go to https://the-internet.herokuapp.com/dynamic_controls
    //click on checkbox and click on remove
    //verify the text
    //click on enable verify the textbox is enabled
    //enter text and click disable
    //verify the textbox is disabled

    public static void main(String[] args) throws InterruptedException {

        CommonMethods.setUp("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkbox = CommonMethods.driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        WebElement remove = CommonMethods.driver.findElement(By.xpath("//button[text()='Remove']"));
        remove.click();
        Thread.sleep(3000);
        WebElement text = CommonMethods.driver.findElement(By.xpath("//p[@id='message']"));
//        text.isDisplayed();
        System.out.println(text.getText());
        System.out.println(text.isDisplayed());

        WebElement enableButton = CommonMethods.driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButton.click();
        Thread.sleep(3000);
        WebElement textbox = CommonMethods.driver.findElement(By.xpath("//input[@type='text']"));

        textbox.isEnabled();
        System.out.println(textbox.isEnabled());
        textbox.sendKeys("hello world");
        WebElement disabledButton = CommonMethods.driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        Thread.sleep(2000);
        disabledButton.click();
        Thread.sleep(3000);
        textbox.isEnabled();
        System.out.println(textbox.isEnabled());
        Thread.sleep(2000);
        WebElement textEnable = CommonMethods.driver.findElement(By.xpath("//p[@id='message']"));
        textEnable.isEnabled();
        System.out.println(textEnable.isDisplayed());


        CommonMethods.close();
    }
}
