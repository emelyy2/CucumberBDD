package StepDef;

import LocatorPages.HomePageLocators;
import LocatorPages.LoginPage;
import Utils.Config;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageDef {
    Driver driver = new Driver();
    LoginPage loginPage = new LoginPage(driver.getDriver());
    HomePageLocators homepage = new HomePageLocators(driver.getDriver());

    @Given("I log Into The TNB")
    public void i_log_into_the_tnb() {
     driver.getDriver().get(Config.getProperty("url"));
     loginPage.username.sendKeys(Config.getProperty("username"));
     loginPage.password.sendKeys(Config.getProperty("password"));
     loginPage.LoginButton.click();
    }
    @When("I Am On The Home Page")
    public void i_am_on_the_home_page() {
        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("homePageTitle"));
    }
    @Then("I Should See Add Money Button Is Displayed")
    public void i_should_see_add_money_button_is_displayed() {
        Assert.assertTrue(homepage.addMoneyToChecking.isDisplayed());
        driver.closeDriver();
    }

}
