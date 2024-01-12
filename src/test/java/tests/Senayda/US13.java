package tests.Senayda;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
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
        Select pickUpPoint = new Select(visitorHomePage.dropDownPickupPoint);
        pickUpPoint.selectByVisibleText("Dallas");
        Select dropDownPoint = new Select(visitorHomePage.dropDownDroppingPoint);
        dropDownPoint.selectByVisibleText("Austin");
        visitorHomePage.dropDownDepartureDate.sendKeys(ConfigReader.getProperty("senaydaDepartureDate"));

        // 15- User clicks on the "Find Ticket" button
        visitorHomePage.findTicketsButton.click();

        // 16- User verifies that available ticket options are displayed
        Assert.assertTrue(buyTicket.ticketOptions.isDisplayed());

        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);
        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);
        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);
        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);

        ReusableMethods.bekle(1);

        // 17- User clicks on the "Select Seat" button for a chosen ticket option
        buyTicket.selectSeatButton.click();
        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);
        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);
        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);
        ReusableMethods.bekle(1);

       // 18- User selects a gender and chooses a seat on the seat selection screen
        buyTicket.checkBoxFemale.click();
        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);
        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);
        ReusableMethods.bekle(1);

        // 19- User selects one of the available seats
        buyTicket.selectSeatNumberButton.click();
        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);
        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);
        ReusableMethods.bekle(1);

        // 20- User confirms the ticket price is displayed
        Assert.assertTrue(buyTicket.ticketPriceDisplay.isDisplayed());

        // 21-  User clicks on the "Continue" button to proceed
        buyTicket.continueButton.click();

        // 22- User clicks on "Confirm" button
        buyTicket.confirmButton.click();

        // 23- User verifies the displayed payment amounts on the subsequent page
        Assert.assertTrue(buyTicket.paymentText.isDisplayed());

        // 24- User ensures the "Pay Now" button is present and functional
        // 25- User clicks on the "Pay Now" button
        Assert.assertTrue(buyTicket.payNowButton.isDisplayed());
        buyTicket.payNowButton.click();

        // 26- User click on "Confirm" button to payment
        buyTicket.confirmButton.click();

        // 27- User confirms redirect to the payment screen
        Assert.assertTrue(buyTicket.paymentPreviewPage.isDisplayed());
        buyTicket.selectSeatButton.sendKeys(Keys.DOWN);

        // 28- User clicks again "Pay now" button to continue
        buyTicket.payNowButtonLast.click();

        // 29- User enters valid credit card information
        buyTicket.nameOnCardButton.sendKeys(ConfigReader.getProperty("senaydaNameOnCard"));
        buyTicket.CardNumberButton.sendKeys(ConfigReader.getProperty("senaydaCardNumber"));
        buyTicket.expirationDateButton.sendKeys(ConfigReader.getProperty("senaydaExpirationDate"));
        buyTicket.cvcButton.sendKeys(ConfigReader.getProperty("senaydaCvcCode"));

        // 30- User submits the payment
        buyTicket.stripePaymentPayButton.click();

        // 31- User ensures the payment confirmation or success message is displayed.
        //32- After successful payment, User verifies that ticket details are displayed.
        // 33- User confirms the accuracy of the ticket information.
        Assert.assertTrue(buyTicket.ticketInformationTable.isDisplayed());

       // 34- User ensures the purchased ticket is listed
        Assert.assertTrue(buyTicket.ticketStatus.isDisplayed());

        // 35- User clicks on the "Print Ticket" button next to the purchased ticket
        buyTicket.printTicketButton.click();

        // 36- User verifies redirection to the ticket printing page and ensure the ticket details are correct
        Assert.assertTrue(buyTicket.printingPage.isDisplayed());

        // 37- User Download and verify the ticket
        buyTicket.printTicketButton.click();
        Assert.assertTrue(buyTicket.printTicketButton.isDisplayed());

        Driver.quitDriver();
    }
}