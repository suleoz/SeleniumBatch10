package com.SelenuimHOMEWORKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW9 {

    //HW
    //Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    //click on leave
    //click on leave list
    //choose from "From calendar"
    //choose from "To calendar"
    //click only on cancelled and rejected checkboxes
    //uncheck Pending Approval
    //select IT support from DD
    //click search
    //quit the browser

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement clickLogin = driver.findElement(By.id("btnLogin"));
        clickLogin.click();


        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();

        WebElement leaveListButton = driver.findElement(By.id("menu_leave_viewLeaveList"));
        leaveListButton.click();

        WebElement calFromDate= driver.findElement(By.id("calFromDate"));
        calFromDate.click();
//        calFromDate.clear();
//        calFromDate.sendKeys("2021-10-28"); ==> bu da calisir

        WebElement monthDD= driver.findElement(By.className("ui-datepicker-month"));
        Select select=new Select(monthDD);
        select.selectByVisibleText("Mar");


        List<WebElement> fromDates= driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement fromDate:fromDates) {

            if (fromDate.getText().equals("14")) {
                fromDate.click();
                break;
            }
        }


        WebElement toMonthCal= driver.findElement(By.id("calToDate"));
        toMonthCal.click();
        WebElement toMonth= driver.findElement(By.className("ui-datepicker-month"));
        Select select1=new Select(toMonth);
        select1.selectByVisibleText("Sep");

        List<WebElement>toDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement toDate:toDates){
            if(toDate.getText().equals("10")){
                toDate.click();
                break;
            }
        }

        WebElement checkBox1= driver.findElement(By.xpath("//input[@value='-1']"));
        checkBox1.click();
        WebElement checkBox2=driver.findElement(By.xpath("//input[@value='0']"));
        checkBox2.click();
        WebElement checkBox3= driver.findElement(By.xpath("//input[@value='1']"));
        checkBox3.click();


//List<WebElement> checkBoxes= driver.findElements(By.id("leaveList_chkSearchFilter_checkboxgroup"));
//        for(WebElement checkBox:checkBoxes){
//            String checkTextes= checkBox.getText();
//            if(checkTextes.contains("Rejected")|| checkTextes.contains("Cancelled")){
//                checkBox.click();
//            }
//
//            if (checkTextes.contains("Pending Approval")){
//                checkBox.click();
//
//            }
//
//        }
        Thread.sleep(3000);
       WebElement selectDD= driver.findElement(By.id("leaveList_cmbSubunit"));
        Select select2=new Select(selectDD);

        select2.selectByVisibleText("IT Support");

WebElement searchButton=driver.findElement(By.xpath("//input[@name='btnSearch']"));
searchButton.click();
        Thread.sleep(2000);

driver.quit();

        }
}
