package tests.Murat;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.AdminSignIn;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Reporter;
import utilities.ReusableMethods;

public class US34 extends Reporter {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCase01(){

        SoftAssert softAssert = new SoftAssert();

        //1- User go to the "https://qa.easybusticket.com/admin".
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        AdminSignIn adminSignIn = new AdminSignIn();

        //2- User clicks on "Username" box.
        adminSignIn.usernameBox.click();

        //3- User enters a valid username.
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("muratAdmin"));

        //4- User clicks on "Password" box.
        adminSignIn.passwordBox.click();

        //5- User enters a valid password.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("muratAdminPassword"));
        //6- User clicks the "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(2);

        AdminDashboard adminDashboard = new AdminDashboard();

        //7 - Admin clicks the username on header section.
        adminDashboard.loggedAdmin.click();

        //8 - Admin clicks on the profile link in the drop-down menu.
        adminDashboard.adminProfile.click();

        //9 - Admin reaches "https://qa.easybusticket.com/admin/profile" page.
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/admin/profile"));

        //10 - Admin clicks "Password Settings" button.
        adminDashboard.adminPasswordSettings.click();

        //11 - Admin reaches "https://qa.easybusticket.com/admin/password" page.
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/admin/password"));

        Driver.quitDriver();
    }

    @Test
    public void testCase02(){

        SoftAssert softAssert = new SoftAssert();

        //1- User go to the "https://qa.easybusticket.com/admin".
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        AdminSignIn adminSignIn = new AdminSignIn();

        //2- User clicks on "Username" box.
        adminSignIn.usernameBox.click();

        //3- User enters a valid username.
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("muratAdmin"));

        //4- User clicks on "Password" box.
        adminSignIn.passwordBox.click();

        //5- User enters a valid password.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("muratAdminPassword"));
        //6- User clicks the "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(2);

        AdminDashboard adminDashboard = new AdminDashboard();

        //7 - Admin clicks the username on header section.
        adminDashboard.loggedAdmin.click();



        //8 - Admin clicks on the profile link in the drop-down menu.
        adminDashboard.adminProfile.click();

        //9 - Admin reaches "https://qa.easybusticket.com/admin/profile" page.
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/admin/profile"));

        //10 - Admin clicks "Password Settings" button.
        adminDashboard.adminPasswordSettings.click();

        //11 - Admin reaches "https://qa.easybusticket.com/admin/password" page.
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/admin/password"));

        //12 - Admin clicks on "Password" box.
        adminDashboard.psPassword.click();

        //13 - Admin enters a valid password.
        adminDashboard.psPassword.sendKeys(ConfigReader.getProperty("muratAdminPassword"));

        //14 - Admin clicks on "New Password" box.
        adminDashboard.psNewPassword.click();

        //15 - Admin enters a new password.
        adminDashboard.psNewPassword.sendKeys(ConfigReader.getProperty("muratAdminPassword"));

        //16 - Admin clicks on "Confirm Password" box.
        adminDashboard.psConfirmPassword.click();

        //17 - Admin enters a new password again.
        adminDashboard.psConfirmPassword.sendKeys(ConfigReader.getProperty("muratAdminPassword"));

        //18 - Admin clicks "Save Changes" button.
        adminDashboard.saveChangesButton.click();

        //19 - Admin sees "Password changed successfully" alert text.
        ReusableMethods.wait(2);
        softAssert.assertTrue(adminDashboard.alertMessage.isDisplayed());

        Driver.quitDriver();
    }

    @Test
    public void testCase03(){

        AdminSignIn adminSignIn = new AdminSignIn();

        //1- User go to the "https://qa.easybusticket.com/admin".
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //2- User clicks on "Username" box.
        adminSignIn.usernameBox.click();

        //3- User enters a valid username.
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("muratAdmin"));

        //4- User clicks on "Password" box.
        adminSignIn.passwordBox.click();

        //5- User enters a valid password.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("muratAdminPassword"));
        //6- User clicks the "Login" button.
        adminSignIn.loginButton.click();

        AdminDashboard adminDashboard = new AdminDashboard();

        //7 - Admin clicks the username on header section.
        adminDashboard.loggedAdmin.click();

        //8 - Admin clicks on the "Logout" link in the drop-down menu.
        adminDashboard.adminLogout.click();

        //9 - Admin reaches "https://qa.easybusticket.com/admin".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("adminUrl")));

        Driver.quitDriver();
    }

    @Test
    public void testCase04(){ extentTest = extentReports.createTest("Admin Password Degistirme","Admin Sifre Değiştirirken Aynı Şifreyi Tekrar Kullanamamalı");

        //1- User go to the "https://qa.easybusticket.com/admin".
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        extentTest.info("User go to the https://qa.easybusticket.com/admin");

        AdminSignIn adminSignIn = new AdminSignIn();

        //2- User clicks on "Username" box.
        ReusableMethods.wait(2);
        adminSignIn.usernameBox.click();
        extentTest.info("User clicks on Username box.");

        //3- User enters a valid username.
        ReusableMethods.wait(2);
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("muratAdmin"));
        extentTest.info("User enters a valid username.");

        //4- User clicks on "Password" box.
        ReusableMethods.wait(2);
        adminSignIn.passwordBox.click();
        extentTest.info("User clicks on Password box.");

        //5- User enters a valid password.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("muratAdminPassword"));
        ReusableMethods.wait(2);
        extentTest.info("User enters a valid password.");
        ReusableMethods.wait(2);

        //6- User clicks the "Login" button.
        adminSignIn.loginButton.click();
        extentTest.info("User clicks the Login button.");
        ReusableMethods.wait(2);

        AdminDashboard adminDashboard = new AdminDashboard();

        //7 - Admin clicks the username on header section.
        adminDashboard.loggedAdmin.click();
        extentTest.info("Admin clicks the username on header section.");
        ReusableMethods.wait(2);

        //8 - Admin clicks on the profile link in the drop-down menu.
        adminDashboard.adminProfile.click();
        extentTest.info("Admin clicks on the profile link in the drop-down menu.");
        ReusableMethods.wait(2);

        //9 - Admin reaches "https://qa.easybusticket.com/admin/profile" page.
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/admin/profile"));
        extentTest.pass("Admin reaches https://qa.easybusticket.com/admin/profile page.");
        ReusableMethods.wait(2);

        //10 - Admin clicks "Password Settings" button.
        adminDashboard.adminPasswordSettings.click();
        extentTest.info("Admin clicks Password Settings button.");
        ReusableMethods.wait(2);

        //11 - Admin reaches "https://qa.easybusticket.com/admin/password" page.
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/admin/password"));
        extentTest.pass("Admin reaches https://qa.easybusticket.com/admin/password page.");
        ReusableMethods.wait(2);

        //12 - Admin clicks on "Password" box.
        adminDashboard.psPassword.click();
        extentTest.info("Admin clicks on Password box.");
        ReusableMethods.wait(2);

        //13 - Admin enters a valid password.
        adminDashboard.psPassword.sendKeys(ConfigReader.getProperty("muratAdminPassword"));
        extentTest.info("Admin enters a valid password.");
        ReusableMethods.wait(2);

        //14 - Admin clicks on "New Password" box.
        adminDashboard.psNewPassword.click();
        extentTest.info("Admin clicks on New Password box.");
        ReusableMethods.wait(2);

        //15 - Admin enters his/her own same password.
        adminDashboard.psNewPassword.sendKeys(ConfigReader.getProperty("muratAdminPassword"));
        extentTest.info("Admin enters his/her own same password.");
        ReusableMethods.wait(2);

        //16 - Admin clicks on "Confirm Password" box.
        adminDashboard.psConfirmPassword.click();
        extentTest.info("Admin clicks on Confirm Password box.");
        ReusableMethods.wait(2);

        //17 - Admin enters a same password again.
        adminDashboard.psConfirmPassword.sendKeys(ConfigReader.getProperty("muratAdminPassword"));
        extentTest.info("Admin enters a same password again.");
        ReusableMethods.wait(2);


        //18 - Admin clicks "Save Changes" button.
        adminDashboard.saveChangesButton.click();
        extentTest.info("Admin clicks Save Changes button.");
        ReusableMethods.wait(2);

        //19 - Admin should see the warning that passwords should not be the same.
        ReusableMethods.wait(2);
        softAssert.assertFalse(adminDashboard.alertMessage.isDisplayed(),"Passwords should not be the same");
        extentTest.info("Admin should see the warning that passwords should not be the same.");

        softAssert.assertAll();

        extentTest.info("User close the page");
    }
}