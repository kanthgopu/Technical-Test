package com.capgemini.hotels.drivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Gopu on 12/11/2016.
 */
public class DriverHelpers {
    public static WebDriver driver;
    public String browser=System.getProperty("browser");
    public String url = System.getProperty("url");

    public DriverHelpers openBrowser() {
        switch (browser) {
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            case "ie":
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
        }
        return this;
    }

    public DriverHelpers navigateTo() {
        driver.get(url);
        return this;
    }

    public DriverHelpers maxWindows() {
        driver.manage().window().maximize();
        return this;
    }

    public DriverHelpers applyImplicitWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return this;
    }

    public void closeBrowser() {
        driver.quit();
    }
}
