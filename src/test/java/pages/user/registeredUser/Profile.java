package pages.user.registeredUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

public class Profile {
    public Profile(){
        PageFactory.initElements(Driver.getDriver(),this);}


    //profile
    @FindBy(xpath = "//li[4][1]")
    public WebElement liProfile;

    @FindBy(xpath = "//*[@id='InputFirstname']")
    public WebElement InputFirstname;

    @FindBy(xpath = "//*[@id='lastname']")
    public WebElement lastname;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement Email;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement adress;

    @FindBy(xpath = "//*[@id='state']")
    public  WebElement state;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement zipCode1;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement city;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement zipCode2;

    @FindBy(xpath = "//*[text()='Country']")
    public WebElement Country;

    @FindBy(xpath = "//*[text()='Update Profile']")
    public WebElement UpdateProfile;

    @FindBy(xpath = "//*[text()='Change Password']")
    public WebElement ChangePassword;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[@id='password'])[2]")
    public WebElement password2;

    @FindBy(xpath = "//*[text()='Confirm Password']")
    public WebElement confirmpassword;

    @FindBy(xpath = "//*[text()='Change Password']")
    public WebElement changepassword;

    @FindBy(xpath = "//*[text()='Logout']")
    public  WebElement logout;

    @FindBy(xpath = "//*[h3='Welcome to Easy Bus Ticket']")
    public WebElement welcometoeasybusticket;

    @FindBy(xpath = "//*[text()='Username']")
    public WebElement username;

    @FindBy(xpath = "//*[text()='Password']")
    public WebElement passwordlogout;

    @FindBy(xpath = "//*[text()='Log In']")
    public WebElement login;

    @FindBy(xpath = "//h5[@class='title']")
    public WebElement labelProfileSettings;

    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement profileUpdatedMessage;

    @FindBy(xpath = "//label[@for='InputFirstname']")
    public WebElement labelFirstName;

    @FindBy(xpath = "//label[@for='lastname']")
    public WebElement labelLastname;

    @FindBy(xpath = "//label[@for='address']")
    public WebElement labelAddress;

    @FindBy(xpath = "//label[@for='state']")
    public WebElement labelState;

    @FindBy(xpath = "(//label[@for='zip'])[1]")
    public WebElement labelZipCode1;

    @FindBy(xpath = "//label[@for='city']")
    public WebElement labelCity;

    @FindBy(xpath = "(//label[@for='zip'])[2]")
    public WebElement labelZipCode2;
}
