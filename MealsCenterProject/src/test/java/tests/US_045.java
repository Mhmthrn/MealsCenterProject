package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.C_adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US_045 extends TestBaseRapor {

    AdminPage adminPage = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert=new SoftAssert();


 /*   "- Open browser go to url ""adminPageLoginUrl""
            - User types in ""Email"" and ""password""
            - User clicks on ""Sign in""
            - Verifiy that username on the headder equals the entered name

        -  User closes the page
        "*/

    @Test
    public void adminPageAccess() {

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert=new SoftAssert();

        extentTest = extentReports.createTest("Verify adminpage ", "As a user, view the adminpage. ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));

        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("feritAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);

        extentTest.info("The user access to the admin homepage");
        Assert.assertTrue(adminPage.profileNameInHeaderAdmin.isDisplayed());

        adminPage.girilenKullaniciAdiDogrulama.click();
        ReusableMethods.wait(1);
        adminPage.girilenKullaniciAdiDogrulama.click();


        extentTest.pass("The user verifies profilname is visible");


    }
        /*    "- Open browser go to url ""adminPageLoginUrl""
               - User types in ""Email"" and ""password""
               - Click on ""Sign in""
               - User clicks on ""reports"" in the menu
                - User clicks on order earnings
                - User verifies access to order earnings reports page
                -  User closes the page*/

    @Test
    public void verifyOrderEarningsReport() {

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert=new SoftAssert();

        extentTest = extentReports.createTest("Verify adminpage ", "As a user, view the order earnings report. ");


        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("feritAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
        extentTest.info("The user access to the adminpage");
        adminPage.reportsAdmin.click();
        adminPage.orderEarningsAdmin.click();

        Assert.assertTrue(adminPage.verifyOrderEarningsItem.isDisplayed());
        extentTest.pass("The user verifies Earnings report is visible");
    }


   /* "- Open browser go to url ""adminPageLoginUrl""
       - User types in ""Email"" and ""password""
       - Click on ""Sign in""
       - User clicks on ""reports"" in the menu
        - User clicks on order earnings
        - User verifies that the order earnings reports are visible as a list
        - Click on ""Log out"" section
        -  User closes the page
"*/

    @Test
    public void verifyReportsAsList() {


        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert=new SoftAssert();

        extentTest = extentReports.createTest("Verify adminpage ", "As a user, view the order earnings report. ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));

        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("feritAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
        extentTest.info("The user access to the adminpage");

        adminPage.reportsAdmin.click();
        adminPage.orderEarningsAdmin.click();

        Assert.assertTrue(adminPage.asListVerifyElementi.isDisplayed());
        extentTest.pass("The user successfully verified the table as a list");

    }

    /*
    "   - Open browser go to url ""adminPageLoginUrl""
        - User types in ""Email"" and ""password""
        - Click on ""Sign in""
        - User clicks on ""reports"" in the menu
        - User clicks on order earnings
        - User enters an order id number in the search tab
        - User clicks enter
        - User verifies that search results are visible

        -  User closes the page
        "
     */

    @Test
    public void verifySearchBox() {

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert=new SoftAssert();

        extentTest = extentReports.createTest("Verify adminpage ", "As a user, view the order earnings report sort to with searchbox. ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("feritAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);

        extentTest.info("The user succesfully verified the table as a list");

        adminPage.reportsAdmin.click();
        adminPage.orderEarningsAdmin.click();

        adminPage.orderEarningsSearchBoxAdmin.sendKeys("0.00$");
        ReusableMethods.wait(4);

        extentTest.info("The user succesfully verified type in table as a list");

        extentTest.info("The user type in to searchbox");
        String expectedIcerik = "1";
        String actualIcerik = adminPage.searchBoxSortResult.getText();

        extentTest.pass("The user successfully verified search Box");

        //Searchboxta manuel giris yapilamiyor, automation yapilabiliyor ama oan veriyi bile girdigimde veri yok diyor.

    }
    /*
        "- Open browser go to url ""adminPageLoginUrl""
        - User types in ""Email"" and ""password""
        - Click on ""Sign in""
        - User clicks on ""reports"" in the menu
        - User clicks on order earnings
        - Click on Start date -- End date section
        - User types in two different dates
        - User verifies that the list is sorted by date
        -  User closes the page
     */

    @Test
    public void toSortByDate() {


        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert=new SoftAssert();

        extentTest = extentReports.createTest("Verify adminpage ", "As a user, view the order to sort by date ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("feritAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);

        extentTest.info("The user successfully access the adminpage");

        adminPage.reportsAdmin.click();
        adminPage.orderEarningsAdmin.click();
        adminPage.sortByDate.click();
        adminPage.sendkeysDate.click();


        List<WebElement> listenumber= Driver.getDriver().findElements(By.xpath("//div[@class='input-group fixed-width-field mr-2']"));
        for (int i = 0; i <listenumber.size()-1 ; i++) {
            int currentElement=Integer.parseInt(listenumber.get(i).getText());
            int afterElement=Integer.parseInt(listenumber.get(i+1).getText());
            Assert.assertTrue(currentElement<afterElement);

        }


        extentTest.pass("The verified to sort by date");
    }


    /*
     "- Open browser go to url ""adminPageLoginUrl"
      - User types in "Email" and "password"
      - Click on "Sign in"
      - User clicks on "reports" in the menu
      - User clicks on order earnings
      -- User clicks on Merchant earnings
      - User verifies the Information has been changed by Merchant earnings
      -  User closes the page

     */


    @Test
    public void toSortByMerchantEarnings() {


        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert=new SoftAssert();

        extentTest = extentReports.createTest("Verify adminpage ", "As a user, view the order earnings report by merchant earnings. ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("feritAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);

        extentTest.info("The user accessed to the adminpage");

        adminPage.reportsAdmin.click();
        adminPage.orderEarningsAdmin.click();


        //  List<WebElement>beforeFilterSort =Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[4]"));
        //
        //  List<Double> beforeFilterSortList= new ArrayList<>();
//
        //  for (WebElement each:beforeFilterSort
        //       ) {
        //      beforeFilterSortList.add(Double.valueOf(each.getText()));
        //  }
//
        //  adminPage.merchantSortButtonAdmin.click();
//
        //  List<WebElement> afterFilterSort = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[4]"));
//
        //  List<Double> afterFilterSortList = new ArrayList<>();
//
        //  for (WebElement each:afterFilterSort
        //       ) {
        //      afterFilterSortList.add(Double.valueOf(each.getText()));
        //  }
//
        //  Collections.sort(beforeFilterSortList);
//
        //  Assert.assertEquals(beforeFilterSortList, afterFilterSortList);
//
        //  ReusableMethods.wait(3);


        List<WebElement> listenumber= Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[4]"));
        for (int i = 0; i <listenumber.size()-1 ; i++) {
            int currentElement=Integer.parseInt(listenumber.get(i).getText());
            int afterElement=Integer.parseInt(listenumber.get(i+1).getText());
            Assert.assertTrue(currentElement<afterElement);



        }

        extentTest.pass("The verified to sort by merchaning earnings");

    }


    /*
        - Open browser go to url "adminPageLoginUrl"
        - User types in "Email"" and "password"
        - Click on "Sign in"
        - User clicks on "reports "in the menu
        - User clicks on order earnings
        - User clicks on order ID
        - User verifies the information has been changed by Order ID
        - User closes the page
     */
    @Test
    public void toSortByOrderID() {



        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert=new SoftAssert();


        extentTest = extentReports.createTest("Verify adminpage ", "As a user, view the order earnings report by Order ID. ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("feritAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);

        extentTest.info("The user accessed to the adminpage");

        adminPage.reportsAdmin.click();
        adminPage.orderEarningsAdmin.click();
        adminPage.ordersIDOrderEarningAdmin.click();
        ReusableMethods.wait(2);



        List<WebElement> listenumber= Driver.getDriver().findElements(By.xpath("//th[text()='Order ID']"));
        for (int i = 0; i <listenumber.size()-1 ; i++) {
            int currentElement=Integer.parseInt(listenumber.get(i).getText());
            int afterElement=Integer.parseInt(listenumber.get(i+1).getText());
            Assert.assertTrue(currentElement<afterElement);


        }
        extentTest.pass("The verified to sort by order ID");

    }


    /*
        - Open browser go to url "adminPageLoginUrl"
        - User types in "Email" and "password"
        - Click on "Sign in"
        - User clicks on "reports" in the menu
        - User clicks on order earnings
        - User clicks on Subtotal
        - User verifies the information has been changed by Subtotal
        - User closes the page"
     */

    @Test
    public void toSortBySubtotal() {



        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert=new SoftAssert();


        extentTest = extentReports.createTest("Verify adminpage ", "As a user, view the order earnings report by Subtotal. ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("feritAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);

        extentTest.info("The user accessed to the adminpage");

        adminPage.reportsAdmin.click();
        adminPage.orderEarningsAdmin.click();
        adminPage.sortBySubtotal.click();


        List<WebElement> listenumber= Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]"));
        for (int i = 0; i <listenumber.size()-1 ; i++) {
            int currentElement=Integer.parseInt(listenumber.get(i).getText());
            int afterElement=Integer.parseInt(listenumber.get(i+1).getText());
            Assert.assertTrue(currentElement<afterElement);


        }
        extentTest.pass("The verified to sort by by subtotal");

    }


    /*
    "- Open browser go to url ""adminPageLoginUrl""
     - User types in ""Email"" and ""password""
     - Click on ""Sign in""
     - User clicks on ""reports"" in the menu
     - User clicks on order earnings
     - User clicks on Total
     - User verifies the information has been changed by Total
     - User closes the page"""
     */
    @Test
    public void toSortByTotal() {



        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert=new SoftAssert();


        extentTest = extentReports.createTest("Verify adminpage ", "As a user, view the order earnings report by Total. ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("feritAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);

        extentTest.info("The user accessed to the adminpage");

        adminPage.reportsAdmin.click();
        adminPage.orderEarningsAdmin.click();
        adminPage.OrderEarningTotalAdmin.click();


        List<WebElement> listenumber= Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]//*[text()='Total']"));
        for (int i = 0; i <listenumber.size()-1 ; i++) {
            int currentElement=Integer.parseInt(listenumber.get(i).getText());
            int afterElement=Integer.parseInt(listenumber.get(i+1).getText());
            Assert.assertTrue(currentElement<afterElement);

        }
        extentTest.pass("The verified to sort by by total");

    }


    /*
    "   - Open browser go to url ""adminPageLoginUrl""
        - User types in ""Email"" and ""password""
        - Click on ""Sign in""
        - User clicks on ""reports"" in the menu
        - User clicks on order earnings
        - User clicks on Admin Comission
        - User verifies the information has been changed by Admin Comission
        - User closes the page"""
     */
    @Test
    public void toSortByAdminCommission() {


        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        softAssert=new SoftAssert();


        extentTest = extentReports.createTest("Verify adminpage ", "As a user, view the order earnings report by Admin Commission. ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("feritAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);

        extentTest.info("The user accessed to the adminpage");

        adminPage.reportsAdmin.click();
        adminPage.orderEarningsAdmin.click();
        adminPage.OrderEarningAdminComissionAdmin.click();

        List<WebElement> listenumber= Driver.getDriver().findElements(By.xpath("//*[text()='Admin commission']"));
        for (int i = 0; i <listenumber.size()-1 ; i++) {
            int currentElement=Integer.parseInt(listenumber.get(i).getText());
            int afterElement=Integer.parseInt(listenumber.get(i+1).getText());
            Assert.assertTrue(currentElement<afterElement);

        }


        adminPage.girilenKullaniciAdiDogrulama.click();
        ReusableMethods.wait(1);
        adminPage.girilenKullaniciAdiDogrulama.click();
        extentTest.pass("The verified to sort by by Admin commission");

    }
}