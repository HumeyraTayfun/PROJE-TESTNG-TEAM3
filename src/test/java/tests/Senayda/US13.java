package tests.Senayda;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.UserSignIn;
import pages.user.registeredUser.BuyTicket;
import pages.user.registeredUser.UserDashboard;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US13 {

    @Test
    public void testCase01() {

        VisitorHomePage visitorHomePage = new VisitorHomePage();
        UserDashboard userDashboard = new UserDashboard();
        UserSignIn userSignIn = new UserSignIn();
        BuyTicket buyTicket = new BuyTicket();
        SoftAssert softAssert = new SoftAssert();

        // 1- User go to the "https://qa.easybusticket.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        // 2- User clicks on "Sign In" button.
        visitorHomePage.singInButton.click();

        // 3- User displays the "Sign In" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/login";
        softAssert.assertEquals(actualUrl,expectedUrl);

        // 4- User clicks on "Username" box.
        // 5- User enters a valid username.
        userSignIn.usernameBox.sendKeys(ConfigReader.getProperty("senaydaUsername"));

        // 6- User clicks on "Password" box.
        // 7- User enters a valid password.
        userSignIn.passwordBox.sendKeys(ConfigReader.getProperty("senaydaPassword"));

        // 8- User clicks the "Login" button.
        userSignIn.loginButton.click();

        // 9- User displays the "Dashboard" page.
        // 10- Users navigates to the User Dashboard page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/user/dashboard";
        softAssert.assertEquals(actualUrl,expectedUrl);

        // 11- User confirms that the menu and its items are visible and accessible.
        Assert.assertTrue(userDashboard.dashboardButton.isDisplayed());
        Assert.assertTrue(userDashboard.bookingButton.isDisplayed());
        Assert.assertTrue(userDashboard.supportRequestButton.isDisplayed());
        Assert.assertTrue(userDashboard.linkProfile.isDisplayed());

        // 12- In the booking menu, locate and click on the "Buy Ticket" link
        ReusableMethods.bekle(2);
        userDashboard.bookingButton.click();
        userDashboard.buyTicketButton.click();

        // 13- User ensures the ticket purchase screen loads correctly
        Assert.assertTrue(buyTicket.ticketPurchaseScreen.isDisplayed());

        // 14- User enters the required ticket information (destination, date)
        visitorHomePage.dropDownPickupPoint.sendKeys("Dallas");
        visitorHomePage.dropDownDroppingPoint.sendKeys("Austin");
        visitorHomePage.dropDownDepartureDate.sendKeys(" 01/28/2024");

        // 15- User clicks on the "Find Ticket" button
        visitorHomePage.findTicketsButton.click();

        // 16- User verifies that available ticket options are displayed
        Assert.assertTrue(buyTicket.ticketOptions.isDisplayed());
    }
}