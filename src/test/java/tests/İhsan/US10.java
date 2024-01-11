package tests.İhsan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.UserSignIn;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US10 {

    @Test
    public void testCase01() {
        // 1- User go to the "https://qa.easybusticket.com"
        // 2- User clicks on "Sign In" button.
        // 3- User displays the "Sign In" page.
        // 4- User clicks on "Username" box.
        // 5- User enters a valid username.
        // 6- User clicks on "Password" box.
        // 7- User enters a valid password.
        // 8- User clicks the "Login" button.
        // 9- User displays the "Dashboard" page.
        ReusableMethods.userLogin("ihsanUsername" , "ihsanPassword");

        Driver.quitDriver();
    }
    @Test
    public void testCase02(){

        VisitorHomePage visitorHomePage = new VisitorHomePage();
        UserSignIn userSignIn = new UserSignIn();
        SoftAssert softAssert = new SoftAssert();

        // 1- User go to the "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        // 2- User clicks on "Sign In" button.
        visitorHomePage.singInButton.click();

        // 3- User displays the "Sign In" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/login";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Sign In' page!");

        // 4- User clicks on "Username" box.
        // 5- User enters an invalid username.
        userSignIn.usernameBox.sendKeys(ConfigReader.getProperty("ihsanInvalidUsername"));

        // 6- User clicks on "Password" box.
        // 7- User enters a valid password.
        userSignIn.passwordBox.sendKeys(ConfigReader.getProperty("ihsanPassword"));

        // 8- User clicks the "Login" button.
        userSignIn.loginButton.click();

        // 9- User verifies that "These credentials do not match our records." error text appeared.
        String actualError = userSignIn.labelError.getText();
        String expectedError = "These credentials do not match our records.";
        softAssert.assertEquals(actualError, expectedError, "Error text DID NOT appear!");

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase03(){

        VisitorHomePage visitorHomePage = new VisitorHomePage();
        UserSignIn userSignIn = new UserSignIn();
        SoftAssert softAssert = new SoftAssert();

        // 1- User go to the "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        // 2- User clicks on "Sign In" button.
        visitorHomePage.singInButton.click();

        // 3- User displays the "Sign In" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/login";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Sign In' page!");

        // 4- User clicks on "Username" box.
        // 5- User enters a valid username.
        userSignIn.usernameBox.sendKeys(ConfigReader.getProperty("ihsanUsername"));

        // 6- User clicks on "Password" box.
        // 7- User enters an invalid password.
        userSignIn.passwordBox.sendKeys(ConfigReader.getProperty("ihsanInvalidPassword"));

        // 8- User clicks the "Login" button.
        userSignIn.loginButton.click();

        // 9- User verifies that "These credentials do not match our records." error text appeared.
        String actualError = Driver.getDriver().getCurrentUrl();
        String expectedError = "These credentials do not match our records.";
        softAssert.assertEquals(actualUrl, expectedUrl, "Error text DID NOT appear!");

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase04(){

        VisitorHomePage visitorHomePage = new VisitorHomePage();
        UserSignIn userSignIn = new UserSignIn();
        SoftAssert softAssert = new SoftAssert();

        // 1- User go to the "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        // 2- User clicks on "Sign In" button.
        visitorHomePage.singInButton.click();

        // 3- User displays the "Sign In" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/login";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Sign In' page!");

        // 4- User clicks on "Username" box.
        // 5- User enters an invalid username.
        userSignIn.usernameBox.sendKeys(ConfigReader.getProperty("ihsanInvalidUsername"));

        // 6- User clicks on "Password" box.
        // 7- User enters a invalid password.
        userSignIn.passwordBox.sendKeys(ConfigReader.getProperty("ihsanInvalidPassword"));

        // 8- User clicks the "Login" button.
        userSignIn.loginButton.click();

        // 9- User verifies that "These credentials do not match our records." error text appeared.
        String actualError = Driver.getDriver().getCurrentUrl();
        String expectedError = "These credentials do not match our records.";
        softAssert.assertEquals(actualUrl, expectedUrl, "Error text DID NOT appear!");

        softAssert.assertAll();
        Driver.quitDriver();
    }
}
