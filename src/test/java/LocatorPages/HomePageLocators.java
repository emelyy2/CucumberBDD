package LocatorPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocators {

    private WebDriver driver;

    public HomePageLocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//button[text()='Add Money to Checking']")
    public WebElement addMoneyToChecking;

    @FindBy(id = "logOut")
    public WebElement logOutButton;


}
