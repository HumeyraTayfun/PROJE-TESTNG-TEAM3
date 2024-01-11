package tests.İhsan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.AdminSignIn;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US26 {
    @Test
    public void testCase01(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Booking History" menu button.
        adminDashboard.bookingHistoryButton.click();

        // 9- User clicks on "Pending Ticket" option.
        adminDashboard.pendingTicketButton.click();

        // 10- User displays "Pending Ticket" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/ticket/pending";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Pending Ticket' page!");

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase02(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Booking History" menu button.
        adminDashboard.bookingHistoryButton.click();

        // 9- User clicks on "Booked Ticket" option.
        adminDashboard.bookedTicketButton.click();

        // 10- User displays "Booked Ticket" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/ticket/booked";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Booked Ticket' page!");

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase03(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Booking History" menu button.
        adminDashboard.bookingHistoryButton.click();

        // 9- User clicks on "Rejected Ticket" option.
        adminDashboard.rejectedTicketButton.click();

        // 10- User displays "Rejected Ticket" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/ticket/rejected";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Rejected Ticket' page!");

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase04(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Booking History" menu button.
        adminDashboard.bookingHistoryButton.click();

        // 9- User clicks on "All Ticket" option.
        adminDashboard.allTicketButton.click();

        // 10- User displays "All Ticket" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/ticket/list";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'All Ticket' page!");

        softAssert.assertAll();
        Driver.quitDriver();
    }
}
