package google.com.commons;

import google.com.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 */
public final class CommonActions {

    /**
     * This method is a private constructor.
     */
    private CommonActions() {

    }

    /**
     * @param webElement this variable contains a web element.
     * @param content    this variable contains the content.
     */
    public static void setInputField(WebElement webElement, String content) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(content);
    }

    /**
     * @param webElement this variable contains a web element.
     */
    public static void clickButton(WebElement webElement) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }
}
