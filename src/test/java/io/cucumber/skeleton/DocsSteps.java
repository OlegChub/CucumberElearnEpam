package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.skeleton.Pages.DocsPage;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DocsSteps {
    DocsPage docsPage = new DocsPage();

    @Then("there are {int} menu items in the left-side menu")
    public void getLeftMenuItemsQuantity(int expectedSize) {
        assertThat(docsPage.getMenuItemTitles()).
                as("Quantity is not as expected").
                hasSize(expectedSize);
    }

    @And("left-side menu contains next items")
    public void validateMenuItemsTitles(List<String> expectedTitles) {
        assertThat(docsPage.getMenuItemTitles()).
                extracting(WebElement::getText).
                as("Some of left-side menu items are not present").
                containsAll(expectedTitles);
    }
}
