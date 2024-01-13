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
}

