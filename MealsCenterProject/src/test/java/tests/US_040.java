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
import pages.C_adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.List;

import static utilities.ReusableMethods.clickWithJS;

public class US_040 extends TestBaseRapor {

    AdminPage adminPage = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());

    SoftAssert softAssert = new SoftAssert();

    Faker faker = new Faker();

    String expectedTitle;

    String actualTitle;

    String couponName;

    @Test()
    public void couponPageVisibleAdminTest() {

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("verify that the cupon page", "As a admin,should be able to see cupon list.");
        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName, ConfigReader.getProperty("kubraAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword, ConfigReader.getProperty("adminGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Admin page");

        adminPage.promoAdmin.click();
        adminPage.couponAdmin.click();
        expectedTitle = "Coupon list";
        actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Coupon page is visible");
        ReusableMethods.wait(1);
    }

    @Test
    public void couponCreateTest() {

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert = new SoftAssert();
        faker = new Faker();

        extentTest = extentReports.createTest("Verification is Create Coupon ", "As a admin, can create Coupon.");
        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to  Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName, ConfigReader.getProperty("kubraAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword, ConfigReader.getProperty("adminGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Admin page");

        adminPage.promoAdmin.click();
        adminPage.couponAdmin.click();
        adminPage.addnewButtonAdmin.click();

        couponName = faker.name().firstName();
        adminPage.CouponNameAdmin.sendKeys(couponName);
        clickWithJS(adminPage.fixedAmountAdmin);
        ReusableMethods.wait(2);

        WebElement ddm = Driver.getDriver().findElement(By.xpath("//select[@class='form-control custom-select form-control-select']"));
        Select select = new Select(ddm);
        select.selectByIndex(0);
        ReusableMethods.wait(2);

        clickWithJS(adminPage.amountAdmin);
        ReusableMethods.wait(2);
        actions.sendKeys(adminPage.amountAdmin, Keys.BACK_SPACE).perform();
        ReusableMethods.wait(1);
        adminPage.amountAdmin.sendKeys("1");
        ReusableMethods.wait(1);

        clickWithJS(adminPage.minorderAdmin);
        ReusableMethods.wait(2);
        actions.sendKeys(adminPage.minorderAdmin, Keys.BACK_SPACE).perform();
        ReusableMethods.wait(1);
        adminPage.minorderAdmin.sendKeys("3");
        ReusableMethods.wait(1);

        ddm = Driver.getDriver().findElement(By.xpath("//select[@id='AR_voucher_days_available']"));
        select = new Select(ddm);
        List<WebElement> optionElemenetList = select.getOptions();
        int expectedBoyut = 7;
        int actualBoyut = optionElemenetList.size();
        for (int i = 0; i < actualBoyut; i++) {
            select.selectByIndex(i);
        }
        softAssert.assertEquals(expectedBoyut, actualBoyut);
        ReusableMethods.wait(4);


        clickWithJS(adminPage.expirationAdmin);
        ReusableMethods.wait(2);
        Driver.getDriver().findElement(By.xpath("(//th[@class='next available'])[1]")).click();
        ReusableMethods.wait(1);
        Driver.getDriver().findElement(By.xpath("(//td[@data-title='r4c6'])[1]")).click();
        ReusableMethods.wait(2);

        ddm = Driver.getDriver().findElement(By.xpath("//select[@id='AR_voucher_used_once']"));
        select = new Select(ddm);
        select.selectByIndex(0);
        ReusableMethods.wait(3);

        ddm = Driver.getDriver().findElement(By.xpath("//select[@id='AR_voucher_status']"));
        select = new Select(ddm);
        select.selectByIndex(2);
        ReusableMethods.wait(3);

        adminPage.couponSaveButtonAdmin.click();

        ReusableMethods.wait(4);

        softAssert.assertAll();

        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Admin can add new coupon successfully.");
        ReusableMethods.wait(1);
    }

    @Test
    public void searchBoxTest() {

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());



        extentTest = extentReports.createTest("Verify that the Search box is active", "Admin should be possible to search in the searchbox");
        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName, ConfigReader.getProperty("kubraAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword, ConfigReader.getProperty("adminGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Admin page");

        adminPage.promoAdmin.click();
        adminPage.couponAdmin.click();
        extentTest.info("Admin can go Coupon list page.");

        adminPage.CouponListSearchBoxAdmin.click();
        adminPage.CouponListSearchBoxAdmin.sendKeys("Angelo");
        Driver.getDriver().findElement(By.xpath("//i[@class='zmdi zmdi-search']")).click();
        ReusableMethods.wait(2);

        adminPage.CouponListSearchBoxClickAdmin.click();
        Assert.assertFalse(adminPage.CouponListSearchBoxClickAdmin.isEnabled());

        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Search box in coupon list didn't work. Could not search among coupons");
        ReusableMethods.wait(1);

    }

    @Test
    public void couponUpdateTest() {

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert = new SoftAssert();

        extentTest = extentReports.createTest("Coupon update test", "As a admin, can update Coupon.");
        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName, ConfigReader.getProperty("kubraAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword, ConfigReader.getProperty("adminGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Admin page");

        adminPage.promoAdmin.click();
        adminPage.couponAdmin.click();

        WebElement updateButton = Driver.getDriver().findElement(By.xpath("//a[@data-original-title='Update']"));
        updateButton.click();
        ReusableMethods.wait(2);
        actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "Update Coupon";
        softAssert.assertTrue(actualTitle.contains(expectedTitle));
        extentTest.info("went to Coupon Update Page");

        ReusableMethods.wait(2);
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);

        softAssert.assertAll();
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Admin can go update coupon page.");
        ReusableMethods.wait(1);
    }

    @Test
    public void couponDeleteTest() {

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());


        extentTest = extentReports.createTest("Verification is delete Coupon ", "As a admin, can delete Coupon.");
        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Coupon page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName, ConfigReader.getProperty("kubraAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword, ConfigReader.getProperty("adminGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Admin page");

        adminPage.promoAdmin.click();
        adminPage.couponAdmin.click();

        clickWithJS(adminPage.CouponListDeleteAdmin);
        adminPage.couponDeleteAgainAdmin.click();
        ReusableMethods.wait(1);
        clickWithJS(adminPage.profileNameInHeaderAdmin);
        ReusableMethods.wait(1);
        clickWithJS(adminPage.logOutButtonAdmin);
        extentTest.pass("Admin can delete old or currently coupons.");
        ReusableMethods.wait(1);


    }

    @Test
    public void nameListTest() {

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());


        extentTest = extentReports.createTest("Verify that sort coupon list by Name ", "As a admin, can sort coupon list by Name.");
        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName, ConfigReader.getProperty("kubraAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword, ConfigReader.getProperty("adminGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Admin page");

        adminPage.promoAdmin.click();
        adminPage.couponAdmin.click();


        List<WebElement> NameList = Driver.getDriver().findElements(By.xpath("(//th[@aria-controls='DataTables_Table_0'])[2]"));
        List<String> NameList2 = new ArrayList<String>();
        for (WebElement each : NameList
        ) {
            NameList2.add(each.toString());
        }
        for (int i = 0; i < NameList2.size() - 1; i++) {
            String currentelement = NameList2.get(i);
            String afterelement = NameList2.get(i + 1);
            Assert.assertFalse(currentelement.compareToIgnoreCase(afterelement) > 0);
            extentTest.pass("Admin can sort coupon list by name .");
            ReusableMethods.wait(1);
        }
    }
        @Test
        public void usersListTest () {

            adminPage = new AdminPage();
            actions = new Actions(Driver.getDriver());


            extentTest = extentReports.createTest("Verify that sort coupon list by uses number", "As a admin, can sort coupon list by uses number  .");
            Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
            extentTest.info("went to Starbucks Admin Page");

            clickWithJS(adminPage.adminPageUserName);
            ReusableMethods.wait(1);
            actions.sendKeys(adminPage.adminPageUserName, ConfigReader.getProperty("kubraAdminUsername")).perform();
            clickWithJS(adminPage.adminPagePassword);
            actions.sendKeys(adminPage.adminPagePassword, ConfigReader.getProperty("adminGeneralPassword") + Keys.ENTER).perform();
            extentTest.info("login to Admin page");

            adminPage.promoAdmin.click();
            adminPage.couponAdmin.click();


            List<WebElement> listnumber= Driver.getDriver().findElements(By.xpath("(//th[@aria-controls='DataTables_Table_0'])[3]"));
            for (int i = 0; i <listnumber.size()-1 ; i++) {
                int currentElement=Integer.parseInt(listnumber.get(i).getText());
                int afterElement=Integer.parseInt(listnumber.get(i+1).getText());
                Assert.assertTrue(currentElement<afterElement);

                adminPage.profileNameInHeaderAdmin.click();
                ReusableMethods.wait(1);
                adminPage.logOutButtonAdmin.click();
                extentTest.pass("Admin can sort coupon list by uses number.");
                ReusableMethods.wait(1);
            }

        }



}






