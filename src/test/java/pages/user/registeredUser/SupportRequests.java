package pages.user.registeredUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SupportRequests {
    public SupportRequests(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Create New']")
    public WebElement createNewDropdown;

    //Support Request/ Create New/ Support tickets label
    @FindBy(xpath = "//*[text()='Support Tickets']")
    public WebElement labelSupportTickets;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailAdressBox;

    @FindBy(xpath = "//*[@name='subject']")
    public WebElement subjectBox;

    @FindBy(xpath = "//*[@name='priority']")
    public WebElement priorityBox;

    @FindBy(xpath = "//*[@name='message']")
    public WebElement messageBox;

    @FindBy(id="inputAttachments")
    public WebElement dosyaSecBox;

    // dosya seç boxın en sagındakı "+" isareti
    @FindBy(xpath = "//*[@type='button']")
    public WebElement plusButton;

    @FindBy(xpath = "//*[@class='support-input-group']")
    public WebElement newPlusButton;

    @FindBy(xpath = "//*[@class='info fs--14px']")
    public WebElement labelAllowedFileExtentions;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Support Request']")
    public WebElement supportRequestLink;

    @FindBy(xpath = "//*[@class='col-md-9 ps-2']")
    public WebElement labelRequestMessage;

    @FindBy(xpath = "//*[@class='fa fa-desktop']")
    public WebElement actionButton;

    @FindBy(xpath = "//*[@class='btn btn--base btn-sm']")
    public WebElement newTicketButton;

    @FindBy(xpath = "//*[text()='Requests']")
    public WebElement requestLink;

    @FindBy(xpath = "//*[text()='Support ticket created successfully!']")
    public WebElement alertMessage;

    @FindBy(xpath = "//*[text()='Account Recovery']")
    public WebElement labelAccountRecovery;

    @FindBy(xpath = "//*[text()='Try to send again']")
    public WebElement tryToSendAgainLink;

    @FindBy(xpath = "//*[text()='Reset Password']")
    public WebElement labelResetPassword;
}