package org.example;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed
    WebDriver driver;
    @Test
    public void Login()
    {


       driver.findElement(By.name("q")).sendKeys("Hello Appium");



    }
}
