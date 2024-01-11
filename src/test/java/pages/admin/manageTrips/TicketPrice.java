package pages.admin.manageTrips;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TicketPrice {
    public TicketPrice(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@*='btn btn-sm btn--primary box--shadow1 text--small']")
    public WebElement addNewButton;

    @FindBy(xpath = "//*[@*='fleet_type']")
    public WebElement dropDownFleetType;

    @FindBy(xpath = "//*[@*='route']")
    public WebElement dropDownRoute;

    @FindBy(xpath = "(//*[@*='Enter a price'])[1]")
    public WebElement priceBox;

    @FindBy(xpath = "(//*[@*='Enter a price'])[2]")
    public WebElement priceBox2;

    @FindBy(xpath = "//*[text()='Save                                ']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()=' Ticket price added successfully']")
    public WebElement labelSave;

    @FindBy(xpath = "//*[@*='btn btn-sm btn--primary box--shadow1 text--small addBtn']")
    public WebElement goBackButton;

    @FindBy(xpath = "(//tbody/tr/td)[3]")
    public WebElement newTicketPriceElement;
}
