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

public class ProspectRegisterPage {
    WebDriver driver;

    public ProspectRegisterPage() {
        this.driver = DriverManager.getDriver();
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(driver));
        // need to use decorator if you want to use @FindElementBy in your PageFactory model.
        PageFactory.initElements(decorator, this);
    }

    @FindElementBy(css = "input[placeholder='Email Address']")
    private WebElement txtBxEmail;

    @FindElementBy(css = ".blue.button")
    private WebElement btnSubmit;

    public void submitEmail(String email){
        Helper.highlightElement(txtBxEmail);
        txtBxEmail.sendKeys(email);
        Helper.highlightElement(btnSubmit);
        btnSubmit.click();
    }

    public String getCurrentUrl(){
        Helper.waitUntil().until(ExpectedConditions.urlContains("prospect-register/"));
        return driver.getCurrentUrl();
    }
}
