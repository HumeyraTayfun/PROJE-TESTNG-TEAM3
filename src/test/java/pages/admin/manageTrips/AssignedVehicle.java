package pages.admin.manageTrips;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AssignedVehicle {
    public AssignedVehicle(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@*='btn btn-sm btn--primary box--shadow1 text--small addBtn']")
    public WebElement addNewButton;

    @FindBy(xpath = "//*[text()=' Assign Vehicle']")
    public WebElement labelAssignVehicle;

    @FindBy(xpath = "(//*[@*='select2-basic select2-hidden-accessible'])[1]")
    public WebElement dropDownTrip;

    @FindBy(xpath = "(//*[@*='textbox'])[1]")
    public WebElement labelTrip;

    @FindBy(xpath = "(//*[@*='select2-basic select2-hidden-accessible'])[2]")
    public WebElement dropDownVehicle;

    @FindBy(xpath = "(//*[@*='textbox'])[2]")
    public WebElement labelVehicle;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Vehicle assigned successfully.']")
    public WebElement labelSave;

    @FindBy(xpath = "(//tbody/tr/td)[1]")
    public WebElement newTripElement;

    @FindBy(xpath = "(//tbody/tr/td)[2]")
    public WebElement newVehicleElement;
}
