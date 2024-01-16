package tests.Burcu;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.AdminSignIn;
import pages.admin.counter.Counter;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US30 {
    @Test
    public void TestCase30(){

        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        AdminSignIn signInLoc = new AdminSignIn();
        Counter counter=new Counter();

            //1-User goes to the home page: https://qa.easybusticket.com/admin
            Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
            // 2-User displays the "Dashboard" page.(kullanıcı kontrol paneli sayfasını görüntuler)
            signInLoc.usernameBox.sendKeys(ConfigReader.getProperty("burcuAdminUsername"));
            signInLoc.passwordBox.sendKeys(ConfigReader.getProperty("burcuAdminPassword"));
            ReusableMethods.wait(1);
            signInLoc.loginButton.click();
        //3-Admin should be able to see the counter link in the trasport manager menu in the left menu on the dashboard page
        //(yönetıcı gösterge tablosu sayfasındakı sol menudekı taşıma yönetıcısı menusunde sayaç baglantısının görebilmelidir.)
         adminDashboard.Counter.click();
         //4-Admin clicks on add/new button(yonetıcı yenı ekle dügmesini tıklıyor)
        adminDashboard.AddNewDashboard.click();
        //5-Admin fills the from.(yonetıcı gelen kısmını doldurur)
        //6-"Add counter" username is added.(kullanıcı adı ekle)
         counter.AddNewName.sendKeys(ConfigReader.getProperty("Name"));
        //7-The city name is added to the counter
        counter. AddNewCity.sendKeys(ConfigReader.getProperty("City"));
        //8-The counter should be added to the location.
        counter.AddNewEnterLocation.sendKeys(ConfigReader.getProperty("Location"));
        //9-A phone number must be added to the meter
        counter. AddNewEnterCounterContactNumber.sendKeys(ConfigReader.getProperty("Mobile"));
        //10_Admin clicks on save button.
        counter.AddNewSave.click();
        //11-Admin  verfies that new added counter is visible.
        counter.AddNew.isDisplayed();







    }
}
