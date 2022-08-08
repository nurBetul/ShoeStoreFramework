package Pages;

import Common.Driver;
import Common.PageBase;
import Utils.SeleniumUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

public class ShoeStoreLanding extends PageBase {
    WebDriver driver = Driver.getDriver();
    protected String goToPageUrl = "https://rb-shoe-store.herokuapp.com/";
    //Constants c = new Constants();
    //SeleniumUtil su = new SeleniumUtil(); Bunlar Base class'ta zaten olusturuldu, tekrara girmissin...

    public boolean goToShoStorePage(){
        su.goToPage(goToPageUrl);
        String currentUrl = driver.getCurrentUrl();
        return Objects.equals(currentUrl, goToPageUrl);
    }
    public String getHomeLabel(){
        //System.out.println("3.test");
        return (driver.findElement(c.homeLabel)).getText();
    }

    public void getTopBarElements(){
        List <WebElement> monthsOnTopBar = su.findElements(c.listOfMonths);
        int count = 0;
        for (WebElement element: monthsOnTopBar) {
            count ++;
            su.highlightElement(element);
        }
        System.out.println("There are " + count + " elements on the top bar");
    }

    public String getRemindMeLabel(){
        String label = (driver.findElement(c.remindMeNEwShoes)).getText();
        return label;
    }

    public void enterEmail(){
        su.click(c.emailAddress);
        su.sendKeys(c.emailAddress, "abc@def.com");
    }

    public void submitEmail(){
        su.click(c.submit);
        su.waitForVisibility(c.emailSubmitMessage);
    }

    public String getEmailSubmitText() {
        return su.findElement(c.emailSubmitMessage).getText();
    }

    public String getPromotionalCodeLabel(){
        return driver.findElement(c.promoCodeLabel).getText();
    }

    public void enterCode(){
        su.click(c.promoCodeTextBox);
        su.sendKeys(c.promoCodeTextBox, "12345");
    }

    public void submitCode (){
        su.click(c.promoCodeSubmit);
        su.waitForVisibility(c.promoAlert);
    }

    public String getWelcomeText(){
        return su.findElement(c.welcomeTitle).getText();
    }

    public String getPreOrderLabel(){
        return su.findElement(c.preOrderLabel).getText();
    }

    public String getChooseABrandLabel(){
        String label = su.findElement(c.chooseABrand).getText();
        return label;
    }

    public void selectBrandByValue(){
        su.click(c.selectList);
        su.selectByValue(c.selectList, "Acorn");
    }

    public void clickSearchButton(){
        su.click(c.searchButton);
    }
}
