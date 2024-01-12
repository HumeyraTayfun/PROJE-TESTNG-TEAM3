package tests.İhsan;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.UserSignIn;
import pages.user.registeredUser.ChangePassword;
import pages.user.registeredUser.Profile;
import pages.user.registeredUser.SupportRequests;
import pages.user.registeredUser.UserDashboard;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US18 {
    @Test
    public void testCase01(){
        UserDashboard userDashboard = new UserDashboard();
        Profile profile = new Profile();
        ChangePassword changePassword = new ChangePassword();
        Actions actions = new Actions(Driver.getDriver());
        SoftAssert softAssert = new SoftAssert();
        // 1- User go to the "https://qa.easybusticket.com"
        // 2- User clicks on "Sign In" button.
        // 3- User displays the "Sign In" page.
        // 4- User clicks on "Username" box.
        // 5- User enters a valid username.
        // 6- User clicks on "Password" box.
        // 7- User enters a valid password.
        // 8- User clicks the "Login" button.
        // 9- User displays the "Dashboard" page.
        ReusableMethods.userLogin("ihsanUsername","ihsanPassword");

        // 10- User clicks the "Profile" button.
        // 11- User clicks "Change Password" from the selection menu.
        profile.ChangePassword.click();

        // 12- User displays the "Change Password" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/user/change-password";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Change Password' page!");

        // 13- User clicks "Current Password" box.
        // 14- User enters valid password.
        changePassword.currentPasswordBox.sendKeys(ConfigReader.getProperty("ihsanNewPassword"));

        // 15- User clicks "Password" box.
        // 16- User enters valid password.
        changePassword.passwordBox.sendKeys(ConfigReader.getProperty("ihsanPassword"));

        // 17- User clicks "Confirm Password" box.
        // 18- User enters valid password.
        changePassword.confirmPasswordBox.sendKeys(ConfigReader.getProperty("ihsanPassword"));

        // 19- User clicks on "Change Password" button.
        changePassword.changePasswordButton.click();

        // 20- User verifies that "Password changes succesfully" text appeared.
        String actualText = changePassword.labelPasswordAlert.getText();
        String expectedText = "Password changes succesfully";
        softAssert.assertEquals(actualUrl, expectedUrl, "'Password changes succesfully' text DID NOT appear!");

    }
}
