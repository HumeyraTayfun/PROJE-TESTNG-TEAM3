package tests.Doruk;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.UserSignIn;
import pages.user.registeredUser.UserDashboard;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US19 {

    @Test
    public void testCase01() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        // 2 - Click the "Sign In" button in the upper right corner.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        visitorHomePage.singInButton.click();

        ReusableMethods.wait(1);

        // 3 - Check that the login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/login";
        softAssert.assertEquals(actualUrl, expectedUrl, "Login page DID NOT open!");

        // 4 - Enter a valid username to username box.
        UserSignIn userSignIn = new UserSignIn();
        userSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukUsername"));

        ReusableMethods.wait(1);

        // 5 - Enter a valid password to password box.
        userSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukPassword"));

        ReusableMethods.wait(1);

        // 6 - Click "Log In" button.
        userSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 7 - Check that the user dashboard page opens.
        String actualUrl2 = Driver.getDriver().getCurrentUrl();
        String expectedUrl2 = "https://qa.easybusticket.com/user/dashboard";
        softAssert.assertEquals(actualUrl2, expectedUrl2, "User dashboard page DID NOT open!");

        // 8 - Hover "Profile" button on the header.
        // 9 - Click on the "Logout" button in the list that opens.
        UserDashboard userDashboard = new UserDashboard();
        Actions actions = new Actions(Driver.getDriver());
        actions
                .moveToElement(userDashboard.profileDropdown)
                .click(userDashboard.logoutButton)
                .build()
                .perform();

        ReusableMethods.wait(1);

        // 10 - Check that the login page opens.
        String actualUrl3 = Driver.getDriver().getCurrentUrl();
        String expectedUrl3 = "https://qa.easybusticket.com/login";
        softAssert.assertEquals(actualUrl3, expectedUrl3, "Login page DID NOT open!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase02() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        // 2 - Click the "Sign In" button in the upper right corner.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        visitorHomePage.singInButton.click();

        ReusableMethods.wait(1);

        // 3 - Check that the login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/login";
        softAssert.assertEquals(actualUrl, expectedUrl, "Login page DID NOT open!");

        // 4 - Click website logo upper login form.
        UserSignIn userSignIn = new UserSignIn();
        userSignIn.homePageButton.click();

        // 5 - Check that homepage opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/";
        softAssert.assertEquals(actualUrl, expectedUrl, "Homepage DID NOT open!");

        softAssert.assertAll();
        Driver.closeDriver();
    }


}
