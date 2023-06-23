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

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"register-policy\"]")
    public WebElement registerPolicy;

    @FindBy(xpath = "//button[@name='register']")// for SIGN UP
    public WebElement signUpButton;



}