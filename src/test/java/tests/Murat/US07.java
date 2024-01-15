package tests.Murat;

import org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor;
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
        //softAssert.assertTrue();

        //5 - Visitor verifies that they are on the blog page.
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
        //5 - The visitor sees the blog posts in the body section.
    }

    @Test
    public void testCase03(){

        //1 - Visitor goes to "https://qa.easybusticket.com/blog".
        Driver.getDriver().get(ConfigReader.getProperty("blogUrl"));
        ReusableMethods.wait(1);
        visitorHomePage.cookiesAllow.click();

        //2 - The visitor sees the Blog text in the body section.
        //3 - The visitor sees the blog posts in the body section.
        //4 - Visitor clicks on blog posts.
        //5 - Post details open.
        //6 - Visitor sees the blog post details.
    }
}