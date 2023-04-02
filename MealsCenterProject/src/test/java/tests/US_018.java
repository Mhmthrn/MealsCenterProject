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

import static utilities.ReusableMethods.clickWithJS;

public class US_018 extends TestBaseRapor {


    Actions actions=new Actions(Driver.getDriver());
    HomePage homePage=new HomePage();

    @Test
    public void pozitifLoginTest(){

        extentTest=extentReports.createTest("Verify Home Order page ","As a user, view the orders of my account.");
        ReusableMethods.homePozitifLoginTest();

    }

    @Test(groups = "demo")
    public void storeSavedTest() {

        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();

        extentTest = extentReports.createTest("store Saved Test", "As a user, favorite store added to favorites.");

        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("went to Home Page");

        ReusableMethods.wait(1);

        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("login to main page");
        ReusableMethods.wait(1);
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.loginSearchBoxHome.sendKeys("Texas");
        ReusableMethods.wait(1);
        clickWithJS(homePage.addressChoseItem);
        homePage.addressChoseItem.click();
        ReusableMethods.wait(1);
        extentTest.info("address information was entered in the search box and selected");

        clickWithJS(homePage.starbucksForSaved);
        ReusableMethods.wait(1);
        try {
            if(homePage.noSaveStoreIcon.isDisplayed()){
                homePage.noSaveStoreIcon.click();
                extentTest.pass("favorite store added to favorites");
            }
        } catch (Exception e) {

        }
        Assert.assertTrue(homePage.saveStoreIcon.isDisplayed());
        ReusableMethods.wait(1);
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("Starbucks in Saved stores is visible");

    }
    @Test(groups = "demo")
        public void visibleSavedStoreTest(){

        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();

        extentTest = extentReports.createTest("Visible Saved Store Test", "As a user,visible saved stores");
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("went to Home Page");
        ReusableMethods.wait(1);

        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("login to main page");

        ReusableMethods.wait(1);
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.manageMyAccount.click();
        ReusableMethods.wait(1);
        homePage.savedStoresSectionNew.click();
        ReusableMethods.wait(1);
        String expectedResult = "Starbucks";
        String actualResult = homePage.savedStoreAllPage.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        ReusableMethods.wait(1);
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("Starbucks in Saved stores is visible");
    }

}
