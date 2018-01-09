package com.prakash;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class GoogleTest extends TestBase {

    @Test
    public void testCase1(){
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed());
    }

    @Test
    public void testCase2(){
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).isDisplayed());
    }

}
