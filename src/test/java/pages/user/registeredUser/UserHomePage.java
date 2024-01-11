package pages.user.registeredUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomePage {
    public UserHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Home']")
    public WebElement homeButton;

    @FindBy(xpath = "(//*[text()='About'])[1]")
    public WebElement headerAboutButton;

    @FindBy(xpath = "(//*[text()='About'])[2]")
    public WebElement footerAboutButton;

    @FindBy(xpath = "(//*[text()='FAQs'])[1]")
    public WebElement faqsButton;

    @FindBy(xpath = "(//*[text()='Blog'])[1]")
    public WebElement blogButton;

    @FindBy(xpath = "(//*[text()='Contact'])[1]")
    public WebElement contactButton;

}
