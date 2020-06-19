package io.cucumber.skeleton.Pages;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class DocsPage extends BasePage {
    public static final String PAGE_TITLE_PATTERN="//*[@class='page-header']/*[contains(@class,'title') and contains(text(),'%s')]";

    public boolean pageIsDisplayed(String title){
        return validateElement(By.xpath(format(PAGE_TITLE_PATTERN,title)));
    }

}
