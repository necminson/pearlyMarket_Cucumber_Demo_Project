package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.PearlyRegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

public class US_02_StepDefs {

    PearlyRegisterPage pearlyRegisterPage = new PearlyRegisterPage();

    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));
    }
    @Given("user clicks on home page Register button")
    public void user_clicks_on_home_page_register_button() {
        WaitUtils.waitFor(2);
       pearlyRegisterPage.registerButton.click();
    }
    @Given("user enters {string} and {string} and {string}")
    public void user_enters_and_and(String string, String string2, String string3) {
        WaitUtils.waitFor(1);
        pearlyRegisterPage.userNameBox.sendKeys(string);
        WaitUtils.waitFor(1);
        pearlyRegisterPage.regEmailBox.sendKeys(string2);
        WaitUtils.waitFor(1);
       pearlyRegisterPage.password.sendKeys(string3);
    }
    @Given("user clicks the button to aggree the privacy policy")
    public void user_clicks_the_button_to_aggree_the_privacy_policy() {
        WaitUtils.waitFor(1);
        pearlyRegisterPage.registerPolicy.click();
    }
    @Then("click on the Sign Up button to register.")
    public void click_on_the_sign_up_button_to_register() {
        WaitUtils.waitFor(1);
        pearlyRegisterPage.signUpButton.click();
    }
    @Then("verify {string} visible.")
    public void verify_visible(String string) {
        WaitUtils.waitFor(1);

    }
}
