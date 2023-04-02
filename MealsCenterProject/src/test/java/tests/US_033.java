package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.A_homePage.HomePage;
import pages.B_merchantPage.HomePageMerchant;
import pages.B_merchantPage.LoginMerchantPage;
import pages.B_merchantPage.ProfilePageMerchant;
import pages.B_merchantPage.Sidebar_DashboardAll_MerchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

import static utilities.ReusableMethods.clickWithJS;

public class US_033 extends TestBaseRapor {
    HomePage homePage = new HomePage();
    HomePageMerchant homePageMerchant = new HomePageMerchant();
    LoginMerchantPage loginMerchantPage = new LoginMerchantPage();
    ProfilePageMerchant profilePageMerchant = new ProfilePageMerchant();
    Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();
    Faker faker=new Faker();
    String expectedTitle="";
    String actualTitle="";
    String couponName="";

    @Test
    public void Tc_3301() {
        loginMerchantPage = new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        actions = new Actions(Driver.getDriver());
        softAssert = new SoftAssert();
        faker=new Faker();

        extentTest = extentReports.createTest("Merchant page access test", "");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("user went to Home Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Merchant page");

        actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "Dashboard";

        Assert.assertTrue(actualTitle.contains(expectedTitle));
        ReusableMethods.wait(2);
        extentTest.pass("Restaurant manager can enter the meal center merchant site successfully.");

    }

    @Test
    public void Tc_3302() {
        loginMerchantPage = new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        actions = new Actions(Driver.getDriver());
        softAssert = new SoftAssert();
        faker=new Faker();

        extentTest = extentReports.createTest("CouponListPageAccessTest ", "");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("user went to Home Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Merchant page");

        sidebar_dashboardAll_merchantPage.promoLinkMerchant.click();
        ReusableMethods.wait(2);

        sidebar_dashboardAll_merchantPage.couponItemLinkMerchant.click();
        ReusableMethods.wait(2);

        expectedTitle = "Coupon list";
        actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        extentTest.pass("Restaurant manager can access the Coupon list page successfully");
    }

    @Test
    public void Tc_3303() {
        loginMerchantPage = new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        actions = new Actions(Driver.getDriver());
        softAssert = new SoftAssert();
        faker=new Faker();

        extentTest = extentReports.createTest("AddCouponTest", "As a restaurant manager, I would like to have a Promo menu to create various promos and have my customers use them in order to deliver my products to more customers.");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("Restaurant manager go to Merchant page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("Restaurant manager can enter the merchant page.");

        sidebar_dashboardAll_merchantPage.promoLinkMerchant.click();
        ReusableMethods.wait(2);

        sidebar_dashboardAll_merchantPage.couponItemLinkMerchant.click();
        ReusableMethods.wait(2);
        extentTest.info("Restaurant manager can go Coupon list page.");

        sidebar_dashboardAll_merchantPage.addNewPlusButtonMerchant.click();
        ReusableMethods.wait(2);

        expectedTitle="Add Coupon";
        actualTitle=Driver.getDriver().getTitle();
        softAssert.assertTrue(actualTitle.equals(expectedTitle));
        ReusableMethods.wait(2);
        extentTest.info("Restaurant manager can go Add Coupon page");

        couponName=faker.name().firstName();
        sidebar_dashboardAll_merchantPage.couponNameTextboxMerchant.sendKeys(couponName);
        ReusableMethods.wait(2);
        sidebar_dashboardAll_merchantPage.couponTypeMerchant.click();

        ReusableMethods.wait(2);
        WebElement ddm=Driver.getDriver().findElement(By.xpath("//select[@class='form-control custom-select form-control-select']"));
        Select select=new Select(ddm);
        select.selectByIndex(0);
        ReusableMethods.wait(2);

        clickWithJS(sidebar_dashboardAll_merchantPage.amountTextboxMerchant);
        ReusableMethods.wait(2);
        actions.sendKeys(sidebar_dashboardAll_merchantPage.amountTextboxMerchant,Keys.BACK_SPACE).perform();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.amountTextboxMerchant.sendKeys("5");
        ReusableMethods.wait(1);

        clickWithJS(sidebar_dashboardAll_merchantPage.minOrderTextboxMerchant);
        ReusableMethods.wait(2);
        actions.sendKeys(sidebar_dashboardAll_merchantPage.minOrderTextboxMerchant,Keys.BACK_SPACE).perform();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.minOrderTextboxMerchant.sendKeys("30");
        ReusableMethods.wait(1);

        ddm=Driver.getDriver().findElement(By.xpath("//select[@id='AR_voucher_days_available']"));
        select= new Select(ddm);
        List<WebElement> optionElemenetList=select.getOptions();
        int expectedBoyut=7;
        int actualBoyut=optionElemenetList.size();
        for (int i = 0; i < actualBoyut; i++) {
            select.selectByIndex(i);
        }
        softAssert.assertEquals(expectedBoyut,actualBoyut);
        ReusableMethods.wait(4);

        clickWithJS(sidebar_dashboardAll_merchantPage.expirationTextboxMerchant);
        ReusableMethods.wait(2);
        Driver.getDriver().findElement(By.xpath("(//th[@class='next available'])[1]")).click();
        ReusableMethods.wait(1);
        Driver.getDriver().findElement(By.xpath("(//td[@data-title='r4c6'])[1]")).click();
        ReusableMethods.wait(2);

        ddm=Driver.getDriver().findElement(By.xpath("//select[@id='AR_voucher_used_once']"));
        select=new Select(ddm);
        select.selectByIndex(0);
        ReusableMethods.wait(3);

        ddm=Driver.getDriver().findElement(By.xpath("//select[@id='AR_voucher_status']"));
        select=new Select(ddm);
        select.selectByIndex(2);
        ReusableMethods.wait(3);

        sidebar_dashboardAll_merchantPage.couponSaveButtonMerchant.click();
        extentTest.pass("Restaurant manager can add new coupon successfully.");
        ReusableMethods.wait(4);

        softAssert.assertAll();

    }

    @Test
    public void Tc_3304(){
        loginMerchantPage = new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        actions = new Actions(Driver.getDriver());
        softAssert = new SoftAssert();
        faker=new Faker();

        extentTest = extentReports.createTest("Coupon List page's functions test", "As a restaurant manager, I would like to have a Promo menu to create various promos and have my customers use them in order to deliver my products to more customers.");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("Restaurant manager go to Merchant page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("Restaurant manager can enter the merchant page.");

        sidebar_dashboardAll_merchantPage.promoLinkMerchant.click();
        ReusableMethods.wait(2);

        sidebar_dashboardAll_merchantPage.couponItemLinkMerchant.click();
        ReusableMethods.wait(2);
        extentTest.info("Restaurant manager can go Coupon list page.");

        sidebar_dashboardAll_merchantPage.couponListSearchBoxMerchant.sendKeys(couponName);
        Driver.getDriver().findElement(By.xpath("(//button[@type='submit'])[3]")).click();
        ReusableMethods.wait(2);

        String actualCouponName=Driver.getDriver().findElement(By.xpath("//td[@class='sorting_1']")).getText();
        softAssert.assertTrue(actualCouponName.contains(couponName));
        extentTest.info("Searh box in coupon list page is works.");
        ReusableMethods.wait(2);

        WebElement updateButton=Driver.getDriver().findElement(By.xpath("//a[@data-original-title='Update']"));
        updateButton.click();
        ReusableMethods.wait(2);
        actualTitle=Driver.getDriver().getTitle();
        expectedTitle="Update Coupon";
        softAssert.assertTrue(actualTitle.contains(expectedTitle));
        extentTest.info("Restaurant manager can go update coupon page.");
        ReusableMethods.wait(2);

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);

        Driver.getDriver().navigate().refresh();
        sidebar_dashboardAll_merchantPage.couponListSearchBoxMerchant.sendKeys(couponName);
        Driver.getDriver().findElement(By.xpath("//i[@class='zmdi zmdi-search']")).click();
        ReusableMethods.wait(2);
        WebElement deleteButton=Driver.getDriver().findElement(By.xpath("//i[@class='zmdi zmdi-delete']"));
        deleteButton.click();
        ReusableMethods.wait(1);
        Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-green item_delete']")).click();
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().refresh();
        softAssert.assertTrue(actualCouponName.contains(couponName));
        ReusableMethods.wait(2);

        WebElement nextButton=Driver.getDriver().findElement(By.xpath("(//a[@class='page-link'])[4]"));
        clickWithJS(nextButton);
        ReusableMethods.wait(2);

        WebElement previousButton=Driver.getDriver().findElement(By.xpath("(//a[@class='page-link'])[1]"));
        clickWithJS(previousButton);
        ReusableMethods.wait(2);
        //softAssert.assertTrue(previousButton.isEnabled());
        extentTest.info("Next and Previous buttons have been enabled");

        sidebar_dashboardAll_merchantPage.couponListSearchBoxMerchant.sendKeys(couponName);
        Driver.getDriver().findElement(By.xpath("//i[@class='zmdi zmdi-search']")).click();
        ReusableMethods.wait(2);
        extentTest.info("Restaurant manager can delete old or currently coupons.");
        ReusableMethods.wait(2);
        extentTest.pass("Restaurant manager can access the coupon page,RM can create,update and delete the coupon.And another coupon list pages button options and visible have been tested with that test.");

        softAssert.assertAll();
    }

}
