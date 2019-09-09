package google.com;

import google.com.pages.PageGoogle;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */
public class LoginTest {

    /**
     * Created by Richard Severich on 9/4/2017.
     */
    @Test
    public void loginSuccessfully() {
        final String username = "richard.severich@fundacion-jala.org";
        final String password = "hola123456";
        Assert.assertEquals(PageGoogle.loginAs(username, password).pageTitle(), "Inbox: Todoist");
    }

}
