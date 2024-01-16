package tests.Hümeyra;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.report.EmailHistory;
import pages.admin.report.LoginHistory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US29 {
    SoftAssert softAssert=new SoftAssert();
    EmailHistory emailHistory=new EmailHistory();
    LoginHistory loginHistory=new LoginHistory();
    @Test
    public void testCase01(){
       // 1.Admin goes to "https://qa.easybusticket.com/admin"
        //2.Verify that" Admin Login to Easy Bus Ticket Dashboard" is visible
       // 3. Admin clicks on username box and enters a valid username
      //  4. Admin clicks on password box and enters a valid password
      //  5. Admin clicks on Login link
       // 6. Verify that admin dashboard page is visible
        ReusableMethods.adminLogin("humeyraAdminUsername","humeyraAdminPassword");
      //  7.Admin clicks on Report menu
        emailHistory.reportMenu.click();
       // 8.Verify that login history is visible
        ReusableMethods.bekle(1);
        softAssert.assertTrue(loginHistory.loginHistoryLink.isDisplayed(),"Login History is not visible");
      //  9.Verify that email history is visible
        ReusableMethods.bekle(1);
        softAssert.assertTrue(emailHistory.emailHistoryLink.isDisplayed(),"Email history is not visible");
        softAssert.assertAll();
        Driver.quitDriver();//TEST PASSED
    }
    @Test
    public void testCase02(){
      //  1.Admin goes to "https://qa.easybusticket.com/admin"
       // 2.Verify that" Admin Login to Easy Bus Ticket Dashboard" is visible
      //  3. Admin clicks on username box and enters a valid username
      //  4. Admin clicks on password box and enters a valid password
       // 5. Admin clicks on Login link
        //6. Verify that admin dashboard page is visible
        ReusableMethods.adminLogin("humeyraAdminUsername","humeyraAdminPassword");
       // 7.Admin clicks on Report menu
        emailHistory.reportMenu.click();
      //  8. Admin clicks on Login history
        loginHistory.loginHistoryLink.click();
       // 9.Admin displays  login history page
        String expectedUrl="https://qa.easybusticket.com/admin/report/login/history";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"Admin did not display login history page");
      //  11.Admin clicks on search user name box
        loginHistory.searchUserNameBox.click();
       // 12. Admin enters a valid usernme and clicks enter key
        loginHistory.searchUserNameBox.sendKeys("asliekm");
        loginHistory.searchBoxIcon.click();
      //  13.Admin displays all information about the chosen user
        for (int i = 0; i <=4 ; i++) {
            softAssert.assertTrue(loginHistory.rowTitleList.get(i).isDisplayed(),"row title list is not displayed");
        }
        //  14.Verify that the username under user is clickable and IP titles are clickable
        loginHistory.user.click();
        Driver.getDriver().navigate().back();
        loginHistory.ıpLink.click();
        softAssert.assertAll();
        Driver.quitDriver();//TEST PASSED


    }
    @Test
    public void testCase03(){
       // 1.Admin goes to "https://qa.easybusticket.com/admin"
        //2.Verify that" Admin Login to Easy Bus Ticket Dashboard" is visible
       // 3. Admin clicks on username box and enters a valid username
      //  4. Admin clicks on password box and enters a valid password
      //  5. Admin clicks on Login link
      //  6. Verify that admin dashboard page is visible
        ReusableMethods.adminLogin("humeyraAdminUsername","humeyraAdminPassword");
      //  7.Admin clicks on Report menu
        emailHistory.reportMenu.click();
       // 8. Admin clicks on Email history
        emailHistory.emailHistoryLink.click();
      //  9.Admin displays all infirmation details of email history
        for (int i = 0; i <=4 ; i++) {
            softAssert.assertTrue(emailHistory.rowTitleList.get(i).isDisplayed(),"row title list is not displayed");
        }

       // 10.Verify that action button is clickable
          emailHistory.actionButton.click();
       // 11. Admin displays email details page
        String title="Email details";
        ReusableMethods.titleİleSayfaDeğiştir(title);
        String expectedUrl="https://qa.easybusticket.com/admin/users/email-details/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrl),"Admin did not display email details page");

        // verify that Admin displays e mail details
        ReusableMethods.bekle(2);
       for (int i = 0; i <=2 ; i++) {
            softAssert.assertTrue(emailHistory.emailDetailsInfo.get(i).isDisplayed(),"Email details is not visible");
       }
        softAssert.assertAll();//TEST PASSED
       Driver.quitDriver();
    }
}
