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

    @FindBy(xpath = "(//tr/td[5]/button[1])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//*[text()=' Update Assigned Vehicle']")
    public WebElement labelUpdateAssignedVehicle;

    @FindBy(xpath = "(//*[@*='select2-basic select2-hidden-accessible'])[3]")
    public WebElement dropDownUpdateTrip;

    @FindBy(xpath = "(//*[@*='select2-basic select2-hidden-accessible'])[4]")
    public WebElement dropDownUpdateVehicle;

    @FindBy(xpath = "//*[text()='Update']")
    public WebElement updateButton;

    @FindBy(xpath = "//*[text()='Assigned vehicle update successfully.']")
    public WebElement labelUpdate;

    @FindBy(xpath = "(//tr/td[5]/button[2])[1]")
    public WebElement disableButton;
}
