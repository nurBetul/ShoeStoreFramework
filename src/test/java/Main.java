import Common.Driver;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("http://www.google.com/");
    }
}
