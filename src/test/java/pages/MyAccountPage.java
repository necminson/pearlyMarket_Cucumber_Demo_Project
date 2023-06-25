package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccountPage {
public MyAccountPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath = "//a[.='My Account']")
    public WebElement myAccountButton;
    @FindBy(xpath = "//a[.='Addresses']")
    public WebElement addressesLink;

    @FindBy(xpath = "(//a[.='Add'])[1]")
    public WebElement addBillingButton;
    @FindBy(xpath = "(//a[.='Add'])[2]")
    public WebElement addShippingButton;

}
