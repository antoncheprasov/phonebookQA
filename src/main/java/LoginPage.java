import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "defaultRegisterFormEmail")
    private WebElement eMailInputField;

    @FindBy(css = "input[formcontrolname='password']")
    private WebElement passwordInputField;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement loginButton;

    @FindBy(id = "error-message")
    private WebElement errorMessage;


    public void enterUsername(String usernameValue) {
        eMailInputField.sendKeys(usernameValue);
    }

    public void enterPassword(String passwordValue) {
        passwordInputField.sendKeys(passwordValue);
    }
    public void clickOnLoginButton(){
        loginButton.click();
    }

    public boolean errorMessageIsDisplayed(){
        return errorMessage.isDisplayed();
    }
    public boolean errorMessageHasText(String expectedText){
        return errorMessage.getText().contains(expectedText);
    }
}
