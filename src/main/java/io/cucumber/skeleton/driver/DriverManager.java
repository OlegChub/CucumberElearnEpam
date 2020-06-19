package io.cucumber.skeleton.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.chrome.ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;

public class DriverManager {
    private final static String CHROME_DRIVER_PATH = "src\\main\\resources\\chromedriver.exe";
    private final static int IMPLICIT_WAIT_TIMEOUT = 5;
    private final static int PAGE_LOAD_TIMEOUT = 20;
    private static ThreadLocal<WebDriver> ThreadLocal = new ThreadLocal<>();

    private DriverManager() {

    }

    public static void setupDriver() {
        System.setProperty(CHROME_DRIVER_EXE_PROPERTY, CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        ThreadLocal.set(driver);

    }

    public static WebDriver getDriver() {
        return ThreadLocal.get();
    }

    public static void quitDriver() {
        Optional.ofNullable(getDriver()).ifPresent(WebDriver -> {
            WebDriver.quit();
        });
    }
}


