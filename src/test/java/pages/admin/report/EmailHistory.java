package pages.admin.report;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EmailHistory {
    public EmailHistory(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Report ']")
    public WebElement reportMenu;

    @FindBy(xpath = "//*[text()='Email History']")
    public WebElement emailHistoryLink;

    @FindBy(xpath = "(//*[@class='fas fa-desktop'])[1]")
    public WebElement actionButton;

    @FindBy(xpath = "//div/p")
    public List<WebElement> emailDetailsInfo;

    @FindBy(xpath = "//*[text()='Payment Completed Successfully']")
    public WebElement labelPaymentCompletedSuccessfully;

    @FindBy(xpath = "//tbody/tr[1]/td")
    public List<WebElement> rowTitleList;
}
