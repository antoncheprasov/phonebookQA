import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static ApplicationManager app = new ApplicationManager();


    @BeforeMethod
    public void setupTest(){
        app.init();
    }

   @AfterMethod
    public void tearDown(){
        app.stop();
    }


}

