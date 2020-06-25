package io.cucumber.skeleton.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import java.util.List;

import static java.lang.String.format;

public class SearchPage extends BasePage{
    public static final By SEARCH_ICON=By.cssSelector("[class*='search']");
    public static final By SEARCH_FIELD=By.xpath("//input[@name='search']");
    public static final By OPEN_SOURCE_LINK=By.xpath("//div[@class='section' and text()='Open Source']");
    public static final String LEFT_MENU_SEARCH_PAGE="//div[@class='filter-item-name']";
    public static final String LEFT_MENU_ITEMS_PATTERN="//[contains(text(),'%s')]";
//*[@class='page-header']/*[contains(@class,'title') and contains(text(),'Open Source')]


    public void insertSearchRequest(String request){
        findElement(SEARCH_ICON).click();
        findElement(SEARCH_FIELD).sendKeys(request, Keys.ENTER);
    }
//    public List<WebElement> getSearchMenuAllItems() {
//        return findElements(LEFT_MENU_SEARCH_PAGE);
//    }

    public void clickOnMenuItem(String item) {
        findElement(By.xpath(format(LEFT_MENU_SEARCH_PAGE,LEFT_MENU_ITEMS_PATTERN,item))).click();
    }

    public void clickNthLink(){
        findElement(OPEN_SOURCE_LINK).click();
    }

}
