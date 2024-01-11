package tests.Burcu;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US04 {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCase01() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();

        //1-User goes  to the home page:  https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //2-User must click on "Allow Cookies"button.
        ReusableMethods.wait(2);
        visitorHomePage.cookiesAllow.click();
        //3-User scrolls all the way down.
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.wait(3);

        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",visitorHomePage. privacypolicy);
        //4-User sees the footer menu.
        ReusableMethods.wait(2);
        visitorHomePage = new VisitorHomePage();
        Assert.assertTrue(visitorHomePage.Ticketpolicies.isDisplayed());
        Driver.quitDriver();

    }

    @Test
    public void testCase02() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        SoftAssert softAssert = new SoftAssert();

        //1-User goes to the home page: https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //2-User clicks 'Allow Cookies' button in pop menu.
        visitorHomePage.cookiesAllow.click();
        //3-User scrolls all the way down.
        //4-User sees 'About Us' under the 'Useful Links' Menu.
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.wait(3);

        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        ReusableMethods.wait(2);
        Assert.assertTrue(visitorHomePage.footerabout.isDisplayed());
        Driver.quitDriver();
    }

    @Test
    public void testCase03() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        SoftAssert softAssert = new SoftAssert();

        //1-User goes to the home page: https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //2-User clicks 'Allow Cookies' button in pop menu.
        ReusableMethods.wait(2);
        visitorHomePage.cookiesAllow.click();
        //3-User scrolls all the way down.
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.wait(3);

        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //4-User clicks 'FAQs' on the footer menu
        ReusableMethods.wait(3);
        visitorHomePage.footerFAQs.click();
        Driver.quitDriver();
    }

    @Test
    public void testCase04() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        SoftAssert softAssert1 = new SoftAssert();

        //1_User goes to the home page: https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //2_User clicks 'Allow Cookies' button in pop menu.
        ReusableMethods.wait(3);
        visitorHomePage.cookiesAllow.click();
        //3_User scrolls all the way down.
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.wait(3);

        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //4_User clicks 'Blog' on the footer menu.
        ReusableMethods.wait(2);
        visitorHomePage.footerblog.click();
        Driver.quitDriver();
    }

    @Test
    public void testCase05() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        SoftAssert softAssert1 = new SoftAssert();

        //1_User goes to the home page: https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //2_User clicks 'Allow Cookies' button in pop menu.
        visitorHomePage.cookiesAllow.click();
        ReusableMethods.wait(2);
        //3_User scrolls all the way down.
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.wait(3);

        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        //4-User clicks 'Contact' on the footer menu.
        ReusableMethods.wait(2);
        visitorHomePage.footercontact.click();
        Driver.quitDriver();
    }

    @Test
    public void testCase06() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        SoftAssert softAssert1 = new SoftAssert();

        //1-User goes to the home page: https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //2-User clicks 'Allow Cookies' button in pop menu.
        ReusableMethods.wait(2);
        visitorHomePage.cookiesAllow.click();
        //3-User scrolls all the way down.
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.wait(3);

        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        //4-User clicks 'Privacy policy' on the footer menu.
        visitorHomePage.footerprivacypolicy.click();
        Driver.quitDriver();
    }

    @Test
    public void testCase07() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        SoftAssert softAssert1 = new SoftAssert();

        //1-User goes to the home page: https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //2-User clicks 'Allow Cookies' button in pop menu.
        visitorHomePage.cookiesAllow.click();
        //3-User scrolls all the way down.
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.wait(3);

        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        //4-User clicks 'Terms and Conditions' on the footer menu.
        visitorHomePage.footertermsandconditions.click();
    }

    @Test
    public void testCase08() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        SoftAssert softAssert1 = new SoftAssert();

        //1-User goes to the home page: https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //2-User clicks 'Allow Cookies' button in pop menu.
        visitorHomePage.cookiesAllow.click();
        //3-User scrolls all the way down.
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.wait(3);

        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        //4-User clicks 'Ticket Policies' on the footer menu.
        visitorHomePage.Ticketpolicies.click();

    }

    @Test
    public void testCase09() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        SoftAssert softAssert1 = new SoftAssert();

        //1-User goes to the home page: https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //2-User clicks 'Allow Cookies' button in pop menu.
        visitorHomePage.cookiesAllow.click();
        //3-User scrolls all the way down.

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.wait(3);

        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        //-User should be able to view Informantions under 'Contact Info' section

    }
}