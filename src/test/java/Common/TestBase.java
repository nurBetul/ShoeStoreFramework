package Common;

import Pages.ShoeStoreLanding;
import Utils.SeleniumUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase extends Base {

    @BeforeSuite
    public void beforeSuite(){
        Driver.setUpDriver();
        //Driver.getDriver().manage().window().maximize();
        //Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void beforeMethod() throws IOException {
        Driver.getDriver();
        Driver.getDriver().manage().window().maximize();
        //String url = "https://rb-shoe-store.herokuapp.com/";
        //Driver.getDriver().get(url);

    }

    @AfterMethod
    public void afterMethod(){
        Driver.closeDriver();

    }

    @AfterSuite
    public void afterSuite(){
        Driver.quitDriver();
    }

}
