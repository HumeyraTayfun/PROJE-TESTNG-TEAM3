package pages.admin.supportRequests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PendingRequests {
    public PendingRequests(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@data-original-title='Details']")
    public WebElement detailsButton;

    @FindBy(xpath = "//*[text()='Support Requests']")
    public WebElement supportRequests;

    @FindBy(xpath = "//*[text()='All Requests']")
    public WebElement allRequests;

    @FindBy(xpath = "//*[text()='Pending Requests']")
    public WebElement pendingRequests;

    @FindBy(xpath = "//*[text()='Closed Requests']")
    public WebElement closedRequests;

    @FindBy(xpath = "//*[text()='Answered Requests']")
    public WebElement answeredRequests;
}
