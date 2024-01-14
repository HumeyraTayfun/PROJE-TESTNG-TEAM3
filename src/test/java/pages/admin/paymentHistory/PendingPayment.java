package pages.admin.paymentHistory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PendingPayment {
    public PendingPayment(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[text()='Pending Payment'])[1]")
    public WebElement pendingPaymentLink;

    @FindBy(xpath = "//*[text()='There is no pending payment']")
    public WebElement labelThereİsNoPendingPayment;

}
