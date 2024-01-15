package tests.Azim;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class US23 {

    @Test
    public void test01(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        //1-User go to the "https://qa.easybusticket.com/admin"
        //2-User clicks on "Username" box.
        //3-User enters a valid username.
        //4-User clicks on "Password" box.
        //5-User enters a valid password.
        //6-User clicks the "Login" button.
        ReusableMethods.adminLogin("azimadmin","azimAdminPassword");

        //7-Click on the "Manage Users" button on the left sidebar.
        adminDashboard.ManageUsersClik.click();

        //8-In the drop-down list that opens, click on the "all users," button.
        adminDashboard.allUsers.click();

        //9-Verify that the "all users," page opens to display.
        String expectedAllUsersUrl="https://qa.easybusticket.com/admin/users";
        String actualAllUsersUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualAllUsersUrl,expectedAllUsersUrl,"All Users page is not visible");

        //10-User clicks on Search box.
        adminDashboard.AdminAllUsersSearchBox.sendKeys("1232141@kadkaskdka.com");
        //11- Enter valid user email address.
        adminDashboard.AdminAllUsersSearchBoxButton.click();

        //12-Click "Action" button.
        adminDashboard.ActionButton.click();

        ReusableMethods.bekle(2);

        //13-Verify visibility of user search page detail information page
        String expectedİnformationPageUrl="https://qa.easybusticket.com/admin/users";
        String actualİnformationPageUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualİnformationPageUrl,expectedİnformationPageUrl,"Active Users page is not visible");

        Driver.getDriver().quit();
    }
    @Test
    public void test02(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        //1-User go to the "https://qa.easybusticket.com/admin"
        //2-User clicks on "Username" box.
        //3-User enters a valid username.
        //4-User clicks on "Password" box.
        //5-User enters a valid password.
        //6-User clicks the "Login" button.
        ReusableMethods.adminLogin("azimadmin","azimAdminPassword");

        //7-Click on the "Manage Users" button on the left sidebar.
        adminDashboard.ManageUsersClik.click();

        //8-In the drop-down list that opens, click on the "active users" button.
        adminDashboard.activeUsers.click();

        //9- Verify that the "Active Users" page opens to display.
        String expectedActiveUsersUrl="https://qa.easybusticket.com/admin/users";
        String actualActiveUsersUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualActiveUsersUrl,expectedActiveUsersUrl,"Active Users page is not visible");

        //10-User clicks on Search box.
        adminDashboard.AdminAllUsersSearchBox.sendKeys("1232141@kadkaskdka.com");
        //11-Enter valid user email address.
        adminDashboard.AdminAllUsersSearchBoxButton.click();

        //12-Click "Action" button.
        adminDashboard.ActionButton.click();
        ReusableMethods.bekle(2);

        //13-Verify visibility of user search page detail information page
        String expectedİnformationPageUrl="https://qa.easybusticket.com/admin/users";
        String actualİnformationPageUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualİnformationPageUrl,expectedİnformationPageUrl,"Active Users page is not visible");

        Driver.getDriver().quit();
    }

    @Test
    public void test03(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        //1-User go to the "https://qa.easybusticket.com/admin"
        //2-User clicks on "Username" box.
        //3-User enters a valid username.
        //4-User clicks on "Password" box.
        //5-User enters a valid password.
        //6-User clicks the "Login" button.
        ReusableMethods.adminLogin("azimadmin","azimAdminPassword");

        //7-Click on the "Manage Users" button on the left sidebar.
        adminDashboard.ManageUsersClik.click();

        //9-In the drop-down list that opens, click on the "banned users" button.
        adminDashboard.BannedUsers.click();

        //10-Verify that the "Banned users" page opens to display.
        String expectedBennadusersUrl="https://qa.easybusticket.com/admin/users/banned";
        String actualBennadusersUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualBennadusersUrl,expectedBennadusersUrl,"Bennad users page is not visible");

        //11-Enter valid user email address.
        adminDashboard.AdminAllUsersSearchBox.sendKeys("1232141@kadkaskdka.com");
        adminDashboard.AdminAllUsersSearchBoxButton.click();

        //12-Click "Action" button.
        adminDashboard.ActionButton.click();

        //13-Verify visibility of user search page detail information page
        String expectedİnformationPageUrl="https://qa.easybusticket.com/admin/users";
        String actualİnformationPageUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualİnformationPageUrl,expectedİnformationPageUrl,"Active Users page is not visible");

        Driver.getDriver().quit();
    }

    @Test
    public void test04(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        //1-User go to the "https://qa.easybusticket.com/admin"
        //2-User clicks on "Username" box.
        //3-User enters a valid username.
        //4-User clicks on "Password" box.
        //5-User enters a valid password.
        //6-User clicks the "Login" button.
        ReusableMethods.adminLogin("azimadmin","azimAdminPassword");
        //7-Click on the "Manage Users" button on the left sidebar.
        adminDashboard.ManageUsersClik.click();

        //8-In the drop-down list that opens, click on the "Email unverified" button.
        adminDashboard.EmailUnverified.click();

        //9-Verify that the "Email unverified" page opens to display.
        String expectedEmailunverifiedUrl="https://qa.easybusticket.com/admin/users/email-unverified";
        String actualEmailunverifiedUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualEmailunverifiedUrl,expectedEmailunverifiedUrl,"Email unverified page is not visible");

        //10-User clicks on Search box.
        adminDashboard.AdminAllUsersSearchBox.sendKeys("1232141@kadkaskdka.com");
        //11-Enter valid user email address.
        adminDashboard.AdminAllUsersSearchBoxButton.click();

        //12-Click "Action" button.
        adminDashboard.ActionButton.click();

        //13-Verify visibility of user search page detail information page
        String expectedİnformationPageUrl="https://qa.easybusticket.com/admin/users";
        String actualİnformationPageUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualİnformationPageUrl,expectedİnformationPageUrl,"Active Users page is not visible");

        Driver.getDriver().quit();
    }
    @Test
    public void test05(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        //1-User go to the "https://qa.easybusticket.com/admin"
        //2-User clicks on "Username" box.
        //3-User enters a valid username.
        //4-User clicks on "Password" box.
        //5-User enters a valid password.
        //6-User clicks the "Login" button.
        ReusableMethods.adminLogin("azimadmin","azimAdminPassword");

        //7-Click on the "Manage Users" button on the left sidebar.
        adminDashboard.ManageUsersClik.click();
        //8-In the drop-down list that opens, click on the " sms unverified" button.
        adminDashboard.SMSUnverified.click();

        //9-Verify that the "sms unverified " page opens to display.
        String expectedsmsunverifiedUrl="https://qa.easybusticket.com/admin/users/sms-unverified";
        String actualsmsunverifiedUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualsmsunverifiedUrl,expectedsmsunverifiedUrl,"Smsunverified page is not visible");

        //10-User clicks on Search box.
        adminDashboard.AdminAllUsersSearchBox.sendKeys("1232141@kadkaskdka.com");
        //11-Enter valid user email address.
        adminDashboard.AdminAllUsersSearchBoxButton.click();

        //12-Click "Action" button.
        adminDashboard.AdminAllUsersActionButton.click();

        //13-Verify visibility of user search page detail information page
        String expectedİnformationPageUrl="https://qa.easybusticket.com/admin/users";
        String actualİnformationPageUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualİnformationPageUrl,expectedİnformationPageUrl,"Active Users page is not visible");

        Driver.getDriver().quit();
    }
    @Test
    public void test06(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        //1-User go to the "https://qa.easybusticket.com/admin"
        //2-User clicks on "Username" box.
        //3-User enters a valid username.
        //4-User clicks on "Password" box.
        //5-User enters a valid password.
        //6-User clicks the "Login" button.
        ReusableMethods.adminLogin("azimadmin","azimAdminPassword");

        //7-Click on the "Manage Users" button on the left sidebar.
        adminDashboard.ManageUsersClik.click();

        //8-In the drop-down list that opens, click on the " Email to All" button.
        adminDashboard.EmailToAllButton.click();

        //9-User clicks the "Subject" Write the subject of the email to box.
        adminDashboard.SendEmailToAllUsersBox.sendKeys("azimadmin");

        //10-Write your message in the message box
        adminDashboard.EmailToAllMessageBox.sendKeys("message");

        //11-User clicks the "Submit " button.
        adminDashboard.EmailToAllSendEmailSubmitButton.click();

        //12-User verifies that the email was sent.
        String expectedSendPageUrl="https://qa.easybusticket.com/admin/dashboard?_token=lbcj5w67Qqgj9Tca5ZlfM4P4cL1ef903P4t7440t&subject=asfas&message=sfsdfsdf";
        String actualSendPageUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualSendPageUrl,expectedSendPageUrl,"Email  Users page is not sended");

        //Driver.getDriver().quit();

    }

}
