package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.A_homePage.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;

public class US_012 extends TestBaseRapor {
/*
    "- Open ""homePageLoginUrl"" page
    - Enter ""HPemail"" and ""HPPassword""
    - Click on Sign in
    - Verifiy that ""HPintroText"" should be displayed
    - User closes the page"
*/
      HomePage homePage = new HomePage();

    @Test
    public void pozitifLoginTest(){
        homePage = new HomePage();
       extentTest=extentReports.createTest("Verify Home Order page ","As a user, view the orders of my account.");
       ReusableMethods.homePozitifLoginTest();


   }

   @Test(groups = {"end2End","demo"})
    public void localCuisineVisibleTest(){
       homePage = new HomePage();
       extentTest=extentReports.createTest("Verify Home Order page ","As a user, view the orders of my account.");

       Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
       extentTest.info("went to Home Page");

       homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
       homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
       extentTest.info("login to main page");

       homePage.cookiesAcceptHome.click();
       ReusableMethods.wait(1);
       homePage.loginSearchBoxHome.sendKeys("Texas");
       ReusableMethods.wait(1);
       clickWithJS(homePage.addressChoseItem);
       homePage.addressChoseItem.click();
       ReusableMethods.wait(1);
       extentTest.info("address information was entered in the search box and selected");
       ReusableMethods.wait(2);
       Driver.getDriver().navigate().back();
       homePage.americanCuisineHome.isDisplayed();
       extentTest.info("American Cuisine Displayed");

      homePage.americanCuisineHome.isDisplayed();
      extentTest.info("American Cuisine Displayed");
      homePage.mediterraneanCuisineHome.isDisplayed();
      extentTest.info("Mediterranean Cuisine Displayed");
      homePage.sandwichesCuisineHome.isDisplayed();
      extentTest.info("Sandwiches Cuisine Displayed");
      homePage.italianCuisineHome.isDisplayed();
      extentTest.info("Italian Cuisine Displayed");
      homePage.mexicanCuisineHome.isDisplayed();
      extentTest.info("Mexican Cuisine Displayed");
      homePage.burgersCuisineHome.isDisplayed();
      extentTest.info("Burgers Cuisine Displayed");
      homePage.japaneseCuisineHome.isDisplayed();
      extentTest.info("Japanese Cuisine Displayed");
      homePage.thaiCuisineHome.isDisplayed();
      extentTest.info("Thai Cuisine Displayed");
      homePage.dropdownCuisineHome.click();
      homePage.chineseCuisineDropDownHome.isDisplayed();
      extentTest.info("Chinise Cuisine Displayed");
       ReusableMethods.wait(2);
      homePage.kosher.isDisplayed();
      extentTest.info("Kosher Cuisine Displayed");
      ReusableMethods.wait(2);
      homePage.halalCuisineDropDownHome.isDisplayed();
      extentTest.info("Halal Cuisine Displayed");
       ReusableMethods.wait(2);
      homePage.vegetarianCuisineDropDownHome.isDisplayed();
      ReusableMethods.wait(1);
       homePage.profilNameItem.click();
       ReusableMethods.wait(1);
       homePage.logoutButton.click();
      extentTest.pass("Vegetarian Cuisine Displayed");


   }

 }
