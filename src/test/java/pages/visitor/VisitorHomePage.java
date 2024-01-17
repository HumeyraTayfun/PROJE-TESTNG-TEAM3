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

    @FindBy(xpath = "//*[@*='sign-up']")
    public WebElement singUpButton;

    @FindBy(xpath ="(//li)[1]" )
    public WebElement HeaderPhoneNumber;

    @FindBy(xpath = "(//li)[2]")
    public WebElement HeaderEmailAddress;

    @FindBy(xpath = "(//*[@*='https://www.twitter.com'])[1] ")
    public WebElement  Headertiwetterİcon ;

    @FindBy(xpath = "(//a[@href='https://www.instagram.com'])[1]")
    public WebElement  Headerİnstagramİcon ;

    @FindBy(xpath = "(//li)[3]")
    public WebElement  HeaderTwitter;

    @FindBy(xpath = "(//a[@href='https://www.facebook.com'])[1]")
    public WebElement  HeaderFacebook;

    @FindBy(xpath = "//*[text()='Choose Your Ticket']")
    public WebElement ChooseYourTicketTitle;

    @FindBy(xpath = "//*[text()='Our Testimonials']")
    public WebElement OurTestimonialsTitle;

    @FindBy(xpath = "//*[@class='testimonial-wrapper']")
    public WebElement OurTestimonialsComment;

    @FindBy(xpath = "//*[@role='presentation'][1]/button")
    public WebElement OurTestimonialsDatButton1;

    @FindBy(xpath = "//*[@role='presentation'][2]/button")
    public WebElement OurTestimonialsDatButton2;

    @FindBy(xpath = "//*[@role='presentation'][3]/button")
    public WebElement OurTestimonialsDatButton3;

    @FindBy(xpath = "//*[text()='Buy Tickets']")
    public WebElement BuyTicketsButton;

    @FindBy(xpath = "//*[text()='Recent Blog Post']")
    public WebElement RecentBlogPostTitle;

    @FindBy(xpath = "(//*[@class='post-content']/h4/a)[1]")
    public WebElement RecentBlogPostTitle1;

    @FindBy(xpath = "(//*[@class='post-content']/h4/a)[2]")
    public WebElement RecentBlogPostTitle2;

    @FindBy(xpath = "(//*[@class='post-content']/h4/a)[3]")
    public WebElement RecentBlogPostTitle3;

    @FindBy(xpath = "(//li)[5]")
    public WebElement  HeaderYoutube;

    @FindBy(xpath = "(//li)[6]")
    public WebElement  HeaderInstagram;

    @FindBy(xpath = "(//*[@class='social-icons']/li/a)[5]")
    public WebElement FooterTwitter;

    @FindBy(xpath = "(//*[@class='social-icons']/li/a)[6]")
    public WebElement FooterFacebook;

    @FindBy(xpath = "(//*[@class='social-icons']/li/a)[7]")
    public WebElement FooterYoutube;

    @FindBy(xpath = "(//*[@class='social-icons']/li/a)[8]")
    public WebElement FooterInstagram;

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

    @FindBy(xpath = "(//li)[14]")
    public WebElement  HeaderContact ;

    @FindBy(xpath = "//div[@class='d-flex flex-wrap algin-items-center']")
    public WebElement  HeaderByTicket ;

    @FindBy(xpath = "//*[text()='Allow']")
    public WebElement cookiesAllow;

    @FindBy(xpath = "//select[@name='pickup']")
    public WebElement dropDownPickupPoint;

    @FindBy(xpath = "//select[@name='destination']")
    public WebElement dropDownDroppingPoint;

    @FindBy(xpath = "//*[@*='date_of_journey']")
    public WebElement dropDownDepartureDate;

    @FindBy(xpath = "//*[text()='Find Tickets']")
    public WebElement findTicketsButton;

    @FindBy(xpath = "//*[text()='Get ticket now']")
    public WebElement getTicketNowButton;

    @FindBy(xpath = "//li")
    public List<WebElement> listr;

    @FindBy(xpath = "(//*[@class='footer-contacts']//a)[1]")
    public WebElement footerPhone;

    @FindBy(xpath = "(//*[@class='footer-contacts']//a)[2]")
    public WebElement footerEmail;

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

    @FindBy(xpath = "(//*[@*='widget-title'])[3]")
    public WebElement footerContacınfo;

    @FindBy(xpath = "//*[@*='las la-phone']")
    public WebElement phoneAlert;

    @FindBy(xpath = "//*[@*='las la-envelope-open']")
    public WebElement emailAlert;

    @FindBy(xpath = "//*[@*='address']")
    public WebElement harıtaAddress;

    @FindBy(xpath = "//*[text()='Send Us Message']")
    public WebElement  sendUsMessageButton;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement messageName;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement messageEmail;

    @FindBy(xpath = "//*[@id='subject']")
    public WebElement messageSubject;

    @FindBy(xpath = "(//li)[3]")
    public WebElement  HeaderDasbordLinkButton ;

}