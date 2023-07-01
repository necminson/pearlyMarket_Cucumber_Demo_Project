package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyRegisterPage {

    public PearlyRegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


//    @FindBy(xpath = "//span[.='New']")
//    public WebElement newButton;

    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@id='reg_username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='reg_email']")
    public WebElement regEmailBox;

    @FindBy(xpath = "//input[@id='reg_password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"register-policy\"]")
    public WebElement registerPolicy;

    @FindBy(xpath = "//button[@name='register']")// for SIGN UP
    public WebElement signUpButton;

    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOutButton;

    @FindBy(xpath = "//*[text()='An account is already registered with that username. Please choose another.']")
    public WebElement alreadyExistText;

    @FindBy(xpath = "//a[@class='showlogin']")
    public WebElement pleaseLoginButton;


}