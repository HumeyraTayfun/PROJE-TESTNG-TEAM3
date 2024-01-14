package pages.admin.paymentHistory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AllPayment {
    public AllPayment(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Payment History']")
    public WebElement paymentHistoryLink;

    @FindBy(xpath = "(//*[text()='All Payment'])[1]")
    public WebElement allPaymentLink;

    @FindBy(xpath = "//tbody/tr[1]/td")
    public List<WebElement> rowTitleList;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement trxNumberUserNameSearchBox;

    @FindBy(xpath = "//*[@placeholder='Min date - Max date']")
    public WebElement minDateMaxDateSearchBox;

    @FindBy(xpath = "(//*[@class='btn btn--primary'])[1]")
    public WebElement searchBoxIcon1;

    @FindBy(xpath = "(//*[@class='btn btn--primary'])[2]")
    public WebElement searchBoxIcon2;

    @FindBy(xpath = "(//*[@class='la la-desktop'])[1]")
    public WebElement actionButton;

    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement labelPaymentHistorySearch;

    @FindBy(xpath = "//*[text()='Deposit Via Stripe Hosted']")
    public WebElement labelDepositViaStripeHosted;





}
