package tests.Senayda;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.paymentGateways.AutomaticGateways;
import pages.admin.paymentGateways.ManuelGateways;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US33 {

    @Test
    public void testCase01() {

        AdminDashboard adminDashboard = new AdminDashboard();
        SoftAssert softAssert = new SoftAssert();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.

        ReusableMethods.adminLogin("senaydaAdminUsername", "senaydaAdminPassword");

        // 8- User clicks on the option button to make the page full screen in the header section
        adminDashboard.fullScreenButton.click();

        // 9- User displays the page full screen
        Assert.assertTrue(adminDashboard.displayFullScreen.isDisplayed());

        // 10- User clicks on the same option button to revert  to its previous, non-full-screen state
        adminDashboard.closeFullScreenPage.click();

        // 11- User displays the search button
        // 12- User clicks the search button in the header section
        adminDashboard.searchButton.click();
        Assert.assertTrue(adminDashboard.searchButton.isDisplayed());

        // 13- User enters "Booked Ticket"
        adminDashboard.searchText.click();
        adminDashboard.searchText.sendKeys(ConfigReader.getProperty("senaydaSearchText"));

        // 14- User displays the Booked Ticket page
        adminDashboard.bookedTicketPageEnter.click();
        Assert.assertTrue(adminDashboard.bookedTicketPage.isDisplayed());

        // 15- User displays the notification button in the header section.
        //16- User clicked notification button.
        ReusableMethods.bekle(1);
        adminDashboard.notificationButton.click();
        Assert.assertTrue(adminDashboard.notificationButton.isDisplayed());

        // 17- User views "You have (number of notification ) unread notification" under the notification header
        Assert.assertTrue(adminDashboard.notificationHeader.isDisplayed());

        // 18- User clicks the "View all notification" button
        //19- User displays all notifications in the notifications header

        adminDashboard.viewAllNotificationText.click();
        Assert.assertTrue(adminDashboard.viewAllNotificationText.isDisplayed());

        // 20- User clicks "Mark all as read" button
        adminDashboard.markAllAsReadButton.click();

        // 21- User displays message "Notifications read successfully"
        Assert.assertTrue(adminDashboard.notificationsReadSuccessfullyMessage.isDisplayed());
    }
}
