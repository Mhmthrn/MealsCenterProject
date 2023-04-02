package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.C_adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;

public class US_036 extends TestBaseRapor {


    AdminPage adminPage = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void TC03601Test() {
        extentTest = extentReports.createTest("admin");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(2);
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("tugbaAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"),Keys.ENTER);
        ReusableMethods.wait(2);
        adminPage.kullaniciIsmiAdmin.click();
        adminPage.logOutButtonAdmin.click();


    }

    @Test
    public void TC03602Test() {
        extentTest = extentReports.createTest("admin");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(2);
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("tugbaAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"),Keys.ENTER);
        ReusableMethods.wait(2);

        adminPage.totalSalesElementi.isDisplayed();
        adminPage.totalMerchantElementi.isDisplayed();
        ReusableMethods.wait(2);
        adminPage.totalCommissionElementi.isDisplayed();
        adminPage.totalSubscriptionsElementi.isDisplayed();
        ReusableMethods.wait(2);
        adminPage.commissionThisWeekElementi.isDisplayed();
        adminPage.commissionThisMonthElementi.isDisplayed();
        ReusableMethods.wait(2);
        adminPage.subscriptionsThisMonthElementi.isDisplayed();
        adminPage.orderReceivedElementi.isDisplayed();
        ReusableMethods.wait(2);
        adminPage.todayDeliveredElementi.isDisplayed();
        adminPage.newCustomerElementi.isDisplayed();
        ReusableMethods.wait(2);
        adminPage.totalRefundElementi.isDisplayed();
        adminPage.lastOrdersElementi.isDisplayed();
        ReusableMethods.wait(2);
        adminPage.populerItemsElementi.isDisplayed();
        adminPage.populerMerchantsElementi.isDisplayed();
        ReusableMethods.wait(2);
        adminPage.salesOverviewElementi.isDisplayed();
        adminPage.topCustomersElementi.isDisplayed();
        ReusableMethods.wait(2);
        adminPage.overviewOfReviewElementi.isDisplayed();
        adminPage.recentPayoutElementi.isDisplayed();
        ReusableMethods.wait(2);

    /*
    3601
    - Open browser go to url "adminPageLoginUrl"
- Click "Username" box and send data.
- Click "Password" box and send password.
- Click the "Sign In" button.
- Redirect to admin dashboard page.
- Click on "Log out" section.
- User closes the page.


3602

- Open browser go to url "adminPageLoginUrl"
- Click "Username" box and send data.
- Click "Password" box and send password.
- Click the "Sign In" button.
- Redirect to admin dashboard page.
- Displayed "Total Sales"
- Displayed "Total Merchant"
- Displayed "Total Commission"
- Displayed "Total Subscriptions"
- Displayed "Commission this week"
- Displayed "Commission this month"
- Displayed "Subscriptions this month"
- Displayed "Order received"
- Displayed "Today delivered"
- Displayed "New customer"
- Displayed "Total refund"
- Displayed "Last Orders"
- Displayed "Popular items"
- Displayed "Popular merchants"
- Displayed "Sales overview"
- Displayed "Top Customers"
- Displayed "Overview of Review"
- Displayed "Recent payout"
- Click on "Log out" section.
- User closes the page.
     */
    }
}
