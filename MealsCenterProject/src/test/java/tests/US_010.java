package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A_homePage.HomePage;
import pages.B_merchantPage.LoginMerchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;

public class US_010 extends TestBaseRapor {


    LoginMerchantPage loginMerchantPage=new LoginMerchantPage();
    HomePage homePage= new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker =new Faker();

   
   @Test

    public void joinElementVerify(){

        extentTest=extentReports.createTest("Verify join element ","As a visitor, can join us button enable.");


        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        homePage.cookiesAcceptHome.click();
        extentTest.info("went to visitor Page");

        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(1);
        clickWithJS(loginMerchantPage.footerBecomeaPartnerMerchant);
        extentTest.info("clik to join button");

        String expectedUrl="https://qa.mealscenter.com/merchant/signup";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        extentTest.pass("the order placed appears on the \"my orders\" screen.");

    }

    @Test(groups = "smoke")
    public void positivRegisterTest(){

        extentTest=extentReports.createTest("Verify register ","As a visitor, can  register.");


        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        homePage.cookiesAcceptHome.click();
        extentTest.info("went to visitor Page");


        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(1);
        clickWithJS(loginMerchantPage.footerBecomeaPartnerMerchant);
        extentTest.info("clik to join button");

        loginMerchantPage.signUpStoreNameMerchant.sendKeys(faker.name().fullName());
        ReusableMethods.wait(1);
        extentTest.info("Store name sendet");
        loginMerchantPage.signUpStoreAddressMerchant.sendKeys(faker.address().fullAddress());
        ReusableMethods.wait(1);
        extentTest.info("Store addresse sendet");
        loginMerchantPage.signUpEmailAddressMerchant.sendKeys(faker.internet().emailAddress());
        ReusableMethods.wait(1);
        extentTest.info("Valid Email addresse sendet");
        loginMerchantPage.signUpTelefonNoMerchant.sendKeys(faker.phoneNumber().phoneNumber());
        ReusableMethods.wait(1);
        extentTest.info("Telefon nummer sendet");
        actions.click(loginMerchantPage.signUpCommissionMerchant).perform();
        ReusableMethods.wait(1);
        loginMerchantPage.signUpSubmitButtonMerchant.click();
        extentTest.info("clik to submit button");

        Assert.assertTrue(loginMerchantPage.signUpAcceptanceVisibleTextMerchant.isDisplayed());
        extentTest.pass("a visotor could register.");

    }


    @Test
    public void negativRegisterTest(){

        extentTest=extentReports.createTest("Verify register ","As a visitor, cant invalid email adresse  register.");


        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        homePage.cookiesAcceptHome.click();
        extentTest.info("went to visitor Page");

        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(1);
        clickWithJS(loginMerchantPage.footerBecomeaPartnerMerchant);
        extentTest.info("clik to join button");

        loginMerchantPage.signUpStoreNameMerchant.sendKeys(faker.name().fullName());
        ReusableMethods.wait(1);
        extentTest.info("Store name sendet");
        loginMerchantPage.signUpStoreAddressMerchant.sendKeys(faker.address().fullAddress());
        ReusableMethods.wait(1);
        extentTest.info("Store addresse sendet");
        loginMerchantPage.signUpEmailAddressMerchant.sendKeys("wrongTeypEmail");
        ReusableMethods.wait(1);
        extentTest.info("invalid type Email addresse sendet");
        loginMerchantPage.signUpTelefonNoMerchant.sendKeys(faker.phoneNumber().phoneNumber());
        ReusableMethods.wait(1);
        extentTest.info("Telefon nummer sendet");
        actions.click(loginMerchantPage.signUpCommissionMerchant).perform();
        ReusableMethods.wait(1);
        clickWithJS(loginMerchantPage.signUpSubmitButtonMerchant);
        extentTest.info("clik to submit button");

        Assert.assertTrue(loginMerchantPage.signUpSubmitButtonMerchant.isDisplayed());
        extentTest.pass("with invalid type Email adresse  a visotor couldnt register.");

    }
}




