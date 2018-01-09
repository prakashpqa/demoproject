package com.prakash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void initBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/prakashp/IdeaProjects/demoproject/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
