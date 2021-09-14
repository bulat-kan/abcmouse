package pages;

import io.github.sukgu.support.ElementFieldDecorator;
import io.github.sukgu.support.FindElementBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;
import utils.helpers.Helper;

public class SubscriptionPage {
    WebDriver driver;

    public SubscriptionPage() {
        this.driver = DriverManager.getDriver();
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(driver));
        // need to use decorator if you want to use @FindElementBy in your PageFactory model.
        PageFactory.initElements(decorator, this);
    }

    @FindElementBy(css = ".page-tag")
    private WebElement h1Member;


    public String getCurrentUrl(){
        Helper.waitUntil().until(ExpectedConditions.urlContains("/subscription"));
        return driver.getCurrentUrl();
    }

    public String getMessage(){
        Helper.highlightElement(h1Member);
        return h1Member.getText();
    }
}
