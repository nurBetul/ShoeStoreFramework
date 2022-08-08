package Pages;

import org.openqa.selenium.By;

public class Constants {


    protected By homeLabel = By.className("navbar-brand");
    protected By topRedBar = By.id("header_nav");
    protected By listOfMonths = By.cssSelector("ul>li"); //12 months + All Shoes
    protected By remindMeNEwShoes = By.xpath("//label[text() = 'Remind me of new shoes']");
    protected By emailAddress = By.name("email");
    protected By submit = By.id("remind_email_submit");
    protected By promoCodeLabel = By.xpath("//label[text() = 'Promotional Code']");
    protected By promoCodeTextBox = By.name("promo_code");
    protected By promoCodeSubmit = By.id("promo_code_submit");
    protected By promoAlert = By.className("flash alert_danger");
    protected By welcomeTitle = By.xpath("//h2[text() = 'Welcome to Shoe Store!']");
    protected By preOrderLabel = By.xpath("//legend[text() = 'Pre-Order your shoes today']");
    protected By chooseABrand = By.xpath("//label[text() = 'Choose a brand']");
    protected By selectList = By.id("brand");
    protected By searchButton = By.id("search_button");
    protected By emailSubmitMessage = By.id("flash");

}
