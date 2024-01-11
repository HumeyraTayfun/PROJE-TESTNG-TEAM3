package pages.user.registeredUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BuyTicket {
    public BuyTicket(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//div[@class='ticket-item']")
    public WebElement ticketPurchaseScreen;

    @FindBy (xpath = "//div[@class='ticket-wrapper']")
    public WebElement ticketOptions;
}
