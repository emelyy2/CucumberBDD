package LocatorPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    //LoginPage page = new LoginPage(driver);

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "UserName")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-btn")
    public WebElement LoginButton;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.LoginButton.click();


    }
}


