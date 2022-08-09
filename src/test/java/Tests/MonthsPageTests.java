package Tests;

import Common.TestBase;
import Pages.ShoeStoreMonths;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MonthsPageTests extends TestBase {
    ShoeStoreMonths ssm = new ShoeStoreMonths();

    @Test
    public void verifyUserGoToJanuarysPage(){
        ssm.clickJanuary();
        Assert.assertEquals(ssm.getJanuaryPageTitle(), "January's Shoes");
    }

    @Test
    public void verifyUserCanSeeBrands (){
        int num = ssm.getBrandLabels();
        Assert.assertTrue(num>0);
    }

    @Test
    public void verifyUserCanSeeNames(){
        Assert.assertTrue(ssm.getNameLabels()>0);
    }

    @Test
    public void verifyUserCanSeePrices(){
        Assert.assertTrue(ssm.getPriceLabels()>0);
    }

    @Test
    public void verifyUserCanSeeDescriptions(){
        Assert.assertTrue(ssm.getDescriptionLabels()>0);
    }

    @Test
    public void verifyReleaseMonthsAreJanuary(){
        Assert.assertEquals(ssm.getReleaseMonthLabels(), ssm.getJanuaryAsReleaseMonth());

    }





}
