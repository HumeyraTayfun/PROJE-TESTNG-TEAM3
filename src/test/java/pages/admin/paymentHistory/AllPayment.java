package pages.admin.paymentHistory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllPayment {
    public AllPayment(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Payment History']")
    public WebElement paymentHistoryLink;

    @FindBy(xpath = "(//*[text()='All Payment'])[1]")
    public WebElement allPaymentLink;




}
