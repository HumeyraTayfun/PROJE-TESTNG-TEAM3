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

    @FindBy(xpath = "(//select[@class='select2-auto-tokenize select2-hidden-accessible'])[1]")
    public WebElement facilitiesBox;

    @FindBy(xpath = "(//*[@*='select2-selection__choice__remove'])[1]")
    public WebElement removeButton;

    @FindBy(xpath = "(//label[@class='btn btn--danger active toggle-off'])[1]")
    public WebElement acStatusButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement submitButton;

    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement facilitiesBox2;

    @FindBy(xpath = "(//button[@type='button'])[7]")
    public  WebElement ActionButton;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public  WebElement updateFleetTypeBox;

    @FindBy(xpath = "(//select[@name='seat_layout'])[2]")
    public WebElement SelectAnOptionFleetTypeBox1;

    @FindBy(xpath = "(//input[@type='number'])[2]")
    public WebElement addFleetNoofDeckBox1;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement SeatSofDeckBox1;

    @FindBy(xpath = "(//select[@class='select2-auto-tokenize select2-hidden-accessible'])[1]")
    public WebElement facilitiesBox1;

    @FindBy(xpath = "(//*[@*='select2-selection__choice__remove'])[5]")
    public WebElement removeButton1;

    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement facilitiesBox3;

    @FindBy(xpath = "(//select[@class='select2-auto-tokenize select2-hidden-accessible'])[2]")
    public WebElement facilitiesBox4;

    @FindBy(xpath = "(//label[@class='btn btn--danger active toggle-off'])[2]")
    public WebElement acStatusButton1;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement submitButton1;

    @FindBy(xpath = "(//span[@class='select2-selection select2-selection--multiple'])[2]")
    public WebElement facilitiesBox5;
}
