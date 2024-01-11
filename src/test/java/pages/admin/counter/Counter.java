package pages.admin.counter;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Counter {
    public Counter(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
