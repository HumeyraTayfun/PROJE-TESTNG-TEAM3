package tests.Burcu;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.registeredUser.BookingHistory;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US14 {
    BookingHistory locator = new BookingHistory();

    @Test
    public void TestCase14(){
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        SoftAssert softAssert1=new SoftAssert();


        //1-User goes to the home page: https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //2-User must click on "Allow Cookies"button.
        ReusableMethods.wait(2);
        visitorHomePage.cookiesAllow.click();
       // 3-click on the reservation history page from the reservation menu
        ReusableMethods.userLogin(ConfigReader.getProperty("burcuUsername"),ConfigReader.getProperty("burcuPassword"));

        //4-ticket information available on the reservation history page should be
        //displayed(rezervazyon gecmısı sayfasında bulunan bilet bilgileri görüntülemelidir.)
         locator.HeaderBooking.click();
         locator.HeaderBookingHistory.click();
         locator.HeaderRezervasyonGecmişi.isDisplayed();

    }
}
