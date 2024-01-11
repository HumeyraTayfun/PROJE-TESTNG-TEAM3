package pages.admin.supportRequests;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllRequests {
    public AllRequests(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
