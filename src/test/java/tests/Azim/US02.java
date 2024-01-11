package tests.Azim;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.registeredUser.SupportRequests;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US02 {
    /*
1-User goes to the "https://qa.easybusticket.com"
2-Verify that home page is visible successfully
3-Verify that header is visible successfully
     */
    @Test
    public void  test1(){
        //1-User goes to the "https://qa.easybusticket.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        //2-Verify that home page is visible successfully
        String expectedUrl="https://qa.easybusticket.com";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualUrl,expectedUrl,"home page is not visible");

        //3-Verify that header is visible successfully
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        softAssert.assertTrue(visitorHomePage.singInButton.isDisplayed(),"header isn't visible successfully");
    }
    @Test
    public void test2(){

/*
1.User goes to the "https://qa.easybusticket.com"
2-Verify that Phone number, e-mail address is visible successfully.
3-Verify that media icons is visible successfully.
4-Verify that sign up/sign in button is visible successfully.
5-Verify that logo is visible successfully.
6-Verify that Home, About, FAQs,Blog,Contact is visible successfully.
7-Verify that Buy TICKET button is visible successfully.
*/
        SoftAssert softAssert = new SoftAssert();
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        softAssert.assertTrue(visitorHomePage.HeaderLogo.isDisplayed());
        Driver.getDriver().get("https://qa.easybusticket.com");
        for (int i = 0; i < 16 ; i++) {
            softAssert.assertTrue(visitorHomePage.listr.get(i).isDisplayed());
        }
        softAssert.assertAll();

    }

    @Test
    public void test3(){
    /*
1-Go to website "https://qa.easybusticket.com"
2-Verify that the header visible at the top of the opened page.
3-Click on the "+1 (603) 624-1800" button on the header.
4-Verify that you are navigated to the about contact page.
5-Navigate to back.
6-Click on the "info@easybusticket.com" button on the header.
7-Verify that you are navigated to the about contact page.
8-Navigate to back.
9-Click on the Twitter icon button on the header.
10-Verify that you are navigated to twitter page.
11-Navigate to back.
12-Click on the Facebook icon button on the header.
13-Verify that you are navigated to facebook page.
14-Navigate to back.
15-Click on the YouTube icon button on the header.
16-Verify that you are navigated to youtube page.
17-Navigate to back.
18-Click on the Instagram icon button on the header.
19-Verify that you are navigated to instagram page.
    */
        //1-User goes to the "https://qa.easybusticket.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        //2-Verify that home page is visible successfully
        String expectedUrl="https://qa.easybusticket.com";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualUrl,expectedUrl,"home page is not visible");

        // 3-Click on the "+1 (603) 624-1800" button on the header.
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        visitorHomePage.HeaderPhoneNumber.click();

        //4-Verify that you are navigated to the about contact page.
        //5-Navigate to back.

        //6-Click on the "info@easybusticket.com" button on the header.
        visitorHomePage.HeaderEmailAddress.click();

        //7-Verify that you are navigated to the about contact page.
        //8-Navigate to back.

        //9-Click on the Twitter icon button on the header.
        visitorHomePage.Headertiwetterİcon.click();

        //10-Verify that you are navigated to twitter page.
        String expectedtwitterUrl="https://twitter.com/";
        String actualtwitterUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"twitter page is not visible");

        //11-Navigate to back.
        Driver.getDriver().navigate().back();

        //12-Click on the Facebook icon button on the header.
        visitorHomePage.HeaderFacebook.click();

        //13-Verify that you are navigated to facebook page.
        String expectedfacebookUrl="https://www.facebook.com";
        String actualfacebookUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"facebook page is not visible");

        //14-Navigate to back.
        Driver.getDriver().navigate().back();

        //15-Click on the YouTube icon button on the header.
        visitorHomePage.HeaderYoutube.click();

        //16-Verify that you are navigated to youtube page.
        String expectedyoutubeUrl="https://www.youtube.com/";
        String actualyoutubeUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"youtube page is not visible");

        //17-Navigate to back.
        Driver.getDriver().navigate().back();

        //18-Click on the Instagram icon button on the header.

        //19-Verify that you are navigated to instagram page.
        String expectedinstagramUrl="https://www.instagram.com";
        String actualinstagramUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"instagram page is not visible");

        Driver.quitDriver();
    }
    @Test
    public void test4(){

    /*
1-Go to website "https://qa.easybusticket.com"
2-Click on the "Sign In" button on the header.
3-Verify that you are navigated to the "Sign In" page.
4-Navigate to back.
5-Click on the "Sign Up" button on the header.
6-Verify that you are navigated to the "Sign Up" page.
     */
        // 1-Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        //2-Click on the "Sign In" button on the header.
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        visitorHomePage.HeaderSignİgn.click();

        //3-Verify that you are navigated to the "Sign In" page.
        String expectedloginUrl="https://qa.easybusticket.com/login";
        String actualloginUrl=Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualloginUrl,expectedloginUrl,"login page is not visible");

        //4-Navigate to back
        Driver.getDriver().navigate().back();

        //5-Click on the "Sign Up" button on the header.
        visitorHomePage.HeaderSignUp.click();

        //6-Verify that you are navigated to the "Sign Up" page.
        String expectedUrl="https://qa.easybusticket.com/register";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"Sign In page is not visible");

    }
    @Test
    public void test5(){

    }
}
