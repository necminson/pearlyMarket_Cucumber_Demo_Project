package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PearlyRegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

public class US_01_StepDefs {
        PearlyRegisterPage pearlyRegisterPage = new PearlyRegisterPage();

    @Given("user is navigates to {string}")
    public void user_is_navigates_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));
    }
    @Given("user clicks on register button")
    public void user_clicks_on_register_button() {
       pearlyRegisterPage.registerButton.click();

    }
    @Given("user enters the username {string}")
    public void user_enters_the_username(String string) {
        WaitUtils.waitFor(2);
        pearlyRegisterPage.userNameBox.sendKeys(string);
    }
    @Given("user enters the email address {string}")
    public void user_enters_the_email_address(String string) {
        WaitUtils.waitFor(2);
        pearlyRegisterPage.regEmailBox.sendKeys(string);
    }
    @Given("user enters the password {string}")
    public void user_enters_the_password(String string) {
        WaitUtils.waitFor(2);
        pearlyRegisterPage.password.sendKeys(string);
    }
    @Given("the I agree to the privacy policy checkbox is checked")
    public void the_i_agree_to_the_privacy_policy_checkbox_is_checked() {
        WaitUtils.waitFor(2);
        pearlyRegisterPage.registerPolicy.click();
    }
    @When("the user clicks on the SIGN UP button")
    public void the_user_clicks_on_the_sign_up_button() {
        WaitUtils.waitFor(2);
        pearlyRegisterPage.signUpButton.click();
    }
    @Then("verify user registered successfully")
    public void verifyUserRegisteredSuccessfully() {
        WaitUtils.waitFor(2);
        ReusableMethods.verifyElementDisplayed(pearlyRegisterPage.signOutButton);
    }
}
