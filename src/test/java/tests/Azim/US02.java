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

    @Test
    public void  test1(){
        SoftAssert softAssert=new SoftAssert();
        VisitorHomePage visitorHomePage=new VisitorHomePage();

        //1-User goes to the "https://qa.easybusticket.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        //2-Verify that home page is visible successfully
        String expectedUrl="https://qa.easybusticket.com";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"home page is not visible");

        //3-Verify that header is visible successfully
        softAssert.assertTrue(visitorHomePage.singInButton.isDisplayed(),"header isn't visible successfully");
    }
    @Test
    public void test2(){


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
        SoftAssert softAssert=new SoftAssert();
        VisitorHomePage visitorHomePage=new VisitorHomePage();

        //1-User goes to the "https://qa.easybusticket.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        //2-Verify that home page is visible successfully
        String expectedUrl="https://qa.easybusticket.com";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"home page is not visible");

        // 3-Click on the "+1 (603) 624-1800" button on the header.

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
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        SoftAssert softAssert=new SoftAssert();

        // 1-Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        //2-Click on the "Sign In" button on the header.

        visitorHomePage.HeaderSignİgn.click();

        //3-Verify that you are navigated to the "Sign In" page.
        String expectedloginUrl="https://qa.easybusticket.com/login";
        String actualloginUrl=Driver.getDriver().getCurrentUrl();

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
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        SoftAssert softAssert=new SoftAssert();

        //1-Go to website "https://qa.easybusticket.com"
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        //2-Click on the "Easybusticket ikon "  on the header.
        visitorHomePage.HeaderLogo.click();

        //3-Verify that the page refreshes when the "Easybusticket Logo ikon" is clicked
        String expectedLogoUrl="https://qa.easybusticket.com";
        String actualLogoUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualLogoUrl,expectedLogoUrl,"Logo home page is not visible");

        //4-Click on the "About" button on the header.
        visitorHomePage.HeaderAbout.click();

        //6-Verify that you are navigated to the "About" page.
        String expectedAboutUrl="https://qa.easybusticket.com/about-us";
        String actualAboutUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualAboutUrl,expectedAboutUrl,"About page is not visible");

        //6-Navigate to back.
        Driver.getDriver().navigate().back();

        //7-Click on the "FAQs" button on the header.
        visitorHomePage.HeaderFaQs.click();

        //8-Verify that you are navigated to the "FAQs" page.
        String expectedFAQsUrl="https://qa.easybusticket.com/faq";
        String actualFAQsUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualFAQsUrl,expectedFAQsUrl,"FAQs page is not visible");

        //9-Navigate to back.
        Driver.getDriver().navigate().back();

        //10-Click on the "Blog" button on the header.
        visitorHomePage.HeaderBlog.click();

        //11-Verify that you are navigated to the "Blog" page.
        String expectedBlogUrl="https://qa.easybusticket.com/blog";
        String actualBlogUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualBlogUrl,expectedBlogUrl,"Blog  page is not visible");

        //12-Navigate to back.
        Driver.getDriver().navigate().back();

        //13-Click on the "Contact" button on the header.
        visitorHomePage.HeaderContact.click();

        //14-Verify that you are navigated to the "Contact" page.
        String expectedContactUrl="https://qa.easybusticket.com/contact";
        String actualContactUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualContactUrl,expectedContactUrl,"Contact page is not visible");

        //15-Navigate to back.
        Driver.getDriver().navigate().back();

        //16-Click on the "BUY TICKETS" button on the header.
        visitorHomePage.HeaderByTicket.click();

        //17-Verify that you are navigated to the "Tickets" page.
        String expectedTicketsUrl="https://qa.easybusticket.com/tickets";
        String actualTicketsUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualTicketsUrl,expectedTicketsUrl,"Tickets page is not visible");

    }
}
