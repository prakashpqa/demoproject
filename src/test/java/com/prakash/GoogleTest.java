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

}
