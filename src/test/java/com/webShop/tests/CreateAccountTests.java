package com.webShop.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegisterPositiveTests(String text) {
        int i = (int) ((System.currentTimeMillis()/1000)%3600);

        click(By.cssSelector("[href='/register']"));

        type(By.name("#FirstName"));

        type("Klein");

        click(By.name("Email"));
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys(text);

        click(By.name("Password"));
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("Abcde!");

        click(By.name("ConfirmPassword"));
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Abcde!");

        click(By.name("register-button"));

        // Assert.assertTrue(isElementPresent(By.xpath("//*[@href='/register']")));
    }

    public void type(String text) {
        click(By.name("#LastName"));
        driver.findElement(By.name("#LastName")).clear();
        driver.findElement(By.name("#LastName")).sendKeys(text);
    }

    public void type(By locator) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys("Jenny");
    }


    public void click(By locator) {
        driver.findElement(locator).click();
    }

}





package com.webShop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegisterPositiveTests() {
        int i = (int) ((System.currentTimeMillis()/1000)%3600);

        driver.findElement(By.cssSelector("[href='/register']")).click();


        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).clear();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Jenny");

        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).clear();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Klein");

        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("jenny.klein001" + i + "@mail.de");;

        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("Abcde!");

        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Abcde!");

        driver.findElement(By.name("register-button")).click();

        Assert.assertTrue(isElementPresent(By.xpath("//*[@href='/register']")));
    }

}

