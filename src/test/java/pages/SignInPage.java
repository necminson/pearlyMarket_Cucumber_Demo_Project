package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement SignInButton;
    @FindBy(xpath = "//input[@id='username']")// for SIGN IN
    public  WebElement username;
    @FindBy(xpath = "//input[@id='password']")// for SIGN IN
    public  WebElement password;
    @FindBy(xpath = "//button[@name='login']") // for SIGN IN
    public WebElement loginButton;

}
