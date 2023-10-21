package StepDef;

import LocatorPages.HomePageLocators;
import LocatorPages.LoginPage;
import Utils.Config;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOutStepDef {

    Driver driver = new Driver();
    LoginPage loginPage = new LoginPage(driver.getDriver());
    HomePageLocators homepage = new HomePageLocators(driver.getDriver());

    @Given("User log Into The TNB")
    public void user_log_into_the_tnb() {
       driver.getDriver().get(Config.getProperty("url"));
       loginPage.login(Config.getProperty("username"), Config.getProperty("password"));
    }

    @When("User Is On The Home Page")
    public void user_is_on_the_home_page() {
        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("homePageTitle"));

    }
    @When("User Check Log Out Button Is Displayed")
    public void user_check_log_out_button_is_displayed() {
        Assert.assertTrue(homepage.logOutButton.isDisplayed());
    }
    @When("User Click Log Out")
    public void user_click_log_out() {
        homepage.logOutButton.click();
    }
    @Then("User Should Be Successfully Logged Out")
    public void user_should_be_successfully_logged_out() {
        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("MainPageTitle"));
        driver.closeDriver();

    }
}
