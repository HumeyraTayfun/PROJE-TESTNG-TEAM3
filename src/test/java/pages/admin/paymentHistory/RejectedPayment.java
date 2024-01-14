package pages.admin.paymentHistory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RejectedPayment {
    public RejectedPayment(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[text()='Rejected Payment'])[1]")
    public WebElement rejectedPaymentLink;

}
