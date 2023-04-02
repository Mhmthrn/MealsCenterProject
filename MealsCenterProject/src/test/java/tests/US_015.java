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

public class US_015 extends TestBaseRapor {

    Actions actions=new Actions(Driver.getDriver());
    HomePage homePage=new HomePage();


    @Test
    public void pozitifLoginTest(){

        extentTest=extentReports.createTest("Verify Home Order page ","As a user, view the orders of my account.");
        ReusableMethods.homePozitifLoginTest();

    }


    @Test
    public void starbucksMenuVisibleTest(){

        extentTest=extentReports.createTest("Verify Home Order page ","As a user, view the orders of my account.");
        ReusableMethods.starbucksMenuVisibleTestHome();

    }

    @Test
    public void orderPageOrderVerify(){
        actions=new Actions(Driver.getDriver());
        homePage=new HomePage();
        extentTest=extentReports.createTest("Verify Home Order page ","As a user, view the orders of my account.");

        HomePage homePage=new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("went to Home Page");


        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("login to main page");

        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.loginSearchBoxHome.sendKeys("Texas");
        ReusableMethods.wait(1);
        clickWithJS(homePage.addressChoseItem);
        homePage.addressChoseItem.click();
        ReusableMethods.wait(1);
        extentTest.info("address information was entered in the search box and selected");

        actions.moveToElement(homePage.starbucksLocete);
        homePage.starbucksLocete.click();
        clickWithJS(homePage.kahveAddToCartTestItem1Home);
        ReusableMethods.wait(1);
        clickWithJS(homePage.kahveAddToCartTestItem2Home);
        ReusableMethods.wait(1);
        homePage.checkOutButtonHome.click();
        extentTest.info("After choosing coffee from Starbucks, the addition process was completed and the checkout was done.");


        homePage.placeOrder.click();
        ReusableMethods.wait(25);
        homePage.profilNameItem.click();
        homePage.myOrdersSection.click();
        ReusableMethods.waitForPageToLoad(1);
        extentTest.info("Payments have been made, or my orders have been sent to the screen.");



        String expectedResult="Kahve";
        ReusableMethods.wait(1);
        String actualResult= homePage.orderPageTestItem.getText();
        ReusableMethods.wait(1);
        Assert.assertTrue(actualResult.contains(expectedResult));
        ReusableMethods.wait(1);
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("the order placed appears on the \"my orders\" screen.");



    }

}
