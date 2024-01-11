package tests.Murat;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.visitor.VisitorFAQs;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import org.testng.asserts.SoftAssert;
import utilities.ReusableMethods;

public class US06 {

    SoftAssert softAssert = new SoftAssert();
    VisitorHomePage visitorHomePage = new VisitorHomePage();
    VisitorFAQs visitorFAQs = new VisitorFAQs();
    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void testCase01(){

        //1 - Visitor goes to "https://qa.easybusticket.com".
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(1);
        visitorHomePage.cookiesAllow.click();

        //2 - Visitor clicks on the FAQS link in the header section.
        visitorHomePage.HeaderFaQs.click();

        //3 - Visitor reaches "https://qa.easybusticket.com/faq".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/faq"));

        //4 - The visitor sees the FAQs text in the body section.
        softAssert.assertTrue(visitorFAQs.labelFaqs.isDisplayed());

        //5 - Visitor verifies that they are on the faqs page.
        softAssert.assertTrue(visitorFAQs.labelFaqsBody.isDisplayed());

        Driver.quitDriver();
    }

    @Test
    public void testCase02(){

        //1 - Visitor goes to "https://qa.easybusticket.com".
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(1);
        visitorHomePage.cookiesAllow.click();

        //2 - Visitor clicks on the FAQS link in the header section.
        ReusableMethods.wait(1);
        visitorHomePage.HeaderFaQs.click();

        //3 - Visitor reaches "https://qa.easybusticket.com/faq".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/faq"));

        //4 - The visitor sees the FAQs text in the body section.
        softAssert.assertTrue(visitorFAQs.labelFaqs.isDisplayed());

        //5 - The visitor clicks on the questions at the bottom of the post.
        //6 - Visitors see the answers to the questions when they click on the questions.
        visitorFAQs.labelQuestion1.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer1.isDisplayed());

        visitorFAQs.labelQuestion2.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer2.isDisplayed());

        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", visitorFAQs.labelQuestion13);
        ReusableMethods.wait(1);

        visitorFAQs.labelQuestion3.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer3.isDisplayed());

        visitorFAQs.labelQuestion4.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer4.isDisplayed());

        visitorFAQs.labelQuestion5.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer5.isDisplayed());

        visitorFAQs.labelQuestion6.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer6.isDisplayed());

        visitorFAQs.labelQuestion7.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer7.isDisplayed());

        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", visitorFAQs.labelFaqsBody);
        ReusableMethods.wait(1);

        visitorFAQs.labelQuestion8.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer8.isDisplayed());

        visitorFAQs.labelQuestion9.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer9.isDisplayed());

        visitorFAQs.labelQuestion10.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer10.isDisplayed());

        visitorFAQs.labelQuestion11.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer11.isDisplayed());

        visitorFAQs.labelQuestion12.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer12.isDisplayed());

        visitorFAQs.labelQuestion13.click();
        softAssert.assertTrue(visitorFAQs.labelAnswer13.isDisplayed());

        Driver.quitDriver();
    }
}
