package tests.Murat;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.user.UserSignIn;
import pages.user.registeredUser.Profile;
import pages.user.registeredUser.UserDashboard;
import pages.visitor.VisitorBlog;
import pages.visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US17 {

    VisitorHomePage visitorHomePage = new VisitorHomePage();
    SoftAssert softAssert = new SoftAssert();
    UserSignIn userSignIn = new UserSignIn();
    UserDashboard userDashboard = new UserDashboard();
    Profile profile = new Profile();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void testCase01(){

        //1 - User goes to "https://qa.easybusticket.com".
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(1);
        visitorHomePage.cookiesAllow.click();

        //2 - User clicks on sign in button.
        visitorHomePage.singInButton.click();

        //3 - User reaches "https://qa.easybusticket.com/login" page.
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/login"));
        ReusableMethods.wait(1);

        //4 - User clicks on "Username" box.
        userSignIn.usernameBox.click();

        //5 - User enters a valid username.
        userSignIn.usernameBox.sendKeys(ConfigReader.getProperty("muratUsername"));

        //6 - User clicks on "Password" box.
        userSignIn.passwordBox.click();

        //7 - User enters a valid password.
        userSignIn.passwordBox.sendKeys(ConfigReader.getProperty("muratPassword"));

        //8 - User clicks the "Login" button.
        userSignIn.loginButton.click();

        //9 - User reaches "https://qa.easybusticket.com/user/dashboard".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/user/dashboard"));

        //10 - User hovers their mouse over the profile link.
        actions.moveToElement(userDashboard.linkProfile).perform();

        //11 - User clicks on Profile link in Profile dropdown menu.
        userDashboard.profileLinkDropdown.click();

        //12 - User reaches "https://qa.easybusticket.com/user/profile-setting".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/user/profile-setting"));

        //13 - User sees profile information.
        softAssert.assertTrue(profile.labelProfileSettings.isDisplayed());

        Driver.quitDriver();
    }

    @Test
    public void testCase02(){

        //1 - User goes to "https://qa.easybusticket.com".
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(1);
        visitorHomePage.cookiesAllow.click();

        //2 - User clicks on sign in button.
        visitorHomePage.singInButton.click();

        //3 - User reaches "https://qa.easybusticket.com/login" page.
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/login"));
        ReusableMethods.wait(1);

        //4 - User clicks on "Username" box.
        userSignIn.usernameBox.click();

        //5 - User enters a valid username.
        userSignIn.usernameBox.sendKeys(ConfigReader.getProperty("muratUsername"));

        //6 - User clicks on "Password" box.
        userSignIn.passwordBox.click();

        //7 - User enters a valid password.
        userSignIn.passwordBox.sendKeys(ConfigReader.getProperty("muratPassword"));

        //8 - User clicks the "Login" button.
        userSignIn.loginButton.click();

        //9 - User reaches "https://qa.easybusticket.com/user/dashboard".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/user/dashboard"));

        //10 - User hovers their mouse over the profile link.
        actions.moveToElement(userDashboard.linkProfile).perform();

        //11 - User clicks on Profile link in Profile dropdown menu.
        userDashboard.profileLinkDropdown.click();

        //12 - User reaches "https://qa.easybusticket.com/user/profile-setting".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/user/profile-setting"));

        //13 - User sees profile information.
        softAssert.assertTrue(profile.labelProfileSettings.isDisplayed());

        //14 - User clicks on the "First Name" text and text box opens.
        profile.labelFirstName.click();

        //15 - User edits the text box containing the name.
        profile.InputFirstname.clear();
        profile.InputFirstname.sendKeys(ConfigReader.getProperty("muratFirstname"));

        //16 - User clicks on the "Last Name" text and text box opens.
        profile.labelLastname.click();

        //17 - User edits the text box containing the Last name.
        profile.lastname.clear();
        profile.lastname.sendKeys(ConfigReader.getProperty("muratLastname"));


        //18 - User clicks on the "Address" text and text box opens.
        profile.labelAddress.click();

        //19 - User edits the text box containing the address.
        profile.adress.clear();
        profile.adress.sendKeys(ConfigReader.getProperty("muratAddress"));

        //20 - User clicks on the "State" text and text box opens.
        profile.labelState.click();

        //21 - User edits the text box containing the state.
        profile.state.clear();
        profile.state.sendKeys(ConfigReader.getProperty("muratState"));

        //22 - The user clicks on the "Zip Code" text at the top and the text box opens.
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        profile.labelZipCode1.click();

        //23 - User edits the text box containing the zip code.
        profile.zipCode1.clear();
        profile.zipCode1.sendKeys(ConfigReader.getProperty("muratZipcode1"));

        //24 - User clicks on the "City" text and text box opens.
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        profile.labelCity.click();

        //25 - User edits the text box containing the city.
        profile.city.clear();
        profile.city.sendKeys(ConfigReader.getProperty("muratCity"));

        //26 - The user clicks on the "Zip Code" text at the bottom and the text box opens.
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        profile.labelZipCode2.click();

        //27 - User edits the text box containing the zip code.
        profile.zipCode2.clear();
        profile.zipCode2.sendKeys(ConfigReader.getProperty("muratZipcode2"));

        //28 - User clicks "Update Profile" button.
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        profile.UpdateProfile.click();

        //29 - User sees green "Profile updated successfully" alert text.
        softAssert.assertTrue(profile.profileUpdatedMessage.isDisplayed());

        Driver.quitDriver();
    }

    @Test
    public void testCase03(){

        //1 - User goes to "https://qa.easybusticket.com".
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.wait(1);
        visitorHomePage.cookiesAllow.click();

        //2 - User clicks on sign in button.
        visitorHomePage.singInButton.click();

        //3 - User reaches "https://qa.easybusticket.com/login" page.
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/login"));
        ReusableMethods.wait(1);

        //4 - User clicks on "Username" box.
        userSignIn.usernameBox.click();

        //5 - User enters a valid username.
        userSignIn.usernameBox.sendKeys(ConfigReader.getProperty("muratUsername"));

        //6 - User clicks on "Password" box.
        userSignIn.passwordBox.click();

        //7 - User enters a valid password.
        userSignIn.passwordBox.sendKeys(ConfigReader.getProperty("muratPassword"));

        //8 - User clicks the "Login" button.
        userSignIn.loginButton.click();

        //9 - User reaches "https://qa.easybusticket.com/user/dashboard".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/user/dashboard"));

        //10 - User hovers their mouse over the profile link.
        actions.moveToElement(userDashboard.linkProfile).perform();

        //11 - User clicks on Profile link in Profile dropdown menu.
        userDashboard.profileLinkDropdown.click();

        //12 - User reaches "https://qa.easybusticket.com/user/profile-setting".
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.easybusticket.com/user/profile-setting"));

        //13 - User sees profile information.
        softAssert.assertTrue(profile.labelProfileSettings.isDisplayed());

        //14 - User clicks on the text box containing his/her name.
        profile.InputFirstname.click();

        //15 - User edits the text box containing the name.
        profile.InputFirstname.clear();
        profile.InputFirstname.sendKeys(ConfigReader.getProperty("muratFirstname"));

        //16 - User clicks on the text box containing his/her Last name.
        profile.lastname.click();

        //17 - User edits the text box containing the Last name.
        profile.lastname.clear();
        profile.lastname.sendKeys(ConfigReader.getProperty("muratLastname"));

        //18 - User clicks on the text box containing the adress.
        profile.adress.click();

        //19 - User edits the text box containing the adress.
        profile.adress.clear();
        profile.adress.sendKeys(ConfigReader.getProperty("muratAdress"));

        //20 - User clicks on the text box containing the state.
        profile.state.click();

        //21 - User edits the text box containing the state.
        profile.state.clear();
        profile.state.sendKeys(ConfigReader.getProperty("muratState"));

        //22 - User clicks on the text box with the "Zip Code" at the top.
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        profile.zipCode1.click();

        //23 - User edits the text box containing the zip code.
        profile.zipCode1.clear();
        profile.zipCode1.sendKeys(ConfigReader.getProperty("muratZipcode1"));

        //24 - User clicks on the text box containing the city.
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        profile.city.click();

        //25 - User edits the text box containing the city.
        profile.city.clear();
        profile.city.sendKeys(ConfigReader.getProperty("muratCity"));

        //26 - User clicks on the text box with the "Zip Code" at the bottom.
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        profile.zipCode2.click();

        //27 - User edits the text box containing the zip code.
        profile.zipCode2.clear();
        profile.zipCode2.sendKeys(ConfigReader.getProperty("muratZipcode2"));

        //28 - User clicks "Update Profile" button.
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        profile.UpdateProfile.click();

        //29 - User sees green "Profile updated successfully" alert text.
        ReusableMethods.wait(1);
        softAssert.assertTrue(profile.profileUpdatedMessage.isDisplayed());

        Driver.quitDriver();
    }
}