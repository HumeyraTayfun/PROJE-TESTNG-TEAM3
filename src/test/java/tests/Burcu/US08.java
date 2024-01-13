package tests.Burcu;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US08 {



        @Test
        public void testCase08(){
            VisitorHomePage visitorHomePage=new VisitorHomePage();
            SoftAssert softAssert1=new SoftAssert();

            //1-User goes to the home page: https://qa.easybusticket.com/
            Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
            //2-User must click on "Allow Cookies"button.
            ReusableMethods.wait(2);

            visitorHomePage.cookiesAllow.click();
            //3-User clicks 'Contact' button on Header menu.(kullanıcı baslık menusundekı ıletısım menusune tıklar)
            visitorHomePage.HeaderContact.click();
            //4-User clicks 'Contact' on the footer menu.(kullanıcı altbılgısı menusundekı kısıye tıklar)
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
            ReusableMethods.bekle(3);

            javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

            visitorHomePage.footerContacınfo.click();
            //5-User should be landed on 'Contact' page.(kullanıcı ıletsım sayfasına yonlendırılmelı)
            visitorHomePage.HeaderContact.click();


        }
        @Test
        public void testCase02(){
            VisitorHomePage visitorHomePage=new VisitorHomePage();
            SoftAssert softAssert1=new SoftAssert();

            //1-User goes to the home page: https://qa.easybusticket.com/
            Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
            //2-User must click on "Allow Cookies"button.
            ReusableMethods.wait(2);

            visitorHomePage.cookiesAllow.click();
            //3-User should be landed on 'Contact' page.(Kullanıcı ıletısım sayfasına yonlendırılme)
            ReusableMethods.wait(2);
            visitorHomePage.HeaderContact.click();
            //4-User should be able to see address, phone, e-meail infos.(kullanıcı adres telefon e posta bılgılerını görebilmelidir)
            Assert.assertTrue(visitorHomePage.HeaderEmailAddress.isDisplayed());
            Assert.assertTrue(visitorHomePage.HeaderPhoneNumber.isDisplayed());
            Assert.assertTrue(visitorHomePage.HeaderEmailAddress.isDisplayed());
            //5-User clicks phone number.(kullanıcı telefon numarasına tıklar)
            visitorHomePage. HeaderPhoneNumber.click();
            //6-User displays phone alert.(KULLANICI TELEFOn uyarısını  GORUR)
            Assert.assertTrue(visitorHomePage. phoneAlert.isDisplayed());

        }
        @Test
    public void testCase03(){
            VisitorHomePage visitorHomePage=new VisitorHomePage();
            SoftAssert softAssert1=new SoftAssert();

            //1-User goes to the home page: https://qa.easybusticket.com/
            Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
            //2-User must click on "Allow Cookies"button.
            ReusableMethods.wait(2);

            visitorHomePage.cookiesAllow.click();
            //3-User should be landed on 'Contact' page.
            visitorHomePage.HeaderContact.click();
            //4-User should be able to see address, phone, e-meail infos.
            Assert.assertTrue(visitorHomePage.HeaderEmailAddress.isDisplayed());
            Assert.assertTrue(visitorHomePage.HeaderPhoneNumber.isDisplayed());
            Assert.assertTrue(visitorHomePage.HeaderEmailAddress.isDisplayed());
            //5-User clicks e-mail string.(kullanıcı eposta dızısıne tıklar)
            visitorHomePage.HeaderEmailAddress.click();
            //6-User displays e-mail alert.(kullanıcı eposta uyarısını gorur)
            visitorHomePage. emailAlert.click();


        }
        @Test
    public void testCase04(){
            VisitorHomePage visitorHomePage=new VisitorHomePage();
            SoftAssert softAssert1=new SoftAssert();

            //1-User goes to the home page: https://qa.easybusticket.com/
            Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
            //2-User must click on "Allow Cookies"button.
            ReusableMethods.wait(2);
            visitorHomePage.cookiesAllow.click();
            //3-User should be landed on 'Contact' page.
            visitorHomePage.HeaderContact.click();
            //4-User fill Name, Email, Subject, Your Message boxes(Kullanıcı adı, E-posta, Konu, Mesaj kutularınızı doldurun)

            ReusableMethods.wait(2);
             visitorHomePage.messageName.sendKeys(ConfigReader.getProperty("name"));
             visitorHomePage.messageEmail.sendKeys(ConfigReader.getProperty("email"));
             visitorHomePage.messageSubject.sendKeys(ConfigReader.getProperty("subject"));
             ReusableMethods.wait(2);
             visitorHomePage.sendUsMessageButton.sendKeys(ConfigReader.getProperty("Your Message"));
             ReusableMethods.wait(2);
            //5- User clicks 'Send Message' Button
            visitorHomePage.sendUsMessageButton.click();
            //6-User should see on right top corner following message:
            //Your message has been sent .Thank you for contacting us


        }
        @Test
    public void testCase05(){
            VisitorHomePage visitorHomePage=new VisitorHomePage();
            SoftAssert softAssert1=new SoftAssert();

            //1-User goes to the home page: https://qa.easybusticket.com/
            Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
            //2-User must click on "Allow Cookies"button.
            visitorHomePage.cookiesAllow.click();
           // 3-User should be landed on 'Contact' page.
            visitorHomePage.HeaderContact.click();
            //4-User should see name of company on the left top corner of the map.(Kullanıcı, haritanın sol üst köşesinde şirketin adını görmelidir.)
            visitorHomePage.harıtaAddress.isDisplayed();
        }
}
