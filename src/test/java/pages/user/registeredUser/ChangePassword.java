package pages.user.registeredUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChangePassword {
    public ChangePassword(){
        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "(//*[@*='form-contorl form--control radius-0'])[1]")
    public WebElement currentPasswordBox;

    @FindBy(xpath = "(//*[@*='form-contorl form--control radius-0'])[2]")
    public WebElement passwordBox;

    @FindBy(xpath = "(//*[@*='form-contorl form--control radius-0'])[3]")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//*[@*='submit']")
    public WebElement  changePasswordButton;

    @FindBy(xpath = "//*[text()='Password changes successfully']")
    public WebElement  labelPasswordAlert;
}
