package pages.user.registeredUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
    @FindBy(xpath = "//*[@id='state']")
    public  WebElement state;
    @FindBy(xpath = "//*[@id='zip']")
    public WebElement zip;
    @FindBy(xpath = "//*[@id='city']")
    public WebElement city;
    @FindBy(xpath = "//*[text()='Zip Code']")
    public WebElement zipCode;
    @FindBy(xpath = "//*[text()='Country']")
    public WebElement Country;
    @FindBy(xpath = "//*[text()='Update Profile']")
    public WebElement UpdateProfile;
    //chnage password
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
    //logout
    @FindBy(xpath = "//*[text()='Logout']")
    public  WebElement logout;
    @FindBy(xpath = "//*[h3='Welcome to Easy Bus Ticket']")
    public WebElement welcometoeasybusticket;

    @FindBy(xpath = "//*[text()='Username']")
    public WebElement username;
    @FindBy(xpath = "//*[text()='Password']")
    public WebElement passwordlogout;
    @FindBy(xpath = "//*[text()='Log In']")
    public WebElement logın;


}
