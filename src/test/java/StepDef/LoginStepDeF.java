package StepDef;

import LocatorPages.LoginPage;
import Utils.Config;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDeF {

    Driver driver = new Driver();
    LoginPage page = new LoginPage(driver.getDriver());

    @Given("I Navigate To TNB Login Page")
    public void i_navigate_to_tnb_login_page() {

        driver.getDriver().get(Config.getProperty("url"));
    }
    @When("I Enter Username As {string}")
    public void i_enter_username_as(String username) {
        page.username.sendKeys(username);
    }

    @When("I Enter Password As {string}")
    public void i_enter_password_as(String password) {
        page.password.sendKeys(password);
    }

    @When("I Click The Login Button")
    public void i_click_the_login_button() {
        page.LoginButton.click();
    }

    @Then("I Should Log Into The Application Successfully")
    public void i_should_log_into_the_application_successfully() {
        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("homePageTitle"));
        driver.closeDriver();

    }
}
