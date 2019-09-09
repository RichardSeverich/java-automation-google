package google.com.pages;

import google.com.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Richard Severich on 9/4/2017.
 */
public abstract class PageBase {

    protected WebDriver webDriver;

    /**
     * This method is the constructor.
     */
    public PageBase() {
        webDriver = DriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }

    /**
     * This method returns the title of page.
     *
     * @return the title of page.
     */
    public String pageTitle() {
        return webDriver.getTitle();
    }

    /**
     * This method load Base Url.
     */
    public void loadUrlPage() {
        webDriver.get(DriverManager.getInstance().getBaseUrl());
    }
}
