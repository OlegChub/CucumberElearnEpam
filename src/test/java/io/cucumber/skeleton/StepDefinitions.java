package io.cucumber.skeleton;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.Pages.DocsPage;
import io.cucumber.skeleton.Pages.HomePage;
import org.junit.Assert;

public class StepDefinitions {
    private HomePage homePage = new HomePage();
    private DocsPage docsPage = new DocsPage();

    @When("user enter the site")
    public void openCucumberSite() {
        homePage.openCucumberSite();
    }

    @When("the user clicks on the {string} section")
    public void clickOnSection(String section) {
        homePage.menuSection(section).click();
    }

    @When("the user clicks on the {string} item")
    public void clickOnMenuItem(String item) {
        homePage.menuItem(item).click();
    }

    @Then("the page with {string} in the title is displayed")
    public void verifyPageTitle(String pageTitle) {
        Assert.assertTrue(docsPage.pageIsDisplayed(pageTitle));
    }
}

