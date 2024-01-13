package pages.admin.paymentGateways;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManuelGateways {
    public ManuelGateways() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='menu-title'])[21]")
    public WebElement manuelGatewaysLink;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement getManuelGatewaysPage;

    @FindBy(xpath = "//a[@class='btn btn-sm btn--primary box--shadow1 text--small']")
    public WebElement addNewButton;

    @FindBy (xpath = "(//input[@type='text'])[1]")
    public WebElement gatewayNameColumn;

    @FindBy (xpath = "(//input[@type='text'])[2]")
    public WebElement currencyColumn;

    @FindBy (xpath = "(//input[@type='text'])[3]")
    public WebElement rateColumn;

    @FindBy (xpath = "//label[@for='image']")
    public WebElement addPhotoButton;

    @FindBy (xpath = "(//input[@type='text'])[4]")
    public WebElement minimumAmountColumn;

    @FindBy (xpath = "(//input[@type='text'])[5]")
    public WebElement maximumAmountColumn;

    @FindBy (xpath = "(//input[@type='text'])[6]")
    public WebElement fixedChargeColumn;

    @FindBy (xpath = "(//input[@type='text'])[7]")
    public WebElement percentChargeColumn;

    @FindBy (xpath = "//div[@contenteditable='true']")
    public WebElement depositInstructionText;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement saveMethodButton;

    @FindBy (xpath = "//a[@data-toggle='modal']")
    public WebElement actionButton;

    @FindBy (xpath = "(//button[@type='submit'])[3]")
    public WebElement disableButton;

    @FindBy (xpath = "(//tbody/tr/td/span)[1]")
    public WebElement disabledStatus;














}

