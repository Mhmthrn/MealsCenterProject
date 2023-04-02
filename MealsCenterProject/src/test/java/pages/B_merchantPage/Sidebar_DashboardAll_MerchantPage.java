package pages.B_merchantPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Sidebar_DashboardAll_MerchantPage {

    public Sidebar_DashboardAll_MerchantPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //  Merchant page deki dashbord yazisi
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardTextMerchant;

    // Merchant page deki sidebar Merchant link under dashboard
    @FindBy(xpath = "//a[text()='Merchant']")
    public WebElement merchantLinkMerchant;

    // Merchant page deki sidebar Orders link under dashboard
    @FindBy(xpath = "//a[text()='Orders']")
    public WebElement ordersLinkMerchant;

    // Merchant page deki sidebar Attributes link under dashboard
    @FindBy(xpath = "//a[text()='Attributes']")
    public WebElement attributesLinkMerchant;

    // Merchant page deki sidebar Food link under dashboard
    @FindBy(xpath = "//a[text()='Food']")
    public WebElement foodLinkMerchant;


    //====================== User story 24 ======================//

    //Merchant page Sidebar da ki Food buttonun altinda ki Category buttonu
    @FindBy(xpath = "//li[@class='position-relative food_category active']")
    public WebElement foodCategoryButtonMerchant;

    // Category List de ki Ilk Category i gosteririr
    @FindBy(xpath = " (//td[@class='sorting_1'])[1]")
    public WebElement categoriListIlkUrunButtonMerchant;

    //Merchant page Sidebar da ki Food > Category > Add new buttonu
    @FindBy(xpath = "//a[@class='btn btn-black btn-circle']")
    public WebElement foodCategoryAddNewButtonMerchant;

    //Add new butonuna tikladiktan sonra gelen sayfa da All Category>> Add Category > Name
    @FindBy(xpath = "//label[@for='AR_category_category_name']")
    public WebElement addCategoryNameButtonMerchant;

    //All Category>> Add Category >Description
    @FindBy(xpath = "//textarea[@class='form-control form-control-text']")
    public WebElement addCategoryDescriptionButtonMerchant;

    //All Category>> Add Category >Featured Image > Browse
    @FindBy(xpath = "(//button[@class='btn btn-info'])[1]")
    public WebElement addCategoryFeaturedImageBrowseButtonMerchant;

    //All Category>> Add Category >Featured Image > Browse> Select File
    @FindBy(xpath = "(//img[@src='https://qa.mealscenter.com/backoffice/../upload/11/2862e3d8-c101-11ed-ac97-2cea7f508bb0.jpeg'])[1]")
    public WebElement addCategoryFeaturedImageBrowseSelectFileButtonMerchant;

    //All Category>> Add Category >Featured Image > Browse > Add Files button
    @FindBy(xpath = "(//button[@class='btn btn-green'])[2]")
    public WebElement addCategoryFeaturedImageBrowseAddFilesButtonMerchant;

    //All Category>> Add Category >Featured Image > Browse > Upload new button
    @FindBy(xpath = "(//a[@class='nav-link active'])[1]")
    public WebElement addCategoryFeaturedImageBrowseUploadNewButtonMerchant;

    //All Category>> Add Category >Featured Image > Browse > Upload new > Select Files Button
    @FindBy(xpath = "(//a[@class='btn btn-green fileinput-button dz-clickable'])[1]")
    public WebElement addCategoryFeaturedImageBrowseUploadNewSelectFilesButtonMerchant;

    //All Category>> Add Category >Featured Image > Browse > Upload new > Add Files Button
    @FindBy(xpath = "(//span[@class='label'])[1]")
    public WebElement addCategoryFeaturedImageBrowseUploadNewAddFilesButtonMerchant;

    //All Category>> Add Category >Icon Image > Browse> Select File
    @FindBy(xpath = "(//img[@src='https://qa.mealscenter.com/backoffice/../upload/11/2862e3d8-c101-11ed-ac97-2cea7f508bb0.jpeg'])[2]")
    public WebElement addCategoryIconImageBrowseSelectFileButtonMerchant;

    //All Category>> Add Category >Icon Image > Browse > Add Files button
    @FindBy(xpath = "(//button[@class='btn btn-green'])[3]")
    public WebElement addCategoryIconImageBrowseAddFilesButtonMerchant;

    //All Category>> Add Category > Icon Image > Browse
    @FindBy(xpath = "(//button[@class='btn btn-info'])[2]")
    public WebElement addCategoryIconImageBrowseButtonMerchant;

    //All Category>> Add Category >Icon Image > Browse > Upload new button
    @FindBy(xpath = "(//a[@class='nav-link active'])[2]")
    public WebElement addCategoryIconImageBrowseUploadNewButtonMerchant;

    //All Category>> Add Category >Icon Image > Browse > Upload new > Select Files Button
    @FindBy(xpath = "(//a[@class='btn btn-green fileinput-button dz-clickable'])[2]")
    public WebElement addCategoryIconImageBrowseUploadNewSelectFilesButtonMerchant;

    //All Category>> Add Category >Icon Image > Browse > Upload new > Add Files Button
    @FindBy(xpath = "(//span[@class='label'])[2]")
    public WebElement addCategoryIconImageBrowseUploadNewAddFilesButtonMerchant;

    //All Category>> Add Category > Dish
    @FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
    public WebElement addCategoryDishButtonMerchant;

    //All Category>> Add Category > Dish > Meals
    @FindBy(xpath = "//li[@class='select2-selection__choice']")
    public WebElement addCategoryDishMealsButtonMerchant;

    //All Category>> Add Category > Status
    @FindBy(xpath = "//select[@class='form-control custom-select form-control-select']")
    public WebElement addCategoryStatusButtonMerchant;

    //All Category>> Add Category > Save
    @FindBy(xpath = "//input[@class='btn btn-green btn-full mt-3']")
    public WebElement addCategorySaveButtonMerchant;

    // Category List > Update Icon

    // Asagida ki locate listede ki ilk urunu update kacinci satirda ki urun update edilmek isteniyorsa
    // satir sayisi 1 nolu yere yazilmali. Her yeni kategori olusturdukca liste sirasi guncelleniyor
    // Ama zaten bug var update edilemiyor

    @FindBy(xpath = "(//i[@class='zmdi zmdi-border-color'])[1]")
    public WebElement updateIconButtonMerchant;

    //Category List > Delete

    // Asagida ki locate listede ki ilk urunu siler kacinci satirda ki urun silinmek isteniyorsa
    // satir sayisi 1 nolu yere yazilmali. Her yeni kategori olusturdukca liste sirasi guncelleniyor
    // kisacasi kontrol etmek gerekiyor :))

    @FindBy(xpath = "(//i[@class='zmdi zmdi-delete'])[1]")
    public WebElement categoryListDeleteButtonMerchant;

    // Category List > Delete > Tekrar Delete
    @FindBy(xpath = "//a[@class='btn btn-green item_delete']")
    public WebElement tekrarDeleteButtonMerchant;

    // Category List Sayfa Basligi
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement categoriListTitleButtonMerchant;

    // Merchant page deki sidebar Order Type link under dashboard
    @FindBy(xpath = "//a[text()='Order Type']")
    public WebElement orderTypeLinkMerchant;

    //User Story 34
    //Delivery item link (Order Type in altında) Merchant page
    @FindBy(xpath = "//a[text()='Delivery']")
    public WebElement deliveryItemLinkMerchant;

    //Settings butonu delivery deki (Edit yapılabileceğine dair) Merchant page
    @FindBy(xpath = "(//*[text()='Settings'])[5]")
    public WebElement deliverySettingsButtonMerchant;

    //Delivery charge type (Select kullanılmalı) delivery settings Merchant page
    @FindBy(id = "AR_option_merchant_delivery_charges_type")
    public WebElement deliveryChargeTypeMerchant;

    //Service fee textbox delivery settings deki Merchant page
    @FindBy(id = "AR_option_merchant_service_fee")
    public WebElement deliveryServiceFeeTextboxMerchant;

    //Save button delivery settings için Merchant page
    @FindBy(xpath = "//input[@value='Save']")
    public WebElement deliverySaveButtonMerchant;

    //Settings saved yazisi testi delivery settings Merchant page
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement deliverySettingsSavedText;

    // Merchant page deki sidebar Payment gateway  link under dashboard
    @FindBy(xpath = "//a[text()='Payment gateway']")
    public WebElement paymentGatewayLinkMerchant;

    // Merchant page deki sidebar Promo link under dashboard
    @FindBy(xpath = "//a[text()='Promo']")
    public WebElement promoLinkMerchant;

    //Coupon item link Merchant page
    @FindBy(xpath = "//a[text()='Coupon']")
    public WebElement couponItemLinkMerchant;

    //Coupon list yazisi Merchant page
    @FindBy(xpath = "//h5[text()='Coupon list']")
    public WebElement couponListTextMerchant;

    //Add new + butonu Merchant page
    @FindBy(xpath = "//i[@class='zmdi zmdi-plus']")
    public WebElement addNewPlusButtonMerchant;

    //Add Coupon yazisi Merchant page
    @FindBy(xpath = "//span[text()='Add Coupon']")
    public WebElement addCouponTextMerchant;

    //Coupon name textbox Merchant page
    @FindBy(id = "AR_voucher_voucher_name")
    public WebElement couponNameTextboxMerchant;

    //Coupon type seçme(Select kullanarak) Merchant page
    @FindBy(id = "AR_voucher_voucher_type")
    public WebElement couponTypeMerchant;

    //Amount textbox Merchant page
    @FindBy(id = "AR_voucher_amount")
    public WebElement amountTextboxMerchant;

    //Min order textbox Merchant page
    @FindBy(id = "AR_voucher_min_order")
    public WebElement minOrderTextboxMerchant;

    //Days Available textbox (select kullanılmalı) Merchant page
    @FindBy(id = "select2-data-1-6sjt")
    public WebElement daysAvailableTextboxMerchant;

    //Expiration textbox(tarih seçme) Merchant page
    @FindBy(id = "AR_voucher_expiration")
    public WebElement expirationTextboxMerchant;

    //Coupon options(Select) Merchant page
    @FindBy(id = "AR_voucher_expiration")
    public WebElement couponOptionsMerchant;

    //Status textbox(Select) Merchant page
    @FindBy(id = "AR_voucher_status")
    public WebElement statusTextboxMerchant;

    //Coupon Save button Merchant page
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement couponSaveButtonMerchant;

    //Coupon list page görünürlük(coupon ismine göre düzenlenmeli) Merchant page
    @FindBy(xpath = "//h6[text()='COUPON NAME']")
    public WebElement couponListPageMerchant;

    // Merchant page deki sidebar Images link under dashboard
    @FindBy(xpath = "//a[text()='Images']")
    public WebElement imagesLinkMerchant;

    // Merchant page deki sidebar Account link under dashboard
    @FindBy(xpath = "//a[text()='Account']")
    public WebElement accountLinkMerchant;

    // Merchant page deki sidebar Buyers link under dashboard
    @FindBy(xpath = "//a[text()='Buyers']")
    public WebElement buyersLinkMerchant;

    // Merchant page deki sidebar Users  link under dashboard
    @FindBy(xpath = "//a[text()='Users']")
    public WebElement usersLinkMerchant;

    // Merchant page deki sidebar Reports link under dashboard
    @FindBy(xpath = "//a[text()='Reports']")
    public WebElement reportsLinkMerchant;

    // Merchant page deki sidebar Inventory Management link under dashboard
    @FindBy(xpath = "//a[text()='Inventory Management']")
    public WebElement inventoryManagementLinkMerchant;


    //*********************US26*************************************
    // Zaten mevcut oldugundan tekraren yazilmamistir.

    //Click catagory
    @FindBy(xpath = "//a[@href='/backoffice/food/category']")
    public WebElement categoryMerchant;

    //user click add a new
    @FindBy(xpath = "//i[@class='zmdi zmdi-check-circle']")
    public WebElement addMerchand;

    // all category name
    @FindBy(xpath = "//label[@for='AR_category_category_name']")
    public WebElement categoryName;

    //all category Description
    @FindBy(xpath = "//textarea[@class='form-control form-control-text']")
    public WebElement categoryDescription;

    //browse
    @FindBy(xpath = "(//button[text()='Browse'])[1]")
    public WebElement browse;

    //all category featured image
    @FindBy(xpath = "(//button[text()='Browse'])[2]")
    public WebElement featuredImage;

    // all category dish
    @FindBy(xpath = "//h6[@class='mb-3 mt-4']")
    public WebElement categorydish;

    //all category dish button
    @FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
    public WebElement categoryButton;

    //all category status
    @FindBy(xpath = "//select[@class='form-control custom-select form-control-select select_two select2-hidden-accessible']")
    public WebElement categoryStatus;

    //all category click save
    @FindBy(xpath = "//input[@class='btn btn-green btn-full mt-3']")
    public WebElement categorySave;

    //user click delete
    @FindBy(xpath = "//i[@class='zmdi zmdi-delete']")
    public WebElement categoryDelete;

    //click delete again
    @FindBy(xpath = "//a[@class='btn btn-green item_delete']")
    public WebElement deleteagain;


//***********************************US 28*********************************

    // Merchantla ilgili olmadigindan, Home Page sayfasi ile ilgili oldugundan bir kismi karartilmistir.

    // Home Page Sign In butonu
    @FindBy(xpath = "//a[text()='Sign in']")
    public WebElement signInButton;

    // Home Page Mobile number or email textBox
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement mobileNumberEmailTextBox;

    // Home Page Password textBox
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement passwordTextBox;

    //homepage search box
    @FindBy(xpath = "//input[@class='form-control form-control-text']")
    public WebElement searchBoxHP;

    //choose location
    @FindBy(xpath = "//span[@class='d-inline text-truncate']")
    public WebElement locationHP;


    // Click Starbucks
    @FindBy(xpath = "//img[@src='https://qa.mealscenter.com/upload/all/31ecec3d-c0fe-11ed-ac97-2cea7f508bb0.webp']")
    public WebElement starBucks;

    //click on the orders

    @FindBy(linkText = "Orders")
    public WebElement clickOrders;

    //new ordes starbucks
    @FindBy(xpath = "//a[@href='/backoffice/orders/new']")
    public WebElement neworders;


    //Dashboard orders new ordered (yeni ürünün görüntülenip görüntülenmediği)
    @FindBy(xpath = "//span[text()='new']")
    public WebElement newOrdersVerify;

    //New Order item linki (sidebardaki Orders item linkinin altındaki) Merchant page
    @FindBy(xpath = "(//div[@class='row align-items-start'])[1]")
    public WebElement newOrdersItem;

    // Accepted link (Satın alınan ürünü onaylama)New Order daki Merchant page
    @FindBy(xpath = "//span[text()='Accepted']")
    public WebElement newOrdersAccepted;

    //Order Processing link (sidebardaki Orders item linkinin altındaki) Merchant page
    @FindBy(xpath = "//a[text()='Orders Processing']")
    public WebElement OrderProcessing;


    //Ready for pickup link (Order Processing teki) Merchant page
    @FindBy(xpath = "//span[text()='Ready for pickup']")
    public WebElement pickUpLink;

    //Ürün onaylandıktan sonra Order Processing te olmadığına dair Merchant page (düzenleme gerektirir)
    @FindBy(xpath = "//b[text()='SİPARİŞİ VEREN ÜYENİN ADI SOYADI']")
    public WebElement orderProceccingOlmadiginadair;

    //Orders Ready link (sidebardaki Orders item linkinin altındaki) Merchant page
    @FindBy(xpath = "//a[text()='Orders Ready']")
    public WebElement readyLink;

    // Orders Ready sayfasında ürünün görüntülendiğine dair Merchant page
    @FindBy(xpath = "//div[@class='ronded-green']")
    public WebElement ordersReadyVerify;

    //MerchantPage verilen siparisi kontrol etmek icin Sol sidebar da bulunan Complated Butonu
    @FindBy(linkText = "Completed")
    public WebElement completedMerchantPage;

    @FindBy(xpath = "//span[text()='Delivery']")
    public WebElement deliveryHomePage;

    @FindBy(xpath = "//input[@value='schedule']")
    public WebElement scheduleHomePage;

    @FindBy(xpath = "//select[@class='form-control custom-select mb-3']")
    public WebElement getScheduleDayHomePage;

    @FindBy(id = "delivery_time")
    public WebElement deliveryTimeHomePage;

    @FindBy(xpath = "(//button[@class='btn btn-green w-100'])[2]")
    public WebElement saveHomePage;

    @FindBy(linkText = "Scheduled")
    public WebElement scheduledMerchantPage;

    //MerchantPage Dashboard altinda bulunan All Orders e erismek icin
    @FindBy(linkText = "All Orders")
    public WebElement allOrdersMerchantPage;

    //user story 29 icin Completed sayfasinda "DELIVERED" button locate.
    @FindBy(xpath = "//button[@class='btn-yellow btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement aliDeliveredButtonInOrdersReadyMerchant;
    @FindBy(xpath = "(//h5[@class='m-0'])[3]")
    public WebElement aliCompletedPageOrderNumberTextMerchant;
    //competed Today page "how to manage order" button locate
    @FindBy(xpath = "(//p[@class='m-0'])[3]")
    public WebElement howToManageOrderButtonMerchant;
    ////competed Today page search box locati.burada order numarasi veya musteri ismiyle siparis aramasi test edilir.
    @FindBy(xpath = "//input[@class='form-control py-2 border-right-0 border']")
    public WebElement competedPagedekiSearchboxMerchant;
    //completed sayfasinin sap tarafinda bulunan drop down menu locati;
    @FindBy(id = "dropdownMenuLink")
    public WebElement completedTodayPageDdmButtonMErchant;
    //completed today page Print button text
    @FindBy(xpath = "//button[@class='btn btn-black normal']")
    public WebElement completedTodayPagePrintButtonMerchant;
    ////completed today page Sort button
    @FindBy(xpath = "(//button[@class='btn dropdown-toggle bs-placeholder btn-light'])[3]")
    public WebElement completedTodayPageSortButtonMerchant;
    ////completed today page Sort > Descendingbutton
    @FindBy(xpath = "//span[text()='Order ID - Descending']")
    public WebElement orderIdDesvendingCompletedTodayMerchant;
    //completed Today pageinde customerin toplam siparis bilgilerini gosteren button.
    @FindBy(xpath = "//a[@class='link']")
    public WebElement orderSayisiniVerenButtonMerchant;
    //completed today sayfasindaki Get direction butonu;
    @FindBy(xpath = "//u[text()='Get direction']")
    public WebElement getDirectionButtonMerchant;
    //completed today sayfasindaki odrderTypeButonu;
    @FindBy(xpath = "//div[text()='Order type']")
    public WebElement orderTypeButtonAliMerchant;
    //completed today sayfasindaki payment status Butonu;
    @FindBy(xpath = "//div[text()='Payment status']")
    public WebElement paymentStatusbuttonMerchant;

    @FindBy(xpath = "//i[@class='zmdi zmdi-search']")
    public WebElement completedTodaybuyutecButonuMerchant ;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement couponListSearchBoxMerchant;





    //Add new butonuna tikladiktan sonra gelen sayfa da All Category>> Add Category > Name
    //Ustteki locate calismadi.

    @FindBy(id="AR_category_category_name")
    public WebElement catname;

    //All Category>> Add Category > save>Succsefyly Created
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement succesfullyCreated;



    //logout buton merchant
    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement logoutMerchant;






}
