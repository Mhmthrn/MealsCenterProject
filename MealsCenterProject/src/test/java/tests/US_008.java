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

public class
US_008 extends TestBaseRapor {

    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();


    @Test
    public void termsAndConditionsVisibleTest() {

        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();

        extentTest = extentReports.createTest("Verify terms and conditions page ", "As a user, view the terms and conditions page.");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        ReusableMethods.wait(1);
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        extentTest.info("went to Home Page");

        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(1);
        clickWithJS(homePage.termsAndConditionsButton);
        extentTest.info("clicked terms and conditions button");

        String expectedInfo = "terms-and-conditions";
        String actualInfo = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualInfo.contains(expectedInfo));
        ReusableMethods.wait(1);
        extentTest.pass("terms and conditions page visible");

    }
    @Test(groups = "demo")

    public void paymentAndReturnConditionsInformationTest(){

        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();

        extentTest = extentReports.createTest("Verify terms and conditions page ", "As a user, view the payment and return information.");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        extentTest.info("went to Home Page");

        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(2);
        clickWithJS(homePage.termsAndConditionsButton);
        extentTest.info("clicked terms and conditions button");

        String expectedResult1 = "Orders and Payment";
        String actualResult = homePage.termsAndConditionsText.getText();
        Assert.assertTrue(actualResult.contains(expectedResult1));
        extentTest.info("Orders and Payment information is visible");

        String expectedResult2 = "Return Conditions";
        Assert.assertTrue(actualResult.contains(expectedResult2));
        ReusableMethods.wait(1);
        extentTest.pass("Return Conditions information is visible");

    }
}

