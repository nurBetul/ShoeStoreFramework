import Common.Driver;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://rb-shoe-store.herokuapp.com/");
    }
}
