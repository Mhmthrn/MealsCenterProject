package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.C_adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class US_042 extends TestBaseRapor {

        AdminPage adminPage=new AdminPage();

        @Test // 001
        public void dashboardDisplayedVerify(){
            adminPage=new AdminPage();
            extentTest=extentReports.createTest("Verify Admin page ","As a admin, view the dashboard.");

            Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));

            adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("burhanAdminUsername"));
            adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
            extentTest.info("successful login");
            adminPage.totalSalesElementi.isDisplayed();
            adminPage.profileNameInHeaderAdmin.click();
            ReusableMethods.wait(1);
            adminPage.logOutButtonAdmin.click();
            extentTest.pass("Dashboard displayed");
        }

        @Test // 002
        public void reviewsTextView(){
            adminPage=new AdminPage();
            extentTest=extentReports.createTest("Verify Admin page ","As a admin, view the ReviewTextDisplayed.");

            Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
            adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("burhanAdminUsername"));
            adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
            extentTest.info("successful login");
            adminPage.buyersButtonAdmin.click();
            adminPage.reviewsButtonAdmin.click();
            adminPage.reviewsTextAdmin.click();
            adminPage.profileNameInHeaderAdmin.click();
            ReusableMethods.wait(1);
            adminPage.logOutButtonAdmin.click();
            extentTest.pass("reviews page opened");

        }

        @Test // 003
        public void merchantListOrder(){
            adminPage=new AdminPage();
            extentTest=extentReports.createTest("Verify Admin page ","As a admin, view the MerchantListOrder.");

            Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
            adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("burhanAdminUsername"));
            adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
            extentTest.info("successful login");
            adminPage.buyersButtonAdmin.click();
            adminPage.reviewsButtonAdmin.click();
            adminPage.reviewsTextAdmin.isDisplayed();

            ReusableMethods.wait(2);
            String expectedSorting1="Vegan Season";
            String expectedSorting2="Vegan Season";

            String actualSorting1=adminPage.sorting1.getText();
            System.out.println(actualSorting1);
            String actualSorting2=adminPage.sorting2.getText();
            System.out.println(actualSorting2);
            ReusableMethods.wait(2);

            Assert.assertEquals(actualSorting1,expectedSorting1);
            Assert.assertEquals(actualSorting2,expectedSorting2);
            adminPage.profileNameInHeaderAdmin.click();
            ReusableMethods.wait(1);
            adminPage.logOutButtonAdmin.click();
            extentTest.pass("Merchants Reviews list sorted by Name");



        }

        @Test // 004
        public void deleteVerify(){
            adminPage=new AdminPage();
            extentTest=extentReports.createTest("Verify Admin page ","As a admin, view the MerchantListOrder.");

            Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
            adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("burhanAdminUsername"));
            adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
            extentTest.info("successful login");
            adminPage.buyersButtonAdmin.click();
            adminPage.reviewsButtonAdmin.click();
            adminPage.reviewsTextAdmin.isDisplayed();

            ReusableMethods.wait(2);
            String expectedSorting1="Vegan Season";
            String expectedSorting2="Vegan Season";

            String actualSorting1=adminPage.sorting1.getText();
            System.out.println(actualSorting1);
            String actualSorting2=adminPage.sorting2.getText();
            System.out.println(actualSorting2);
            ReusableMethods.wait(2);

            Assert.assertEquals(actualSorting1,expectedSorting1);
            Assert.assertEquals(actualSorting2,expectedSorting2);
            extentTest.pass("Merchants Reviews list sorted by Name");


           adminPage.deleteButtonReviewAdmin.click();
           adminPage.deleteConfirmationButtonAdmin.click();
           adminPage.sorting1.isDisplayed();
            adminPage.profileNameInHeaderAdmin.click();
            ReusableMethods.wait(1);
            adminPage.logOutButtonAdmin.click();
           extentTest.pass("Verify that 'Delete' product is not deleted");



        }

        @Test //005
        public void successfullyUpdate(){
            adminPage=new AdminPage();
            extentTest=extentReports.createTest("Verify Admin page ","As a admin, view 'Successfuly updated'");

            Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
            adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("burhanAdminUsername"));
            adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
            extentTest.info("successful login");
            adminPage.buyersButtonAdmin.click();
            adminPage.reviewsButtonAdmin.click();
            adminPage.reviewsTextAdmin.isDisplayed();
            adminPage.updateButtonAdmin.click();
            adminPage.customerReviewsTextBoxAdmin.clear();
            adminPage.customerReviewsTextBoxAdmin.sendKeys("Super");
            adminPage.customerReviewsRatingBoxAdmin.clear();
            adminPage.customerReviewsRatingBoxAdmin.sendKeys("4.0", Keys.ENTER);
            ReusableMethods.wait(2);
            adminPage.customerReviewsStatusSelectAdmin.click();
            ReusableMethods.wait(2);
            adminPage.customerReviewsStatusSelectPublishbuttonAdmin.click();
            adminPage.customerReviewsStatusSaveButtonAdmin.click();
            adminPage.succesfullyUpdatedTextAdmin.isDisplayed();
            adminPage.profileNameInHeaderAdmin.click();
            ReusableMethods.wait(1);
            adminPage.logOutButtonAdmin.click();
            extentTest.pass("Successfuly updated");



        }

    }

