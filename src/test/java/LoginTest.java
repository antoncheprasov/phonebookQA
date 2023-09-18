
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTest{

    @Test
    public void successLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(app.driver);
        loginPage.enterUsername("test@gmail.com");
        sleep(1000);
        loginPage.enterPassword("test@gmail.com");
        sleep(1000);
        loginPage.clickOnLoginButton();
        sleep(1000);
        ContactPage contactPage = new ContactPage(app.driver);
        sleep(1000);
        assertTrue(contactPage.contactsPageIsDisplayed());
    }

    @Test
    public void loginWithIncorrectEMail() throws InterruptedException {
        LoginPage loginPage = new LoginPage(app.driver);
        loginPage.enterUsername("asgh@gmail.com");
        sleep(1000);
        loginPage.enterPassword("test@gmail.com");
        sleep(1000);
        loginPage.clickOnLoginButton();
        sleep(1000);
        assertTrue(loginPage.errorMessageIsDisplayed());
        sleep(1000);
        assertTrue(loginPage.errorMessageHasText(
                "Please check your activation or Login + Password combination"));
        sleep(1000);
    }

    @Test
    public void loginWithIncorrectPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage(app.driver);
        loginPage.enterUsername("test@gmail.com");
        sleep(1000);
        loginPage.enterPassword("asbfhjkh");
        sleep(1000);
        loginPage.clickOnLoginButton();
        sleep(1000);
        assertTrue(loginPage.errorMessageIsDisplayed());
        sleep(1000);
        assertTrue(loginPage.errorMessageHasText(
                "Please check your activation or Login + Password combination"));
        sleep(1000);
    }
}
