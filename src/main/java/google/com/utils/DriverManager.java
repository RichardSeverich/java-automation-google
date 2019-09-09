package google.com.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Richard Severich on 9/4/2017.
 */
public final class DriverManager {
    private static final String BASE_URL = "https://google.com/";
    private static final String CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String CHROME_DRIVER_PATH = "drivers/chromedriver.exe";

    private static DriverManager instance;
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    /**
     *
     */
    private DriverManager() {
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_PATH);
        webDriver = new ChromeDriver();
        setWait();
    }

    /**
     * @return the singleton instance.
     */
    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    /**
     * @return the base url.
     */
    public String getBaseUrl() {
        return BASE_URL;
    }

    /**
     * @return the web driver.
     */
    public WebDriver getWebDriver() {
        return webDriver;
    }

    /**
     * @return the we driver waint.
     */
    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }

    /**
     * @param implicitTimeWait this variable contains implicit time wait.
     */
    public void setImplicitTimeWait(int implicitTimeWait) {
        webDriver.manage().timeouts().implicitlyWait(implicitTimeWait, TimeUnit.SECONDS);
    }

    /**
     * @param explicitTimeWait this variable contains explicit time wait
     */
    public void setExplicitTimeWait(int explicitTimeWait) {
        webDriverWait = new WebDriverWait(webDriver, explicitTimeWait);
    }

    /**
     * this method  set wait.
     */
    public void setWait() {
        final int implicitTimeWait = 15;
        final int explicitTimeWait = 30;
        setImplicitTimeWait(implicitTimeWait);
        setExplicitTimeWait(explicitTimeWait);
    }
}
