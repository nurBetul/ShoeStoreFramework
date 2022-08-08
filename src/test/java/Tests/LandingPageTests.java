package Tests;

import Common.TestBase;
import Pages.ShoeStoreLanding;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTests extends TestBase {
    ShoeStoreLanding ssl = new ShoeStoreLanding();

    @Test
    public void verifyYouCanNavigateToShoStorePage(){
        System.out.println("1.test");
        Assert.assertTrue(ssl.goToShoStorePage());
    }

    @Test
    public void verifyHomeIsDisplayedOnTheTopLeft(){
        String home = ssl.getHomeLabel();
        Assert.assertEquals(home, "HOME");
    }
}
