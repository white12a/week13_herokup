package login.com.herokuapp.internet_the.testbase;


import login.com.herokuapp.internet_the.PropertyReader.PropertyReader;
import login.com.herokuapp.internet_the.Utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }
}
