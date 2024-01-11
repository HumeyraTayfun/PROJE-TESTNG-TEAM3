package pages.admin.supportRequests;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PendingRequests {
    public PendingRequests(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
