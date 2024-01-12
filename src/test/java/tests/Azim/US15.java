package tests.Azim;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.UserSignIn;
import pages.user.registeredUser.UserDashboard;
import pages.visitor.VisitorHomePage;
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
    SoftAssert softAssert=new SoftAssert();
    ReusableMethods.userLogin("azimUsername","azimPassword");



    //9-In the drop-down list that opens, click on the "Create New" button.
    userDashboard.supportRequestButton.click();
    userDashboard.CreateNewButton.click();


    //10User clicks on the name box.
    //11-User on the name box  enter a valid name
    //12-User clicks on the Email address box.
    //13-User on the Email address box  enter a valid Email address
    //14-User clicks on the Subject box
    //15-User on the Subject box  enter a valid support
    //16-User click on priority dropdown.
    //17-User on priority dropdown and choose one
    //18-User clicks on message button.
    //19-User on message  enter her/his message
    //20-User clicks on "Select File" button.
    //21-"Select File"selects a valid file from her/his folder according to allowed file extensions"
    //22-Verify that folder is selected
    //23-User clicks on plus button(+)
    //24-User clicks the "Submit" button.
    //25-Verify that the new request form was successfully created.












    }


}
