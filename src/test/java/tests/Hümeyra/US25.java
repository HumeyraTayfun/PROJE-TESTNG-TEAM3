package tests.Hümeyra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.admin.paymentHistory.AllPayment;
import pages.admin.paymentHistory.PendingPayment;
import pages.admin.paymentHistory.RejectedPayment;
import pages.admin.paymentHistory.SuccessfulPayment;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US25 {

    @Test
    public void testCase01(){
      //  1.Admin goes to "https://qa.easybusticket.com/admin"
       // 2.Verify that" Admin Login to Easy Bus Ticket Dashboard" is visible
       // 3. Admin clicks on username box and enters a valid username
      //  4. Admin clicks on password box and enters a valid password
       // 5. Admin clicks on Login link
       // 6. Verify that admin dashboard page is visible
       ReusableMethods.adminLogin("humeyraAdminUsername","humeyraAdminPassword");
       // 7. Admin clicks on Payment History menu
        AllPayment allPayment=new AllPayment();
        allPayment.paymentHistoryLink.click();
        ReusableMethods.bekle(1);
       // 8.Verify that pending payment is visible
        PendingPayment pendingPayment=new PendingPayment();
        Assert.assertTrue(pendingPayment.pendingPaymentLink.isDisplayed());
        ReusableMethods.bekle(1);
       // 9.Verify that successful payment is visible
        SuccessfulPayment successfulPayment=new SuccessfulPayment();
        Assert.assertTrue(successfulPayment.successfulPaymentLink.isDisplayed());
        ReusableMethods.bekle(1);
        //10.Verify that rejected payment is visible
        RejectedPayment rejectedPayment=new RejectedPayment();
        Assert.assertTrue(rejectedPayment.rejectedPaymentLink.isDisplayed());
        ReusableMethods.bekle(1);
       // 11. Verify that All payment is visible
        Assert.assertTrue(allPayment.allPaymentLink.isDisplayed());//TEST PASSED
        Driver.quitDriver();
    }

    @Test
    public void testCase02(){
      //  1.Admin goes to "https://qa.easybusticket.com/admin"
       // 2.Verify that" Admin Login to Easy Bus Ticket Dashboard" is visible
       // 3. Admin clicks on username box and enters a valid username
       // 4. Admin clicks on password box and enters a valid password
        //5. Admin clicks on Login link
        //6. Verify that admin dashboard page is visible
        ReusableMethods.adminLogin("humeyraAdminUsername","humeyraAdminPassword");
       // 7. Admin clicks on Payment History menu
        AllPayment allPayment=new AllPayment();
        allPayment.paymentHistoryLink.click();
        ReusableMethods.bekle(1);
      //  8. Admin clicks on pending payment page
        PendingPayment pendingPayment=new PendingPayment();
        pendingPayment.pendingPaymentLink.click();
      //  9.Admin displays pending payment page
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/payment/pending";
        Assert.assertEquals(actualUrl,expectedUrl);
      //  10. Verify that "there is no pending payment" is visible
        Assert.assertTrue(pendingPayment.labelThereİsNoPendingPayment.isDisplayed());//TEST PASSED
        Driver.quitDriver();
    }

    @Test
    public void testCase03(){
        //1.Admin goes to "https://qa.easybusticket.com/admin"
       // 2.Verify that" Admin Login to Easy Bus Ticket Dashboard" is visible
       // 3. Admin clicks on username box and enters a valid username
       // 4. Admin clicks on password box and enters a valid password
       // 5. Admin clicks on Login link
       // 6. Verify that admin dashboard page is visible
        ReusableMethods.adminLogin("humeyraAdminUsername","humeyraAdminPassword");
       // 7. Admin clicks on Payment History menu
        AllPayment allPayment=new AllPayment();
        allPayment.paymentHistoryLink.click();
        ReusableMethods.bekle(1);
       // 8. Admin clicks on successful payment page
        SuccessfulPayment successfulPayment=new SuccessfulPayment();
        successfulPayment.successfulPaymentLink.click();
       // 9. Admin displays that all information is visible
        List<WebElement> rowTitleList=Driver.getDriver().findElements(By.xpath("//tbody/tr[1]/td"));
        List<String > rowTitlesText = ReusableMethods.stringlisteDönüştür(rowTitleList);
        String rowTitles="";
        for (int i = 0; i <=rowTitles.length() ; i++) {
            rowTitles="(//tbody/tr[1]/td)[i] ";


        }
       // 10. Admin clicks on "Trx number/username" search box
        successfulPayment.trxNumberUserNameSearchBox.click();
       // 11.Admin enters a valid username/trx number
        successfulPayment.trxNumberUserNameSearchBox.sendKeys(ConfigReader.getProperty("successfulPaymentChosenUserName"));
       // 12.Admin presses enter icon
        successfulPayment.searchBoxIcon1.click();
       // 13. Admin displays searched  information
        Assert.assertTrue(successfulPayment.labelPaymentHistorySearch.isDisplayed());
        //14.Admin clicks on action button
        successfulPayment.actionButton.click();
        //15.Verify that admin displays the details
        Assert.assertTrue(successfulPayment.labelDepositViaStripeHosted.isDisplayed());
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        //  16. Admin clicks on "min date-max date" search button
        successfulPayment.minDateMaxDateSearchBox.click();
        //  17. Admin enters a valid date
        successfulPayment.minDateMaxDateSearchBox.sendKeys(ConfigReader.getProperty("successfulPaymentchosenDate"));
        successfulPayment.searchBoxIcon2.click();
      //  18. Admin displays searched no information
        Assert.assertTrue(successfulPayment.labelNoPaymentFound.isDisplayed());//TEST PASSED

    }

    @Test
    public void testCase04(){
       // 1.Admin goes to "https://qa.easybusticket.com/admin"
      //  2.Verify that" Admin Login to Easy Bus Ticket Dashboard" is visible
       // 3. Admin clicks on username box and enters a valid username
      //  4. Admin clicks on password box and enters a valid password
       // 5. Admin clicks on Login link
       // 6. Verify that admin dashboard page is visible
        ReusableMethods.adminLogin("humeyraAdminUsername","humeyraAdminPassword");
        //7. Admin clicks on Payment History menu
        AllPayment allPayment=new AllPayment();
        allPayment.paymentHistoryLink.click();
        ReusableMethods.bekle(1);
       // 8. Admin clicks on rejected payment page
        RejectedPayment rejectedPayment=new RejectedPayment();
        rejectedPayment.rejectedPaymentLink.click();
       // 9. Admin displays that all information is visible

        //10. Admin clicks on "Trx number/username" search box
        //11.Admin enters a valid username/trx number
      //  12.Admin presses enter key
      //  13. Admin displays searched  information
        //14.Admin clicks on action button
        //15.Verify that admin displays the details
        //  16. Admin clicks on "min date-max date" search button
        //17.Admin navigate to back
       // 18.Admin navigate to back
        //  19. Admin enters a valid date


       // 20. Admin displays all details
    }
    @Test
    public void testCase05(){
       // 1.Admin goes to "https://qa.easybusticket.com/admin"
       // 2.Verify that" Admin Login to Easy Bus Ticket Dashboard" is visible
       // 3. Admin clicks on username box and enters a valid username
       // 4. Admin clicks on password box and enters a valid password
      //  5. Admin clicks on Login link
        //6. Verify that admin dashboard page is visible
        ReusableMethods.adminLogin("humeyraAdminUsername","humeyraAdminPassword");
       // 7. Admin clicks on Payment History menu
        AllPayment allPayment=new AllPayment();
        allPayment.paymentHistoryLink.click();
        ReusableMethods.bekle(1);
       // 8. Admin clicks on All payment page
        allPayment.allPaymentLink.click();
      //  9. Admin displays that all information is visible
      //  10. Admin clicks on "Trx number/username" search box
      //  11.Admin enters a valid username/trx number
      //  12.Admin presses enter key
      //  13. Admin displays searched  information
       // 14. Admin clicks on "min date-max date" search button
       // 15. Admin enters a valid date
      //  16. Admin displays searched information
      //  17. Admin clicks on Action button
       // 18. Admin displays all details
    }
}
