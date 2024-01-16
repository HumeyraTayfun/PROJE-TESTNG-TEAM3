package pages.admin.counter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Counter {
    public Counter(){
        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//*[@*='name']")
    public WebElement AddNewName;

    @FindBy(xpath = "//*[@*='city']")
    public WebElement AddNewCity;

    @FindBy(xpath = "//*[@*='Enter Location']")
    public WebElement AddNewEnterLocation;

    @FindBy(xpath = "//*[@*='Enter Counter Contact Number']")
    public WebElement AddNewEnterCounterContactNumber;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement AddNewSave;

    @FindBy(xpath = "(//a[@href='javascript:void(0)'])[11]")
    public WebElement AddNew;

}
