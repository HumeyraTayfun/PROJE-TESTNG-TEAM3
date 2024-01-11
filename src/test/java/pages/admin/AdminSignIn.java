package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminSignIn {
    public AdminSignIn(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@*='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//*[@*='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@*='submit-btn mt-25 b-radius--capsule']")
    public WebElement loginButton;
}
