package utils.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class FirefoxWebDriver {

    public static WebDriver loadDriver(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        if(ConfigReader.getProperty("headless").equalsIgnoreCase("true"))
            options.setHeadless(true);

        WebDriver driver =new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

}
