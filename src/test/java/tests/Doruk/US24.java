package tests.Doruk;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.AdminSignIn;
import pages.admin.manageUsers.*;
import pages.admin.user.UserDetail;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US24 {

    @Test
    public void testCase01() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("adminUrl")
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminUrl");
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Manage Users" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.ManageUsers.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "All Users" button.
        adminDashboard.AllUsers.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with all users displayed.
        AllUsers allUsers = new AllUsers();
        softAssert.assertTrue(allUsers.detailsButton.isDisplayed(), "All users page DID NOT open!");

        ReusableMethods.wait(1);

        // 10 - In the drop-down list that opens, click on the "Active Users" button.
        allUsers.activeUsers.click();

        ReusableMethods.wait(1);

        // 11 - Check that the page opens with active users displayed.
        ActiveUsers activeUsers = new ActiveUsers();
        softAssert.assertTrue(activeUsers.detailsButton.isDisplayed(), "Active users page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - In the drop-down list that opens, click on the "Banned Users" button.
        activeUsers.bannedUsers.click();

        ReusableMethods.wait(1);

        // 13 - Check that the page opens with banned users displayed.
        BannedUsers bannedUsers = new BannedUsers();
        softAssert.assertTrue(bannedUsers.detailsButton.isDisplayed(), "Banned users page DID NOT open!");

        ReusableMethods.wait(1);

        // 14 - In the drop-down list that opens, click on the "All Users" button.
        bannedUsers.emailUnverified.click();

        ReusableMethods.wait(1);

        // 15 - Check that the page opens with email unverified users displayed.
        EmailUnverified emailUnverified = new EmailUnverified();
        softAssert.assertTrue(emailUnverified.detailsButton.isDisplayed(), "Email unverified users page DID NOT open!");

        ReusableMethods.wait(1);

        // 16 - In the drop-down list that opens, click on the "SMS Unverified" button.
        emailUnverified.smsUnverified.click();

        ReusableMethods.wait(1);

        // 17 - Check that the page opens with SMS unverified users displayed.
        SMSUnverified smsUnverified = new SMSUnverified();
        softAssert.assertTrue(smsUnverified.detailsButton.isDisplayed(), "SMS unverified users page DID NOT open!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase02() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("adminUrl")
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminUrl");
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Manage Users" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.ManageUsers.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "All Users" button.
        adminDashboard.AllUsers.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with all users displayed.
        // 10 - Click on the "Details" button on the far right of the 1st user in the table.
        AllUsers allUsers = new AllUsers();
        softAssert.assertTrue(allUsers.detailsButton.isDisplayed(), "All users page DID NOT open!");
        allUsers.detailsButton.click();

        ReusableMethods.wait(1);

        // 11 - Check that user details page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/user/detail/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User details page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - Check whether the "Email Verification" status is "Verified" or "Unverified".
        UserDetail userDetail = new UserDetail();
        softAssert.assertTrue(userDetail.emailVerified.isDisplayed() || userDetail.emailUnverified.isDisplayed(), "Email verification status is NOT displayed!");

        ReusableMethods.wait(1);

        // 13 - Check whether the "SMS Verification" status is "Verified" or "Unverified".
        softAssert.assertTrue(userDetail.smsVerified.isDisplayed() || userDetail.smsUnverified.isDisplayed(), "SMS verification status is NOT displayed!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase03() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("adminUrl")
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminUrl");
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Manage Users" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.ManageUsers.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "Active Users" button.
        adminDashboard.activeUsers.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with active users displayed.
        // 10 - Click on the "Details" button on the far right of the 1st user in the table.
        ActiveUsers activeUsers = new ActiveUsers();
        softAssert.assertTrue(activeUsers.detailsButton.isDisplayed(), "Active users page DID NOT open!");
        activeUsers.detailsButton.click();

        ReusableMethods.wait(1);

        // 11 - Check that user details page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/user/detail/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User details page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - Check whether the "Email Verification" status is "Verified" or "Unverified".
        UserDetail userDetail = new UserDetail();
        softAssert.assertTrue(userDetail.emailVerified.isDisplayed() || userDetail.emailUnverified.isDisplayed(), "Email verification status is NOT displayed!");

        ReusableMethods.wait(1);

        // 13 - Check whether the "SMS Verification" status is "Verified" or "Unverified".
        softAssert.assertTrue(userDetail.smsVerified.isDisplayed() || userDetail.smsUnverified.isDisplayed(), "SMS verification status is NOT displayed!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase04() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("adminUrl")
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminUrl");
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Manage Users" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.ManageUsers.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "Banned Users" button.
        adminDashboard.bannedUsers.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with active users displayed.
        // 10 - Click on the "Details" button on the far right of the 1st user in the table.
        BannedUsers bannedUsers = new BannedUsers();
        softAssert.assertTrue(bannedUsers.detailsButton.isDisplayed(), "Banned users page DID NOT open!");
        bannedUsers.detailsButton.click();

        ReusableMethods.wait(1);

        // 11 - Check that user details page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/user/detail/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User details page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - Check whether the "Email Verification" status is "Verified" or "Unverified".
        UserDetail userDetail = new UserDetail();
        softAssert.assertTrue(userDetail.emailVerified.isDisplayed() || userDetail.emailUnverified.isDisplayed(), "Email verification status is NOT displayed!");

        ReusableMethods.wait(1);

        // 13 - Check whether the "SMS Verification" status is "Verified" or "Unverified".
        softAssert.assertTrue(userDetail.smsVerified.isDisplayed() || userDetail.smsUnverified.isDisplayed(), "SMS verification status is NOT displayed!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase05() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("adminUrl")
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminUrl");
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Manage Users" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.ManageUsers.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "Email Unverified Users" button.
        adminDashboard.emailUnverified.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with active users displayed.
        // 10 - Click on the "Details" button on the far right of the 1st user in the table.
        EmailUnverified emailUnverified = new EmailUnverified();
        softAssert.assertTrue(emailUnverified.detailsButton.isDisplayed(), "Email unverified users page DID NOT open!");
        emailUnverified.detailsButton.click();

        ReusableMethods.wait(1);

        // 11 - Check that user details page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/user/detail/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User details page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - Check whether the "Email Verification" status is "Verified" or "Unverified".
        UserDetail userDetail = new UserDetail();
        softAssert.assertTrue(userDetail.emailVerified.isDisplayed() || userDetail.emailUnverified.isDisplayed(), "Email verification status is NOT displayed!");

        ReusableMethods.wait(1);

        // 13 - Check whether the "SMS Verification" status is "Verified" or "Unverified".
        softAssert.assertTrue(userDetail.smsVerified.isDisplayed() || userDetail.smsUnverified.isDisplayed(), "SMS verification status is NOT displayed!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase06() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("adminUrl")
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminUrl");
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Manage Users" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.ManageUsers.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "SMS Unverified Users" button.
        adminDashboard.smsUnverified.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with active users displayed.
        // 10 - Click on the "Details" button on the far right of the 1st user in the table.
        SMSUnverified smsUnverified = new SMSUnverified();
        softAssert.assertTrue(smsUnverified.detailsButton.isDisplayed(), "SMS unverified users page DID NOT open!");
        smsUnverified.detailsButton.click();

        ReusableMethods.wait(1);

        // 11 - Check that user details page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/user/detail/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User details page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - Click "Login as User" button.
        UserDetail userDetail = new UserDetail();
        softAssert.assertTrue(userDetail.emailVerified.isDisplayed() || userDetail.emailUnverified.isDisplayed(), "Email verification status is NOT displayed!");

        ReusableMethods.wait(1);

        // 13 - Check whether the "SMS Verification" status is "Verified" or "Unverified".
        softAssert.assertTrue(userDetail.smsVerified.isDisplayed() || userDetail.smsUnverified.isDisplayed(), "SMS verification status is NOT displayed!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase07() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("adminUrl")
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminUrl");
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Manage Users" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.ManageUsers.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "All Users" button.
        adminDashboard.AllUsers.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with active users displayed.
        // 10 - Click on the "Details" button on the far right of the 1st user in the table.
        AllUsers allUsers = new AllUsers();
        softAssert.assertTrue(allUsers.detailsButton.isDisplayed(), "All users page DID NOT open!");
        allUsers.detailsButton.click();

        ReusableMethods.wait(1);

        // 11 - Check that user details page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/user/detail/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User details page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - Click "Login as User" button.
        UserDetail userDetail = new UserDetail();
        userDetail.loginAsUser.click();

        ReusableMethods.wait(1);

        // 13 - Check that you are logged in as a user.
        String newHandle = Driver.getDriver().getWindowHandles().toArray()[1].toString();
        Driver.getDriver().switchTo().window(newHandle);
        actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actualUrl.contains("https://qa.easybusticket.com/user/"), "User page DID NOT open!");

        softAssert.assertAll();
    }

    @Test
    public void testCase08() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("adminUrl")
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminUrl");
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Manage Users" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.ManageUsers.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "Active Users" button.
        adminDashboard.activeUsers.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with active users displayed.
        // 10 - Click on the "Details" button on the far right of the 1st user in the table.
        ActiveUsers activeUsers = new ActiveUsers();
        softAssert.assertTrue(activeUsers.detailsButton.isDisplayed(), "Active users page DID NOT open!");
        activeUsers.detailsButton.click();

        ReusableMethods.wait(1);

        // 11 - Check that user details page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/user/detail/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User details page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - Click "Login as User" button.
        UserDetail userDetail = new UserDetail();
        userDetail.loginAsUser.click();

        ReusableMethods.wait(1);

        // 13 - Check that you are logged in as a user.
        String newHandle = Driver.getDriver().getWindowHandles().toArray()[1].toString();
        Driver.getDriver().switchTo().window(newHandle);
        actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actualUrl.contains("https://qa.easybusticket.com/user/"), "User page DID NOT open!");

        softAssert.assertAll();
    }

    @Test
    public void testCase09() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("adminUrl")
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminUrl");
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Manage Users" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.ManageUsers.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "Banned Users" button.
        adminDashboard.bannedUsers.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with active users displayed.
        // 10 - Click on the "Details" button on the far right of the 1st user in the table.
        BannedUsers bannedUsers = new BannedUsers();
        softAssert.assertTrue(bannedUsers.detailsButton.isDisplayed(), "Banned users page DID NOT open!");
        bannedUsers.detailsButton.click();

        ReusableMethods.wait(1);

        // 11 - Check that user details page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/user/detail/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User details page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - Click "Login as User" button.
        UserDetail userDetail = new UserDetail();
        userDetail.loginAsUser.click();

        ReusableMethods.wait(1);

        // 13 - Check that you are logged in as a user.
        String newHandle = Driver.getDriver().getWindowHandles().toArray()[1].toString();
        Driver.getDriver().switchTo().window(newHandle);
        actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actualUrl.contains("https://qa.easybusticket.com/user/"), "User page DID NOT open!");

        softAssert.assertAll();
    }

    @Test
    public void testCase10() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("adminUrl")
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminUrl");
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Manage Users" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.ManageUsers.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "Email Unverified Users" button.
        adminDashboard.emailUnverified.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with active users displayed.
        // 10 - Click on the "Details" button on the far right of the 1st user in the table.
        EmailUnverified emailUnverified = new EmailUnverified();
        softAssert.assertTrue(emailUnverified.detailsButton.isDisplayed(), "E-mail unverified users page DID NOT open!");
        emailUnverified.detailsButton.click();

        ReusableMethods.wait(1);

        // 11 - Check that user details page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/user/detail/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User details page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - Click "Login as User" button.
        UserDetail userDetail = new UserDetail();
        userDetail.loginAsUser.click();

        ReusableMethods.wait(1);

        // 13 - Check that you are logged in as a user.
        String newHandle = Driver.getDriver().getWindowHandles().toArray()[1].toString();
        Driver.getDriver().switchTo().window(newHandle);
        actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actualUrl.contains("https://qa.easybusticket.com/user/"), "User page DID NOT open!");

        softAssert.assertAll();
    }

    @Test
    public void testCase11() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("adminUrl")
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("adminUrl");
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Manage Users" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.ManageUsers.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "SMS Unverified Users" button.
        adminDashboard.smsUnverified.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with active users displayed.
        // 10 - Click on the "Details" button on the far right of the 1st user in the table.
        SMSUnverified smsUnverified = new SMSUnverified();
        softAssert.assertTrue(smsUnverified.detailsButton.isDisplayed(), "SMS unverified users page DID NOT open!");
        smsUnverified.detailsButton.click();

        ReusableMethods.wait(1);

        // 11 - Check that user details page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/user/detail/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User details page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - Click "Login as User" button.
        UserDetail userDetail = new UserDetail();
        userDetail.loginAsUser.click();

        ReusableMethods.wait(1);

        // 13 - Check that you are logged in as a user.
        String newHandle = Driver.getDriver().getWindowHandles().toArray()[1].toString();
        Driver.getDriver().switchTo().window(newHandle);
        actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actualUrl.contains("https://qa.easybusticket.com/user/"), "User page DID NOT open!");

        softAssert.assertAll();
    }
}
