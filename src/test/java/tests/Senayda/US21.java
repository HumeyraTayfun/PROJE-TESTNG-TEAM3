package tests.Senayda;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.AdminSignIn;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Reporter;
import utilities.ReusableMethods;

public class US21 extends Reporter {

    @Test
    public void testCase01() { extentTest = extentReports.createTest("Login olma testi","Admin login olabilmeli");

        AdminSignIn adminSignIn = new AdminSignIn();
        SoftAssert softAssert = new SoftAssert();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        extentTest.info("User go to the https://qa.easybusticket.com/admin");
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        ReusableMethods.wait(2);

        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        extentTest.info("User clicks on Usernamebox." +
                " User enters a valid username.");
        adminSignIn.usernameBox.click();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("senaydaAdminUsername"));

        ReusableMethods.wait(2);

        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        extentTest.info("User clicks on Password box." +
                "User enters a valid password.");
        adminSignIn.passwordBox.click();
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("senaydaAdminPassword"));

        ReusableMethods.wait(2);

        // 6- User clicks the "Login" button.
        extentTest.info("User clicks the Login button");
        adminSignIn.loginButton.click();

        ReusableMethods.wait(2);

        // 7- User displays the "Admin Dashboard" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Admin Dashboard' page!");
        extentTest.pass("User displays the Admin Dashboard page.");

        softAssert.assertAll();

        extentTest.info("User close the page");
    }
}
