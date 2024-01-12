package tests.İhsan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US01 {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void testCase01(){
        // 1- User go to the "https://qa.easybusticket.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        // 2- Verify that "Every Journey is an Adventure, Every Ticket is  a Story" is visible.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        softAssert.assertTrue(visitorHomePage.HomePageVerify.isDisplayed(), "User DID NOT display" +
                " \"Every Journey is an Adventure, Every Ticket is  a Story\"");

        softAssert.assertAll();
        Driver.quitDriver();



    }
}