package pages.visitor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorBlog {
    public VisitorBlog(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@class='left-content']/li[1]/a")
    public WebElement HeaderPhone;

    @FindBy(xpath = "//*[@class='left-content']/li[2]/a")
    public WebElement HeaderEmail;

    @FindBy(xpath = "//*[@class='logo']/a")
    public WebElement HeaderLogo;

    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement HeaderDashboard;

    @FindBy(xpath = "//*[text()='Booking']")
    public WebElement HeaderBooking;

    @FindBy(xpath = "//*[text()='Support Request']")
    public WebElement HeaderSupportRequest;

    @FindBy(xpath = "(//*[text()='Profile'])[1]")
    public WebElement HeaderProfile;

    @FindBy(xpath = "//*[text()='Buy Ticket']")
    public WebElement HeaderBuyTicket;

    @FindBy(xpath = "//*[text()='Booking History']")
    public WebElement HeaderBookingHistory;

    @FindBy(xpath = "//*[text()='Create New']")
    public WebElement HeaderCreateNewSupportRequest;

    @FindBy(xpath = "//*[text()='Requests']")
    public WebElement HeaderMySupportRequests;

    @FindBy(xpath = "(//*[text()='Profile'])[2]")
    public WebElement HeaderMyProfile;

    @FindBy(xpath = "//*[text()='Change Password']")
    public WebElement HeaderChangePassword;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement HeaderLogout;

    @FindBy(xpath = "//*[@class='social-icons']/li[1]/a")
    public WebElement TwitterIcon;

    @FindBy(xpath = "//*[@class='social-icons']/li[2]/a")
    public WebElement FacebookIcon;

    @FindBy(xpath = "//*[@class='social-icons']/li[3]/a")
    public WebElement YoutubeIcon;

    @FindBy(xpath = "//*[@class='social-icons']/li[4]/a")
    public WebElement InstagramIcon;

    @FindBy(xpath = "(//*[@class='title']/a)[1]")
    public WebElement BlogTitle1;

    @FindBy(xpath = "(//*[@class='title']/a)[2]")
    public WebElement BlogTitle2;

    @FindBy(xpath = "(//*[@class='title']/a)[3]")
    public WebElement BlogTitle3;

    @FindBy(xpath = "(//*[@class='title']/a)[4]")
    public WebElement BlogTitle4;

    @FindBy(xpath = "(//*[@class='title']/a)[5]")
    public WebElement BlogTitle5;

    @FindBy(xpath = "(//*[@class='title']/a)[6]")
    public WebElement BlogTitle6;

    @FindBy(xpath = "(//*[@class='title']/a)[7]")
    public WebElement BlogTitle7;

    @FindBy(xpath = "(//*[@class='title']/a)[8]")
    public WebElement RecentBlogTitle1;

    @FindBy(xpath = "(//*[@class='title']/a)[9]")
    public WebElement RecentBlogTitle2;

    @FindBy(xpath = "(//*[@class='title']/a)[10]")
    public WebElement RecentBlogTitle3;

    @FindBy(xpath = "//*[text()='About']")
    public WebElement FooterAbout;

    @FindBy(xpath = "//*[text()='FAQs']")
    public WebElement FooterFAQs;

    @FindBy(xpath = "//*[text()='Blog']")
    public WebElement FooterBlog;

    @FindBy(xpath = "//*[text()='Contact']")
    public WebElement FooterContact;

    @FindBy(xpath = "//*[text()='Privacy Policy']")
    public WebElement FooterPrivacyPolicy;

    @FindBy(xpath = "//*[text()='Terms and Conditions']")
    public WebElement FooterTermsAndConditions;

    @FindBy(xpath = "//*[text()='Ticket Policies']")
    public WebElement FooterTicketPolicies;

    @FindBy(xpath = "//*[@class='footer-contacts']/li[2]/a")
    public WebElement FooterPhone;

    @FindBy(xpath = "//*[@class='footer-contacts']/li[3]/a")
    public WebElement FooterEmail;

    @FindBy(xpath = "(//h2[@class='title'])[1]")
    public WebElement labelBlog;

    @FindBy(xpath = "//h2[@class='title']")
    public WebElement labelBlogDetails;
}
