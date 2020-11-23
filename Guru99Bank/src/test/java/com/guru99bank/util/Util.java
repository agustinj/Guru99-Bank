package com.guru99bank.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

    public static WebDriver driver;

    public static final String FIREFOX_PATH = "C:\\Users\\Me\\Desktop\\NewFirefox\\geckodriver.exe";

    public static final String USER_NAME = "mngr295895";
    public static final String PASSWD = "apyjAva";
    public static final String baseURL = "http://www.demo.guru99.com/V4/";

    public static void launchFirefox() {
        System.setProperty("webdriver.gecko.driver", FIREFOX_PATH);
        driver = new FirefoxDriver();

    }
    
    

}

