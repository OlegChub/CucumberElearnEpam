package io.cucumber.skeleton.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.skeleton.driver.DriverManager;

public class CucumberHooks {
    @Before
    public void setupDriver(){
        DriverManager.setupDriver();
    }

    @After
    public void quitDriver(){
        DriverManager.quitDriver();
    }
}
