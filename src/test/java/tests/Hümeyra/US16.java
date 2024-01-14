package tests.Hümeyra;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.registeredUser.SupportRequests;
import utilities.Driver;
import utilities.ReusableMethods;

public class US16 {
    SoftAssert softAssert=new SoftAssert();
    @Test
    public void testCase01(){
        // 1. User goes to the "https://qa.easybusticket.com
        //  2. User clicks on "Sign in" button
        //  3- User displays the "Sign In" page.
        // 4. User clicks on the username box and enter a valid username
        // 5. User clicks on the password box and enter a valid password
        // 6.User clicks on Log in button
        //  7. User displays the "Dashboard" page.
        ReusableMethods.userLogin("humeyraSignInUsername","humeyraSignInPassword");
        //  8. User click on "Support Request" link and chooses Requests link

        SupportRequests supportRequests=new SupportRequests();
        supportRequests.supportRequestLink.click();
        supportRequests.requestLink.click();

        // 10. User clicks on Action button
        supportRequests.actionButton.click();
        // 11. Verify that the details of each past request are visible
        softAssert.assertTrue(supportRequests.labelRequestMessage.isDisplayed());
        Driver.quitDriver();

    }

    @Test
    public void testCase02(){
        // 1. User goes to the "https://qa.easybusticket.com
        // 2. User clicks on "Sign in" button
        // 3. User clicks on the username box and enter a valid username
        // 4. User clicks on the password box and enter a valid password
        // 5.User clicks on Log in button
        // 6 User displays the "Dashboard" page.
        ReusableMethods.userLogin("humeyraSignInUsername","humeyraSignInPassword");
        // 7. User click on "Support Request" link and chooses Requests link
        SupportRequests supportRequests=new SupportRequests();
        supportRequests.supportRequestLink.click();
        supportRequests.requestLink.click();
        // 8.User click on "New Ticket" button
        supportRequests.newTicketButton.click();
        // 9. User clicks on Subject box and enter his/her message
        supportRequests.subjectBox.click();
        supportRequests.subjectBox.sendKeys("yolculuk");
        // 10. User click on priority dropdown and choose one
        Select select=new Select(supportRequests.priorityBox);
        select.selectByValue("2");
        //11. User clicks on message button and enter her/his message
        supportRequests.messageBox.click();
        supportRequests.messageBox.sendKeys("bir adet yastık istiyorum");
        //12.User clicks on "Dosya Sec" button and selects a valid file from her/his folder according to allowed file extensions
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.bekle(1);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",supportRequests.dosyaSecBox);

        ReusableMethods.bekle(1);
        String dynamicFilePath = System.getProperty("user.home") +
                "\\Downloads\\Common_Interview_Questions_.pdf";
        supportRequests.dosyaSecBox.sendKeys(dynamicFilePath);
        // 13. Verify that folder is selected
        // 14. User clicks on plus button(+)
        // supportRequests.plusButton.click();
        // 15. Verify that new file upload menu is appeared
        // softAssert.assertTrue(supportRequests.newPlusButton.isDisplayed());
        // 16. User clicks on "Submit" button
        supportRequests.submitButton.click();
        // 17. Verify that "Support ticket is created successfully" is displayed
        String expectedText="Support ticket created successfully!";
        String actualText=supportRequests.alertMessage.getText();
        softAssert.assertEquals(actualText,expectedText);//TEST PASSED
        Driver.quitDriver();
    }
}
