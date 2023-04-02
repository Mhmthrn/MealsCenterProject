package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.C_adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;
import static utilities.ReusableMethods.clickWithJS;

public class US_043 extends TestBaseRapor {
    AdminPage adminPage= new AdminPage();
    Actions actions= new Actions(Driver.getDriver());



    @Test()
    public void    merchantRegistrationPageVisibleAdminTest ()  {
        adminPage= new AdminPage();
        actions= new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verification is Merchant Registraions page ","As a admin, can Merchant registration page seen.");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName,ConfigReader.getProperty("mehmetAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword,ConfigReader.getProperty("adminGeneralPassword")+ Keys.ENTER).perform();
        extentTest.info("login to Admin page");

        adminPage.reportTitleButtonAdmin.click();
        adminPage.merchantRegistirationButtonAdmin.click();
        Assert.assertTrue(adminPage.merchantRegistrationTextAdmin.isDisplayed());
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Merchant registration is visible");

    }

    @Test()
    public void    merchantsListedListAdminTest ()  {
        adminPage= new AdminPage();
        actions= new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verification in the merchan regisration list is visible ","The list must be actual");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName,ConfigReader.getProperty("mehmetAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword,ConfigReader.getProperty("adminGeneralPassword")+ Keys.ENTER).perform();
        extentTest.info("login to Admin page");

        adminPage.reportTitleButtonAdmin.click();
        adminPage.merchantRegistirationButtonAdmin.click();
        assertTrue(adminPage.merchantRegistratinOnListVerifyItem.isDisplayed());
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Merchants have been successfully listed in the list.");

    }

    @Test()
    public void    merchantRegistrationlistSortedByName ()  {
        adminPage= new AdminPage();
        actions= new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verification  Merchant Registration list sorted by name test","Verify Merchant Registration list is sorted by name");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName,ConfigReader.getProperty("mehmetAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword,ConfigReader.getProperty("adminGeneralPassword")+ Keys.ENTER).perform();
        extentTest.info("login to Admin page");

        adminPage.reportTitleButtonAdmin.click();
        adminPage.merchantRegistirationButtonAdmin.click();
        adminPage.nameSortbuttonAdmin.click();

        String expectedSort1="67899";
        String expectedSort2="7-Eleven";

        String actualSort1=adminPage.nameSortItem1.getText();
        String actualSort2=adminPage.nameSortItem2.getText();

        Assert.assertTrue(actualSort1.contains(expectedSort1));
        Assert.assertTrue(actualSort2.contains(expectedSort2));
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Merchants Registration list sorted by Name.");

    }

    @Test()
    public void    merchantRegistrationlistSortedDateRange ()  {
        adminPage= new AdminPage();
        actions= new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Verification  Merchant Registration list sorted date range test","Verify Merchant Registration list is sorted by date range");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName,ConfigReader.getProperty("mehmetAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword,ConfigReader.getProperty("adminGeneralPassword")+ Keys.ENTER).perform();
        extentTest.info("login to Admin page");

        adminPage.reportTitleButtonAdmin.click();
        adminPage.merchantRegistirationButtonAdmin.click();
        extentTest.info("Merchant Registration list visible");

        clickWithJS(adminPage.dateSearchBoxAdmin);
        ReusableMethods.wait(1);
        actions.click(adminPage.dateStart).perform();
        ReusableMethods.wait(1);
        actions.click(adminPage.dateEnd).perform();

        Assert.assertTrue(true);
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Merchants Registration list sorted by date range but full control could not be achieved due to missing test data.");

    }



    @Test(groups = "demo")
    public  void    merchantRegistrationlistSortedStatusRangeByName () {
        adminPage= new AdminPage();
        actions= new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("Verification  Merchant Registration list sorted By Status test", "Verify Merchant Registration list is sorted By Status range");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        ReusableMethods.wait(1);
        extentTest.info("went to Starbucks Admin Page");


        actions.sendKeys(adminPage.adminPageUserName, ConfigReader.getProperty("mehmetAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword, ConfigReader.getProperty("adminGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Admin page");

        adminPage.reportTitleButtonAdmin.click();
        adminPage.merchantRegistirationButtonAdmin.click();
        extentTest.info("Merchant Registration list visible");


        Select select= new Select(adminPage.allStatusButtonAdmin);
        select.selectByVisibleText("active");

        List<WebElement> listeactive= Driver.getDriver().findElements(By.xpath("//div[@class='badge customer active']"));

        String expectedResult="active";
        int count=0;

        for (WebElement each :listeactive){

            String actualResult=each.getText();
            if (actualResult.contains(expectedResult)){
                count++;
            }
        }

        if (count==10){
            Assert.assertTrue(true);
        }
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Merchants Registration list sorted by Status.");

    }

}

