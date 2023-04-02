package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.A_homePage.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Set;

public class US_004 extends TestBaseRapor {

    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void LinkisActiveFooterofHomePage(){

        HomePage homePage=new HomePage();
        extentTest=extentReports.createTest("Verify that links are active in footer of homepage ","As a visitor, click the links in the footer of homepage.");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        homePage.cookiesAcceptHome.click();
        String ilkSayfaWHD=Driver.getDriver().getWindowHandle();
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(1);

        SoftAssert softAssert=new SoftAssert();
        homePage.facebookIcon.click();
        Set<String> tumSayfalarWHDSeti= Driver.getDriver().getWindowHandles();

        String ikinciSayfaWHD="";

        for (String each: tumSayfalarWHDSeti
        ) {
            if (!each.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=each;
            }
        }

        Driver.getDriver().switchTo().window(ikinciSayfaWHD);
        String expectedUrl="https://www.facebook.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"Facebook sayfasına gitmiyor");
        extentTest.pass("Facebook link goes facebook page");
        Driver.getDriver().switchTo().window(ilkSayfaWHD);



        homePage.instagramIcon.click();

        tumSayfalarWHDSeti= Driver.getDriver().getWindowHandles();
        String ucuncuSayfaWHD="";

        for (String each: tumSayfalarWHDSeti
        ) {
            if (!each.equals(ilkSayfaWHD)&&!each.equals(ilkSayfaWHD)){
                ucuncuSayfaWHD=each;
            }
        }

        Driver.getDriver().switchTo().window(ucuncuSayfaWHD);
        expectedUrl="https://www.instagram.com/";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"Instagram sayfasına gitmiyor");
        extentTest.pass("Instagram link goes instagram page");// not pass
        Driver.getDriver().switchTo().window(ilkSayfaWHD);


        homePage.linkedInIcon.click();

        tumSayfalarWHDSeti= Driver.getDriver().getWindowHandles();
        String dorduncuSayfaWHD="";

        for (String each: tumSayfalarWHDSeti
        ) {
            if (!each.equals(ilkSayfaWHD)&&!each.equals(ikinciSayfaWHD)&&!each.equals(ucuncuSayfaWHD)){
                dorduncuSayfaWHD=each;
            }
        }

        Driver.getDriver().switchTo().window(dorduncuSayfaWHD);
        expectedUrl="https://www.linkedin.com/";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"LinkedIn sayfasına gitmiyor");
        extentTest.pass("LinkedIn link goes linkedin page"); //not pass
        Driver.getDriver().switchTo().window(ilkSayfaWHD);


        homePage.twitterIcon.click();
        tumSayfalarWHDSeti= Driver.getDriver().getWindowHandles();
        String besinciSayfaWHD="";

        for (String each: tumSayfalarWHDSeti
        ) {
            if (!each.equals(ilkSayfaWHD)&&!each.equals(ikinciSayfaWHD)&&!each.equals(ucuncuSayfaWHD)&&!each.equals(dorduncuSayfaWHD)){
                besinciSayfaWHD=each;
            }
        }

        Driver.getDriver().switchTo().window(besinciSayfaWHD);
        expectedUrl="https://twitter.com/";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"Twitter sayfasına gitmiyor");
        extentTest.pass("Twitter link goes twitter page"); //not pass
        Driver.getDriver().switchTo().window(ilkSayfaWHD);

        homePage.youtubeIcon.click();
        tumSayfalarWHDSeti= Driver.getDriver().getWindowHandles();
        String altinciSayfaWHD="";

        for (String each: tumSayfalarWHDSeti
        ) {
            if (!each.equals(ilkSayfaWHD)&&!each.equals(ikinciSayfaWHD)&&!each.equals(ucuncuSayfaWHD)
                    &&!each.equals(dorduncuSayfaWHD)&&!each.equals(besinciSayfaWHD)){
                altinciSayfaWHD=each;
            }
        }

        Driver.getDriver().switchTo().window(altinciSayfaWHD);
        expectedUrl="https://www.youtube.com/";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"Youtube sayfasına gitmiyor");
        extentTest.pass("Youtube link goes youtube page"); //not pass
        Driver.getDriver().switchTo().window(ilkSayfaWHD);

        ReusableMethods.wait(1);
        homePage.BecomeAPartner.click();
        tumSayfalarWHDSeti= Driver.getDriver().getWindowHandles();
        String yedinciSayfaWHD="";

        for (String each: tumSayfalarWHDSeti
        ) {
            if (!each.equals(ilkSayfaWHD)&&!each.equals(ikinciSayfaWHD)&&!each.equals(ucuncuSayfaWHD)
                    &&!each.equals(dorduncuSayfaWHD)&&!each.equals(besinciSayfaWHD)&&!each.equals(altinciSayfaWHD)){
                yedinciSayfaWHD=each;
            }
        }

        Driver.getDriver().switchTo().window(yedinciSayfaWHD);
        expectedUrl="https://qa.mealscenter.com/merchant/signup";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"become a partner sayfasına gitmiyor");
        extentTest.pass("become a partner link goes merchant signup page");
        Driver.getDriver().switchTo().window(ilkSayfaWHD);


        ReusableMethods.wait(1);
        homePage.contaktUsButton.click();
        String expectedInfo="contactus";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedInfo),"contact us sayfasına gitmiyor");
        extentTest.pass("Contact Us link goes contact us page");
        Driver.getDriver().navigate().back();

        homePage.termsAndConditionsButton.click();
        expectedInfo="terms-and-conditions";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedInfo),"terms-and-conditions sayfasına gitmiyor");
        extentTest.pass("terms-and-conditions link goes terms-and-conditions page");
        Driver.getDriver().navigate().back();

        homePage.privacyPolicyButton.click();
        expectedInfo="privacy-policy";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedInfo),"privacy-policy sayfasına gitmiyor");
        extentTest.pass("privacy-policy link goes privacy-policy page");
        Driver.getDriver().navigate().back();



        homePage.discoveryVegatariann.click();
        expectedInfo="discover-the-best-vegetarian-food-delivery-options-in-your-area";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedInfo),"discover-the-best-vegetarian-food-delivery-options-in-your-area sayfasına gitmiyor");
        extentTest.pass("discover-the-best-vegetarian-food-delivery-options-in-your-area link goes discover-the-best-vegetarian-food-delivery-options-in-your-area page");
        Driver.getDriver().navigate().back();

        homePage.howToEatHaelty.click();
        expectedInfo="how-to-eat-healthy-with-food-delivery";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedInfo),"how-to-eat-healthy-with-food-delivery sayfasına gitmiyor");
        extentTest.pass("how-to-eat-healthy-with-food-delivery link goes how-to-eat-healthy-with-food-delivery page");
        Driver.getDriver().navigate().back();

        homePage.theBenefitsOfUsing.click();
        expectedInfo="the-benefits-of-using-a-food-delivery-platform-for-your-healthy-lifestyle";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedInfo),"the-benefits-of-using-a-food-delivery-platform-for-your-healthy-lifestyle sayfasına gitmiyor");
        extentTest.pass("the-benefits-of-using-a-food-delivery-platform-for-your-healthy-lifestyle link goes the-benefits-of-using-a-food-delivery-platform-for-your-healthy-lifestyle page");
        Driver.getDriver().navigate().back();

        homePage.discoverHealtyFood.click();
        expectedInfo="discover-healthy-food-delivery-options-for-your-whole-family";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedInfo),"discover-healthy-food-delivery-options-for-your-whole-family sayfasına gitmiyor");
        extentTest.pass("discover-healthy-food-delivery-options-for-your-whole-family link goes discover-healthy-food-delivery-options-for-your-whole-family page");
        Driver.getDriver().navigate().back();

        homePage.appStoreIcon.click();
        expectedUrl="https://apps.apple.com/app/";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"applestore sayfasına gitmiyor"); //not pass
        extentTest.pass("AppStore icon goes to AppStore page");
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);

        homePage.playStoreIcon.click();
        expectedUrl="https://play.google.com/store/";
        actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"playstore sayfasına gitmiyor");
        extentTest.pass("PlayStore icon goes to PlayStore page");

        softAssert.assertAll();

        Driver.quitDriver();
    }

}
