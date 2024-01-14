package tests.Burcu;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.UserSignIn;
import pages.user.registeredUser.BookingHistory;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US14 {
    BookingHistory locator = new BookingHistory();
    VisitorHomePage visitorHomePage=new VisitorHomePage();
    UserSignIn signInLoc = new UserSignIn();

    @Test
    public void TestCase14(){
        SoftAssert softAssert1=new SoftAssert();


        //1-User goes to the home page: https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
        //2-User enters credentials, then clicks Log In Button
        signInLoc.usernameBox.sendKeys(ConfigReader.getProperty("burcuUsername"));
        signInLoc.passwordBox.sendKeys(ConfigReader.getProperty("burcudurakPassword"));
        signInLoc.checkBoxRememberMe.click();
        signInLoc.loginButton.click();

        //3-User must click on header booking button.
        locator.HeaderBooking.click();
        //4-user must click on header booking history button.
        locator.BookingHistroyRezervasyonGecmişi.click();


    }
}
