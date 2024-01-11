package pages.visitor;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorTermsAndConditions {
    public VisitorTermsAndConditions(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
