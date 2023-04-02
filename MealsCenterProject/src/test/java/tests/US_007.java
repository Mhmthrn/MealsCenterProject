package tests;

import org.openqa.selenium.By;
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

public class US_007 extends TestBaseRapor {
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void TC_0701contactUsVisibleTest() {
        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("Verify ContactUs  page ", "As a visitor, view the contact us page.");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        extentTest.info("went to Home Page");

        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(1);
        clickWithJS(homePage.contaktUsButton);
        extentTest.info("clicked contactus button");

        String expectedInfo = "contact";
        String actualInfo = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualInfo.contains(expectedInfo));
        extentTest.pass("contactus page is visible");


    }

    @Test(groups = {"smoke","demo"})
    public void TC_0702Test() {
        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("Verify ContactUs  page ", "As a visitor, view the contact us page.");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        extentTest.info("went to Home Page");


        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(2);
        clickWithJS(homePage.contaktUsButton);
        extentTest.info("clicked contactus button");


        clickWithJS(homePage.fullNameTextBox1);
        ReusableMethods.wait(3);
        homePage.usernameHome.sendKeys(ConfigReader.getProperty("Fullname"));
        clickWithJS(homePage.fullNameTextBox2);
        ReusableMethods.wait(3);
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("EmailAddress"),Keys.ENTER);

        ReusableMethods.wait(3);
        extentTest.info("login to main page");
        ReusableMethods.wait(4);

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[@class ='alert alert-success']")).isDisplayed());

        ReusableMethods.wait(1);
        extentTest.pass("Homepage is visible");

    }


    @Test
    public void TC_0703Test() {
        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("Verify ContactUs  page ", "As a visitor, view the contact us page.");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        extentTest.info("went to Home Page");


        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(2);
        clickWithJS(homePage.contaktUsButton);
        extentTest.info("clicked contactus button");

        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        ReusableMethods.wait(3);
        extentTest.info("login to main page");
        ReusableMethods.wait(4);

        ReusableMethods.wait(1);
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("Homepage is visible");



    }
}
