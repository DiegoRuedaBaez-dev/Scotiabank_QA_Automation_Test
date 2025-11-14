package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    @Before
    public void setUp() {
        driverFactory.getDriver().get("https://www.saucedemo.com/");
    }
    @After
    public void tearDown() {
        driverFactory.quitDriver();
    }
}