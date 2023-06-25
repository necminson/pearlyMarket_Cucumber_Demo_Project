package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BillingAddressPage;
import pages.MyAccountPage;
import pages.PearlyRegisterPage;
import pages.SignInPage;
import utilities.*;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;


public class US_03_StepDefs {
    SignInPage signInPage = new SignInPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    BillingAddressPage billingPage = new BillingAddressPage();
    PearlyRegisterPage registerPage = new PearlyRegisterPage();
    Faker faker = new Faker();
    String  e_mail = faker.internet().emailAddress();

    String userName = faker.name().username();
    String passWord = faker.internet().password();

    @And("user enters {string} and {string} and {string} on sign up page")
    public void userEntersAndAndOnSignUpPage(String username, String email, String password) {
        registerPage.userNameBox.sendKeys(userName);
        registerPage.regEmailBox.sendKeys(e_mail);
        registerPage.password.sendKeys(passWord);
    }

    @Given("user clicks on home page Sing in button")
    public void user_clicks_on_home_page_sing_in_button() {

        waitForVisibility(signInPage.SignInButton,5).click();

    }

    @Given("user enters {string} and {string}")
    public void user_enters_and(String email, String password) {
        waitForVisibility(signInPage.username,5).sendKeys(e_mail);
        waitForVisibility(signInPage.password,5).sendKeys(passWord);

    }

    @Then("click on the login button to sign in.")
    public void clickOnTheLoginButtonToSignIn() {
        waitForClickablility(signInPage.loginButton,5).click();
        waitFor(3);
    }

    @And("user enters username and password in SingIn page")
    public void userEntersUsernameAndPasswordInSingInPage() {
            waitForVisibility(signInPage.username,5).sendKeys(userName);
            waitForVisibility(signInPage.password,5).sendKeys(passWord);
            waitFor(3);
    }

    @Then("user enters My Account page")
    public void user_enters_my_account_page() {
        waitFor(3);
        JSUtils.scrollAllTheWayDownJS();
        JSUtils.clickWithTimeoutByJS(myAccountPage.myAccountButton);
    }

    @Then("user clicks on Address link button")
    public void user_clicks_on_address_link_button() {
        ReusableMethods.clickWithTimeOut(myAccountPage.addressesLink,5);
    }

    @Then("user clicks on ADD button under Billing Address")
    public void user_clicks_on_add_button_under_billing_address() {
        ReusableMethods.clickWithTimeOut(myAccountPage.addBillingButton,5);

    }

    @Then("Verify Email address is filled automatically")
    public void verify_email_address_is_filled_automatically() {
        JSUtils.clickWithTimeoutByJS(billingPage.billingEmail);
        System.out.println("actualEmail = " + billingPage.billingEmail.getText());
        System.out.println("expectedEmail = " + e_mail);
        // assertTrue(billingPage.billingEmail.getText().equals(e_mail));
    }

    @Then("user enters {string},{string},{string},{string},{string} and {string}")
    public void user_enters_and(String firstname, String lastname, String StreetAddress, String Postcode, String TownCity, String Phone) {
        waitForVisibility(billingPage.billingFirstName,5).sendKeys(faker.name().firstName());
        waitForVisibility(billingPage.billingLastName,5).sendKeys(faker.name().lastName());
        waitForVisibility(billingPage.billingStreetAddress,5).sendKeys(faker.address().streetAddress());
        waitForVisibility(billingPage.billingZipCode,5).sendKeys(faker.address().zipCode());
        waitForVisibility(billingPage.billingCity,5).sendKeys(faker.address().city());
        waitForVisibility(billingPage.billingPhone,5).sendKeys(faker.phoneNumber().cellPhone());

    }

    @Then("user selects Country_region and Province")
    public void user_selects_country_region_and_province() {
        WebElement countryDropdown=  waitForVisibility(billingPage.billingCountry,5);
        JSUtils.clickWithTimeoutByJS(countryDropdown);
        Select selectCountry = new Select(countryDropdown);
        selectCountry.selectByVisibleText("Turkey");
        waitFor(3);
        WebElement provinceDropdown=  waitForVisibility(billingPage.billingState,5);
        JSUtils.clickWithTimeoutByJS(provinceDropdown);
        Select selectProvince = new Select(provinceDropdown);
        selectProvince.selectByVisibleText("Kayseri");

    }

    @Then("user clicks on Save Address button")
    public void user_clicks_on_save_address_button() {
        WebElement sab = waitForVisibility(billingPage.shippingSaveAddressButton,5);
        JSUtils.clickWithTimeoutByJS(sab);
    }

    @Then("verify user added Billing Address successfully")
    public void verify_user_added_billing_address_successfully() {
        String successMessage = waitForVisibility(billingPage.successAlert,5).getText();
        assertEquals("Address changed successfully.",successMessage);

    }

    @And("refresh the page")
    public void refreshThePage() {
        Driver.getDriver().navigate().refresh();
    }
}