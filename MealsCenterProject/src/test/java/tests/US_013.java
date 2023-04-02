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

public class US_013 extends TestBaseRapor {
    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void TC_1301(){
        extentTest = extentReports.createTest("HomePage login test", "User can login the website successfully.");
        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());

        //extentTest = extentReports.createTest("Verify Dashboardpage ", "As a user, view the Dashboardpage. ");
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);

        homePage.signInButton.click();
        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHomeAli"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHomeAli"), Keys.ENTER);
        extentTest.info("went to Home Page");

        Assert.assertTrue(homePage.loginVerifiyItemHome.isDisplayed());

        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();

        extentTest.pass("Homepage is visible");





    }
    @Test
    public void TC_1302(){
        homePage=new HomePage();
        actions=new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Order Process Test by user","User give order from mealCenter.And user can follow the order process");

        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("user went to Home Page");

        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);

        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHomeAli"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHomeAli"), Keys.ENTER);
        extentTest.info("login to main page");

        //homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.loginSearchBoxHome.sendKeys("Texas");
        ReusableMethods.wait(1);
        clickWithJS(homePage.addressChoseItem);
        homePage.addressChoseItem.click();
        ReusableMethods.wait(1);
        extentTest.info("address information was entered in the search box and selected");
        ReusableMethods.wait(2);

        //WebElement starbucuk=Driver.getDriver().findElement(By.xpath("(//h5[@class='m-0 text-truncate'])[8]"));
        clickWithJS(homePage.starbucksLocete);
        //starbucuk.click();

        extentTest.info("user can enter restaurant page successfully.");

        //- User  should be able to select any menu from restaurant page.(Kahve)
        homePage.kahveAddToCartTestItem1Home.click();
        ReusableMethods.wait(1);
        homePage.kahveAddToCartTestItem2Home.click();
        ReusableMethods.wait(1);
        //- Verifiy the order oft the summary title.

        String actualText=Driver.getDriver().findElement(By.xpath("//p[@class='mb-1']")).getText();
        String expectedText="Kahve ";

        Assert.assertTrue(actualText.contains(expectedText));
        ReusableMethods.wait(2);
        //- User should be able to click Checkout button.
        homePage.checkOutButtonHome.click();
        //-User closes the page
        ReusableMethods.wait(4);
        clickWithJS(homePage.profilNameItem);
        ReusableMethods.wait(4);
        clickWithJS(homePage.logoutButton);

        extentTest.pass("user can follow the order process successfully with this test.");
    }


    @Test(groups = {"smoke","end2end"})
    public void TC_1303(){
        homePage=new HomePage();
        actions=new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("Successful order test.","user can order from mealsCenter successfuly");

        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("user went to Home Page");

        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);

        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHomeAli"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHomeAli"), Keys.ENTER);
        extentTest.info("login to main page");

        //homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.loginSearchBoxHome.sendKeys("Texas");
        ReusableMethods.wait(1);
        clickWithJS(homePage.addressChoseItem);
        homePage.addressChoseItem.click();
        ReusableMethods.wait(1);
        extentTest.info("address information was entered in the search box and selected");
        ReusableMethods.wait(2);

        //WebElement starbucuk=Driver.getDriver().findElement(By.xpath("(//h5[@class='m-0 text-truncate'])[8]"));
        clickWithJS(homePage.starbucksLocete);
        //starbucuk.click();
        extentTest.info("user can enter restaurant page successfully.");

        homePage.kahveAddToCartTestItem1Home.click();
        ReusableMethods.wait(1);
        homePage.kahveAddToCartTestItem2Home.click();
        ReusableMethods.wait(1);
        homePage.checkOutButtonHome.click();
        ReusableMethods.wait(2);
        extentTest.info("user can give order successfully.");

        //actions.scrollToElement(homePage.cashOnDelivery).perform();
        ReusableMethods.wait(3);
        extentTest.info("address information was not entered because it was entered on the homepage.");

        clickWithJS(homePage.cashOnDelivery);
        ReusableMethods.wait(1);
        clickWithJS(homePage.cashOnDeliveryPaymetOption);
        extentTest.info("user's payment decision has been accepted");

        clickWithJS(homePage.placeOrder);
        ReusableMethods.wait(2);
        extentTest.info("user's order has been accepted");

        String actualText=homePage.confirmingYourOrderTextHomePage.getText();
        String expectedText="Confirming your order";
        ReusableMethods.wait(5);
        Assert.assertTrue(actualText.contains(expectedText));
        ReusableMethods.wait(4);
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();

        extentTest.pass("CUSTOMER CAN GIVE ORDER FROM MEAL CENTER");


    }
}
