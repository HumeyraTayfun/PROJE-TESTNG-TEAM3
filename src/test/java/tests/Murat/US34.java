package tests.Murat;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.AdminSignIn;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US34 {

    AdminSignIn adminSignIn = new AdminSignIn();
    AdminDashboard adminDashboard = new AdminDashboard();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCase01(){

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
        ReusableMethods.wait(1);
        softAssert.assertTrue(adminDashboard.alertMessage.isDisplayed());

        Driver.quitDriver();
    }

    @Test
    public void testCase03(){

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

        //7 - Admin clicks the username on header section.
        adminDashboard.loggedAdmin.click();

        //8 - Admin clicks on the "Logout" link in the drop-down menu.
        adminDashboard.adminLogout.click();

        //9 - Admin reaches "https://qa.easybusticket.com/admin".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("adminUrl")));

        Driver.quitDriver();
    }

    @Test
    public void testCase04(){

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

        //15 - Admin enters his/her own same password.
        adminDashboard.psNewPassword.sendKeys(ConfigReader.getProperty("muratAdminPassword"));

        //16 - Admin clicks on "Confirm Password" box.
        adminDashboard.psConfirmPassword.click();

        //17 - Admin enters a same password again.
        adminDashboard.psConfirmPassword.sendKeys(ConfigReader.getProperty("muratAdminPassword"));

        //18 - Admin clicks "Save Changes" button.
        adminDashboard.saveChangesButton.click();

        //19 - Admin should see the warning that passwords should not be the same.
        ReusableMethods.wait(1);
        softAssert.assertTrue(adminDashboard.alertMessage.isDisplayed());

        Driver.quitDriver();
    }
}