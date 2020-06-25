package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.Pages.SearchPage;

public class SearchSteps {
    SearchPage searchPage=new SearchPage();

    @When("the user enters {string} request in Search field")
    public void theUserClicksOnTheSearchIcon(String request) {
        searchPage.insertSearchRequest(request);
    }

    @And("filter the search results with {string} param")
    public void filterTheSearchResultsWithBlogParam(String param) {
        searchPage.clickOnMenuItem(param);
    }

    @And("open first link with Open Source")
    public void openFirstLinkWith() throws InterruptedException {
        Thread.sleep(3000);
        searchPage.clickNthLink();
    }

    @Then("the page with {string} is opening")
    public void thePageWithIsOpening(String arg0) {
        System.out.println("finish");
    }
}
