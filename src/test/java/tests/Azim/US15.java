package tests.Azim;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.UserSignIn;
import pages.user.registeredUser.SupportRequests;
import pages.user.registeredUser.UserDashboard;
import pages.visitor.VisitorHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US15 {

@Test
    public  void  test01(){
    //1-User go to the "https://qa.easybusticket.com"
    //2- User clicks on "Sign In"button.
    //3- User clicks on username box.
    //4- User enters a valid username.
    //5- User clicks on password box.
    //6- User enters a valid password.
    //7- User clicks the "Login" button.
    //8-User clicks on "Dasboard".

    UserSignIn userSignIn=new UserSignIn();
    SoftAssert softAssert=new SoftAssert();
    ReusableMethods.userLogin("azimUsername","azimPassword");



    //9-Click on the new ticket link from the Support Request menu.


    //10-Verify that  Support Request new ticket creation page is visible successfully

    }
@Test
    public  void  test02(){
    //1-User go to the "https://qa.easybusticket.com"
    //2-User clicks on "Sign In"button.
    //3-User clicks on username box.
    //4-User enters a valid username.
    //5-User clicks on password box.
    //6-User enters a valid password.
    //7-User clicks the "Login" button.
    UserDashboard userDashboard=new UserDashboard();
    VisitorHomePage visitorHomePage=new VisitorHomePage();
    SupportRequests supportRequests=new SupportRequests();
    SoftAssert softAssert=new SoftAssert();
    ReusableMethods.userLogin("azimUsername","azimPassword");

    //8-In the drop-down list that opens, click on the "Create New" button.
    userDashboard.supportRequestButton.click();
    userDashboard.CreateNewButton.click();

    //9-User clicks on the name box.
    supportRequests.nameBox.click();

    //10-User on the name box  enter a valid name
    supportRequests.nameBox.sendKeys("azim");
    //11-User clicks on the Email address box.
    supportRequests.emailAdressBox.click();

    //12-User on the Email address box  enter a valid Email address
    supportRequests.emailAdressBox.sendKeys("azimkaya3377@gmail.com");

    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
    javascriptExecutor.executeScript("arguments[0].scrollIntoView();",supportRequests.subjectBox);

    //13-User clicks on the Subject box
    supportRequests.subjectBox.click();

    //14-User on the Subject box  enter a valid support
    supportRequests.subjectBox.sendKeys("support");

    JavascriptExecutor javascriptExecutor1 = (JavascriptExecutor) Driver.getDriver();
    javascriptExecutor.executeScript("arguments[0].scrollIntoView();",supportRequests.subjectBox);

    //15-User click on priority dropdown.
    supportRequests.priorityBox.click();
    //16-User on priority dropdown and choose one
    Select select=new Select(supportRequests.priorityBox);
    select.selectByVisibleText("2");
    //17-User clicks on message button.
    //18-User on message  enter her/his message
    //19-User clicks on "Select File" button.
    //20-"Select File"selects a valid file from her/his folder according to allowed file extensions"
    //21-Verify that folder is selected
    //22-User clicks on plus button(+)
    //23-User clicks the "Submit" button.
    //24-Verify that the new request form was successfully created.
    Driver.getDriver().quit();
    }
    @Test
    public void test3(){
        UserDashboard userDashboard=new UserDashboard();
        SupportRequests supportRequests=new SupportRequests();
        SoftAssert softAssert=new SoftAssert();

        //1-User go to the "https://qa.easybusticket.com"
        //2-User clicks on "Sign In"button.
        //3-User clicks on username box.
        //4-User enters a valid username.
        //5-User clicks on password box.
        //6-User enters a valid password.
        //7-User clicks the "Login" button.
        ReusableMethods.userLogin("azimUsername","azimPassword");

        //8-Click on the  Request link from the Support Request menu.
        userDashboard.supportRequestButton.click();
        supportRequests.requestLink.click();
        supportRequests.actionButton.click();

        //9-Verify that the registration information of the created request can be viewed"
        String expectedTicketUrl="https://qa.easybusticket.com/ticket";
        String actualTicketUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualTicketUrl,expectedTicketUrl,"Ticket page is not visible");
        Driver.getDriver().quit();

    }

}
