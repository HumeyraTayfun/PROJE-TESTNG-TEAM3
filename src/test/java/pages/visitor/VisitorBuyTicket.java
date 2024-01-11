package pages.visitor;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorBuyTicket {
    public VisitorBuyTicket(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
