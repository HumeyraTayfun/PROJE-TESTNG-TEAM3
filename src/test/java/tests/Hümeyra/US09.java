package tests.Hümeyra;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.UserSignUp;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US09 {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void TestCase01(){
        //  1. User goes to the "https://qa.easybusticket.com
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        // 2. User clicks on "Sign up" button
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        visitorHomePage.HeaderSignUp.click();

        UserSignUp userSignUp=new UserSignUp();
        // 3.User displays " Sign up your account"
        softAssert.assertTrue(userSignUp.labelSignUpYourAccount.isDisplayed());
        // 4. User clicks on firstname box and enters a valid firstname
        userSignUp.firstNameBox.click();
        userSignUp.firstNameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpFirstName"));
        //  5. User clicks on Lastname box and enter a valid last name
        userSignUp.lastNameBox.click();
        userSignUp.lastNameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpLastName"));
        //  6. User clicks on country box and choose a country
        Select selectcountry=new Select(userSignUp.countryBox);
        selectcountry.selectByValue(ConfigReader.getProperty("humeyraSignUpCountry"));
        ReusableMethods.bekle(1);
        //  7. User clicks on mobile box and enter a valid mobile number
        userSignUp.mobileBox.click();
        userSignUp.mobileBox.sendKeys(ConfigReader.getProperty("humeyraSignUpMobile"));
        // 8. User clicks on user name box and enter a valid user name
        userSignUp.usernameBox.click();
        userSignUp.usernameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpUserName"));
        // 9.User clicks on e mail box and enter a valid email address
        userSignUp.emailBox.click();
        userSignUp.emailBox.sendKeys(ConfigReader.getProperty("humeyraSignUpEmail"));
        // 10. User clicks on password box and enter invalid password
        userSignUp.passwordBox.click();
        userSignUp.passwordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpInvalidPassword1"));
        // 11.User clicks on confirm password box and enter password
        userSignUp.confirmPasswordBox.click();
        userSignUp.confirmPasswordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpConfirmInvalidPassword1"));
        // 12. User clicks on Accepting all checkbox
        userSignUp.acceptingAllCheckbox.click();
        // 13.User clicks on sign up button
        userSignUp.signUpButton.click();
        // 11.Verify that user can't register
        String expectedText="The password must contain at least one uppercase and one lowercase letter.";
        String actualText=userSignUp.alertInvalidPassword1.getText();
        softAssert.assertEquals(actualText,expectedText);
        // 12. User clicks on password box and enter invalid password
        userSignUp.passwordBox.click();
        userSignUp.passwordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpInvalidPassword2"));
        // 13.User clicks on confirm password box and enter password
        userSignUp.confirmPasswordBox.click();
        userSignUp.confirmPasswordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpConfirmInvalidPassword2"));
        //  14.User clicks on Accepting all checkbox
        userSignUp.acceptingAllCheckbox.click();
        //  15.User clicks on sign up button
        userSignUp.signUpButton.click();
        // 16.Verify that user can't register
        String expectedAlert="The password must be at least 6 characters.";
        String actualAlert=userSignUp.alertInvalidPassword2.getText();
        softAssert.assertEquals(actualAlert,expectedAlert);
        // 17. User clicks on password box and enter invalid password
        userSignUp.passwordBox.click();
        userSignUp.passwordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpInvalidPassword3"));

        // 18.User clicks on confirm password box and enter password
        userSignUp.confirmPasswordBox.click();
        userSignUp.confirmPasswordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpConfirmInvalidPassword3"));
        // 19.User clicks on Accepting all checkbox
        userSignUp.acceptingAllCheckbox.click();
        // 20.User clicks on sign up button
        userSignUp.signUpButton.click();
        //  21.Verify that user can't register
        String expectedAlert3="The password must contain at least one number.";
        String actualAlert3=userSignUp.alertInvalidPassword3.getText();
        softAssert.assertEquals(actualAlert3,expectedAlert3);
        // 22. User clicks on password box and enter invalid password
        userSignUp.passwordBox.click();
        userSignUp.passwordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpInvalidPassword4"));
        // 23.User clicks on confirm password box and enter password
        userSignUp.confirmPasswordBox.click();
        userSignUp.confirmPasswordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpConfirmInvalidPassword4"));
        // 24.User clicks on Accepting all checkbox
        userSignUp.acceptingAllCheckbox.click();
        //  25.User clicks on sign up button
        userSignUp.signUpButton.click();
        // 26.Verify that user can't register
        String expectedAlert4="The password must contain at least one symbol.";
        String actualAlert4=userSignUp.alertInvalidPassword4.getText();
        softAssert.assertEquals(actualAlert4,expectedAlert4);
        // softAssert.assertAll();
        Driver.closeDriver();

    }

    @Test
    public void testCase02(){
        //1. User goes to the "https://qa.easybusticket.com
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        // 2. User clicks on "Sign up" button
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        visitorHomePage.HeaderSignUp.click();

        UserSignUp userSignUp=new UserSignUp();
        // 3.User displays " Sign up your account"
        softAssert.assertTrue(userSignUp.labelSignUpYourAccount.isDisplayed());

        // 4.User leaves the firstname box blank
        //  5. User clicks on Lastname box and enter a valid last name
        userSignUp.lastNameBox.click();
        userSignUp.lastNameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpLastName"));
        //  6. User clicks on country box and choose a country
        Select selectcountry=new Select(userSignUp.countryBox);
        selectcountry.selectByValue(ConfigReader.getProperty("humeyraSignUpCountry"));
        ReusableMethods.bekle(1);
        //  7. User clicks on mobile box and enter a valid mobile number
        userSignUp.mobileBox.click();
        userSignUp.mobileBox.sendKeys(ConfigReader.getProperty("humeyraSignUpMobile"));
        // 8. User clicks on user name box and enter a valid user name
        userSignUp.usernameBox.click();
        userSignUp.usernameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpUserName"));
        // 9.User clicks on e mail box and enter a valid email address
        userSignUp.emailBox.click();
        userSignUp.emailBox.sendKeys(ConfigReader.getProperty("humeyraSignUpEmail"));

        //10. User clicks on password box and enter a valid password
        userSignUp.passwordBox.click();
        userSignUp.passwordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpValidPassword"));
        // 11.User clicks on confirm password and enter a valid confirm password
        userSignUp.confirmPasswordBox.click();
        userSignUp.confirmPasswordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpValidPassword"));

        // 12.User clicks on Accepting all button and clicks sign up button
        userSignUp.acceptingAllCheckbox.click();

        userSignUp.signUpButton.click();
        // 13.Verify that user can't register
        Driver.quitDriver();
    }

    @Test
    public void testCase03(){
        //1. User goes to the "https://qa.easybusticket.com
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        // 2. User clicks on "Sign up" button
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        visitorHomePage.HeaderSignUp.click();

        UserSignUp userSignUp=new UserSignUp();
        // 3.User displays " Sign up your account"
        softAssert.assertTrue(userSignUp.labelSignUpYourAccount.isDisplayed());

        // 4.User clicks on the firstname box blank and enter a valid firstname
        userSignUp.firstNameBox.click();
        userSignUp.firstNameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpFirstName"));

        // 5.User leaves the lastname box blank
        //  6. User clicks on country box and choose a country
        Select selectcountry=new Select(userSignUp.countryBox);
        selectcountry.selectByValue(ConfigReader.getProperty("humeyraSignUpCountry"));
        ReusableMethods.bekle(1);
        //  7. User clicks on mobile box and enter a valid mobile number
        userSignUp.mobileBox.click();
        userSignUp.mobileBox.sendKeys(ConfigReader.getProperty("humeyraSignUpMobile"));
        // 8. User clicks on user name box and enter a valid user name
        userSignUp.usernameBox.click();
        userSignUp.usernameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpUserName"));
        // 9.User clicks on e mail box and enter a valid email address
        userSignUp.emailBox.click();
        userSignUp.emailBox.sendKeys(ConfigReader.getProperty("humeyraSignUpEmail"));
        //10. User clicks on password box and enter a valid password
        userSignUp.passwordBox.click();
        userSignUp.passwordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpValidPassword"));
        // 11.User clicks on confirm password and enter a valid confirm password
        userSignUp.confirmPasswordBox.click();
        userSignUp.confirmPasswordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpValidPassword"));

        // 12.User clicks on Accepting all button and clicks sign up button
        userSignUp.acceptingAllCheckbox.click();

        userSignUp.signUpButton.click();
        // 13.Verify that user can't register
        Driver.quitDriver();

    }

    @Test
    public void testCase04(){
        //1. User goes to the "https://qa.easybusticket.com
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        // 2. User clicks on "Sign up" button
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        visitorHomePage.HeaderSignUp.click();

        UserSignUp userSignUp=new UserSignUp();
        // 3.User displays " Sign up your account"
        softAssert.assertTrue(userSignUp.labelSignUpYourAccount.isDisplayed());

        // 4.User clicks on the firstname box blank and enter a valid firstname
        userSignUp.firstNameBox.click();
        userSignUp.firstNameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpFirstName"));

        // 5. User clicks on Lastname box and enter a valid last name
        userSignUp.lastNameBox.click();
        userSignUp.lastNameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpLastName"));
        //  6. User clicks on country box and choose a country
        Select selectcountry=new Select(userSignUp.countryBox);
        selectcountry.selectByValue(ConfigReader.getProperty("humeyraSignUpCountry"));
        ReusableMethods.bekle(1);
        //  7. 7.User leaves mobile box blank
        // 8. User clicks on user name box and enter a valid user name
        userSignUp.usernameBox.click();
        userSignUp.usernameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpUserName"));
        // 9.User clicks on e mail box and enter a valid email address
        userSignUp.emailBox.click();
        userSignUp.emailBox.sendKeys(ConfigReader.getProperty("humeyraSignUpEmail"));
        //10. User clicks on password box and enter a valid password
        userSignUp.passwordBox.click();
        userSignUp.passwordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpValidPassword"));
        // 11.User clicks on confirm password and enter a valid confirm password
        userSignUp.confirmPasswordBox.click();
        userSignUp.confirmPasswordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpValidPassword"));

        // 12.User clicks on Accepting all button and clicks sign up button
        userSignUp.acceptingAllCheckbox.click();

        userSignUp.signUpButton.click();
        // 13.Verify that user can't register
        Driver.quitDriver();

    }

    @Test
    public void testCase05(){
        //1. User goes to the "https://qa.easybusticket.com
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        // 2. User clicks on "Sign up" button
        VisitorHomePage visitorHomePage=new VisitorHomePage();
        visitorHomePage.HeaderSignUp.click();

        UserSignUp userSignUp=new UserSignUp();
        // 3.User displays " Sign up your account"
        softAssert.assertTrue(userSignUp.labelSignUpYourAccount.isDisplayed());

        // 4.User clicks on the firstname box blank and enter a valid firstname
        userSignUp.firstNameBox.click();
        userSignUp.firstNameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpFirstName"));

        // 5. User clicks on Lastname box and enter a valid last name
        userSignUp.lastNameBox.click();
        userSignUp.lastNameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpLastName"));
        //  6. User clicks on country box and choose a country
        Select selectcountry=new Select(userSignUp.countryBox);
        selectcountry.selectByValue(ConfigReader.getProperty("humeyraSignUpCountry"));
        ReusableMethods.bekle(1);
        //  7. User clicks on mobile box and enter a valid mobile number
        userSignUp.mobileBox.click();
        userSignUp.mobileBox.sendKeys(ConfigReader.getProperty("humeyraSignUpMobile"));
        // 8. User clicks on user name box and enter a valid user name
        userSignUp.usernameBox.click();
        userSignUp.usernameBox.sendKeys(ConfigReader.getProperty("humeyraSignUpUserName"));
        // 9.User clicks on e mail box and enter a valid email address
        userSignUp.emailBox.click();
        userSignUp.emailBox.sendKeys(ConfigReader.getProperty("humeyraSignUpEmail"));
        //10. User clicks on password box and enter a valid password
        userSignUp.passwordBox.click();
        userSignUp.passwordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpValidPassword"));
        // 11.User clicks on confirm password and enter a valid confirm password
        userSignUp.confirmPasswordBox.click();
        userSignUp.confirmPasswordBox.sendKeys(ConfigReader.getProperty("humeyraSignUpValidPassword"));

        // 12.User clicks on Accepting all button and clicks sign up button
        userSignUp.acceptingAllCheckbox.click();

        userSignUp.signUpButton.click();
        // 13. Verify that user is in the dashboard
        Driver.quitDriver();


    }
}