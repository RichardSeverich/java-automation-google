package google.com.pages;

import google.com.commons.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Richard Severich on 9/4/2017.
 */
public class PageGoogle extends PageBase {

    @FindBy(css = "div input")
    private WebElement inputSearch;

    @FindBy(css = "form[id='login_form'] input[id='email']")
    private WebElement userTexBox;

    @FindBy(css = "form[id='login_form'] input[id='password']")
    private WebElement passwordTexBox;

    @FindBy(css = "a[class='submit_btn amibutton amibutton_red sel_login']")
    private WebElement loginButton;

    //@FindBy(name = "GB_frame")
    @FindBy(css = "iframe[name='GB_frame']")
    private WebElement iFrameOne;

    //@FindBy(id = "GB_frame")
    @FindBy(css = "iframe[id='GB_frame']")
    private WebElement iFrameTwo;


    @FindBy(css = "form[id='login_form'] input[id='password']")
    private WebElement frame;

    /**
     * @param user this variable contains the user name.
     * @param pass this varialbe contains the password.
     * @return the Homepage Instance.
     */
    public static PageHome loginAs(String user, String pass) {
        PageGoogle pageGoogle = new PageGoogle();
        pageGoogle.loadUrl();
        pageGoogle.switchIFrame();
        pageGoogle.setPasswordTexBox(pass);
        pageGoogle.clickLogIntButton();
        return new PageHome();
    }

    /**
     *
     */
    private void switchIFrame() {
        webDriver.switchTo().frame(iFrameOne).switchTo().frame(iFrameTwo);
    }

    /**
     *
     */
    private void loadUrl() {
        loadUrlPage();
    }

    /**
     *
     */
    private void clickLogIntButton() {
        CommonActions.clickButton(loginButton);

    }

    /**
     * @param searchCriteria this variable contains the username.
     */
    private void setInputSearch(String searchCriteria) {
        CommonActions.setInputField(inputSearch, searchCriteria);
    }

    /**
     * @param password this variable contains the password.
     */
    private void setPasswordTexBox(String password) {
        CommonActions.setInputField(passwordTexBox, password);
    }
}
