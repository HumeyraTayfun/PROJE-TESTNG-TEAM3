package pages.visitor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorContact {
    public VisitorContact(){
        PageFactory.initElements(Driver.getDriver(),this);}

    // "Contact Us" Header Text
    @FindBy(xpath = "//h2[@class='title']")
    public WebElement labelContact;

    // "Let's get in touch" Body Text
    @FindBy(xpath = "//h3[@class='title mb-2']")
    public WebElement labelContactBody;

    // "Our Address"
    @FindBy(xpath = "(//div[@class='content'])[1]")
    public WebElement ourAddress;

    // "Call Us"
    @FindBy(xpath = "(//div[@class='content'])[2]")
    public WebElement callUs;

    // "EmailUs"
    @FindBy(xpath = "(//div[@class='content'])[3]")
    public WebElement emailUs;

    // "Name" text box
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameBox;

    // "Name Text" for name text box
    @FindBy(xpath = "//label[@for='name']")
    public WebElement labelName;

    // "Email" text box
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    // "Email Text" for email text box
    @FindBy(xpath = "//label[@for='email']")
    public WebElement labelEmail;

    // "Subject" text box
    @FindBy(xpath = "//input[@id='subject']")
    public WebElement subjectBox;

    // "Subject Text" for subject text box
    @FindBy(xpath = "//label[@for='subject']")
    public WebElement labelSubject;

    // "Your Message" text box
    @FindBy(xpath = "//textarea[@id='msg']")
    public WebElement messageBox;

    // "Your Message Text" for message text box
    @FindBy(xpath = "//label[@for='msg']")
    public WebElement labelYourMessage;

    // "Send Us Message" button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sensUsMessageButton;

}
