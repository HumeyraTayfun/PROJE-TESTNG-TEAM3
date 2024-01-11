package pages.visitor;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorBlog {
    public VisitorBlog(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
