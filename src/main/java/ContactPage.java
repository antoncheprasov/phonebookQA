import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage{

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "langSelect")
    private WebElement contactsPage;

    @FindBy(css = "a.nav-link[href='/contacts']")
    private WebElement addNewContact;

    @FindBy(css = "input[formcontrolname='firstName']")
    private WebElement enterFirstName;

    @FindBy(id = "form-lastName")
    private WebElement enterLastName;

    @FindBy(css = "button[type='submit']")
    private WebElement saveButton;

    public boolean contactsPageIsDisplayed() {
        return contactsPage.isDisplayed();
    }

    public void clickOnAddNewContactButton(){
        addNewContact.click();
    }

    public void setEnterFirstName(String firstNameValue) {
        enterFirstName.sendKeys(firstNameValue);
    }

    public void setEnterLastName(String lastNameValue) {
        enterLastName.sendKeys(lastNameValue);
    }

    public void clickOnSaveButton(){
        saveButton.click();
    }
}
