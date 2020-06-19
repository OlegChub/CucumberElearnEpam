package io.cucumber.skeleton.Pages;

import io.cucumber.skeleton.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.String.format;

public class HomePage extends BasePage {
    public static final String HOME_URL="https://cucumber.io/";
    public static final String TEXT_PATTERN="%s[contains(text(),'%s')]";
    public static final String MENU_SECTION="//*[contains(@class,'nav-link')]";
    public static final String CHILD_MENU_ITEM="//*[contains(@class,'dropdown')]//*[contains(@class,'item')]";

    public void openCucumberSite(){
        DriverManager.getDriver().get(HOME_URL);
    }
    public WebElement menuSection(String linkText){
        return findElement(By.xpath(format(TEXT_PATTERN,MENU_SECTION,linkText)));
    }
    public WebElement menuItem(String linkText){
        return findElement(By.xpath(format(TEXT_PATTERN,CHILD_MENU_ITEM,linkText)));
    }
}
