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

    @FindBy(xpath = "//*[text()='Reset Password']")
    public WebElement labelResetPassword;

    @FindBy(xpath = "(//*[@id='type'])[1]")
    public WebElement selectOneBox;

    @FindBy(xpath = "//*[@class='form--control ']")
    public WebElement emailAdressBox;

    @FindBy(xpath = "//*[text()='Send Password Code']")
    public WebElement sendPasswordCodeButton;

    @FindBy(xpath = "(//li)[3]")
    public WebElement HeaderDashboard;

    @FindBy(xpath = "(//a[@href='javascript::void()'])[2]")
    public WebElement SupportRequestButton;

    @FindBy(xpath = "//*[text()='Password reset email sent successfully']")
    public WebElement alertMessageText;

    @FindBy(xpath = "//*[@*='https://qa.easybusticket.com']")
    public WebElement homePageButton;
}