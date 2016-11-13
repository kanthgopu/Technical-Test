package com.capgemini.hotels;

import com.capgemini.hotels.drivers.DriverHelpers;
import cucumber.api.java.Before;
import cucumber.api.java.After;
/**
 * Created by Gopu on 12/11/2016.
 */
public class Hooks {

    DriverHelpers driverHelpers;

    public Hooks(DriverHelpers diDriverHelpers) {
        this.driverHelpers = diDriverHelpers;
    }

    @Before
    public void setUp() {
        driverHelpers.openBrowser().navigateTo().applyImplicitWait().maxWindows();
    }

    @After
    public void tearDown() {
       driverHelpers.closeBrowser();

    }
}
