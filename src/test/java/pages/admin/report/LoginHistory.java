package pages.admin.report;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LoginHistory {
    public LoginHistory(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Login History']")
    public WebElement loginHistoryLink;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement searchUserNameBox;

    @FindBy(xpath = "//*[@class='fa fa-search']")
    public WebElement searchBoxIcon;

    @FindBy(xpath = "//tbody/tr[1]/td")
    public List<WebElement> rowTitleList;

    @FindBy(xpath = "(//a[text()='asliekm'])[1]")
    public WebElement user;

    @FindBy(xpath = "(//span[@class='font-weight-bold'])[2]")
    public WebElement ıpLink;
}
