package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.*;

public class US_04_StepDefs {

    SignInPage signInPage = new SignInPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    BillingAddressPage billingPage = new BillingAddressPage();

    ShippingAddressPage shippingPage = new ShippingAddressPage();
    PearlyRegisterPage registerPage = new PearlyRegisterPage();
    Faker faker = new Faker();
    String  e_mail = faker.internet().emailAddress();

    String userName = faker.name().username();
    String passWord = faker.internet().password();

    @Given("user clicks on Shipping link button")
    public void user_clicks_on_shipping_link_button() {


    }
    @Given("user clicks on ADD button under Shipping Address")
    public void user_clicks_on_add_button_under_shipping_address() {


    }
    @Then("Verify Shipping Email adress is filled automatically")
    public void verify_shipping_email_adress_is_filled_automatically() {


    }
    @Then("user selects Country_region and Province in Billing Address")
    public void user_selects_country_region_and_province_in_billing_address() {


    }
    @Then("user clicks on Save Shipping Address button")
    public void user_clicks_on_save_shipping_address_button() {


    }
    @Then("verify user added Shipping Address successfully")
    public void verify_user_added_shipping_address_successfully() {


    }
}
