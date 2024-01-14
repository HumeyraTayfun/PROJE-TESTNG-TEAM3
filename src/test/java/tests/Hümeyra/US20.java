package tests.Hümeyra;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.user.UserSignIn;
import pages.user.registeredUser.SupportRequests;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US20 {

    @Test
    public void testCase01(){
       // 1.User goes to the"https://easybusticket.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
       // 2.User clicks on Sign In button
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        visitorHomePage.singInButton.click();

        //3. User clicks on "Forgot Password" link
        UserSignIn userSignIn=new UserSignIn();
        userSignIn.linkForgotPassword.click();
        //4. Verify that "Reset Password" is visible
        Assert.assertTrue(userSignIn.labelResetPassword.isDisplayed());
       // 5. User clicks on select one box and choose username/email address
        Select select=new Select(userSignIn.selectOneBox);
        select.selectByValue("email");
      //  6. User clicks on username/email address and enter a valid username/email address
        userSignIn.emailAdressBox.click();
        userSignIn.emailAdressBox.sendKeys(ConfigReader.getProperty("humeyraSignUpEmail"));

       // 7. User clicks on "Send password code" button
        userSignIn.sendPasswordCodeButton.click();
       // 8. Verify that "password reset email send successfully"is visible
        String expectedAlert="Password reset email sent successfully";
        String actualAlert=userSignIn.alertMessageText.getText();
        Assert.assertEquals(actualAlert,expectedAlert);//TEST PASSED
    }

    @Test
    public void testCase02(){
        // 1.User goes to the"https://easybusticket.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        // 2.User clicks on Sign In button
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        visitorHomePage.singInButton.click();

        //3. User clicks on "Forgot Password" link
        UserSignIn userSignIn=new UserSignIn();
        userSignIn.linkForgotPassword.click();
        //4. Verify that "Reset Password" is visible
        Assert.assertTrue(userSignIn.labelResetPassword.isDisplayed());
        // 5. User clicks on select one box and choose username/email address
        Select select=new Select(userSignIn.selectOneBox);
        select.selectByValue("email");
        //  6. User clicks on username/email address and enter a valid username/email address
        userSignIn.emailAdressBox.click();
        userSignIn.emailAdressBox.sendKeys(ConfigReader.getProperty("humeyraSignUpEmail"));

        // 7. User clicks on "Send password code" button
        userSignIn.sendPasswordCodeButton.click();
        // 8. Verify that "password reset email send successfully"is visible
        String expectedAlert="Password reset email sent successfully";
        String actualAlert=userSignIn.alertMessageText.getText();
        Assert.assertEquals(actualAlert,expectedAlert);
       //   9. Verify that user is in the account recovery page
        SupportRequests supportRequests=new SupportRequests();
            Assert.assertTrue(supportRequests.labelAccountRecovery.isDisplayed());
       // 10.User clicks on "try to send again" link
        supportRequests.tryToSendAgainLink.click();
       // 11. Verify that user is in the Reset password page
        Assert.assertTrue(supportRequests.labelResetPassword.isDisplayed());
       // 12.User clicks on select one box and choose email address
        Select select1=new Select(userSignIn.selectOneBox);
        select1.selectByValue("email");
        userSignIn.emailAdressBox.click();
        userSignIn.emailAdressBox.sendKeys(ConfigReader.getProperty("humeyraSignUpEmail"));
       // 13.User clicks on " send password code" button
        userSignIn.sendPasswordCodeButton.click();
       // 14. Verify that "password reset email send successfully"is visible
        String expectedAlert1="Password reset email sent successfully";
        String actualAlert1=userSignIn.alertMessageText.getText();
        Assert.assertEquals(actualAlert,expectedAlert);//TEST PASSED
    }
}
