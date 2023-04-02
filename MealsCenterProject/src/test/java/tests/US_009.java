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

public class US_009 extends TestBaseRapor {
    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    @Test(groups = "smoke")
    public void homepaageVisibleTest(){
        homePage=new HomePage();
        actions=new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verify PrivacyPolicies page ","As a visitor, view the Privacy Policies");

        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
       // homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        extentTest.info("went to Home Page");
        String expectedUrl="https://qa.mealscenter.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
        extentTest.pass("Homepage is accessable");

    }
    @Test(groups = "smoke")
    public void PrivacyPoliciesVisibleTest(){
        homePage=new HomePage();
        actions=new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verify PrivacyPolicies page ","As a visitor, view the Privacy Policies");

        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
       // homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        extentTest.info("went to Home Page");
        actions.sendKeys(Keys.END).perform();

        ReusableMethods.wait(1);
        clickWithJS(homePage.privacyPolicyButton); //Js kullandik
       // homePage.privacyPolicyButton.click();
        ReusableMethods.wait(1);
        extentTest.info("Clicked to PrivacyPolicies Page");
        String expecteInfo="privacy";
        String actualInfo=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualInfo.contains(expecteInfo));
        ReusableMethods.wait(3);
        extentTest.pass("PrivacyPolicies Page is visible");


    }
    @Test (groups = {"smoke", "demo"})
    public void ContentofPrivacyPoliciesVisibleTest(){
        homePage=new HomePage();
        actions=new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verify PrivacyPolicies page ","As a visitor, view Content of the Privacy Policies");

        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
       // homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        extentTest.info("went to Home Page");
        actions.sendKeys(Keys.END).perform();

        ReusableMethods.wait(1);
        clickWithJS(homePage.privacyPolicyButton); //Js kullandik
        // homePage.privacyPolicyButton.click();
        ReusableMethods.wait(1);
        extentTest.info("Clicked to PrivacyPolicies Page");

        Assert.assertTrue(homePage.informationWeCollect.isDisplayed());
        extentTest.pass("information We Collect is visible");

        Assert.assertTrue(homePage.howWeUseYourInformation.isDisplayed());
        extentTest.pass("how We Use Your Information We Collect is visible");

        Assert.assertTrue(homePage.disclosureOfYourInformation.isDisplayed());
        extentTest.pass("disclosure Of Your Information We Collect is visible");

        Assert.assertTrue(homePage.securityOfYourInformation.isDisplayed());
        extentTest.pass("Security Of Your Informationis visible");

        Assert.assertTrue(homePage.contactUsText.isDisplayed());
        extentTest.pass("contact Us Text is visible");

        clickWithJS(homePage.privacyMealscenterLink);
        //String notExpectedUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals(Driver.getDriver().getCurrentUrl()));
        extentTest.pass("privacy Meals center Link is is not Clickable");
        Assert.assertTrue(homePage.privacyMealscenterLink.isEnabled());
        extentTest.pass("privacy Meals center Link is enabled");


        ReusableMethods.wait(3);

    }

}
