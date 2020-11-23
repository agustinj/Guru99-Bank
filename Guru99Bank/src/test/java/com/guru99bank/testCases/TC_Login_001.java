package com.guru99bank.testCases;

import com.guru99bank.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Login_001 extends Util {

    public static void main(String[] args) {

        launchFirefox();

        driver.get(baseURL);

        WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
        
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.name("uid")));
        driver.findElement(By.name("uid")).sendKeys(USER_NAME);
        //   WebElement userID = driver.findElement(By.name("uid"));
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.name("password")).sendKeys(PASSWD);
//        WebElement password = driver.findElement(By.name("password"));
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnLogin")));
        driver.findElement(By.name("btnLogin")).click();
//        WebElement loginButton = driver.findElement(By.name("btnLogin"));

        //       userID.sendKeys(USER_NAME);
        //       password.sendKeys(PASSWD);
        //       loginButton.click();

//        WebElement element = driver.findElement(By.className("heading3"));
        String loginTitle = "Welcome To Manager's Page of Guru99 Bank";

        if (driver.getPageSource().contains(loginTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();
    }
}

