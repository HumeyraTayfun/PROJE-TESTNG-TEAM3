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

    @FindBy(xpath = "(//tr/td[2])[1]")
    public WebElement routeName;

    @FindBy(xpath = "(//td/button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteConfirmButton;

    @FindBy(xpath = "//*[text()='Price Deleted Successfully']")
    public WebElement labelDelete;

    @FindBy(xpath = "(//td/a)[1]")
    public WebElement editButton;

    @FindBy(xpath = "//*[@*='text']")
    public WebElement updateBox;

    @FindBy(xpath = "//*[*='Update']")
    public WebElement updateButton;

    @FindBy(xpath = "//*[text()='Price Updated Successfully']")
    public WebElement labelUpdate;
}
