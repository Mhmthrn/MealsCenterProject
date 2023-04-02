package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A_homePage.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class US_006 extends TestBaseRapor {

    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void SignInLinkActive(){

        HomePage homePage=new HomePage();

        extentTest=extentReports.createTest("Verify that login page is visible ","As a user, view the orders of my account.");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        extentTest.info("went to Homepage");

        homePage.headerSingInButtonHome.click();
        extentTest.info("click Sign in");

        String expectedInfo="login";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedInfo));
        extentTest.pass("login page is visible");

        Driver.closeDriver();

    }
    @Test
    public void SignUpLinkActive(){

        HomePage homePage=new HomePage();
        extentTest=extentReports.createTest("Verify that Register page is visible ","As a user, view the orders of my account.");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        homePage.cookiesAcceptHome.click();
        extentTest.info("went to Homepage");

        homePage.headerSingInButtonHome.click();
        extentTest.info("click Sign in");

        homePage.signUpButton.click();
        extentTest.info("click sign up");

        String expectedInfo="signup";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedInfo));
        extentTest.pass("register page is visible");

        Driver.closeDriver();
    }
    @Test (groups = "smoke")
    public void PositiveSignUp(){

        HomePage homePage=new HomePage();
        extentTest=extentReports.createTest("Verify that Register was succesfully done ","As a user, view the orders of my account.");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        homePage.cookiesAcceptHome.click();
        extentTest.info("went to Homepage");

        homePage.headerSingInButtonHome.click();
        extentTest.info("click Sign in");

        homePage.signUpButton.click();
        extentTest.info("click sign up");

        Faker faker=new Faker();

        homePage.firstNameTextBox1.sendKeys(faker.name().firstName());
        homePage.lastNameTextBox1.sendKeys(faker.name().lastName());
        homePage.emailAddressTextBox11.sendKeys(faker.internet().emailAddress());
        homePage.dropdownButton.click();
        homePage.selectFlag.click();
        homePage.telefonnummerTextBox.sendKeys(faker.phoneNumber().cellPhone());

        homePage.passwordTextBox21.sendKeys("Izmir35.");
        homePage.confirmPasswordTextBox1.sendKeys("Izmir35.");
        homePage.signUpButton2.click();

        ReusableMethods.wait(2);



        Assert.assertTrue(homePage.registerDone.isDisplayed());
        extentTest.pass("register was succesfully done");

        Driver.closeDriver();
    }


}
