package pages.admin.manageTrips;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Trip {
    public Trip(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@*='btn btn-sm btn--primary box--shadow1 text--small addBtn']")
    public WebElement addNewButton;

    @FindBy(xpath = "//*[text()=' Add Trip']")
    public WebElement labelAddTrip;

    @FindBy(xpath = "(//*[@*='fleet_type'])[1]")
    public WebElement dropDownFleetType;

    @FindBy(xpath = "(//*[@*='textbox'])[1]")
    public WebElement labelFleetType;

    @FindBy(xpath = "(//*[@*='route'])[1]")
    public WebElement dropDownRoute;

    @FindBy(xpath = "(//*[@*='schedule'])[1]")
    public WebElement dropDownSchedule;

    @FindBy(xpath = "(//*[@*='start_from'])[1]")
    public WebElement dropDownStartFrom;

    @FindBy(xpath = "(//*[@*='textbox'])[4]")
    public WebElement labelStartFrom;

    @FindBy(xpath = "(//*[@*='end_to'])[1]")
    public WebElement dropDownEndTo;

    @FindBy(xpath = "(//*[@*='textbox'])[5]")
    public WebElement labelEndTo;

    @FindBy(xpath = "(//*[@*='select2-basic select2-hidden-accessible'])[1]")
    public WebElement dropDownDayOff;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Trip save successfully']")
    public WebElement labelSave;

    @FindBy(xpath = "(//tbody/tr/td)[1]")
    public WebElement newTripElement;

    @FindBy(xpath = "(//tr/td/button[2])[1]")
    public WebElement disableButton;

    @FindBy(xpath = "//*[text()='Disable']")
    public WebElement disableConfirmButton;

    @FindBy(xpath = "//*[text()='Trip disabled successfully']")
    public WebElement labelDisable;

    @FindBy(xpath = " (//tr/td[4]/span)[1]")
    public WebElement labelDisabled;

    @FindBy(xpath = "(//tr/td/button[1])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//*[text()=' Update Trip']")
    public WebElement labelUpdateTrip;

    @FindBy(xpath = "(//*[@*='title'])[2]")
    public WebElement titleBox;

    @FindBy(xpath = "//*[text()='Update']")
    public WebElement updateButton;

    @FindBy(xpath = "(//*[text()='Close'])[2]")
    public WebElement closeButton;
}
