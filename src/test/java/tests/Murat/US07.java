package tests.Murat;

import org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.visitor.VisitorBlog;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US07 {

    VisitorHomePage visitorHomePage = new VisitorHomePage();
    SoftAssert softAssert = new SoftAssert();
    VisitorBlog visitorBlog = new VisitorBlog();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void testCase01(){

        //1 - Visitor goes to "https://qa.easybusticket.com".
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(1);
        visitorHomePage.cookiesAllow.click();

        //2 - Visitor clicks on the Blog link in the header section.
        visitorHomePage.HeaderBlog.click();

        //3 - Visitor reaches "https://qa.easybusticket.com/blog".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/blog"));

        //4 - The visitor sees the Blog text in the body section.
        softAssert.assertTrue(visitorBlog.labelBlog.isDisplayed());

        //5 - Visitor verifies that they are on the blog page.
        softAssert.assertTrue(visitorBlog.BlogTitle1.isDisplayed());

        Driver.quitDriver();
    }

    @Test
    public void testCase02(){

        //1 - Visitor goes to "https://qa.easybusticket.com".
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(1);
        visitorHomePage.cookiesAllow.click();

        //2 - Visitor clicks on the Blog link in the header section.
        visitorHomePage.HeaderBlog.click();

        //3 - Visitor reaches "https://qa.easybusticket.com/blog".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/blog"));

        //4 - The visitor sees the Blog text in the body section.
        softAssert.assertTrue(visitorBlog.labelBlog.isDisplayed());

        //5 - The visitor sees the blog posts in the body section.
        softAssert.assertTrue(visitorBlog.BlogTitle1.isDisplayed());

        Driver.quitDriver();
    }

    @Test
    public void testCase03(){

        //1 - Visitor goes to "https://qa.easybusticket.com/blog".
        Driver.getDriver().get(ConfigReader.getProperty("blogUrl"));
        ReusableMethods.wait(1);
        visitorHomePage.cookiesAllow.click();

        //2 - The visitor sees the Blog text in the body section.
        softAssert.assertTrue(visitorBlog.labelBlog.isDisplayed());

        //3 - The visitor sees the blog posts in the body section.
        //4 - Visitor clicks on blog posts.
        //5 - Post details open.
        //6 - Visitor sees the blog post details.
        softAssert.assertTrue(visitorBlog.BlogTitle1.isDisplayed());
        visitorBlog.BlogTitle1.click();
        softAssert.assertTrue(visitorBlog.labelBlogDetails.isDisplayed());
        Driver.getDriver().navigate().back();

        softAssert.assertTrue(visitorBlog.BlogTitle2.isDisplayed());
        visitorBlog.BlogTitle2.click();
        softAssert.assertTrue(visitorBlog.labelBlogDetails.isDisplayed());
        Driver.getDriver().navigate().back();

        softAssert.assertTrue(visitorBlog.BlogTitle3.isDisplayed());
        visitorBlog.BlogTitle3.click();
        softAssert.assertTrue(visitorBlog.labelBlogDetails.isDisplayed());
        Driver.getDriver().navigate().back();

        softAssert.assertTrue(visitorBlog.BlogTitle4.isDisplayed());
        visitorBlog.BlogTitle4.click();
        softAssert.assertTrue(visitorBlog.labelBlogDetails.isDisplayed());
        Driver.getDriver().navigate().back();

        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        ReusableMethods.wait(1);

        softAssert.assertTrue(visitorBlog.BlogTitle5.isDisplayed());
        visitorBlog.BlogTitle5.click();
        softAssert.assertTrue(visitorBlog.labelBlogDetails.isDisplayed());
        Driver.getDriver().navigate().back();

        softAssert.assertTrue(visitorBlog.BlogTitle6.isDisplayed());
        visitorBlog.BlogTitle6.click();
        softAssert.assertTrue(visitorBlog.labelBlogDetails.isDisplayed());
        Driver.getDriver().navigate().back();

        softAssert.assertTrue(visitorBlog.BlogTitle7.isDisplayed());
        visitorBlog.BlogTitle7.click();
        softAssert.assertTrue(visitorBlog.labelBlogDetails.isDisplayed());
        Driver.getDriver().navigate().back();

        Driver.quitDriver();
    }
}