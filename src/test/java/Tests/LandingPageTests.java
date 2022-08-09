package Tests;

import Common.TestBase;
import Pages.ShoeStoreLanding;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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

    @Test
    public void verifyUserCanGetTopBarElements(){
        List<WebElement> topBar = ssl.getTopBarElements();
        int months = topBar.size();
        Assert.assertEquals(months, 13);
        // there are 12 months and All Shoes section

    }

    @Test
    public void verifyUserCanSeeRemindMeLabel(){
        Assert.assertEquals(ssl.getRemindMeLabel(), "Remind me of new shoes");
    }

    @Test
    public void verifyUserCanEnterEmail(){
        ssl.enterEmail();
        ssl.submitEmail();
        Assert.assertEquals(ssl.getEmailSubmitText(), "Thanks! We will notify you of our new shoes at this email: abc@def.com");
    }

    @Test
    public void verifyUserCanSeePromotionalCodeLabel(){
        Assert.assertEquals(ssl.getPromotionalCodeLabel(), "Promotional Code");
    }

    @Test
    public void verifyUserCanGetPromotionalCodeAcceptedWarning(){
        ssl.enterCode();
        ssl.submitCode();
        Assert.assertNotEquals(ssl.getPromotionalCodeWarning(), "Invalid code format");
        //This test will fail because all promotional code versions give the same warning message

    }

    @Test
    public void verifyUserCanSeeWelcomeText(){
        Assert.assertEquals(ssl.getWelcomeText(), "Welcome to Shoe Store!");
    }

    @Test
    public void verifyUserCanSeePreOrderLabel(){
        Assert.assertEquals(ssl.getPreOrderLabel(), "Pre-Order your shoes today");
    }

    @Test
    public void verifyUserCanSeeChooseABrandText(){
        Assert.assertEquals(ssl.getChooseABrandLabel(), "Choose a brand");
    }

    @Test
    public void verifyIfUserCanSelectBrandByValue(){
        ssl.selectBrandByValue();
        ssl.clickSearchButton();
        Assert.assertEquals(ssl.getPageTitle(), "Acorn's Shoes");
    }
}
