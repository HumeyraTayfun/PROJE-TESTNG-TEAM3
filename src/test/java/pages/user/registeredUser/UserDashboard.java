package pages.user.registeredUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {
    public UserDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//h2[@class='title']")
    public WebElement dashboardTitle;

    @FindBy (xpath = "(//div[@class='dashboard-widget__content'])[1]")
    public WebElement totalBookedTicketPanel;

    @FindBy (xpath = "(//div[@class='dashboard-widget__content'])[2]")
    public WebElement totalRejectedTicketPanel;

    @FindBy (xpath = "(//div[@class='dashboard-widget__content'])[3]")
    public WebElement totalPendingTicketPanel;

    @FindBy (xpath = "//td[@data-label='Status']")
    public WebElement statusPanel;

    @FindBy(xpath = "//*[text()='Allow']")
    public WebElement cookiesAllow;

    @FindBy(xpath = "//*[@*='#0']")
    public WebElement linkProfile;

    @FindBy (xpath = "//a[@href='https://qa.easybusticket.com/user/dashboard']")
    public WebElement dashboardButton;

    @FindBy (xpath = "(//a[@href='javascript::void()'])[1]")
    public WebElement bookingButton;

    @FindBy (xpath = "(//a[@href='javascript::void()'])[2]")
    public WebElement supportRequestButton;

    @FindBy (xpath = "(//a[@href='https://qa.easybusticket.com/tickets'])[1]")
    public WebElement buyTicketButton;

    @FindBy(xpath = "//*[*='Create New']")
    public WebElement CreateNewButton;

    @FindBy(xpath = "//a[@href='https://qa.easybusticket.com/user/profile-setting']")
    public WebElement profileLinkDropdown;

    @FindBy(xpath = "(//*[text()='Profile'])[1]")
    public WebElement profileDropdown;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutButton;

}
