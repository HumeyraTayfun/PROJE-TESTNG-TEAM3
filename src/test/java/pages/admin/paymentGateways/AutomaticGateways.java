package pages.admin.paymentGateways;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomaticGateways {
    public AutomaticGateways(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "(//span[@class='menu-title'])[19]")
    public WebElement paymentGateWaysMenu;

    @FindBy(xpath = "(//span[@class='menu-title'])[20]")
    public WebElement automaticGatewaysLink;

    @FindBy (xpath = "//h6[@class='page-title']")
    public WebElement automaticGatewaysPage;
}
