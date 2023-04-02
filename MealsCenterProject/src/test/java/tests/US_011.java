package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.A_homePage.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;

public class US_011 extends TestBaseRapor {

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());


    @BeforeClass
    public void websiteAccessible() {
        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("Verify Home Order page ", "As a user, view the orders of my account.");

        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("went to Home Page");
        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("login to main page");
        ReusableMethods.wait(1);

    }

    @Test(groups = "smoke")
    public void US11_() {
        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());
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
        ReusableMethods.wait(1);
        homePage.hotCoffesLink.click();

        String expectedResult = "Hot Coffees";
        String actualResult = homePage.hotCoffesLink.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        ReusableMethods.wait(1);

        homePage.kahveAddToCartTestItem1Home.click();
        homePage.kahveAddToCartTestItem2Home.click();
        homePage.checkOutButtonHome.click();
        homePage.placeOrder.click();
        ReusableMethods.wait(2);


        String expectedResult2 = "Confirming your order";
        String actualResult2 = homePage.placeOrder.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();


        Driver.closeDriver();
    }

}

