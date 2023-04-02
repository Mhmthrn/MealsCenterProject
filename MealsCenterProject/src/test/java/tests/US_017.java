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

public class US_017 extends TestBaseRapor {

    Actions actions = new Actions(Driver.getDriver());

    HomePage homePage = new HomePage();

    @Test
    public void orderPageOrderVerify() {
        extentTest = extentReports.createTest("Verify Home Order page ", "As a user, view the orders of my account.");

        homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("went to Home Page");


        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("login to main page");

        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        actions.moveToElement(homePage.profilNameItem);
        clickWithJS(homePage.profilNameItem);
        clickWithJS(homePage.paymentsOptions);
        ReusableMethods.waitForPageToLoad(1);

        Assert.assertTrue(homePage.addNewPayment.isDisplayed());
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("Payments page was visible.");
    }

    @Test(groups="smoke")
    public void addPaymentAndDeleteWithCashOnDelivery() {
        extentTest = extentReports.createTest("Verify Add Payment and Delete ", "The payment options page, new payment method can be added and deleted");

        homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("went to Home Page");


        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("login to main page");

        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        actions.moveToElement(homePage.profilNameItem);
        clickWithJS(homePage.profilNameItem);
        clickWithJS(homePage.paymentsOptions);
        ReusableMethods.wait(1);
        clickWithJS(homePage.addNewPayment);
        ReusableMethods.wait(1);
        clickWithJS(homePage.cashOnDeliveryPaymetOption);
        ReusableMethods.wait(1);
        clickWithJS(homePage.addCashAlert);
        ReusableMethods.wait(1);
        clickWithJS(homePage.closeAddItemHome);
        ReusableMethods.wait(1);
        clickWithJS(homePage.selectCashOnDeliveryIcon);
        ReusableMethods.wait(1);
        clickWithJS(homePage.setDefaultHome);
        ReusableMethods.wait(1);
        extentTest.info("The created payment has been successfully selected");
        clickWithJS(homePage.deleteCashOnDeliveryIcon);

        Assert.assertTrue(!homePage.deleteCashOnDeliveryIcon.isDisplayed());
        clickWithJS(homePage.profilNameItem);
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("The created payment method could not be deleted");


    }

    @Test(groups="smoke")
    public void addPaymentAndDeleteWithStripe() {
        extentTest = extentReports.createTest(" Verify Add Payment and Delete ", "The payment options page, new payment method can be added and deleted");

        homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("went to Home Page");


        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("login to main page");

        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        actions.moveToElement(homePage.profilNameItem);
        clickWithJS(homePage.profilNameItem);
        clickWithJS(homePage.paymentsOptions);
        ReusableMethods.wait(1);
        clickWithJS(homePage.addNewPayment);
        ReusableMethods.wait(1);
        clickWithJS(homePage.stripePaymetOption);
        extentTest.info("");
        ReusableMethods.wait(1);
        Driver.getDriver().switchTo().frame(homePage.iframeCardHome);
        homePage.cardNumber.click();
        homePage.cardNumber.sendKeys("424242424242424242424242424242");
        ReusableMethods.wait(3);
        Driver.getDriver().switchTo().defaultContent();

        clickWithJS(homePage.addStripeAlert);
        ReusableMethods.wait(3);
        clickWithJS(homePage.closeAddItem2Home);
        ReusableMethods.wait(1);
        clickWithJS(homePage.selectStripeIcon);
        ReusableMethods.wait(1);
        clickWithJS(homePage.setDefaultHome);
        ReusableMethods.wait(1);
        extentTest.info("The created payment has been successfully selected");

        clickWithJS(homePage.deleteStripeIcon);
        Assert.assertTrue(!homePage.deleteStripeIcon.isDisplayed());
        clickWithJS(homePage.profilNameItem);
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("The created payment method could not be deleted");
    }

    @Test(groups="smoke")
    public void editCashOnDelivery () {
        extentTest = extentReports.createTest("Veriify payment information can be changed ", "The payment options page, new payment method can be changed");

        homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("went to Home Page");


        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("login to main page");

        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        actions.moveToElement(homePage.profilNameItem);
        clickWithJS(homePage.profilNameItem);
        clickWithJS(homePage.paymentsOptions);

        Assert.assertTrue(!homePage.editCoshOnDeliveryIcon.isEnabled());
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("The edit icon is not enabled");

    }
    @Test
    public void editStripeIcon() {
        extentTest = extentReports.createTest("Veriify payment information can be changed ", "The payment options page, new payment method can be changed");

        homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("went to Home Page");


        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("login to main page");

        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        actions.moveToElement(homePage.profilNameItem);
        clickWithJS(homePage.profilNameItem);
        clickWithJS(homePage.paymentsOptions);

        Assert.assertTrue(!homePage.editStripeIcon.isEnabled());
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("The edit icon is not enabled");

    }
}