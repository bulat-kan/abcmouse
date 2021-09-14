package utils.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

public class Helper {
    private static Actions actions = new Actions(DriverManager.getDriver());
    private static JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();

    // checks if elements is clickable and visible before clicking
    public static void mouseClick(WebElement element) {

        new WebDriverWait(DriverManager.getDriver(), 5)
                .until(ExpectedConditions.elementToBeClickable(element));
        Actions actions = new Actions(DriverManager.getDriver());
        actions.click(element).perform();
    }

    // js click
    public static void javascriptClick(WebElement element) {
        new WebDriverWait(DriverManager.getDriver(), 5)
                .until(ExpectedConditions.elementToBeClickable(element));
        js.executeScript("arguments[0].click();", element);
    }

    // highlighter of your demo
    public static void highlightElement(WebElement element) {
        String style = "border: 4px dashed blue";
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, style);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void selectAllCopy() {
        // command +a
        actions.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
        // command + c
        actions.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
    }

    public static void selectAllCut() {
        actions.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
        actions.keyDown(Keys.COMMAND).sendKeys("x").keyUp(Keys.COMMAND).build().perform();
    }

    public static void paste() {
        actions.keyDown(Keys.COMMAND).sendKeys("v").keyDown(Keys.COMMAND).build().perform();
    }

    public static WebDriverWait waitUntil() {
        return new WebDriverWait(DriverManager.getDriver(), 7);
    }

    public static void moveToElement(WebElement element) {
        actions.moveToElement(element).perform();
    }
}
