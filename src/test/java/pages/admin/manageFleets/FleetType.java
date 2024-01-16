package pages.admin.manageFleets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FleetType {
    public FleetType(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Manage Fleets']")
    public WebElement manageFleets;

    @FindBy(xpath = "//*[text()='Seat Layouts']")
    public WebElement seatLayouts;

    @FindBy(xpath = "//*[text()='Fleet Type']")
    public WebElement fleetType;

    @FindBy(xpath = "(//*[@type='text'])[1]")
    public WebElement addFleetTypeNameBox;

    @FindBy(xpath = "(//select[@name='seat_layout'])[1]")
    public WebElement SelectAnOptionFleetTypeBox;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement addFleetNoofDeckBox;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement SeatSofDeckBox;

    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement facilitiesBox;
}
