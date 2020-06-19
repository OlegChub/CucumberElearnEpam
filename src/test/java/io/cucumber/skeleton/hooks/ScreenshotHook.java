package io.cucumber.skeleton.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.skeleton.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotHook {
    @After
    public void takeScreenshot(Scenario scenario) {

        byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }
}
