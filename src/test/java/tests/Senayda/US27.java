package tests.Senayda;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.paymentGateways.AutomaticGateways;
import pages.admin.paymentGateways.ManuelGateways;
import utilities.ReusableMethods;

public class US27 {
    @Test
    public void testCase01() {

        SoftAssert softAssert = new SoftAssert();
        AutomaticGateways automaticGateways = new AutomaticGateways();
        ManuelGateways manuelGateways = new ManuelGateways();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.

        ReusableMethods.adminLogin("senaydaAdminUsername", "senaydaAdminPassword");

        //  8- User verify the presence of the "Payment Gateways" menu and its sub-menus
        automaticGateways.paymentGateWaysMenu.click();
        Assert.assertTrue(automaticGateways.paymentGateWaysMenu.isDisplayed());

        // 9-  User click on the link associated with
        // "Automatic Gateways."under the "Payment Gateways" menu
        automaticGateways.automaticGatewaysLink.click();

        // 10- User displays "Automatic Gateways page"
        Assert.assertTrue(automaticGateways.automaticGatewaysPage.isDisplayed());

    }
        @Test
        public void testCase02() {

            SoftAssert softAssert = new SoftAssert();
            AutomaticGateways automaticGateways = new AutomaticGateways();
            ManuelGateways manuelGateways = new ManuelGateways();

            // 1- User go to the "https://qa.easybusticket.com/admin"
            // 2- User clicks on "Username" box.
            // 3- User enters a valid username.
            // 4- User clicks on "Password" box.
            // 5- User enters a valid password.
            // 6- User clicks the "Login" button.
            // 7- User displays the "Admin Dashboard" page.

            ReusableMethods.adminLogin("senaydaAdminUsername", "senaydaAdminPassword");

            // 8- User verify the presence of the "Payment Gateways" menu and its sub-menus
            automaticGateways.paymentGateWaysMenu.click();
            Assert.assertTrue(automaticGateways.paymentGateWaysMenu.isDisplayed());

           // "9- User click on the link associated with
            //  ""Manuel Gateways.""under the ""Payment Gateways"" menu"
            manuelGateways.manuelGatewaysLink.click();

          // 10- User displays "Manuel Gateways page"
            Assert.assertTrue(manuelGateways.manuelGatewaysLink.isDisplayed());

            // 11-  User click "Add new" button
            manuelGateways.addNewButton.click();
    }
}