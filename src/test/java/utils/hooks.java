package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    @Before
    public void setUp() {
        driverFactory.getDriver();
    }
    @After
    public void tearDown() {
        driverFactory.quitDriver();
    }
}