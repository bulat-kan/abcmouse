package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.drivers.ChromeWebDriver;
import utils.drivers.FirefoxWebDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver;

    private DriverManager() { }

    public static WebDriver getDriver(){
        if(driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "firefox":
                    driver = FirefoxWebDriver.loadDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                    break;
                default:
                    driver = ChromeWebDriver.loadDriver();
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if(driver !=null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

