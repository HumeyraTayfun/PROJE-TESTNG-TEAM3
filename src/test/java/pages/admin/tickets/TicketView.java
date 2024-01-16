package pages.admin.tickets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TicketView {
    public TicketView(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='message']")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@name='replayTicket']")
    public WebElement replyButton;

    @FindBy(xpath = "(//button[contains(text(),'Delete')])[1]")
    public WebElement deleteMessage;

    @FindBy(xpath = "//*[@class='modal-footer']//button[contains(text(),'Delete')]")
    public WebElement confirmDeleteMessage;

    @FindBy(xpath = "(//*[contains(text(),'Delete successfully')])[2]")
    public WebElement deleteSuccessMessage;

    @FindBy(xpath = "(//*[contains(text(),'Support ticket replied successfully')])[2]")
    public WebElement replySuccessMessage;

    @FindBy(xpath = "//*[@data-target='#DelModal']")
    public WebElement closeTicketButton;

    @FindBy(xpath = "(//button[contains(text(),'Close Ticket')])[1]")
    public WebElement confirmCloseTicketButton;

    @FindBy(xpath = "(//*[contains(text(),'Support ticket closed successfully')])[2]")
    public WebElement closeTicketSuccessMessage;

}
