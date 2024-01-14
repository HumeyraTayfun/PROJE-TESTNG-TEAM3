package pages.admin.manageTrips;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Schedule {
    public Schedule(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@*='btn btn-sm btn--primary box--shadow1 text--small addBtn']")
    public WebElement addNewButton;

    @FindBy(xpath = "//*[text()=' Add Schedule']")
    public WebElement labelAddSchedule;

    @FindBy(xpath = "(//*[@*='start_from'])[1]")
    public WebElement startFromBox;

    @FindBy(xpath = "(//*[@*='end_at'])[1]")
    public WebElement endAtBox;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Schedule save successfully']")
    public WebElement labelSave;

    @FindBy(xpath = "(//tbody/tr/td)[1]")
    public WebElement newScheduleElement;

    @FindBy(xpath = "(//tbody/tr/td/button)[2]")
    public WebElement disableButton;

    @FindBy(xpath = "//*[text()='Disable']")
    public WebElement disableActiveButton;

    @FindBy(xpath = "(//tbody/tr/td/span)[1]")
    public WebElement labelStatus;

    @FindBy(xpath = "(//tbody/tr/td/button)[1]")
    public WebElement editButton;

    @FindBy(xpath = "//*[text()=' Update Schedule']")
    public WebElement labelUpdatePage;

    @FindBy(xpath = "//*[text()='Update']")
    public WebElement updateButton;
}
