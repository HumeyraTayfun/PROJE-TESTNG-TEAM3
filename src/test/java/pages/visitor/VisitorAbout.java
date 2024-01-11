package pages.visitor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorAbout {
    public VisitorAbout() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//h2[@class='title'])[1]")
    public WebElement aboutTitle;

    @FindBy (xpath = "(//div[@class='section-header'])[1]")
    public WebElement aboutPageTextInformation;
}
