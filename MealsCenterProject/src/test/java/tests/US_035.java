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

public class US_035 extends TestBaseRapor {

    AdminPage adminPage= new AdminPage();
    Actions actions= new Actions(Driver.getDriver());


    @Test(groups = {"smoke", "demo"})
    public void    adminPagePozitifLoginTest ()  {
        adminPage= new AdminPage();
        actions= new Actions(Driver.getDriver());
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
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("login to Admin page");

    }

    @Test()
    public void    adminPageNegatifLoginTest01 ()  {
        adminPage= new AdminPage();
        actions= new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verification is Admin Page wrong password cant  login ","As a admin, cant wrong password  Admin Page login.");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName,ConfigReader.getProperty("mehmetAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword,"wrongPassword"+ Keys.ENTER).perform();
        extentTest.info("Send invalid username and  correct password");


        Assert.assertTrue(adminPage.adminPageUserName.isDisplayed());
        extentTest.pass("inability to login to Admin page with valid username and  wrong password");

    }

    @Test()
    public void    adminPageNegatifLoginTest02 ()  {
        adminPage= new AdminPage();
        actions= new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verification is Admin Page wrong username cant  login ","As a admin, cant wrong username  Admin Page login.");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName,"wrongUsername").perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword,ConfigReader.getProperty("adminGeneralPassword")+ Keys.ENTER).perform();
        extentTest.info("Send invalid username and  correct password");


        Assert.assertTrue(adminPage.adminPageUserName.isDisplayed());
        extentTest.pass("inability to login to Admin page with invalid username and  correct password");

    }






}

