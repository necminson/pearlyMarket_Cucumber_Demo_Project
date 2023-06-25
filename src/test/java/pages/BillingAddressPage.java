package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BillingAddressPage {
    public BillingAddressPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement billingFirstName;
    @FindBy(xpath = "//*[@id='billing_last_name']")
    public WebElement billingLastName;
    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement billingCountry;
    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement billingState;
    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement billingCity;
    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement billingZipCode;
    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement billingPhone;
    @FindBy(xpath = "//*[@id='billing_email']")
    public WebElement billingEmail;
    @FindBy(xpath = "//*[@id='billing_address_1']")
    public WebElement billingStreetAddress;
    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement shippingSaveAddressButton;
    @FindBy(xpath = "//a[text()='Edit Your Billing Address']")
    public WebElement editBillingAddress;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement successAlert;




}
