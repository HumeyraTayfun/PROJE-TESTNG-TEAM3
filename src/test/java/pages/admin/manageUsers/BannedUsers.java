package pages.admin.manageUsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BannedUsers {
    public BannedUsers(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@data-original-title='Details']")
    public WebElement detailsButton;

    @FindBy(xpath = "//*[text()='Email Unverified']")
    public WebElement emailUnverified;
}
