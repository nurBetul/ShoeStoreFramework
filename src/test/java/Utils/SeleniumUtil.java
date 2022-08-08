package Utils;

import Common.Driver;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class SeleniumUtil {

    WebDriver driver = Driver.getDriver();

    private final long SHORT_EXPLICIT_WAIT_TIME = 5;
    Actions action = new Actions(Driver.getDriver());

    public void moveToElement(By locator){
        action.moveToElement(findElement(locator)).build();
    }

    public void goToPage(String url){
        driver.get(url);
    }
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }
    public void sendKeys(By locator, String text){
        clear(locator);
        findElement(locator).sendKeys(text);
    }
    public void clear (By locator){
        findElement(locator).clear();
    }
    public void click(By locator){
        findElement(locator).click();
    }
    public String getText(By locator){
        return findElement(locator).getText();
    }
    public boolean isDisplayed(By locator){
        return findElement(locator).isDisplayed();
    }
    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }
    public void waitForVisibility(By locator){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(SHORT_EXPLICIT_WAIT_TIME) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void selectByIndex (By locator, int index){
        Select select = new Select(findElement(locator));
        select.selectByIndex(index);
    }

    public void selectByValue (By locator, String value){
        Select select = new Select(findElement(locator));
        select.selectByValue(value);
    }

    public void highlightElement (By locator){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", findElement(locator));

    }

    public void highlightElement (WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

    }
}
