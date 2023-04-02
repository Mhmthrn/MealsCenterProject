package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.C_adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;

public class US_038 extends TestBaseRapor {
    AdminPage adminPage=new AdminPage();
    Actions actions=new Actions(Driver.getDriver());
    @Test()
    public void    adminPagePozitifLoginTest ()  {
        adminPage=new AdminPage();
        actions=new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verification is Admin Page login ","As a admin, can Admin Page login.");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName,ConfigReader.getProperty("mehmetAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword,ConfigReader.getProperty("adminGeneralPassword")+ Keys.ENTER).perform();
        extentTest.info("Send valid username and  correct password");

        Assert.assertTrue(adminPage.girilenKullaniciAdiDogrulama.isDisplayed());
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("login to Admin page");
    }

    @Test()
    public void    AllordersVisible ()  {
        adminPage=new AdminPage();
        actions=new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verification All Orders Button is active ","Check the All orders button is active as Admin.");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName,ConfigReader.getProperty("mehmetAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword,ConfigReader.getProperty("adminGeneralPassword")+ Keys.ENTER).perform();
        extentTest.info("Send valid username and  correct password");

        Assert.assertTrue(adminPage.girilenKullaniciAdiDogrulama.isDisplayed());
        adminPage.profileNameInHeaderAdmin.click();
        adminPage.ordersButtonAdmin.click();
        adminPage.allOrdersButtonAdmin.click();
        Assert.assertTrue(adminPage.allOrdersHeader.isEnabled());
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("AllOrders Button Is active");
    }

    @Test()
    public void   AllAmountsOrdersCancelVisible ()  {
        adminPage=new AdminPage();
        actions=new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verification All Amounts Buttons are active ","Check the All Amounts buttons are active as Admin.");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName,ConfigReader.getProperty("mehmetAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword,ConfigReader.getProperty("adminGeneralPassword")+ Keys.ENTER).perform();
        extentTest.info("Send valid username and  correct password");

        Assert.assertTrue(adminPage.girilenKullaniciAdiDogrulama.isDisplayed());
        adminPage.profileNameInHeaderAdmin.click();
        adminPage.ordersButtonAdmin.click();
        adminPage.allOrdersButtonAdmin.click();
        Assert.assertTrue(adminPage.allordersOrder.isEnabled());
        extentTest.pass("Order Button Is active");
        Assert.assertTrue(adminPage.allordersCancel.isEnabled());
        extentTest.pass("Cancel Button Is active");
        Assert.assertTrue(adminPage.allordersTotalRefund.isEnabled());
        extentTest.pass("Total Refund Button Is active");
        Assert.assertTrue(adminPage.allordersTotalOrders.isEnabled());
        extentTest.pass("Total Orders Button Is active");
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();

    }
}
