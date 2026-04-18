package com.webShop.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegisterPositiveTests() {
        int i = (int) ((System.currentTimeMillis() / 1000) % 3600);

        driver.findElement(By.cssSelector("[href='/register']")).click();


        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).clear();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Jenny");

        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).clear();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Klein");

        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("jenny.klein001" + i + "@mail.de");
        ;

        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("Abcde!");

        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Abcde!");

        driver.findElement(By.name("register-button")).click();

       // Assert.assertTrue(isAlertPresent());
    }

    //private boolean isAlertPresent() {
    //    Alert alert = new WebDriverWait(driver, Duration.ofSeconds(20))
      //          .until(ExpectedConditions.alertIsPresent());
    //    if (alert == null) {
    //        return false;
     //   }
     //   return true;}


}
