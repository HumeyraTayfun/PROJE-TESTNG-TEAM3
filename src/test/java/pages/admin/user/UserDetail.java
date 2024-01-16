package pages.admin.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDetail {

    public UserDetail(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='Verified'])[1]")
    public WebElement emailVerified;

    @FindBy(xpath = "(//*[text()='Unverified'])[1]")
    public WebElement emailUnverified;

    @FindBy(xpath = "(//*[text()='Verified'])[2]")
    public WebElement smsVerified;

    @FindBy(xpath = "(//*[text()='Unverified'])[2]")
    public WebElement smsUnverified;

    @FindBy(xpath = "//*[contains(text(),'Login as User')]")
    public WebElement loginAsUser;

}
