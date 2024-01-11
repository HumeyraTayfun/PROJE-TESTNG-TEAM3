package tests.Senayda;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.visitor.VisitorAbout;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US05 {

    @Test
    public void testCase01() {

        // 1-  User navigates to the homepage of the website: https://qa.easybusticket.com/
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        // 2- User identifies and locate the 'About' link within the header section.
        VisitorHomePage visitorHomePage = new VisitorHomePage();

        Assert.assertTrue(visitorHomePage.HeaderAbout.isDisplayed());

        // 3- User clicks on the 'About' link.
        visitorHomePage.HeaderAbout.click();

        // 4- User verifies that the 'About' page loads correctly
        // without any errors or delays.
        ReusableMethods.bekle(2);
        VisitorAbout visitorAbout = new VisitorAbout();
        Assert.assertTrue(visitorAbout.aboutTitle.isDisplayed());

        // 5- User confirms that the displayed
        // information matches the expected details on about page.

        ReusableMethods.bekle(2);

        VisitorAbout visitorAbout1 = new VisitorAbout();
        Assert.assertTrue(visitorAbout1.aboutPageTextInformation.isDisplayed());

        Driver.quitDriver();

    }
}