package pages.admin.manageFleets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Vehicles {
    public Vehicles(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Vehicles']")
    public WebElement Vehicles;

    @FindBy(xpath = "//*[@name='search']")
    public WebElement allVehiclesSearchBox;

    @FindBy(xpath = "//*[@class='input-group-append']")
    public WebElement allVehiclesSearchButton;

    @FindBy(xpath = "(//*[@href='javascript:void(0)'])[12]")
    public WebElement addNewButton;

    @FindBy(xpath = "(//*[@type='text'])[2]")
    public WebElement nicNameBox;

    @FindBy(xpath = "(//*[@name='fleet_type'])[1]")
    public WebElement fleetTypeBoxSeleckBox;

    @FindBy(xpath = "(//*[@type='text'])[3]")
    public WebElement RegisterNoBox;

    @FindBy(xpath = "(//*[@type='text'])[4]")
    public WebElement engineNoBox;

    @FindBy(xpath = "(//*[@type='text'])[5]")
    public WebElement chasisNoBox;

    @FindBy(xpath = "(//*[@type='text'])[6]")
    public WebElement modelNoBox;

    @FindBy(xpath = "(//*[@type='submit'])[3]")
    public WebElement submitButton;

    @FindBy(xpath = "(//button[@type='button'])[7]")
    public WebElement actionButton;

    @FindBy(xpath = "(//*[@type='text'])[7]")
    public WebElement nicNameBox1;

    @FindBy(xpath = "(//*[@name='fleet_type'])[2]")
    public WebElement fleetTypeBoxSeleckBox1;

    @FindBy(xpath = "(//*[@type='text'])[8]")
    public WebElement RegisterNoBox1;

    @FindBy(xpath = "(//*[@type='text'])[9]")
    public WebElement engineNoBox1;

    @FindBy(xpath = "(//*[@type='text'])[10]")
    public WebElement chasisNoBox1;

    @FindBy(xpath = "(//*[@type='text'])[11]")
    public WebElement modelNoBox1;

    @FindBy(xpath = "(//*[@type='submit'])[4]")
    public WebElement updateButton1;

    @FindBy(xpath = "(//*[@type='button'])[7]")
    public WebElement actionButton1;

    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement statüsActionButton;

    @FindBy(xpath = "(//button[@type='submit'])[6]")
    public WebElement disableVehicleButton;

    @FindBy(xpath = "(//button[@type='submit'])[5]")
    public WebElement disableVehicleButton1;
}
