package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSignIn {
    public UserSignIn(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@*='checkbox']")
    public WebElement checkBoxRememberMe;

    @FindBy(xpath = "//*[@*='account-button w-100']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='These credentials do not match our records.']")
    public WebElement labelError;

    @FindBy(xpath = "//*[text()='Forgot Password?']")
    public WebElement linkForgotPassword;
}