package pages.C_adminPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {


    public AdminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Admin page login ve admin anasayfa locateleri

    //Admin page username
    @FindBy(id = "LoginForm_username")
    public WebElement adminPageUserName;

    // Admin page password
    @FindBy(id = "LoginForm_password")
    public WebElement adminPagePassword;

    // Admin page Sign in buttonu
    @FindBy(id = "//input[@class='btn btn-green btn-full']")
    public WebElement adminPageSignInButton;

    // Girilen kullanici adinin sag ustte ciktigini dogrular
    @FindBy(xpath = "(//a[@class='btn btn-sm dropdown-toggle text-truncate'])[1]")
    public WebElement girilenKullaniciAdiDogrulama;

    // Logout butonu
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement LogoutButton;

    // Username ya da sifrenin yanlis girilmesinden dolayi goruntulenen hata mesaji //div[@class='row text-left']
    @FindBy(xpath = "//div[@class='errorMessage']")
    public WebElement errorMessage;

    // US36
    // Admin page'e giris yapilinca dashboard sayfasindaki total Sales elementi
    @FindBy(xpath = "//div[@class='rounded-status-report rounded r1']")
    public WebElement totalSalesElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki total Merchant elementi
    @FindBy(xpath = "//div[@class='rounded-status-report rounded r2']")
    public WebElement totalMerchantElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki total commission elementi
    @FindBy(xpath = "//div[@class='rounded-status-report rounded r3']")
    public WebElement totalCommissionElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki total Subscriptions elementi
    @FindBy(xpath = "//div[@class='rounded-status-report rounded r4']")
    public WebElement totalSubscriptionsElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki commission this week elementi
    @FindBy(xpath = "//h6[text()='Commission this week']")
    public WebElement commissionThisWeekElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki commission this month elementi
    @FindBy(xpath = "//h6[text()='Commission this month']")
    public WebElement commissionThisMonthElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki Subscriptions this month elementi
    @FindBy(xpath = "//h6[text()='Subscriptions this month']")
    public WebElement subscriptionsThisMonthElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki Order Received elementi
    @FindBy(xpath = " (//div[@class='col mb-2 mb-xl-0'])[1]")
    public WebElement orderReceivedElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki Today Delivered Elementi
    @FindBy(xpath = " (//div[@class='col mb-2 mb-xl-0'])[2]")
    public WebElement todayDeliveredElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki New Customer elementi
    @FindBy(xpath = " (//div[@class='col mb-2 mb-xl-0'])[3]")
    public WebElement newCustomerElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki Total Refund elementi
    @FindBy(xpath = " (//div[@class='col mb-2 mb-xl-0'])[4]")
    public WebElement totalRefundElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki Last Orders elementi
    @FindBy(xpath = "(//h5[@class='m-0'])[1]")
    public WebElement lastOrdersElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki Populer Items elementi
    @FindBy(xpath = "(//h5[@class='m-0'])[2]")
    public WebElement populerItemsElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki Populer Merchants elementi
    @FindBy(xpath = "(//h5[@class='m-0'])[3]")
    public WebElement populerMerchantsElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki Sales Overview elementi
    @FindBy(xpath = "(//h5[@class='m-0 mb-3'])[1]")
    public WebElement salesOverviewElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki Top Customers elementi
    @FindBy(xpath = "(//h5[@class='m-0 mb-3'])[2]")
    public WebElement topCustomersElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki Overview of Review elementi
    @FindBy(xpath = "(//h5[@class='m-0 mb-3'])[3]")
    public WebElement overviewOfReviewElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki Recent Payout elementi
    @FindBy(xpath = "(//h5[@class='m-0 mb-3'])[4]")
    public WebElement recentPayoutElementi;

    //US 37
    // Admin page'e giris yapilinca side barda dashboard altindaki merchant elementi
    @FindBy(xpath = "//li[@class='merchant']")
    public WebElement merchantElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki dasboradin altindaki merchant'in altindaki list elementi
    @FindBy(xpath = "//li[@class='position-relative vendor_list']")
    public WebElement listElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki dasboradin altindaki merchant'in altindaki list'in altindaki All Merchant elementi
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement allMerchantElementi;

    // Admin page'e giris yapilinca dashboard sayfasindaki dasboradin altindaki
    // merchant'in altindaki list'in altindaki All Merchant sayfasindaki ilk urun edit elementi
    @FindBy(xpath = " (//i[@class='zmdi zmdi-border-color'])[1]")
    public WebElement ilkUrunEditElementi;

    //US38
    // admin page deki order buttonunun locate i
    @FindBy(xpath = "//li[@class='admin_orders']")
    public WebElement ordersButtonAdmin;

    // admin page deki order ii icersindeki allOrderButton locate i
    @FindBy(xpath = "//li[@class='position-relative order_list']")
    public WebElement allOrdersButtonAdmin;

    // admin page > all orders sayfasi startDate-end date locate i
    @FindBy(xpath = "//input[@class='form-control py-2 border-right-0 border']")
    public WebElement dateSearchBoxAdmin;

    // admin page > all orders sayfasi startDate-end date> last 7 days  butonu locate i
    @FindBy(xpath = "//li[@data-range-key='Last 7 Days']")
    public WebElement last7DaysButtonAdmin;

    // admin page > all orders sayfasi Order ID button locati
    @FindBy(xpath = "//th[@class='sorting sorting_asc']")
    public WebElement orderIdAdmin;

    // admin page > all orders sayfasi ilk orderin eyes icon locati
    @FindBy(xpath = "(//a[@class='ref_view_order normal btn btn-light tool_tips'])[1]")
    public WebElement eyesIconAdmin;

    // admin page > all orders > order details print buttonunun locati
    @FindBy(xpath = "//button[@class='btn btn-black normal']")
    public WebElement printButtonAdmin;

    // admin page deki order buttonunun locati
    @FindBy(xpath = "//li[@class='admin_orders']")
    public WebElement Admin;

    //US40
    // AdminPage Promo
    @FindBy(xpath = "//*[@class='promo']")
    public WebElement promoAdmin ;

    //AdminPage Coupun button
    @FindBy(xpath = "//*[@class='position-relative promo_coupon'] ")
    public WebElement couponAdmin ;

    //AdminPage name button
    @FindBy(xpath = "//*[@class='sorting sorting_asc']")
    public WebElement nameButtonAdmin;

    //AdminPage Coupon add+new buttonu
    @FindBy(xpath = "//*[@class='zmdi zmdi-plus']")
    public WebElement addnewButtonAdmin;

    //AdminPage Coupon Name
    @FindBy(xpath ="//input[@id='AR_voucher_voucher_name']")
    public WebElement CouponNameAdmin ;

    //AdminPage fixedAmount (Coupon Type)
    @FindBy(xpath = "(//*[@class='mb-4 mt-4'])[1]")
    public WebElement fixedAmountAdmin;

    //AdminPage Amount
    @FindBy(xpath = "//input[@id='AR_voucher_amount']")
    public WebElement amountAdmin;

    //AdminPage min order
    @FindBy(xpath = "//input[@id='AR_voucher_min_order']")
    public WebElement minorderAdmin;

    //AdminPage days available
    @FindBy(xpath = "(//span[@class='select2-selection select2-selection--multiple'])[1]")
    public WebElement daysavailableAdmin;

    //AdminPage Sunday
    @FindBy(xpath = "//span[@id='select2-AR_voucher_days_available-container-choice-oknc-sunday']")
    public WebElement sundayAdmin;

    //AdminPage expiration
    @FindBy(xpath = "//input[@class='form-control form-control-text datepick']")
    public WebElement expirationAdmin;

    //AdminPage Applicable to merchant
    @FindBy(xpath = "(//span[@class='select2-selection select2-selection--multiple'])[1]")
    public WebElement ApplicableToMerchantAdmin ;

    //AdminPage Applicable to merchant choose Starbucks
    @FindBy(xpath = "//span[@id='select2-AR_voucher_apply_to_merchant-container-choice-3xya-11']")
    public WebElement chooseStarbucksAdmin;

    //AdminPage Coupon Options
    @FindBy(xpath = "//*[@class='form-control custom-select form-control-select coupon_options']")
    public WebElement CouponOptionsAdmin ;

    //AdminPage status
    @FindBy(xpath = "(//*[@class='form-control custom-select form-control-select'])[2]")
    public WebElement statusbuttonAdmin;

    //AdminPage Coupun ekleme Save buttonu
    @FindBy(xpath = "//input[@class='btn btn-green btn-full mt-3']")
    public WebElement couponSaveButtonAdmin;

    //AdminPage ProfilName
    @FindBy(xpath = "(//*[@class='btn btn-sm dropdown-toggle text-truncate'])[1]")
    public WebElement profilNameAdmin ;

    //AdminPage Profil
    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement profilButtonAdmin ;

    //AdminPage Logout
    @FindBy(xpath = "(//*[@id=\"desktop-top-menu\"]/div[2]/div/div/div[3]/div/div/a[2]")
    public WebElement logoutButtonAdmin ;

    //AdminPage Coupon List
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement couponListAdmin ;

    //AdminPage CouponList duzenleme(uptade/edit) (birinci isim)
    @FindBy(xpath = "(//a[@class='btn btn-light tool_tips'])[1]")
    public WebElement CouponListEditAdmin ;

    //AdminPage CouponList silme(delete) (birinci isim)
    @FindBy(xpath = "(//a[@class='btn btn-light datatables_delete tool_tips'])[1]")
    public WebElement CouponListDeleteAdmin;

    //AdminPage CouponList aramakutusu (searchbox)
    @FindBy(xpath = "//input[@class='form-control rounded search w-25']")
    public WebElement CouponListSearchBoxAdmin ;

    //AdminPage CouponList aramakutusu tiklama
    @FindBy(xpath = "//i[@class='zmdi zmdi-search']")
    public WebElement CouponListSearchBoxClickAdmin;

    //US_41
    //AdminPage Buyers butonu
    @FindBy(xpath = "//*[@id=\"yw0\"]/li[6]/a")
    public WebElement buyersAdmin ;

    //AdminPage customers butonu
    @FindBy(xpath = "//li[@class='position-relative buyer_customers']")
    public WebElement customersAdmin ;

    //AdminPage Customer yeni musteri ekleme(add new)
    @FindBy(xpath = "(//div[@class='p-2'])[1]")
    public WebElement customeraddAdmin ;

    //AdminPage Customer eklemek icin first name
    @FindBy(id="AR_client_first_name")
    public WebElement customerFirstNameAdmin ;

    //AdminPage Customer eklemek icin last name
    @FindBy(id = "AR_client_last_name")
    public WebElement customerLastNameAdmin ;

    //AdminPage Customer eklemek icin mail adres
    @FindBy(id = "AR_client_email_address")
    public WebElement customerMailAdresAdmin ;

    //AdminPage Customer eklemek icin sifre
    @FindBy(id = "AR_client_npassword")
    public WebElement customerpasswordAdmin ;

    //AdminPage Customer eklemek icin iletisim  no
    @FindBy(id= "AR_client_contact_phone")
    public WebElement contactphoneAdmin ;

    //AdminPage Customer eklemek icin tekrar sifre
    @FindBy(id = "AR_client_cpassword")
    public WebElement confirmpasswordAdmin ;

    //AdminPage Customer eklemek icin status aktif
    @FindBy(xpath = "//*[@id='AR_client_status']")
    public WebElement statusaktivedAdmin ;

    //AdminPage Customer eklemek icin kaydetmek tusu (Save)
    @FindBy(xpath = "//input[@class='btn btn-green btn-full mt-3']")
    public WebElement CustomerSavedAdmin ;

    //AdminPage Customer duzenlemek icin FirstName
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement editfirstnameAdmin;

    //AdminPage Customer duzenlemek icin LastName
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement editlastnameAdmin;

    //AdminPage Customer duzenlemek icin mailadress
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[3]")
    public WebElement editmailadressAdmin;

    //AdminPage Customer duzenlemek icin iletisim numarasi
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[4]")
    public WebElement editcontactnoAdmin;

    //AdminPage Customer duzenlemek icin sifre
    @FindBy(xpath = "//input[@id='AR_client_npassword']")
    public WebElement editpasswordAdmin ;

    //AdminPage Customer duzenlemek icin sifre tekrari
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[5]")
    public WebElement editconfirmpasswordAdmin;

    //AdminPage Customer duzenlerken statu durumu(aktif)
    @FindBy(xpath = "//*[@class='form-control custom-select form-control-select']")
    public WebElement editstatusAdmin ;

    //AdminPage Customer duzenledikten sonra kaydetmek
    @FindBy(xpath = "//input[@class='btn btn-green btn-full mt-3']")
    public WebElement editSaveAdmin ;

    //AdminPage Customer silmek icin Delete button
    @FindBy(xpath ="(//i[@class='zmdi zmdi-delete'])[1]")
    public WebElement customerdeleteAdmin;

    //AdminPage Customer silmek icin Delete onaylama
    @FindBy(xpath = "//a[@class='btn btn-green item_delete']")
    public WebElement customerdeleteagainAdmin;

    //AdminPage Customer arama kutusu
    @FindBy(xpath = "//input[@class='form-control rounded search w-25']")
    public WebElement customersearchboxAdmin;

    //AdminPage Customer arama kutusu yazdiktan sonra click
    @FindBy(xpath = "//i[@class='zmdi zmdi-search']")
    public WebElement customersearchboxclickAdmin;

    //user Story 42
    //admin page side bardaki buyers buttonu
    @FindBy(xpath = "//a[text()='Buyers']")
    public WebElement buyersButtonAdmin;

    //admin page side bardaki reviews buttonu
    @FindBy(xpath = "//a[text()='Reviews']")
    public WebElement reviewsButtonAdmin;

    //admin page > Reviews page deki Reviews text i
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement reviewsTextAdmin;

    //admin page > Reviews page deki merchant sort button
    @FindBy(xpath = "//th[@class='sorting']")
    public WebElement merchantSortButtonAdmin;

    //admin page > Reviews page deki Reviews sort button
    @FindBy(xpath = "//th[@class='sorting sorting_asc']")
    public WebElement reviewsSortButtonAdmin;

    //admin page > Reviews page deki delete(cop tenekesi) button
    @FindBy(xpath = "//a[@data-id='18']")
    public WebElement deleteButtonTextAdmin;

    //admin page > Reviews page > delete/ delete confirmation button
    @FindBy(xpath = "//a[@class='btn btn-green item_delete']")
    public WebElement deleteConfirmationButtonAdmin;

    //admin page > Reviews page > update (kalem) button
    @FindBy(xpath = "(//a[@class='btn btn-light tool_tips'])[1]")
    public WebElement updateButtonAdmin;

    //admin page > Reviews page > update > Update Review pagedeki customer reviewsin silinip,degistirilebildigi text yeri.
    @FindBy(id = "AR_review_review")
    public WebElement customerReviewsTextBoxAdmin;

    //admin page > Reviews page > update > Update Review pagedeki rating text yeri.
    @FindBy(id = "AR_review_rating")
    public WebElement customerReviewsRatingBoxAdmin;

    //admin page > Reviews page > update > Update Review pagedeki status select yeri.
    @FindBy(id = "AR_review_status")
    public WebElement customerReviewsStatusSelectAdmin;

    //admin page > Reviews page > update > Update Review pagedeki status selectteki Publish yeri.
    @FindBy(xpath = "//option[@value='publish']")
    public WebElement customerReviewsStatusSelectPublishbuttonAdmin;

    //admin page > Reviews page > update > Update Review pagedeki save button
    @FindBy(xpath = "//input[@value='Save']")
    public WebElement customerReviewsStatusSaveButtonAdmin;

    //admin page > Reviews page > update > Update Review save ardindan cikan "Succesfully updated texti.
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement succesfullyUpdatedTextAdmin;

    //US43
    //reports title button in admin page
    @FindBy(xpath = "//li[@class='reports']")
    public WebElement reportTitleButtonAdmin;

    //reportsin icerisindeki merchant registiration button admin page
    @FindBy(xpath = "//li[@class='position-relative reports_merchant_registration']")
    public WebElement merchantRegistirationButtonAdmin;

    //profile name in header
    @FindBy(xpath = "(//a[@class='btn btn-sm dropdown-toggle text-truncate'])[1]")
    public WebElement profileNameInHeaderAdmin;

    //"Log out" section in header
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement logOutButtonAdmin;

    //adminpage > reports> merchant registiration da merchant registiration texti
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement merchantRegistrationTextAdmin;

    //adminpage > reports> merchant registiration da name
    @FindBy(xpath = "//th[@class='sorting sorting_asc']")
    public WebElement nameSortbuttonAdmin;

    //adminpage > reports> merchant registiration da startDate__EndDate button
    @FindBy(xpath = "//li[@data-range-key='Last 7 Days']")
    public WebElement last7day;

    //adminpage > reports> merchant registiration da All Status button
    @FindBy(xpath = "//select[@title='All Status']")
    public WebElement allStatusButtonAdmin;

    //adminpage > reports> merchant registiration da All Status ddm in altinda active button
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_next\"]")
    public WebElement nextButton;

    //adminpage > reports> merchant registiration da Total Registered text
    @FindBy(xpath = "(//p[@class='m-0 mr-2 text-muted text-truncate'])[1]")
    public WebElement totalRegisteredTextAdmin;

    //adminpage > reports> merchant registiration da Commission Total text
    @FindBy(xpath = "(//p[@class='m-0 mr-2 text-muted text-truncate'])[2]")
    public WebElement commissionTotalTextAdmin;

    ////adminpage > reports> merchant registiration da Membership Total text
    @FindBy(xpath = "(//p[@class='m-0 mr-2 text-muted text-truncate'])[3]")
    public WebElement membershipTotalTextAdmin;

    ////adminpage > reports> merchant registiration da Total Active text
    @FindBy(xpath = "(//p[@class='m-0 mr-2 text-muted text-truncate'])[4]")
    public WebElement totalActiveTextAdmin;

    ////adminpage > reports> merchant registiration da Total Inactive text
    @FindBy(xpath = "(//p[@class='m-0 mr-2 text-muted text-truncate'])[5]")
    public WebElement totalInactiveTextAdmin;

    //   Us 44
    //   Admin>homepage>Reports
    @FindBy(xpath = "//a[text()='Reports']")
    public WebElement reportsAdmin;

    //   Us 44 Admin>homepage>Reports>MerchantSales
    @FindBy(xpath = "//a[text()='Merchant Sales']")
    public WebElement merchantSalesAdmin;

    //   Us 44 Admin>homepage>Reports>MerchantSales>MerchantSalesReport
    @FindBy(xpath = "//input[@placeholder='Start date -- End date']")
    public WebElement merchantSalesReportFilterAdmin;

    //   Us 44 Admin>homepage>Reports>MerchantSales>MerchantSalesReport
    @FindBy(xpath = "//*[text()='Order ID']")
    public WebElement ordersIDAdmin;

    //US 45
    //   Us 45 Admin>homepage>Reports
    @FindBy(xpath = "//*[text()='Order earnings']")
    public WebElement orderEarningsAdmin;

    //   Us 45 Admin>homepage>Reports>OrderEarning>Searchbox
    @FindBy(xpath = "//label[text()='Search:']")
    public WebElement orderEarningsSearchBoxAdmin;

    //   Us 45 Admin>homepage>Reports>OrderEarning>MerchantEarning
    @FindBy(xpath = "//th[text()='Merchant Earnings']")
    public WebElement MerchantEarningsAdmin;
    //   Us 45 Admin>homepage>Reports>OrderEarning>MerchantEarning
    @FindBy(xpath = "//th[text()='Order ID']")
    public WebElement ordersIDOrderEarningAdmin;

    //   Us 45 Admin>homepage>Reports>OrderEarning>MerchantEarning
    @FindBy(xpath = "//*[text()='Total']")
    public WebElement OrderEarningTotalAdmin;

    //   Us 45 Admin>homepage>Reports>OrderEarning>MerchantEarning
    @FindBy(xpath = "//*[text()='Admin commission']")
    public WebElement OrderEarningAdminComissionAdmin;

    //yeni eklenen US36
    @FindBy(id = "dropdownMenuLink")
    public WebElement kullaniciIsmiAdmin;

    // Admin page Sign in butonu locate islemi icin itiyac duyulmustur
    @FindBy(xpath = "(//input[@class='btn btn-green btn-full'])[1]")
    public WebElement adminPageSignInButton2;

    // Admin page merchantSalesReportTitle locate islemi icin itiyac duyulmustur
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement merchantSalesReportTitle;

    //*********************** US 043 ***********************//
    // merchant registration list goruntulandinine dair dogrilama elementi

    @FindBy(xpath = "//div[@class='card-body']")
    public WebElement merchantRegistratinOnListVerifyItem;

    // isim siralama butonu  dogrulam  icin 3 elemente ihtiyac vardir

    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement nameSortItem1;

    @FindBy(xpath = "(//td[@class='sorting_1'])[2]")
    public WebElement nameSortItem2;

    // tarih baslangic elementi
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/table/tbody/tr[5]/td[2]")
    public WebElement dateStart;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/table/tbody/tr[5]/td[7]")
    public WebElement dateEnd;

    @FindBy(xpath = "//input[@class='form-control py-2 border-right-0 border']")
    public WebElement dateVerifyItem;

    //Tarih Filtreleme locate icin ihtiyac duyulmustur(Fidan)
    @FindBy(xpath = "(//td[@data-title='r0c3'])[1]")
    public WebElement dateStart2;

    @FindBy(xpath = "//h5[text()='Order earnings report']")
    public WebElement verifyOrderEarningsItem;

    @FindBy(xpath = "//div[@class='col-sm-12']")
    public WebElement asListVerifyElementi;

    @FindBy(xpath = "//div[@class='input-group fixed-width-field mr-2']")
    public WebElement sortByDate;

    @FindBy(xpath = "//li[@data-range-key='Last 7 Days']")
    public WebElement sendkeysDate;

    //***********************************US 45*********************************

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")
    public WebElement sortBySubtotal;

    @FindBy(xpath = "(//td[text()='Vegan Season'])[1]")
    public WebElement sorting1;

    @FindBy(xpath = "(//td[text()='Vegan Season'])[2]")
    public WebElement sorting2;

    @FindBy(xpath = "//a[@data-id='21']")
    public WebElement deleteButtonReviewAdmin;

    // *****************US 41**************************

    //Customer name button
    @FindBy(xpath = "//th[text()='Name']")
    public WebElement customernamelist ;

    //Customer edit
    @FindBy(xpath = "(//i[@class='zmdi zmdi-border-color'])[1]")
    public WebElement customeredit;

    @FindBy(xpath = "//*[@id=\"active-form\"]/div/div/div[1]")
    public WebElement succesfullyupdatedtext ;

    @FindBy(id = "DataTables_Table_0_info")
    public WebElement searchBoxSortResult;

    // US38 order>allOrder>AllorderHeader
    @FindBy(xpath = "//h5[text()='All Orders']")
    public WebElement allOrdersHeader;

    // US38 order>allOrder>Orders
    @FindBy(xpath = "//p[text()='Orders']")
    public WebElement allordersOrder;

    // US38 order>allOrder>Cancel
    @FindBy(xpath = "//p[text()='Cancel']")
    public WebElement allordersCancel;

    // US38 order>allOrder>TotalRefund
    @FindBy(xpath = "//p[text()='Total refund']")
    public WebElement allordersTotalRefund;

    // US38 order>allOrder>TotalOrders
    @FindBy(xpath = "//p[text()='Total Orders']")
    public WebElement allordersTotalOrders;

    //=======US 37 icin asagidaki locate lere ihtiyac duyulmustur=======

    @FindBy(xpath = "//input[@type='search']")
    public WebElement allMerchantSearchBox;

    @FindBy(xpath = "(//a[@class='btn btn-light tool_tips'])[1]")
    public WebElement starbucksEditButton;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement starbucksEditSaveButton;

    // US38 icin ihtiyac duyulmustur

    @FindBy(xpath = "//div[@class='input-group fixed-width-field mr-2']")
    public WebElement dateSearchBoxAdmin2;

    @FindBy(xpath = "//th[@aria-controls='DataTables_Table_0']")
    public WebElement orderIdAdmin2;

    @FindBy(xpath = "(//i[@class='zmdi zmdi-eye'])[1]")
    public WebElement eyesIconAdmin2;

    @FindBy(xpath = "//button[@class='btn btn-black']")
    public WebElement closeButtonAdmin;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement customerListAdmin ;

    //Order ID locate ihtiyactan dolayi yazilmistir
    @FindBy(xpath = "//th[@class='sorting sorting_asc']")
    public WebElement orderIdFilter;

    // Us 40 icin asagidaki elemente ihtiyac duyulmustur
    @FindBy(xpath = "//a[@class='btn btn-green item_delete']")
    public WebElement  couponDeleteAgainAdmin;


}
