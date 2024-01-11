package pages.visitor;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorPrivacyPolicy {
    public VisitorPrivacyPolicy(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
