package pages.visitor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class VisitorHomePage {
    public VisitorHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Every Journey is an Adventure, Every Ticket is a Story']")
    public WebElement HomePageVerify;

    @FindBy(xpath = "//*[@*='sign-in']")
    public WebElement singInButton;

    @FindBy(xpath ="(//li)[1]" )
    public WebElement HeaderPhoneNumber;

    @FindBy(xpath = "(//li)[2]")
    public WebElement HeaderEmailAddress;

    @FindBy(xpath = "(//*[@*='https://www.twitter.com'])[1] ")
    public WebElement  Headertiwetterİcon ;

    @FindBy(xpath = "(//a[@href='https://www.instagram.com'])[1]")
    public WebElement  Headerİnstagramİcon ;

    @FindBy(xpath = "(//li)[7]")
    public WebElement  HeaderSignİgn ;

    @FindBy(xpath = "(//li)[9]")
    public WebElement  HeaderSignUp ;

    @FindBy(xpath = "(//*[@class='logo'])[1]")
    public WebElement  HeaderLogo ;

    @FindBy(xpath = "(//li)[10]")
    public WebElement  HeaderHome ;

    @FindBy(xpath = "(//li)[11]")
    public WebElement  HeaderAbout ;

    @FindBy(xpath = "(//li)[12]")
    public WebElement  HeaderFaQs ;

    @FindBy(xpath = "(//li)[13]")
    public WebElement  HeaderBlog ;

    @FindBy(xpath = "(//li)[12]")
    public WebElement  HeaderContact ;

    @FindBy(xpath = "//div[@class='d-flex flex-wrap algin-items-center']")
    public WebElement  HeaderByTicket ;

    @FindBy(xpath = "//*[text()='Allow']")
    public WebElement cookiesAllow;

    @FindBy(xpath = "(//*[@*='select2-selection select2-selection--single'])[1]")
    public WebElement dropDownPickupPoint;

    @FindBy(xpath = "(//*[@*='select2-selection select2-selection--single'])[2]")
    public WebElement dropDownDroppingPoint;

    @FindBy(xpath = "//*[@*='date_of_journey']")
    public WebElement dropDownDepartureDate;

    @FindBy(xpath = "//*[text()='Find Tickets']")
    public WebElement findTicketsButton;

    @FindBy(xpath = "//*[text()='Get ticket now']")
    public WebElement getTicketNowButton;

    @FindBy(xpath = "//li")
    public List<WebElement> listr;

    @FindBy(xpath = "(//a[@href='https://www.facebook.com'])[1]")
    public WebElement  HeaderFacebook ;

    @FindBy(xpath = "(//li)[5]")
    public WebElement  HeaderYoutube ;

    @FindBy(xpath = "//ul[@class='footer-links']//a[text()='About']")
    public WebElement footerabout;

    @FindBy(xpath = "//ul[@class='footer-links']//a[text()='FAQs']")
    public WebElement footerFAQs;

    @FindBy(xpath = "//ul[@class='footer-links']//a[text()='Blog']")
    public WebElement footerblog;

    @FindBy(xpath = "//ul[@class='footer-links']//a[text()='Contact']")
    public WebElement footercontact;

    @FindBy(xpath = "//*[text()='Privacy Policy']")
    public WebElement footerprivacypolicy;

    @FindBy(xpath = "//*[text()='Terms and Conditions']")
    public WebElement footertermsandconditions;

    @FindBy(xpath = "//*[text()='Ticket Policies']")
    public WebElement Ticketpolicies;

    @FindBy(xpath = "(//li)[3]")
    public WebElement  HeaderDasbordLinkButton ;

}