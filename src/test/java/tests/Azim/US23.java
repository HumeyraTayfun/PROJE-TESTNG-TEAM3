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

        //7-Verify  that admin dashboard page opens.
        String expectedAdmindashboardUrl="https://qa.easybusticket.com/admin/dashboard";
        String actualAdmindashboardUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualAdmindashboardUrl,expectedAdmindashboardUrl,"dashboard page is not visible");

        /*
        //8-Click on the "Manage Users" button on the left sidebar.
        adminDashboard.ManageUsersClik.click();

        //9-In the drop-down list that opens, click on the "All Users" button.
        adminDashboard.allUsers.click();


         */
        //10-Verify that the" All users "page opens to display.
        //11- User clicks on Search box.
        //12- Enter valid user email address.
        //13-Verify visibility of the user search page information page
        //14-Click "Action" button.
        //15-Verify visibility of user search page detail information page

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

        //7-Verify  that admin dashboard page opens.
        String expectedadminUsersUrl="https://qa.easybusticket.com/admin/users";
        String actualadminUsersUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualadminUsersUrl,expectedadminUsersUrl,"Admin dasboard page is not visible");

        /*
        //8-Click on the "Manage Users" button on the left sidebar.
        adminDashboard.ManageUsersClik.click();

        //9-In the drop-down list that opens, click on the "All Users" button.
        adminDashboard.allUsers.click();

        //10-Verify that the "All Users" page opens to display.

        //11-In the drop-down list that opens, click on the "active users" button.
        adminDashboard.activeUsers.click();

        //12- Verify that the "Active Users" page opens to display.
        String expectedActiveUsersUrl="https://qa.easybusticket.com/admin/users";
        String actualActiveUsersUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualActiveUsersUrl,expectedActiveUsersUrl,"Active Users page is not visible");

        //13-In the drop-down list that opens, click on the "Bennad users" button.

        //14-Verify that the "Bennad users" page opens to display.
        String expectedAllUsersUrl="https://qa.easybusticket.com/admin/users/active";
        String actualAllUsersUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualAllUsersUrl,expectedAllUsersUrl,"Bennad users page is not visible");


        //15-In the Email unverified list that opens, click on the "Email unverified" button.

        //16-Verify that the "Email unverified" page opens to display.
        String expectedAllUsersUrl="https://qa.easybusticket.com/admin/users";
        String actualAllUsersUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualAllUsersUrl,expectedAllUsersUrl,"Ticket page is not visible");


        //16-In the Email unverified list that opens, click on the "sms unverified " button.

        //17-Verify that the "sms unverified " page opens to display.
        String expectedAllUsersUrl="https://qa.easybusticket.com/admin/users";
        String actualAllUsersUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualAllUsersUrl,expectedAllUsersUrl,"Ticket page is not visible");

*/

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
        //7-Verify  that admin dashboard page opens.
        //8-Click on the "Manage Users" button on the left sidebar.
        //9-In the drop-down list that opens, click on the "banned users" button.
        //10-Verify that the "Banned users" page opens to display.
        //11-User clicks on Search box.
        //12-Enter valid user email address.
        //13-Verify visibility of the user search page information page
        //14-Click "Action" button.
        //15-Verify visibility of user search page detail information page
        //16-In the drop-down list that opens, click on the "Email unverified" button.
        //17-User clicks on Search box.

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
        //7-Verify  that admin dashboard page opens.
        //8-Click on the "Manage Users" button on the left sidebar.
        //9-In the drop-down list that opens, click on the "Email unverified" button.
        //10-Verify that the "Email unverified" page opens to display.
        //11-User clicks on Search box.
        //12-Enter valid user email address.
        //13-Verify visibility of the user search page information page
        //14-Click "Action" button.
        //15-Verify visibility of user search page detail information page

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
        //7-Verify  that admin dashboard page opens.
        //8-Click on the "Manage Users" button on the left sidebar.
        //9-In the drop-down list that opens, click on the "sms unverified" button.
        //10-Verify that the "Sms unverified" page opens to display.
        //11-User clicks on Search box.
        //12-Enter valid user email address.
        //13-Verify visibility of the user search page information page
        //14-Click "Action" button.
        //15-Verify visibility of user search page detail information page

        Driver.getDriver().quit();

    }












}
