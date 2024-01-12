package tests.Azim;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.UserSignIn;
import pages.visitor.VisitorHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US12 {

    public  void  test01(){

        //1-User go to the "https://qa.easybusticket.com"
        //2- User clicks on "Sign In"button.
        //3- User clicks on username box.
        //4- User enters a valid username.
        //5- User clicks on password box.
        //6- User enters a valid password.
        //7- User clicks the "Login" button.
        UserSignIn userSignIn=new UserSignIn();
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        ReusableMethods.userLogin("azimUsername","azimPassword");
        ReusableMethods.bekle(3);
        //9-Click on the "Easybusticket Logo ikon "  on the header.
        visitorHomePage.HeaderLogo.click();

        //10-Click on the "Dashboard " button  on the header.
        visitorHomePage.HeaderDasbordLinkButton.click();

        //11-User displays the "Dashboard" link.
        String expecteddashboardUrl="https://qa.easybusticket.com/user/dashboard";
        String actualdashboardUrl= Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualdashboardUrl,expecteddashboardUrl,"dashboard page is not visible");
    }
    @Test
    public  void  test02(){
        //1-User go to the "https://qa.easybusticket.com"
        //2- User clicks on "Sign In"button.
        //3- User clicks on username box.
        //4- User enters a valid username.
        //5- User clicks on password box.
        //6- User enters a valid password.
        //7- User clicks the "Login" button.
        UserSignIn userSignIn=new UserSignIn();
        ReusableMethods.userLogin("azimUsername","azimPassword");
        UserSignIn userSignIn1=new UserSignIn();

        //8-Verify that menu dasbord button is visible successfully
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(userSignIn.HeaderDashboard.isDisplayed(),"dashboard button is not visible");
    }

@Test
    public  void  test03(){
        //1-User go to the "https://qa.easybusticket.com"
        //2-User clicks on "Sign In"button.
        //3-User displays the "Sign In" page
        //4-User clicks on username box.
        //5-User enters a valid username.
        //6-User clicks on password box.
        //7-User enters a valid password.
        //8-User clicks the "Login" button.
        UserSignIn userSignIn=new UserSignIn();
        SoftAssert softAssert=new SoftAssert();
        ReusableMethods.userLogin("azimUsername","azimPassword");

        //9-User clicks on "Dasboard".
        userSignIn.HeaderDashboard.click();

        //10-Verify that dasbord page is visible successfully
        String expecteddashboardUrl="https://qa.easybusticket.com/user/dashboard";
        String actualdashboardUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualdashboardUrl,expecteddashboardUrl,"dashboard page is not visible");
   }
}



