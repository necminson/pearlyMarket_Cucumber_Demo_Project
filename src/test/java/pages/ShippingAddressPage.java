package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShippingAddressPage {

    public ShippingAddressPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
