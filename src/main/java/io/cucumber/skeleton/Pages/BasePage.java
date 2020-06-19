package io.cucumber.skeleton.Pages;


import io.cucumber.skeleton.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    public WebElement findElement(By by){
        return DriverManager.getDriver().findElement(by);
    }
    public List<WebElement> findElements(By by){
        return DriverManager.getDriver().findElements(by);
    }

    public boolean validateElement(By by){
        return !findElements(by).isEmpty();
    }
}
