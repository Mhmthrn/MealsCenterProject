package pages.B_merchantPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePageMerchant {



    public HomePageMerchant(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    ///////////////////////USER STORY 23 ////////////////////////////////

    @FindBy(xpath = "//div[@class='rounded-status-report rounded r1']")
    public WebElement totalOrdersHomePageMerchant ;

    @FindBy(xpath = "//div[@class='rounded-status-report rounded r2']")
    public WebElement totalCancelHomePageMerchant;

    @FindBy(xpath = "//div[@class='rounded-status-report rounded r3']")
    public WebElement totalRefundHomePageMerchant;

    @FindBy(xpath = "//div[@class='rounded-status-report rounded r4']")
    public WebElement totalSalesHomePageMerchant;

    @FindBy(xpath = "(//h6[@class='m-0 text-muted font-weight-normal'])[1]")
    public WebElement salesThisWeekHomePageMerchant;

    @FindBy(xpath = "(//h6[@class='m-0 text-muted font-weight-normal'])[2]")
    public WebElement earningThisWeekHomePageMerchant;

    @FindBy(xpath = "(//h6[@class='m-0 text-muted font-weight-normal'])[3]")
    public WebElement yourBalanceHomePageMerchant;

    @FindBy(xpath = "(//h5[@class='m-0 text-secondary'])[1]")
    public WebElement orderReceivedHomePageMerchant;

    @FindBy(xpath = "(//h5[@class='m-0 text-secondary'])[2]")
    public WebElement todayDeliveredHomePageMerchant;

    @FindBy(xpath = "(//h5[@class='m-0 text-secondary'])[3]")
    public WebElement todaySalesHomePageMerchant;

    @FindBy(xpath = "(//h5[@class='m-0 text-secondary'])[4]")
    public WebElement todayRefundHomePageMerchant;

    @FindBy(xpath = "(//h5[@class='m-0'])[1]")
    public WebElement lastOrdersHomePageMerchant;

    @FindBy(xpath = "(//h5[@class='m-0'])[2]")
    public WebElement popularItemsHomePageMerchant;

    @FindBy(xpath = "(//h5[@class='m-0 mb-3'])[1]")
    public WebElement salesOverviewHomePageMerchant;

    @FindBy(xpath = "(//h5[@class='m-0 mb-3'])[2]")
    public WebElement topCustomersHomePageMerchant;

    @FindBy(xpath = "(//h5[@class='m-0 mb-3'])[3]")
    public WebElement overviewOfReviewHomePageMerchant;


}
