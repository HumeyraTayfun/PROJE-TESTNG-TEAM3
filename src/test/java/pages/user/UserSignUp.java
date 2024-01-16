package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSignUp {
    public UserSignUp(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Sign Up your Account']")
    public WebElement labelSignUpYourAccount;

    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@id='lastname']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@id='country']")
    public WebElement countryBox;

    @FindBy(xpath = "//*[@id='mobile']")
    public WebElement mobileBox;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id='password-confirm']")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//*[@id='agree']")
    public WebElement acceptingAllCheckbox;

    @FindBy(xpath = "//*[text()='Sign Up']")
    public WebElement signUpButton;

    @FindBy(xpath = "//*[text()='Already have an Account? ']")
    public WebElement labelAlreadyHaveAnAccount;

    //homePage/signUp/signinButton
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='The password must contain at least one uppercase and one lowercase letter.']")
    public WebElement alertInvalidPassword1;

    @FindBy(xpath = "//*[text()='The password must be at least 6 characters.']")
    public WebElement alertInvalidPassword2;

    @FindBy(xpath = "//*[text()='The password must contain at least one number.']")
    public WebElement alertInvalidPassword3;

    @FindBy(xpath = "//*[text()='The password must contain at least one symbol.']")
    public WebElement alertInvalidPassword4;
}