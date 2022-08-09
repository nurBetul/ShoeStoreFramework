package Pages;

import Common.Driver;
import Common.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoeStoreMonths extends PageBase {

    WebDriver driver = Driver.getDriver();

    public void clickJanuary(){
        su.click(c.january);
    }

    public String getJanuaryPageTitle(){
        return su.findElement(c.januarysShoes).getText();
    }

    public int getBrandLabels(){
        List < WebElement> listOfBrand = su.findElements(c.listOfBrand);
        int num = listOfBrand.size();
        System.out.println("There are " + num + " brands on January's Shoes page");
        return num;
    }

    public int getNameLabels(){
        List < WebElement> listOfBrand = su.findElements(c.listOfNames);
        int num = listOfBrand.size();
        System.out.println("There are " + num + " names on January's Shoes page");
        return num;
    }

    public int getPriceLabels(){
        List < WebElement> listOfBrand = su.findElements(c.listOfPrices);
        int num = listOfBrand.size();
        System.out.println("There are " + num + " prices on January's Shoes page");
        return num;
    }

    public int getDescriptionLabels(){
        List < WebElement> listOfBrand = su.findElements(c.listOfDescription);
        int num = listOfBrand.size();
        System.out.println("There are " + num + " descriptions on January's Shoes page");
        return num;
    }

    public int getReleaseMonthLabels(){
        List < WebElement> listOfBrand = su.findElements(c.listOfReleaseMonth);
        int num = listOfBrand.size();
        System.out.println("There are " + num + " release months on January's Shoes page");
        return num;
    }

    public int getJanuaryAsReleaseMonth(){

        List < WebElement> listOfBrand = su.findElements(c.listOfJanuaryLink);
        int num = listOfBrand.size();
        System.out.println("There are " + num + " release months on January's Shoes page");
        return num;

    }




}
