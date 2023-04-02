package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.C_adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.List;

import static utilities.ReusableMethods.clickWithJS;

public class US_041 extends TestBaseRapor {

    AdminPage adminPage = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void AdminPageAccessible() {
        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        actions.sendKeys(adminPage.adminPageUserName, ConfigReader.getProperty("esraAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword, ConfigReader.getProperty("adminGeneralPassword") + Keys.ENTER).perform();
        Assert.assertTrue(adminPage.profileNameInHeaderAdmin.isDisplayed());
        //extentTest.info("The user verifies profilname is visible");
        ReusableMethods.wait(2);
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        Driver.closeDriver();

    }

    @Test
    public void BuyersCustomers() {
        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("esraAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
        ReusableMethods.wait(2);
        clickWithJS(adminPage.buyersAdmin);
        adminPage.customersAdmin.click();
        Assert.assertTrue(adminPage.customerListAdmin.isDisplayed());
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        Driver.closeDriver();
    }

    @Test
    public void AddnewCustomers() {
        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("esraAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
        ReusableMethods.wait(2);
        clickWithJS(adminPage.buyersAdmin);
        ReusableMethods.wait(1);
        adminPage.customersAdmin.click();
        ReusableMethods.wait(2);
        actions.moveToElement(adminPage.customeraddAdmin);
        adminPage.customeraddAdmin.click();
        ReusableMethods.wait(2);
        clickWithJS(adminPage.customerFirstNameAdmin);
        adminPage.customerFirstNameAdmin.sendKeys("Zero");
        clickWithJS(adminPage.customerLastNameAdmin);
        adminPage.customerLastNameAdmin.sendKeys("Hero");
        clickWithJS(adminPage.customerMailAdresAdmin);
        adminPage.customerMailAdresAdmin.sendKeys("zerohero@gmail.com");
        clickWithJS(adminPage.contactphoneAdmin);
        adminPage.contactphoneAdmin.sendKeys("070707070707");
        clickWithJS(adminPage.customerpasswordAdmin);
        adminPage.customerpasswordAdmin.sendKeys(ConfigReader.getProperty("adminGeneralPassword"));
        clickWithJS(adminPage.confirmpasswordAdmin);
        adminPage.confirmpasswordAdmin.sendKeys(ConfigReader.getProperty("adminGeneralPassword"));
        clickWithJS(adminPage.CustomerSavedAdmin);
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        Driver.closeDriver();

    }

    @Test
    public void EditCustomers() {
        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("esraAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
        ReusableMethods.wait(2);
        clickWithJS(adminPage.buyersAdmin);
        ReusableMethods.wait(1);
        adminPage.customersAdmin.click();
        ReusableMethods.wait(2);
        actions.moveToElement(adminPage.customeredit);
        adminPage.customeredit.click();
        ReusableMethods.wait(2);
        clickWithJS(adminPage.editfirstnameAdmin);
        adminPage.editfirstnameAdmin.sendKeys("Zero");
        clickWithJS(adminPage.editlastnameAdmin);
        adminPage.editlastnameAdmin.sendKeys("2Hero");
        // clickWithJS(adminPage.editmailadressAdmin);
        // adminPage.editmailadressAdmin.sendKeys("zero2hero@gmail.com");
        clickWithJS(adminPage.editcontactnoAdmin);
        adminPage.editcontactnoAdmin.sendKeys("2070707070707");
        clickWithJS(adminPage.editpasswordAdmin);
        adminPage.editpasswordAdmin.sendKeys(ConfigReader.getProperty("adminGeneralPassword"));
        clickWithJS(adminPage.editconfirmpasswordAdmin);
        adminPage.editconfirmpasswordAdmin.sendKeys(ConfigReader.getProperty("adminGeneralPassword"));
        clickWithJS(adminPage.editSaveAdmin);

        Assert.assertTrue(adminPage.succesfullyupdatedtext.isDisplayed());
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        Driver.closeDriver();

    }

    @Test(groups = "demo")
    public void SearchboxTest() {
        extentTest=extentReports.createTest("Name list test"," Verify list sorted by name");
        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("esraAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
        ReusableMethods.wait(2);
        clickWithJS(adminPage.buyersAdmin);
        ReusableMethods.wait(1);
        adminPage.customersAdmin.click();
        ReusableMethods.wait(2);
        clickWithJS(adminPage.customersearchboxAdmin);
        adminPage.customersearchboxAdmin.sendKeys("Zero");
        clickWithJS(adminPage.customersearchboxclickAdmin);
        extentTest.info("sendet search box \"Zero\" ");

        ReusableMethods.wait(2);
        clickWithJS(adminPage.profileNameInHeaderAdmin);
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Merchants Registration list sorted by date range but full control could not be achieved due to missing test data.");
        Driver.closeDriver();
    }

    @Test
    public void DeleteCustomers() {
        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("esraAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
        ReusableMethods.wait(2);
        clickWithJS(adminPage.buyersAdmin);
        ReusableMethods.wait(1);
        adminPage.customersAdmin.click();
        ReusableMethods.wait(2);
        clickWithJS(adminPage.customerdeleteAdmin);
        clickWithJS(adminPage.customerdeleteagainAdmin);
        ReusableMethods.wait(1);
        adminPage.customerdeleteagainAdmin.click();
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        Driver.closeDriver();

    }

    @Test
    public void nameList() {
        extentTest=extentReports.createTest("Name list test"," Verify list sorted by name");
        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("esraAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
        ReusableMethods.wait(3);
        clickWithJS(adminPage.buyersAdmin);
        ReusableMethods.wait(1);
        adminPage.customersAdmin.click();
        ReusableMethods.wait(3);
        clickWithJS(adminPage.customernamelist);


        List<WebElement> NameList = Driver.getDriver().findElements(By.xpath("//td//h6"));
        List<String> NameList2= new ArrayList<String>();

        for (WebElement each: NameList
             ) {
            NameList2.add(each.toString());
        }
        for (int i = 0; i < NameList2.size()-1; i++) {
            String currentelement =NameList2.get(i);
            String afterelement =NameList2.get(i+1);

            Assert.assertFalse(currentelement.compareToIgnoreCase(afterelement)>0);

        }
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        Driver.closeDriver();
    }
}





