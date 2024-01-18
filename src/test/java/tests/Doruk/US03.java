package tests.Doruk;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US03 {

    @Test
    public void testCase01(){
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("userUrl")
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        // 2 - Verify "Choose Your Ticket" section is visible
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        softAssert.assertTrue(visitorHomePage.ChooseYourTicketTitle.isDisplayed(), "Choose Your Ticket section is NOT visible!");

        // 3 - Set value to "Pickup Point" box.
        Select pickupPoint = new Select(visitorHomePage.dropDownPickupPoint);
        pickupPoint.selectByVisibleText(ConfigReader.getProperty("dorukPickupPoint"));

        ReusableMethods.wait(1);

        // 4 - Set value to "Drop Off Point" box.
        Select dropOffPoint = new Select(visitorHomePage.dropDownDroppingPoint);
        dropOffPoint.selectByVisibleText(ConfigReader.getProperty("dorukDroppingPoint"));

        ReusableMethods.wait(1);

        // 5 - Set value to "Departure Date" date box.
        visitorHomePage.dropDownDepartureDate.sendKeys(ConfigReader.getProperty("dorukDepartureDate"));

        ReusableMethods.wait(1);

        // 6 - Click "Find Tickets" button.
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", visitorHomePage.findTicketsButton);

        ReusableMethods.wait(5);

        // 7 - Check that tickets are shown according to the entered destinations.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/ticket/search?pickup=1&destination=2&date_of_journey=07%2F12%2F2024";
        softAssert.assertEquals(actualUrl, expectedUrl, "Tickets are NOT shown according to the entered destinations!");

        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase02() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("userUrl")
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        // 2 - Scroll down and check "Our Testimonials" titled section is visible.
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", visitorHomePage.OurTestimonialsTitle);
        softAssert.assertTrue(visitorHomePage.OurTestimonialsTitle.isDisplayed(), "Our Testimonials section is NOT visible!");

        // 3 - Check if the comment appears in the white card under the title.
        softAssert.assertTrue(visitorHomePage.OurTestimonialsComment.isDisplayed(), "Comment is NOT visible!");

        // 4 - Click on the 2nd of the 3 lines at the bottom of the comment card.
        js.executeScript("arguments[0].click();", visitorHomePage.OurTestimonialsDatButton2);

        ReusableMethods.wait(1);

        // 5 - Check if different comment content is displayed.

        // 6 - Click on the 3rd of the 3 lines at the bottom of the comment card.
        js.executeScript("arguments[0].click();", visitorHomePage.OurTestimonialsDatButton3);

        ReusableMethods.wait(1);

        // 7 - Check if different comment content is displayed.

        // 8 - Click on the 1st of the 3 lines at the bottom of the comment card.
        js.executeScript("arguments[0].click();", visitorHomePage.OurTestimonialsDatButton1);

        ReusableMethods.wait(1);

        // 9 - Check that the first displayed comment content is displayed again.


        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase03() {
        SoftAssert softAssert = new SoftAssert();

        // 1 - Go to website ConfigReader.getProperty("userUrl")
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

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

}
