package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class driverFactory {

    private static WebDriver driver;

    private static String speedMode = "very_slow";

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();

            options.addArguments("--incognito");
            options.addArguments("--disable-save-password-bubble");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-translate");
            options.addArguments("disable-features=PasswordManagerOnboarding");
            options.addArguments("disable-features=PasswordImport");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void setSpeed(String mode) {
        speedMode = mode.toLowerCase();
    }

    public static void slow() {
        try {
            switch (speedMode) {
                case "slow":
                    Thread.sleep(500);
                    break;
                case "very_slow":
                    Thread.sleep(1200);
                    break;
                default:
                    break;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
