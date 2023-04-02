package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A_homePage.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_001 extends TestBaseRapor {
    HomePage homePage=new HomePage();

    @Test(groups = {"smoke","demo"})
    public void visitorWebSiteIsEnable(){
        homePage=new HomePage();
        extentTest=extentReports.createTest("Verify Visitor Web Site Enable","As a visotor, reach the Home Page");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));

        Assert.assertTrue(homePage.loginVerifiyItemHome.isDisplayed());
        extentTest= extentTest.pass("Accessing the page as a user");


    }

}

