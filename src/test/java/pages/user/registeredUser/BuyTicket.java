package pages.user.registeredUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BuyTicket {
    public BuyTicket(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//div[@class='ticket-item']")
    public WebElement ticketPurchaseScreen;

    @FindBy (xpath = "//div[@class='ticket-wrapper']")
    public WebElement ticketOptions;

    @FindBy (xpath = "//a[@class='btn btn--base']")
    public WebElement selectSeatButton;

    @FindBy (xpath = "//input[@id='female']")
    public WebElement checkBoxFemale;

    @FindBy (xpath = "(//span[@class='seat'])[1]")
    public WebElement selectSeatNumberButton;

    @FindBy (xpath = "//*[text()='NaN USD']")
    public WebElement ticketPriceDisplay;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement continueButton;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement confirmButton;

    @FindBy (xpath = "//h5[@class='title']")
    public WebElement paymentText;

    @FindBy (xpath = "(//a[@href='javascript:void(0)'])[1]")
    public WebElement payNowButton;

    @FindBy (xpath = "//h2[@class='title']")
    public WebElement paymentPreviewPage;

    @FindBy (xpath = "//a[@href='https://qa.easybusticket.com/user/ticket-booking/payment/confirm']")
    public WebElement payNowButtonLast;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement nameOnCardButton;

    @FindBy (xpath = "(//input[@type='tel'])[1]")
    public WebElement CardNumberButton;

    @FindBy (xpath = "(//input[@class='form--control input-sz custom-input jp-card-invalid'])[1]")
    public WebElement expirationDateButton;

    @FindBy (xpath = "(//input[@type='tel'])[3]")
    public WebElement cvcButton;

    @FindBy (xpath = " //button[@class='btn btn--base h-40']")
    public WebElement stripePaymentPayButton;

    @FindBy (xpath = "//section[@class='dashboard-section padding-top padding-bottom']")
    public WebElement ticketInformationTable;

    @FindBy (xpath = "//span[@class='badge badge--success']")
    public WebElement ticketStatus;

    @FindBy (xpath = "//i[@class='las la-print']")
    public WebElement printTicketButton;

    @FindBy (xpath = "//div[@class='ticket-inner']")
    public WebElement printingPage;

    @FindBy (xpath = "//button[@type='button']")
    public WebElement downloadTicketButton;









}
