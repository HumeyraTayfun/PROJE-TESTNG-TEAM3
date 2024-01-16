package tests.Doruk;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.AdminSignIn;
import pages.admin.manageUsers.*;
import pages.admin.supportRequests.AllRequests;
import pages.admin.supportRequests.AnsweredRequests;
import pages.admin.supportRequests.ClosedRequests;
import pages.admin.supportRequests.PendingRequests;
import pages.admin.tickets.TicketView;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US28 {

    @Test
    public void testCase01() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com/admin"
        Driver.getDriver().get("https://qa.easybusticket.com/admin");

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Support Requests" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.supportRequests.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "All Requests" button.
        adminDashboard.allRequests.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with all support requests displayed.
        AllRequests allRequests = new AllRequests();
        softAssert.assertTrue(allRequests.detailsButton.isDisplayed(), "All requests page DID NOT open!");

        ReusableMethods.wait(1);

        // 10 - In the drop-down list that opens, click on the "Pending Requests" button.
        allRequests.pendingRequests.click();

        ReusableMethods.wait(1);

        // 11 - Check that the page opens with pending support requests displayed.
        PendingRequests pendingRequests = new PendingRequests();
        softAssert.assertTrue(pendingRequests.detailsButton.isDisplayed(), "Pending requests page DID NOT open!");

        ReusableMethods.wait(1);

        // 12 - Click on the "Closed Requests" button on the left sidebar.
        pendingRequests.closedRequests.click();

        ReusableMethods.wait(1);

        // 13 - Check that the page opens with pending closed requests displayed.
        ClosedRequests closedRequests = new ClosedRequests();
        softAssert.assertTrue(closedRequests.detailsButton.isDisplayed(), "Closed requests page DID NOT open!");

        ReusableMethods.wait(1);

        // 14 - Click on the "Answered Requests" button on the left sidebar.
        closedRequests.answeredRequests.click();

        ReusableMethods.wait(1);

        // 15 - Check that the page opens with answered support requests displayed.
        AnsweredRequests answeredRequests = new AnsweredRequests();
        softAssert.assertTrue(answeredRequests.detailsButton.isDisplayed(), "Answered requests page DID NOT open!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase02() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com/admin"
        Driver.getDriver().get("https://qa.easybusticket.com/admin");

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Support Requests" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.supportRequests.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "All Requests" button.
        adminDashboard.allRequests.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with all support requests displayed.
        AllRequests allRequests = new AllRequests();
        softAssert.assertTrue(allRequests.detailsButton.isDisplayed(), "All requests page DID NOT open!");

        // 10 - Click on the "Details" button on the far right of the 1st support request in the table.
        allRequests.detailsButton.click();

        // 11 - Check that the support request page is displayed.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/tickets/view/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Support request page DID NOT open!");

        // 12 - Enter a valid message to "Your Message" box.
        TicketView ticketView = new TicketView();
        ticketView.messageBox.sendKeys("Hello!");

        ReusableMethods.wait(1);

        // 13 - Click "Reply" button.
        ticketView.replyButton.click();

        ReusableMethods.wait(1);

        // 14 - Check that "Support ticket replied successfully" notification is displayed.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.replySuccessMessage.isDisplayed(), "Support ticket replied successfully notification DID NOT display!");

        // 15 - Click 1st "Delete" button in bottom.
        ticketView.deleteMessage.click();

        ReusableMethods.wait(1);

        // 16 - Check "Delete Reply!" titled card is displayed.
        // 17 - Click "Delete" in card.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.confirmDeleteMessage.isDisplayed(), "Delete Reply! titled card DID NOT display!");
        ticketView.confirmDeleteMessage.click();

        // 18 - Check that "Delete successfully" notification is displayed.
        softAssert.assertTrue(ticketView.deleteSuccessMessage.isDisplayed(), "Delete successfully notification DID NOT display!");

        // 19 - Click "Close Ticket" button.
        ticketView.closeTicketButton.click();

        ReusableMethods.wait(1);

        // 20 - Check "Close Support Ticket!" titled card is displayed.
        // 21 - Click "Close Ticket" button in card.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.confirmCloseTicketButton.isDisplayed(), "Close Support Ticket! titled card DID NOT display!");
        ticketView.confirmCloseTicketButton.click();

        ReusableMethods.wait(1);

        // 22 - Check that "Support ticket closed successfully!" notification is displayed.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.closeTicketSuccessMessage.isDisplayed(), "Support ticket closed successfully! notification DID NOT display!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase03() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com/admin"
        Driver.getDriver().get("https://qa.easybusticket.com/admin");

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Support Requests" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.supportRequests.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "Pending Requests" button.
        adminDashboard.pendingRequests.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with pending support requests displayed.
        PendingRequests pendingRequests = new PendingRequests();
        softAssert.assertTrue(pendingRequests.detailsButton.isDisplayed(), "Pending requests page DID NOT open!");

        // 10 - Click on the "Details" button on the far right of the 1st support request in the table.
        pendingRequests.detailsButton.click();

        // 11 - Check that the support request page is displayed.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/tickets/view/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Support request page DID NOT open!");

        // 12 - Enter a valid message to "Your Message" box.
        TicketView ticketView = new TicketView();
        ticketView.messageBox.sendKeys("Hello!");

        ReusableMethods.wait(1);

        // 13 - Click "Reply" button.
        ticketView.replyButton.click();

        ReusableMethods.wait(1);

        // 14 - Check that "Support ticket replied successfully" notification is displayed.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.replySuccessMessage.isDisplayed(), "Support ticket replied successfully notification DID NOT display!");

        // 15 - Click 1st "Delete" button in bottom.
        ticketView.deleteMessage.click();

        ReusableMethods.wait(1);

        // 16 - Check "Delete Reply!" titled card is displayed.
        // 17 - Click "Delete" in card.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.confirmDeleteMessage.isDisplayed(), "Delete Reply! titled card DID NOT display!");
        ticketView.confirmDeleteMessage.click();

        // 18 - Check that "Delete successfully" notification is displayed.
        softAssert.assertTrue(ticketView.deleteSuccessMessage.isDisplayed(), "Delete successfully notification DID NOT display!");

        // 19 - Click "Close Ticket" button.
        ticketView.closeTicketButton.click();

        ReusableMethods.wait(1);

        // 20 - Check "Close Support Ticket!" titled card is displayed.
        // 21 - Click "Close Ticket" button in card.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.confirmCloseTicketButton.isDisplayed(), "Close Support Ticket! titled card DID NOT display!");
        ticketView.confirmCloseTicketButton.click();

        ReusableMethods.wait(1);

        // 22 - Check that "Support ticket closed successfully!" notification is displayed.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.closeTicketSuccessMessage.isDisplayed(), "Support ticket closed successfully! notification DID NOT display!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase04() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com/admin"
        Driver.getDriver().get("https://qa.easybusticket.com/admin");

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Support Requests" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.supportRequests.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "Closed Requests" button.
        adminDashboard.closedRequests.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with closed support requests displayed.
        ClosedRequests closedRequests = new ClosedRequests();
        softAssert.assertTrue(closedRequests.detailsButton.isDisplayed(), "Closed requests page DID NOT open!");

        // 10 - Click on the "Details" button on the far right of the 1st support request in the table.
        closedRequests.detailsButton.click();

        // 11 - Check that the support request page is displayed.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/tickets/view/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Support request page DID NOT open!");

        // 12 - Enter a valid message to "Your Message" box.
        TicketView ticketView = new TicketView();
        ticketView.messageBox.sendKeys("Hello!");

        ReusableMethods.wait(1);

        // 13 - Click "Reply" button.
        ticketView.replyButton.click();

        ReusableMethods.wait(1);

        // 14 - Check that "Support ticket replied successfully" notification is displayed.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.replySuccessMessage.isDisplayed(), "Support ticket replied successfully notification DID NOT display!");

        // 15 - Click 1st "Delete" button in bottom.
        ticketView.deleteMessage.click();

        ReusableMethods.wait(1);

        // 16 - Check "Delete Reply!" titled card is displayed.
        // 17 - Click "Delete" in card.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.confirmDeleteMessage.isDisplayed(), "Delete Reply! titled card DID NOT display!");
        ticketView.confirmDeleteMessage.click();

        // 18 - Check that "Delete successfully" notification is displayed.
        softAssert.assertTrue(ticketView.deleteSuccessMessage.isDisplayed(), "Delete successfully notification DID NOT display!");

        // 19 - Click "Close Ticket" button.
        ticketView.closeTicketButton.click();

        ReusableMethods.wait(1);

        // 20 - Check "Close Support Ticket!" titled card is displayed.
        // 21 - Click "Close Ticket" button in card.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.confirmCloseTicketButton.isDisplayed(), "Close Support Ticket! titled card DID NOT display!");
        ticketView.confirmCloseTicketButton.click();

        ReusableMethods.wait(1);

        // 22 - Check that "Support ticket closed successfully!" notification is displayed.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.closeTicketSuccessMessage.isDisplayed(), "Support ticket closed successfully! notification DID NOT display!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase05() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com/admin"
        Driver.getDriver().get("https://qa.easybusticket.com/admin");

        // 2 - Check that admin login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin login page DID NOT open!");

        // 3 - Enter a valid username to username box.
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukAdminUsername"));

        ReusableMethods.wait(1);

        // 4 - Enter a valid password to password box.
        adminSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukAdminPassword"));

        ReusableMethods.wait(1);

        // 5 - Click "Login" button.
        adminSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that admin dashboard page opens.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin dashboard page DID NOT open!");

        // 7 - Click on the "Support Requests" button on the left sidebar.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.supportRequests.click();

        ReusableMethods.wait(1);

        // 8 - In the drop-down list that opens, click on the "Answered Requests" button.
        adminDashboard.answeredRequests.click();

        ReusableMethods.wait(1);

        // 9 - Check that the page opens with answered support requests displayed.
        AnsweredRequests answeredRequests = new AnsweredRequests();
        softAssert.assertTrue(answeredRequests.detailsButton.isDisplayed(), "Answered requests page DID NOT open!");

        // 10 - Click on the "Details" button on the far right of the 1st support request in the table.
        answeredRequests.detailsButton.click();

        // 11 - Check that the support request page is displayed.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/tickets/view/";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Support request page DID NOT open!");

        // 12 - Enter a valid message to "Your Message" box.
        TicketView ticketView = new TicketView();
        ticketView.messageBox.sendKeys("Hello!");

        ReusableMethods.wait(1);

        // 13 - Click "Reply" button.
        ticketView.replyButton.click();

        ReusableMethods.wait(1);

        // 14 - Check that "Support ticket replied successfully" notification is displayed.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.replySuccessMessage.isDisplayed(), "Support ticket replied successfully notification DID NOT display!");

        // 15 - Click 1st "Delete" button in bottom.
        ticketView.deleteMessage.click();

        ReusableMethods.wait(1);

        // 16 - Check "Delete Reply!" titled card is displayed.
        // 17 - Click "Delete" in card.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.confirmDeleteMessage.isDisplayed(), "Delete Reply! titled card DID NOT display!");
        ticketView.confirmDeleteMessage.click();

        // 18 - Check that "Delete successfully" notification is displayed.
        softAssert.assertTrue(ticketView.deleteSuccessMessage.isDisplayed(), "Delete successfully notification DID NOT display!");

        // 19 - Click "Close Ticket" button.
        ticketView.closeTicketButton.click();

        ReusableMethods.wait(1);

        // 20 - Check "Close Support Ticket!" titled card is displayed.
        // 21 - Click "Close Ticket" button in card.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.confirmCloseTicketButton.isDisplayed(), "Close Support Ticket! titled card DID NOT display!");
        ticketView.confirmCloseTicketButton.click();

        ReusableMethods.wait(1);

        // 22 - Check that "Support ticket closed successfully!" notification is displayed.
        ticketView = new TicketView();
        softAssert.assertTrue(ticketView.closeTicketSuccessMessage.isDisplayed(), "Support ticket closed successfully! notification DID NOT display!");

        softAssert.assertAll();
        Driver.closeDriver();
    }
}
