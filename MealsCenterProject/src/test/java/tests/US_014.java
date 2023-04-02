package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A_homePage.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_014 extends TestBaseRapor {

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());

    /*
    - Open browser go to url ""HomePageLoginUrl""
    - User clicks sign in button
    - User types in "Email" and "password"
    - User clicks sign in button
    - User verifies that website is accessible
    - Click on ""Log out"" section
    - User closes the page

     */
    @Test(groups = "smoke")
    public void dashboardPageVisible() {

        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Verify Dashboardpage ", "As a user, view the Dashboardpage. ");
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);

        homePage.signInButton.click();
        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("went to Home Page");

        Assert.assertTrue(homePage.loginVerifiyItemHome.isDisplayed());

        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();

        extentTest.pass("Homepage is visible");



    }



        /*
    - Open browser go to url "HomePageLoginUrl"
    - User clicks sign in button
    - User types in "Email" and "password"
    - User clicks sign in button
    - User verifies that their profile name is visible
    - Click on "Log out" section
    - User closes the page
     */


    @Test(groups = "smoke")
    public void profilNameVisible(){

        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Verify Dashboardpage ", "As a user, view the entered profile name. ");
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);

        homePage.signInButton.click();
        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("went to Home Page");
        ReusableMethods.wait(2);

        Assert.assertTrue(homePage.profilNameItem.isDisplayed());

        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();

        extentTest.pass("Entered profile name item is displayed");




    }

    /*
    "- Open browser go to url "HomePageLoginUrl"
    - User clicks sign in button
    - User types in "Email" and "password"
    - User clicks sign in button
    - User clicks the entered profile name
    - User clicks manage my accounts
    - User can change  the last name under basic details.
    - User clicks submit
    - Click on "Log out" section
    - User closes the page"

         */

    @Test(groups = "smoke")
    public void userChangeInfo(){

        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Verify enter the info ", "As a user, view the Dashboardpage. ");
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);

        homePage.signInButton.click();
        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("User went to Homepage");
        ReusableMethods.wait(1);
        homePage.profilNameItem.click();
        homePage.manageMyAccount.click();
        extentTest.info("User cliked the Manage My Acccount ");
        homePage.basicDetailsLastName.sendKeys("yilmaz");
        homePage.basicDetailsSubmitButton.click();
        extentTest.info("The user send a new information into the lastname section");


        ReusableMethods.wait(1);

        Assert.assertTrue(homePage.profilUpdateMesaj.isDisplayed());

        ReusableMethods.wait(1);


        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();

        extentTest.pass("The new lastname has be entered");
    }


    /*
      "- Open browser go to url "HomePageLoginUrl"
    - User clicks sign in button
    - User types in "Email" and "password"
    - User clicks sign in button
    - User clicks the entered profile name
    - User clicks manage my accounts
    - User verifies that the entered info has been successfully changed
    - Click on "Log out" section
    - User closes the page"
         */

    @Test(groups = "smoke")
    public void verifyChangedInfo(){


        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());


        extentTest = extentReports.createTest("Verify enter the info ", "As a user, view the Dashboardpage. ");
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);

        homePage.signInButton.click();
        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("User went to Homepage");
        ReusableMethods.wait(1);
        homePage.profilNameItem.click();
        homePage.manageMyAccount.click();
        extentTest.info("User cliked the Manage My Acccount ");
        homePage.basicDetailsLastName.sendKeys("yilmaz");
        homePage.basicDetailsSubmitButton.click();
        extentTest.info("The user send a new information into the lastname section");


        ReusableMethods.wait(1);

        Assert.assertTrue(homePage.profilUpdateMesaj.isDisplayed());

        ReusableMethods.wait(1);


        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();

        extentTest.pass("The lastname has be changed");
    }

}
