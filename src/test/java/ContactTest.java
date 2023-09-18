import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class ContactTest extends BaseTest{

    @Test
    public void addingNewContact() throws InterruptedException {
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
        sleep(1000);
        contactPage.clickOnAddNewContactButton();
        sleep(1000);
        contactPage.setEnterFirstName("Anton7777");
        sleep(1000);
        contactPage.setEnterLastName("Ojjjjj");
        sleep(10000);
        contactPage.clickOnSaveButton();
        sleep(1000);
    }

}
