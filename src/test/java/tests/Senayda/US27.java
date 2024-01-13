package tests.Senayda;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.paymentGateways.AutomaticGateways;
import pages.admin.paymentGateways.ManuelGateways;
import utilities.ConfigReader;
import utilities.Driver;
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
            Actions action = new Actions(Driver.getDriver());

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

            // 12- User enters "Gateway Name"
            manuelGateways.gatewayNameColumn.click();
            manuelGateways.gatewayNameColumn.sendKeys(ConfigReader.getProperty("senaydaGatewayName"));

            // 13-  User enters "Currency"
            manuelGateways.currencyColumn.click();
            manuelGateways.currencyColumn.sendKeys(ConfigReader.getProperty("senaydaCurrency"));

            // 14- User enters "Rate"
            manuelGateways.rateColumn.click();
            manuelGateways.rateColumn.sendKeys(ConfigReader.getProperty("senaydaRate"));

           // 15- User add photo
           // manuelGateways.addPhotoButton.click();
           // String dynamicFilePath = System.getProperty("user.home") +
           //  "/Masaüstü/indir.png";
           // manuelGateways.addPhotoButton.sendKeys(dynamicFilePath);

            // 16- User enters "Minimum Amount"
            manuelGateways.minimumAmountColumn.click();
            manuelGateways.minimumAmountColumn.sendKeys(ConfigReader.getProperty("senaydaMinimumAmount"));

            // 17- User enters "Maximum Amount"
            manuelGateways.maximumAmountColumn.click();
            manuelGateways.maximumAmountColumn.sendKeys(ConfigReader.getProperty("senaydaMaximumAmount"));

            // 18- User enters "Fixed Charge"
            manuelGateways.fixedChargeColumn.click();
            manuelGateways.fixedChargeColumn.sendKeys(ConfigReader.getProperty("senaydaFixedCharge"));

            // 19- User enters "Percent Charge"
            manuelGateways.percentChargeColumn.click();
            manuelGateways.percentChargeColumn.sendKeys(ConfigReader.getProperty("senaydaPercentCharge"));

            action.sendKeys(Keys.PAGE_DOWN).perform();
            action.sendKeys(Keys.PAGE_DOWN).perform();
            action.sendKeys(Keys.PAGE_DOWN);

            // 20- User enters "Deposit Instruction"
            manuelGateways.depositInstructionText.sendKeys(ConfigReader.getProperty("senaydaDepositInstruction"));

            // 24- User clicks "Save Method" button
            manuelGateways.saveMethodButton.click();

            // 25- User displays "Manuel Gateways" page
            Assert.assertTrue(manuelGateways.getManuelGatewaysPage.isDisplayed());

            // 26- User clicks on " Action" button for the added Disable Gateways Schedule
            manuelGateways.actionButton.click();

            // 27- User clicks on "Disable" option
            manuelGateways.disableButton.click();

            // 27- User verifies that the is disabled
            // 28- User clicks edit button.
           // 29- User changes her/his name .
           //  30- User clicks "Save Method" button.




        }
}