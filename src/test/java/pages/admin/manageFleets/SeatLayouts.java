package pages.admin.manageFleets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SeatLayouts {
    public SeatLayouts(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//*[@href='javascript:void(0)'])[12]")
    public WebElement AdNevButton;

    @FindBy(xpath = "(//*[@type='text'])[1]")
    public WebElement addSeatLayoutsBox;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement addSeatLayoutsSaveButton;

    @FindBy(xpath = "(//button[@type='button'])[7]")
    public WebElement addSeatLayoutsActionButton;

    @FindBy(xpath = "(//*[@type='submit'])[3]")
    public WebElement addSeatLayoutsAbdateBox;

    @FindBy(xpath = "(//*[@type='submit'])[3]")
    public WebElement addSeatLayoutsAbdateButton;

    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement addSeatLayoutsDeleteButton;

    @FindBy(xpath = "(//button[@type='submit'])[4]")
    public WebElement addSeatLayoutsDeleteButton1;


}
