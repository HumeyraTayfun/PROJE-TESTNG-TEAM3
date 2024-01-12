package tests.Senayda;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class US21 {

    @Test
    public void testCase01() {

        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.

        ReusableMethods.adminLogin("senaydaAdminUsername", "senaydaAdminPassword");

        Driver.quitDriver();
    }
}
