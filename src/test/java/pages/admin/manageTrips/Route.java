package pages.admin.manageTrips;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Route {
    public Route(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@*='btn btn-sm btn--primary box--shadow1 text--small addBtn']")
    public WebElement addNewButton;

    @FindBy(xpath = "//*[@*='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//*[@*='start_from']")
    public WebElement dropDownStartFrom;

    @FindBy(xpath = "//*[@*='end_to']")
    public WebElement dropDownEndTo;

    @FindBy(xpath = "//*[@name='time']")
    public WebElement timeBox;

    @FindBy(xpath = "//*[@name='distance']")
    public WebElement distanceBox;

    @FindBy(xpath = "//*[text()='Save                                ']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Route save successfully']")
    public WebElement labelSave;

    @FindBy(xpath = "//*[@*='btn btn-sm btn--primary box--shadow1 text--small addBtn']")
    public WebElement goBackButton;

    @FindBy(xpath = "(//tbody/tr/td)[1]")
    public WebElement newRouteElement;

    @FindBy(xpath = "(//tbody/tr/td/button)[1]")
    public WebElement disableButton;

    @FindBy(xpath = "//*[text()='Disable']")
    public WebElement disableActiveButton;

    @FindBy(xpath = "(//tbody/tr/td/span)[1]")
    public WebElement labelStatus;

    @FindBy(xpath = "(//tbody/tr/td/a)[1]")
    public WebElement editButton;

    @FindBy(xpath = "//*[text()='Route update successfully']")
    public WebElement labelUpdate;

    @FindBy(xpath = "//*[text()='Save Changes                                ']")
    public WebElement saveChangesButton;
}
