package tests.Burcu;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.AdminSignIn;
import pages.user.UserSignIn;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US22 {
    SoftAssert softAssert = new SoftAssert();
    AdminDashboard adminDashboard = new AdminDashboard();
    AdminSignIn signInLoc = new AdminSignIn();

    @BeforeTest
    public void LogIn(){
        //1-User goes to the home page: https://qa.easybusticket.com/admin
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        // 1-User displays the "Dashboard" page.(kullanıcı kontrol paneli sayfasını görüntuler)
        signInLoc.usernameBox.sendKeys(ConfigReader.getProperty("burcuAdminUsername"));
        signInLoc.passwordBox.sendKeys(ConfigReader.getProperty("burcuAdminPassword"));
        ReusableMethods.wait(1);
        signInLoc.loginButton.click();
    }
    @BeforeMethod(alwaysRun = true)
    public void DashboardPage(){
        //1-User goes to the home page: https://qa.easybusticket.com/admin
        ReusableMethods.wait(1);
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl") + "dashboard");
        ReusableMethods.wait(1);
    }
    @AfterClass(alwaysRun = true)
    public void CleanUp(){
        Driver.quitDriver();
        ReusableMethods.wait(1);
    }
    @Test(priority = 1)
    public void TestCase_ViewAllTotalUsers(){
        //2- User clicks on "View All" button for "Total Users".
        adminDashboard.ViewAllTotalUsers.click();
        //3- User displays "Manage Users" page.
        adminDashboard.ManageUsers.isDisplayed();
    }
    @Test(priority = 2)
    public void TestCase_ViewAllTotalEmailUnverifiedUsers(){
        //2- User clicks on "View All" button for "TotalEmailUnverifiedUsers".
        adminDashboard.ViewAllTotalEmailUnverifiedUsers.click();
        //3- User displays "Manage Users" page.
        adminDashboard.ManageUsers.isDisplayed();
    }
    @Test
    public void TestCase_ViewAllTotalSMSUnverifiedUsers(){
        //2- User clicks on "View All" button for "TotalSMSUnverifiedUsers".
        adminDashboard.ViewAllTotalSMSUnverifiedUsers.click();
        //3- User displays "Manage Users" page.
        adminDashboard.ManageUsers.isDisplayed();
    }
    @Test
    public void TestCase_ViewAllPendingPayment(){
        //2- User clicks on "View All" button for "PendingPayment".
        adminDashboard.ViewAllPendingPayment.click();
        //3- User displays "Manage Users" page.
        adminDashboard.ManageUsers.isDisplayed();
    }
    @Test
    public void TestCase_ViewAllRejectedPayment(){
        //2- User clicks on "View All" button for "AllRejectedPayment".
        adminDashboard.ViewAllRejectedPayment.click();
        //3- User displays "Manage Users" page.
        adminDashboard.ManageUsers.isDisplayed();
    }
    @Test
    public void TestCase_ViewAllACVehicle(){
        //2- User clicks on "View All" button for "AllACVehicle".
        adminDashboard.ViewAllACVehicle.click();
        //3- User displays "Manage Users" page.
        adminDashboard.ManageUsers.isDisplayed();
    }
    @Test
    public void TestCase_ViewAllNonACVehicle(){
        //2- User clicks on "View All" button for "NonACVehicle".
        adminDashboard.ViewAllNonACVehicle.click();
        //3- User displays "Manage Users" page.
        adminDashboard.ManageUsers.isDisplayed();
    }
    @Test()
    public void TestCase_ViewAllTotalCounter(){
        //2- User clicks on "View All" button for "TotalCounter".(kullanıı toplam kullanıcı için tümünü görüntüle dügmesine tıklar)
        adminDashboard.ViewAllTotalCounter.click();
        //3- Admin dashboard page should display last 30 days payment history(yönetici kontrol paneli son 30 günlük ödeme geçmişini göstermelidir.)
        adminDashboard.ManageUsers.isDisplayed();
    }
    @Test()
    public void TestCase_(){
        //2- Admin dashboard page should display latest bookıng History
        adminDashboard.lastestBookingHistory.click();
        //3- Admin dashboard page should display last 30 days payment history(yönetici kontrol paneli son 30 günlük ödeme geçmişini göstermelidir.)
        adminDashboard.last30daysPaymentHistory.isDisplayed();
    }
    }




