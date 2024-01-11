package pages.visitor;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorTicketPolicies {
    public VisitorTicketPolicies(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
