package pages.user.registeredUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateSupportRequest {
    public CreateSupportRequest(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@name='message']")
    public WebElement requestMesageBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement requestReplyButton;

    @FindBy(xpath = "//*[@type='file']")
    public WebElement requestSelectFileButton;
}
