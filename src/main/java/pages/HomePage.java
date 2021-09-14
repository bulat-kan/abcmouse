package pages;

import io.github.sukgu.support.ElementFieldDecorator;
import io.github.sukgu.support.FindElementBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import utils.ConfigReader;
import utils.DriverManager;

public class HomePage {
    WebDriver driver;

    private String homeUrl = ConfigReader.getProperty("baseURL");

    @FindElementBy(css = "signup-button[class='header-button abcmouse-sans']")
    private WebElement btnSignUp;


    public HomePage() {
        this.driver = DriverManager.getDriver();
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(driver));
        // need to use decorator if you want to use @FindElementBy in your PageFactory model.
        PageFactory.initElements(decorator, this);
    }

    public void signUP(){
        btnSignUp.click();
    }

    public void navigateToHomePage(){
        driver.get(homeUrl);
    }
}
