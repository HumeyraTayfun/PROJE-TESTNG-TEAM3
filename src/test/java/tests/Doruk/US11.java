package tests.Doruk;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.UserSignIn;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US11 {

    @Test
    public void testCase01() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        // 2 -  Click the "Sign In" button in the upper right corner.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        visitorHomePage.singInButton.click();

        ReusableMethods.wait(1);

        // 3 - Check that the login page opens.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/login";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the login page!");

        // 4 - Enter a valid value in the Username box.
        UserSignIn userSignIn = new UserSignIn();
        userSignIn.usernameBox.sendKeys(ConfigReader.getProperty("dorukUsername"));

        ReusableMethods.wait(1);

        // 5 - Enter a valid value in the Password box.
        userSignIn.passwordBox.sendKeys(ConfigReader.getProperty("dorukPassword"));

        ReusableMethods.wait(1);

        // 6 - Click the "Log In" button.
        userSignIn.loginButton.click();

        ReusableMethods.wait(1);

        // 7 - Check that the page that opens is the dashboard page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/user/dashboard";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the dashboard page!");
    }

    @Test
    public void testCase02() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");



    }

    @Test
    public void testCase03() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        // 2 - Click on the "+1 (603) 624-1800" button on the header.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        visitorHomePage.HeaderPhoneNumber.click();

        ReusableMethods.wait(1);

        // 3 - Check that you are navigated to the about contact page.

        // 4 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 5 - Click on the "info@easybusticket.com" button on the header.
        visitorHomePage.HeaderEmailAddress.click();

        ReusableMethods.wait(1);

        // 6 - Check that you are navigated to the about contact page.

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase04() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        // 2 - Click on the Twitter icon button on the header.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        visitorHomePage.HeaderTwitter.click();

        ReusableMethods.wait(1);

        // 3 - Check that you are navigated to twitter page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("twitter.com"), "You are NOT navigated to twitter page!");

        // 4 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 5 - Click on the Facebook icon button on the header.
        visitorHomePage.HeaderFacebook.click();

        ReusableMethods.wait(1);

        // 6 - Check that you are navigated to facebook page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("facebook.com"), "You are NOT navigated to facebook page!");

        // 7 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 8 - Click on the YouTube icon button on the header.
        visitorHomePage.HeaderYoutube.click();

        ReusableMethods.wait(1);

        // 9 - Check that you are navigated to youtube page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("youtube.com"), "You are NOT navigated to youtube page!");

        // 10 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 11 - Click on the Instagram icon button on the header.
        visitorHomePage.HeaderInstagram.click();

        ReusableMethods.wait(1);

        // 12 - Check that you are navigated to instagram page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("instagram.com"), "You are NOT navigated to instagram page!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase05() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        // 2 - Click on the "Sign In" button on the header.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        visitorHomePage.singInButton.click();

        ReusableMethods.wait(1);

        // 3 - Check that you are navigated to the "Sign In" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/login";

        softAssert.assertEquals(actualUrl, expectedUrl, "You are NOT navigated to the 'Sign In' page!");

        // 4 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 5 - Click on the "Sign Up" button on the header.
        visitorHomePage.singUpButton.click();

        ReusableMethods.wait(1);

        // 6 - Check that you are navigated to the "Sign Up" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/register";

        softAssert.assertEquals(actualUrl, expectedUrl, "You are NOT navigated to the 'Sign Up' page!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase06() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        // 2 - Click on the "About" button on the header.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        visitorHomePage.HeaderAbout.click();

        ReusableMethods.wait(1);

        // 3 - Check that you are navigated to the "About" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/about-us";

        softAssert.assertEquals(actualUrl, expectedUrl, "You are NOT navigated to the 'About' page!");

        // 4 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 5 - Click on the "FAQs" button on the header.
        visitorHomePage.HeaderFaQs.click();

        ReusableMethods.wait(1);

        // 6 - Check that you are navigated to the "FAQs" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/faqs";

        softAssert.assertEquals(actualUrl, expectedUrl, "You are NOT navigated to the 'FAQs' page!");

        // 7 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 8 - Click on the "Blog" button on the header.
        visitorHomePage.HeaderBlog.click();

        ReusableMethods.wait(1);

        // 9 - Check that you are navigated to the "Blog" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/blog";

        softAssert.assertEquals(actualUrl, expectedUrl, "You are NOT navigated to the 'Blog' page!");

        // 10 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 11 - Click on the "Contact" button on the header.
        visitorHomePage.HeaderContact.click();

        ReusableMethods.wait(1);

        // 12 - Check that you are navigated to the "Contact" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/contact";

        softAssert.assertEquals(actualUrl, expectedUrl, "You are NOT navigated to the 'Contact' page!");

        // 13 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 14 - Click on the "BUY TICKETS" button on the header.
        visitorHomePage.BuyTicketsButton.click();

        ReusableMethods.wait(1);

        // 15 - Check that you are navigated to the "Tickets" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/tickets";

        softAssert.assertEquals(actualUrl, expectedUrl, "You are NOT navigated to the 'Tickets' page!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase07() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        // 2 - Scroll down and check "Recent Blog Post" titled section is visible.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", visitorHomePage.RecentBlogPostTitle);

        softAssert.assertTrue(visitorHomePage.RecentBlogPostTitle.isDisplayed(), "Recent Blog Post section is NOT visible!");

        // 3 - Check that 3 blog cards are displayed below the title.
        softAssert.assertTrue(visitorHomePage.RecentBlogPostTitle1.isDisplayed(), "Blog card 1 is NOT visible!");
        softAssert.assertTrue(visitorHomePage.RecentBlogPostTitle2.isDisplayed(), "Blog card 2 is NOT visible!");
        softAssert.assertTrue(visitorHomePage.RecentBlogPostTitle3.isDisplayed(), "Blog card 3 is NOT visible!");

        // 4 - Click on the title in the 1st blog card.
        js.executeScript("arguments[0].click();", visitorHomePage.RecentBlogPostTitle1);

        ReusableMethods.wait(1);

        // 5 - Check that you are redirected to the 1st blog content page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/blog/103/travel-trends-the-best-times-to-explore-new-places";
        softAssert.assertEquals(actualUrl, expectedUrl, "You are NOT redirected to the 1st blog content page!");

        // 6 - Navigate page to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 7 - Click on the title in the 2nd blog card.
        js.executeScript("arguments[0].click();", visitorHomePage.RecentBlogPostTitle2);

        ReusableMethods.wait(1);

        // 8 - Check that you are redirected to the 2nd blog content page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/blog/87/traveling-with-technology-making-your-journey-easier-with-apps-and-devices";
        softAssert.assertEquals(actualUrl, expectedUrl, "You are NOT redirected to the 2nd blog content page!");

        // 9 - Navigate page to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 10 - Click on the title in the 3rd blog card.
        js.executeScript("arguments[0].click();", visitorHomePage.RecentBlogPostTitle3);

        ReusableMethods.wait(1);

        // 11 - Check that you are redirected to the 3rd blog content page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/blog/86/safety-measures-what-to-pay-attention-to-during-travel";
        softAssert.assertEquals(actualUrl, expectedUrl, "You are NOT redirected to the 3rd blog content page!");


        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase08() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        ReusableMethods.wait(3);

        // 2 - Scroll to the bottom of the page.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        ReusableMethods.wait(3);

        // 3 - Click on the Twitter icon button on the footer.
        visitorHomePage.cookiesAllow.click();

        ReusableMethods.wait(3);

        js.executeScript("arguments[0].click();", visitorHomePage.FooterTwitter);

        ReusableMethods.wait(1);

        // 4 - Check that you are navigated to twitter page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("twitter.com"), "You are NOT navigated to twitter page!");

        // 5 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 6 - Click on the Facebook icon button on the footer.
        js.executeScript("arguments[0].click();", visitorHomePage.FooterFacebook);

        ReusableMethods.wait(1);

        // 7 - Check that you are navigated to facebook page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("facebook.com"), "You are NOT navigated to facebook page!");

        // 8 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 9 - Click on the YouTube icon button on the footer.
        js.executeScript("arguments[0].click();", visitorHomePage.FooterYoutube);

        ReusableMethods.wait(1);

        // 10 - Check that you are navigated to youtube page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("youtube.com"), "You are NOT navigated to youtube page!");

        // 11 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 12 - Click on the Instagram icon button on the footer.
        js.executeScript("arguments[0].click();", visitorHomePage.FooterInstagram);

        ReusableMethods.wait(1);

        // 13 - Check that you are navigated to instagram page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("instagram.com"), "You are NOT navigated to instagram page!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase09() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        ReusableMethods.wait(3);

        // 2 - Scroll to the bottom of the page.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        ReusableMethods.wait(3);

        // 3 - Click on the "About" button on the footer.
        visitorHomePage.cookiesAllow.click();

        ReusableMethods.wait(3);

        js.executeScript("arguments[0].click();", visitorHomePage.footerabout);

        ReusableMethods.wait(1);

        // 4 - Check that you are navigated to about page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/about-us";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "You are NOT navigated to about page!");

        // 5 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 6 - Click on the "FAQs" button on the footer.
        js.executeScript("arguments[0].click();", visitorHomePage.footerFAQs);

        ReusableMethods.wait(1);

        // 7 - Check that you are navigated to FAQs page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/faqs";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "You are NOT navigated to FAQs page!");

        // 8 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 9 - Click on the "Blog" button on the footer.
        js.executeScript("arguments[0].click();", visitorHomePage.footerblog);

        ReusableMethods.wait(1);

        // 10 - Check that you are navigated to blog page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/blog";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "You are NOT navigated to blog page!");

        // 11 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 12 - Click on the "Contact" button on the footer.
        js.executeScript("arguments[0].click();", visitorHomePage.footercontact);

        ReusableMethods.wait(1);

        // 13 - Check that you are navigated to instagram page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/contact";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "You are NOT navigated to contact page!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase10() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        ReusableMethods.wait(3);

        // 2 - Scroll to the bottom of the page.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        ReusableMethods.wait(3);

        // 3 - Click on the "Privacy Policy" button on the footer.
        visitorHomePage.cookiesAllow.click();

        ReusableMethods.wait(3);

        js.executeScript("arguments[0].click();", visitorHomePage.footerprivacypolicy);

        ReusableMethods.wait(1);

        // 4 - Check that you are navigated to privacy policy page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/policy/69/privacy-policy";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "You are NOT navigated to privacy policy page!");

        // 5 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 6 - Click on the "Terms and Conditions" button on the footer.
        js.executeScript("arguments[0].click();", visitorHomePage.footertermsandconditions);

        ReusableMethods.wait(1);

        // 7 - Check that you are navigated to terms and conditions page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/policy/71/terms-and-conditions";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "You are NOT navigated to terms and conditions page!");

        // 8 - Navigate to back.
        Driver.getDriver().navigate().back();

        ReusableMethods.wait(1);

        // 9 - Click on the "Ticket Policies" button on the footer.
        js.executeScript("arguments[0].click();", visitorHomePage.Ticketpolicies);

        ReusableMethods.wait(1);

        // 10 - Check that you are navigated to ticket policies page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/policy/90/ticket-policies";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "You are NOT navigated to ticket policies page!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase11() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get("https://qa.easybusticket.com");

        ReusableMethods.wait(3);

        // 2 - Scroll to the bottom of the page.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        ReusableMethods.wait(3);

        // 37 - Click on the "+1 (603) 624-1800" button on the footer.
        visitorHomePage.cookiesAllow.click();

        ReusableMethods.wait(3);

        js.executeScript("arguments[0].click();", visitorHomePage.footerPhone);

        ReusableMethods.wait(1);

        // 4 - Check that the alert for forwarding to a phone number is visible
        // 5 - Click cancel on alert.
        Driver.getDriver().switchTo().alert().dismiss();

        ReusableMethods.wait(1);

        // 6 - Click on "info@easybusticket.com" button on the footer.
        js.executeScript("arguments[0].click();", visitorHomePage.footerEmail);

        ReusableMethods.wait(1);

        // 7 - Check that the mail sending tool is open.


        softAssert.assertAll();
        Driver.closeDriver();
    }

}
