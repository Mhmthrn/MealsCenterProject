package pages.A_homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //==========Home Page Genel Login bolumu ve adres secme =================//

    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement usernameHome;

    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement passwordHome;

    @FindBy(xpath = "//button[@class='el-button el-button--primary el-button--default is-round w-100']")
    public WebElement cookiesAcceptHome;

    @FindBy(xpath = "//input[@class='form-control form-control-text']")
    public WebElement loginSearchBoxHome;

    // Texas
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[3]/ul/li[1]")
    public WebElement addressChoseItem;


    //  home page "Hungry? We got you" texti

    @FindBy(xpath = "//h2[@class='text-center mb-3']")
    public WebElement loginVerifiyItemHome;


    //==========User Story 2=================//


    //Home Page Header da ki Meals Center logo button

    @FindBy(xpath = " (//img[@class='img-200'])[1]")
    public WebElement headerMealsCenterHome;

    //Home Page Header da ki Cart button
    @FindBy(xpath = "//a[@class='ssm-toggle-navx']")
    public WebElement headerCartButtonHome;

    //Home Page Header da ki Sign in button
    @FindBy(xpath = "//li[@class='d-none d-lg-inline line-left']")
    public WebElement headerSingInButtonHome;

    //Home Page Header da ki Sepet button
    @FindBy(xpath = "//span[@class='badge small badge-dark rounded-pill']")
    public WebElement headerSepetButtonHome;




    //==========User Story 3=================//

    // US_03: As a visitor, I want the functions in the body of the Home page to be visible and active.

    @FindBy(xpath = "(//div[@class='d-none d-lg-block'])[1]")
    public WebElement block1HomePage;

    @FindBy(xpath = "(//div[@class='col d-flex justify-content-start align-items-center'])[1]")
    public WebElement block2HomePage;

    @FindBy(xpath = "(//div[@class='col d-flex justify-content-end align-items-center'])[1]")
    public WebElement block3HomePage;

    @FindBy(xpath = "//div[@class='owl-carousel restaurant-carousel rounded owl-loaded owl-drag']")
    public WebElement block4HomePage;


    @FindBy(xpath = "//div[@class='order-three-steps d-none d-lg-block']")
    public WebElement block5HomePage;

    @FindBy(xpath = "//div[@class='section-benefits mt-3 mb-0 row']")
    public WebElement block6HomePage;

    @FindBy(xpath = "//div[@class='col d-flex justify-content-start align-items-center'])[2]")
    public WebElement block7HomePage;

    @FindBy(xpath = "(//div[@class='col d-flex justify-content-end align-items-center'])[2]")
    public WebElement block8HomePage;

    @FindBy(xpath = "//div[@class='owl-carousel restaurant-carousel rounded-circle owl-loaded owl-drag']")
    public WebElement block9HomePage;

    @FindBy(xpath = "//div[@class='section-mobileapp tree-columns-center d-none d-md-block']")
    public WebElement block10HomePage;


    //==========User Story 4=================//

    // Footer elements

    // Facebook icon
    @FindBy(xpath = "//a[@class='facebook']")
    public WebElement facebookIcon;

    // Instagram icon
    @FindBy(xpath = "(//div[@class='ml-2 ml-md-3 ml-lg-4'])[1]")
    public WebElement instagramIcon;

    //  LinkedIn icon
    @FindBy(xpath = "(//div[@class='ml-2 ml-md-3 ml-lg-4'])[2]")
    public WebElement  linkedInIcon;

    // Twitter icon
    @FindBy(xpath ="(//div[@class='ml-2 ml-md-3 ml-lg-4'])[3]" )
    public WebElement twitterIcon;

    // Youtube icon
    @FindBy(xpath ="(//div[@class='ml-2 ml-md-3 ml-lg-4'])[4]" )
    public WebElement youtubeIcon;

    // Meals Center Corp. bolumu

    // Contact us
    @FindBy(xpath = "(//li[@class='position-relative '])[1]")
    public WebElement ContactUs;

    // Terms and conditions
    @FindBy(xpath = "(//li[@class='position-relative '])[2]")
    public WebElement TermsConditions;

    // Privacy policy
    @FindBy(xpath ="(//li[@class='position-relative '])[3]" )
    public WebElement PrivacyPolicy;

    // Business

    // Become a Partner
    @FindBy(xpath = "(//li[@class='position-relative '])[4]")
    public WebElement BecomeAPartner;


    //Blog

    //Discover the Best Vegetarian Food Delivery Options in Your Area
    @FindBy(xpath ="(//li[@class='position-relative '])[5]" )
    public WebElement discoveryVegatariann;

    // How to Eat Healthy with Food Delivery
    @FindBy(xpath ="(//li[@class='position-relative '])[6]" )
    public WebElement howToEatHaelty;

    // The Benefits of Using a Food Delivery Platform for Your Healthy Lifestyle
    @FindBy(xpath = "(//li[@class='position-relative '])[7]")
    public WebElement theBenefitsOfUsing;

    // Discover Healthy Food Delivery Options for Your Whole Family
    @FindBy(xpath ="(//li[@class='position-relative '])[8]" )
    public WebElement discoverHealtyFood;


    // application sites area

    // AppStore
    @FindBy(xpath = "(//div[@class='p-2'])[1]")
    public WebElement appStoreIcon;

    // PlayStore
    @FindBy(xpath ="(//div[@class='p-2'])[2]" )
    public WebElement playStoreIcon;

    //==========User Story 5=================//

    // Home Page Sign In butonu US5
    @FindBy(xpath ="//a[text()='Sign in']")
    public WebElement signInButton;

    // Home Page Sign Up butonu US5
    @FindBy(xpath ="//a[text()='Sign Up']")
    public WebElement signUpButton;

    // Home Page Mobile number or email textBox US5
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement mobileNumberEmailTextBox;

    // Home Page Password textBox US5
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement passwordTextBox1;

    //==========User Story 6=================//

    // Home Page US6 Sign Up butonu
    @FindBy(xpath ="//a[text()='Sign Up']")
    public WebElement signUpButton1;

    // Home Page US6 First name textBox
    @FindBy(xpath = "//label[@for='firstname']")
    public WebElement firstNameTextBox;

    // Home Page US6 Last name textBox
    @FindBy(xpath = "//label[@for='lastname']")
    public WebElement lastNameTextBox;

    // Home Page US6 Email address textBox
    @FindBy(xpath = "//label[@for='email_address']")
    public WebElement emailAddressTextBox1;

    // Home Page US6 Telefon nummer textBox
    @FindBy(xpath = "//input[@data-mask='###################']")
    public WebElement telefonnummerTextBox;

    // Home Page US6 Dropdown Ulke
    @FindBy(xpath = "//button[@class='dropdown-toggle']")
    public WebElement dropdownButton;

    // Home Page US6 Password textBox
    @FindBy(xpath = "//label[@for='password']")
    public WebElement passwordTextBox2;

    // Home Page US6 eye button
    @FindBy(xpath = "//i[@class='zmdi zmdi-eye']")
    public WebElement eyeButton;

    // Home Page US6 Confirm Password textBox
    @FindBy(xpath = "//label[@for='cpassword']")
    public WebElement confirmPasswordTextBox;

    // Home Page US6 Sign Up button
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement signUpButton2;

    // Home Page US6 Logout button
    @FindBy(xpath = "//a[text()=' Logout ']")
    public WebElement logoutButton;



    //==========User Story 7=================//

    // Home Page US7 Contakt Us button
    @FindBy(xpath = "//a[text()='Contact us']")
    public WebElement contaktUsButton;

    // Home Page US7 Full name textBox
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement fullNameTextBox1;

    // Home Page US7 Email address textBox
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement emailAddressTextBox2;

    // Home Page US7 Your Message textBox
    @FindBy(xpath = "(//div[@class='form-label-group'])[3]")
    public WebElement yourMessageTextBox1;

    // Home Page US7 Submit button
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitButton;

    // Home Page US7 Allert Message
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement allertMessage;

    // Home Page US7 Full name* textBox
    @FindBy(xpath = "//label[@for='AR_contact_fullname']")
    public WebElement fullNameTextBox2;

    // Home Page US7 Email address* textBox
    @FindBy(xpath = "//label[@for='AR_contact_email_address']")
    public WebElement emailAddressTextBox;

    // Home Page US7 Your Message textBox
    @FindBy(xpath = "//textarea[@class='form-control form-control-text']")
    public WebElement yourMessageTextBox2;

    //==========User Story 8=================//

    // Home Page US8 Terms and conditions button
    @FindBy(xpath = "//a[text()='Terms and conditions']")
    public WebElement termsAndConditionsButton;

    // Home Page US8  Orders and Payment
    @FindBy(xpath = "//font[text()='Orders and Payment']")
    public WebElement ordersAndPayment;

    //==========User Story 9=================//

    // Home Page US9  Privacy policy button
    @FindBy(xpath = "//a[text()='Privacy policy']")
    public WebElement privacyPolicyButton;

    // Home Page US9  Information We Collect
    @FindBy(xpath = "//font[text()='Information We Collect']")
    public WebElement informationWeCollect;

    // Home Page US9  How We Use Your Information
    @FindBy(xpath = "//font[text()='How We Use Your Information']")
    public WebElement howWeUseYourInformation;

    // Home Page US9  Disclosure of Your Information
    @FindBy(xpath = "//font[text()='Disclosure of Your Information']")
    public WebElement disclosureOfYourInformation;

    // Home Page US9  Security of Your Information
    @FindBy(xpath = "//font[text()='Security of Your Information']")
    public WebElement securityOfYourInformation;

    // Home Page US9  Contact Us text
    @FindBy(xpath = "//h6[text()='If you have any questions or concerns about our Privacy Policy, please contact us at ']")
    public WebElement contactUsText;

    // Home Page US9  "privacy@mealscenter.com" adress linki
    @FindBy(xpath = "//font[@color='#ff0000']")
    public WebElement privacyMealscenterLink ;

    // Restaurant menusu ileri kaydırma tuşu US11 (5 kere tıklanılacak)
    @FindBy (xpath = "//a[@class='owl-carousel-nav next']")
    public WebElement restaurantMenusu;

    //==========User Story 11=================//

    // Starbucks linki US11
    @FindBy (xpath = "(//a[@href='https://qa.mealscenter.com/starbucks'])[4]")
    public WebElement starbucksLink;

    // Hot Coffees linki US11 (sidebar men unun altı)
    @FindBy (xpath = "//a[text()='Hot Coffees']")
    public WebElement hotCoffesLink;

    // Caffe Misto yu (hot coffees) sepete ekle linki US11
    @FindBy (xpath = "(//a[text()=' Add to cart '])[2]")
    public WebElement caffeMıstoLink;

    // Checkout linki (kasa-sepet) US11
    @FindBy (xpath = "//a[@disabled='false']")
    public WebElement checkoutLink;

    // Place Order linki (satın alma)US11
    @FindBy (xpath = "//span[text()='Place Order']")
    public WebElement placeOrderLink;


    //==========User Story 12=================//

    // home page cuisineler

    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[1]")
    public WebElement americanCuisineHome;

    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[2]")
    public WebElement mediterraneanCuisineHome;

    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[3]")
    public WebElement sandwichesCuisineHome;

    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[4]")
    public WebElement italianCuisineHome;

    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[5]")
    public WebElement mexicanCuisineHome;

    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[6]")
    public WebElement burgersCuisineHome;

    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[7]")
    public WebElement japaneseCuisineHome;

    @FindBy(xpath = "(//a[text()='Thai'])[1]")
    public WebElement thaiCuisineHome;

    @FindBy(id = "dropdownCuisine")
    public WebElement dropdownCuisineHome;

    @FindBy(xpath = "(//a[@class='p-2 pl-2 d-block'])[1]")
    public WebElement chineseCuisineDropDownHome;

    @FindBy(xpath = "(//a[@class='p-2 pl-2 d-block'])[2]")
    public WebElement kosherCuisineDropDownHome;

    @FindBy(xpath = "(//a[@class='p-2 pl-2 d-block'])[3]")
    public WebElement halalCuisineDropDownHome;

    @FindBy(xpath = "(//a[@class='p-2 pl-2 d-block'])[4]")
    public WebElement vegetarianCuisineDropDownHome;



    //==========User Story 13=================//

    // starbucksmenu
    @FindBy(xpath = "(//h5[@class='m-0 text-truncate'])[8]")
    public WebElement starbucksLocete;

    // US 13 test item Kahve

    @FindBy(xpath = "(//a[@class='btn btn-grey xget-item-details'])[1]")
    public WebElement kahveAddToCartTestItem1Home;

    //US 13  kahve secildikten sonra ikinci bir add to cart butonu cikmakta

    @FindBy(xpath = "(//button[@class='btn btn-green w-100 add_to_cart'])[1]")
    public WebElement kahveAddToCartTestItem2Home;

    // US 13 checkoutpage iconu Strabucks kahve siparisi sonrasi muhtmel bug  eger ileri tarihli siparis
    // verilecekse calisiyor yoksa calismadi

    // ileri taihli siparis girme secenegi

    @FindBy(xpath = "//a[@class='btn btn-green w-100 pointer d-flex justify-content-between']")
    public WebElement checkOutButtonHome;


    @FindBy(xpath = "//span[@class='badge btn-black rounded-pill ml-1 font20']")
    public WebElement addNewAddress;


    @FindBy(xpath = " (//span[@class='mr-1'])[3]")
    public WebElement cashOnDelivery;

    @FindBy(xpath = " (//span[@class='mr-1'])[4]")
    public WebElement cstrip;

    @FindBy(xpath = "(//span[@class='label'])[12]")
    public WebElement placeOrder;

    // siparisin sip[aris sayfasina gittigini tes etmek icin item "Kahve"
    @FindBy(xpath = "(//span[@class='mr-1'])[1]")
    public WebElement orderPageTestItem;


    // Verifiy the order oft the summery title.
    @FindBy(xpath = "//p[@class='mb-1']")
    public WebElement verifiySummeryItems;


    //==========User Story 14=================//

    //  profil bolumu drop down menu iconu
    @FindBy(id = "dropdownMenuLink")
    public WebElement profilNameItem;

    @FindBy(xpath = "//a[@class='dropdown-item with-icon-account']")
    public WebElement manageMyAccount;

    // My orders

    @FindBy(xpath = "//a[@class='dropdown-item with-icon-orders']")
    public WebElement myOrdersSection;



    // Basic Details last name bolumu

    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement basicDetailsLastName;

    @FindBy(xpath = "//button[@class='mt-3 btn btn-green w-100']")
    public WebElement basicDetailsSubmitButton;

    @FindBy(xpath = " //div[@class='alert alert-success']")
    public WebElement profilUpdateMesaj;



    //==========User Story 15=================//

    // Starbucks below and verify that the menus appear item

    @FindBy(id = "vue-merchant-menu")
    public WebElement starbucksMenuApperItem;



    //==========User Story 17=================//

    // user account  Payments Options

    @FindBy(xpath = "//a[@class='dropdown-item with-icon-payments']")
    public WebElement paymentsOptions;


    // Cash on delivery
    @FindBy(xpath = "(//a[@class='btn btn-green'])[1]")
    public WebElement addNewPayment;

    @FindBy(xpath = "//a[@class='d-block chevron-section medium d-flex align-items-center rounded mb-2'][1]")
    public WebElement cashOnDeliveryPaymetOption;

    @FindBy(xpath = "(//button[@class='btn btn-green w-100'])[1]")
    public WebElement addCashAlert;

    @FindBy(xpath = "(//a[@id='dropdownMenuLink'])[3]")
    public WebElement selectCashOnDeliveryIcon;

    @FindBy(xpath = "(//a[@class='btn normal small'])[3]")
    public WebElement editCoshOnDeliveryIcon;


    @FindBy(xpath = " (//a[@class='btn normal small'])[4]")
    public WebElement deleteCashOnDeliveryIcon;


    // Stripe
    @FindBy(xpath = "//a[@class='d-block chevron-section medium d-flex align-items-center rounded mb-2'][2]")
    public WebElement stripePaymetOption;

    @FindBy(xpath = "(//input[@class='InputElement is-empty Input Input--empty'])[1]")
    public WebElement cardNumber;

    @FindBy(xpath = "(//input[@class='InputElement is-empty Input Input--empty'])[2]")
    public WebElement MMYYNumber;

    @FindBy(xpath = "(//input[@class='InputElement is-empty Input Input--empty'])[3]")
    public WebElement CVCNumber;


    @FindBy(xpath = "(//button[@class='btn btn-green w-100'])[2]")
    public WebElement addStripeAlert;


    @FindBy(xpath = "(//a[@id='dropdownMenuLink'])[2]")
    public WebElement selectStripeIcon;



    @FindBy(xpath = "(//a[@class='btn normal small'])[1]")
    public WebElement editStripeIcon;


    @FindBy(xpath = "(//a[@class='btn normal small'])[2]")
    public WebElement deleteStripeIcon;



    //==========User Story 18=================//

    // profil name Saved Stores bolumu

    @FindBy(xpath = "//a[@class='dropdown-item with-icon-savedstore']")
    public WebElement savedStoresSection;

    //==========User Story 8=================//

    // genel aciklama metni

    @FindBy(xpath = "(//div[@class='text-left'])[2]")
    public WebElement termsAndConditionsText;

    @FindBy(id = "firstname")
    public WebElement firstNameTextBox1;

    // Home Page US6 Last name textBox
    @FindBy(id = "lastname")
    public WebElement lastNameTextBox1;

    // Home Page US6 Email address textBox
    @FindBy(id = "email_address")
    public WebElement emailAddressTextBox11;

    //Home Page US6 Select Flag
    @FindBy(xpath = "//div[text()='United States']")
    public WebElement selectFlag;

    // Home Page US6 Password textBox
    @FindBy(id = "password")
    public WebElement passwordTextBox21;

    // Home Page US6 Confirm Password textBox
    @FindBy(id = "cpassword")
    public WebElement confirmPasswordTextBox1;

    // Home Page US6 Register is succesfully done

    @FindBy (id = "dropdownMenuLink")
    public WebElement registerDone;

    //  SONRADAN EKLENENLER ASAGIYA LUTFEN:

    @FindBy(linkText = "Kosher")
    public WebElement kosher;


    //home page siparis verrildi> odeme ve adres bilgileri girildi."Confirming your order" yazisinin locati
    @FindBy(xpath = "//h5[@class='m-0 mb-1']")
    public WebElement confirmingYourOrderTextHomePage;



    //==========User Story 03=================//
    // locate islemi icin .. eleemtte ihtiyac duyulmustur

    // Us 30  pre conditions icin asagida ki elementlere ihtiyac duyuldu
    @FindBy(xpath = "//a[@class='d-block chevron-section transaction-section d-flex align-items-center rounded mb-2']")
    public WebElement deliveryHome;
    @FindBy (xpath = "(//input[@type='radio'])[5]")
    public WebElement deliverScheduleForLaterHome;
    @FindBy (xpath = "//select[@class='form-control custom-select mb-3']")
    public WebElement scheduleForLaterDateButtonHome;
    @FindBy (id = "delivery_time")
    public WebElement scheduleForLaterTimeButtonHome;
    @FindBy (xpath = "(//button[@class='btn btn-green w-100'])[2]")
    public WebElement scheduleForLaterSaveHome;
    @FindBy (xpath = "(//button[@class='btn btn-green w-100'])[9]")
    public WebElement addCashButtonHome;
    @FindBy (xpath = "(//a[@class='btn btn-grey quantity-add-cart'])[2]")
    public WebElement caffeMistoHome;


    //========US 18 icin asagidaki locate lere ihtiyac duyulmustur=======

    @FindBy(xpath = "//i[@class='zmdi zmdi-favorite-outline']")
    public WebElement noSaveStoreIcon;

    @FindBy(xpath = "//i[@class='zmdi zmdi-favorite text-green']")
    public WebElement saveStoreIcon;

    @FindBy(xpath = "//a[text()='Saved Stores']")
    public WebElement savedStoresSectionNew;

    @FindBy(xpath = "//h5[text()='Starbucks']")
    public WebElement starbucksForSaved;

    @FindBy(xpath = "//div[@id='vue-saved-store']")
    public WebElement savedStoreAllPage;

    //User story 29 icin verilen orderin numarasini almak icin confirm sayfasindaki order numarasinin oldugu textbox locati
    @FindBy(xpath = "(//p[@class='m-0 mb-1 bold'])[1]")
    public WebElement orderNumberTextLocatiHomePage;

    //====== Us 17 icin asagidaki elementlere ihtiyac duyuldu=======//
    @FindBy (xpath = "//a[@class='dropdown-item a-12']")
    public WebElement setDefaultHome;

    @FindBy (xpath = "(//i[@class='zmdi zmdi-close font20'])[1]")
    public WebElement closeAddItemHome;

    @FindBy (xpath = "(//i[@class='zmdi zmdi-close font20'])[2]")
    public WebElement closeAddItem2Home;

    @FindBy (xpath = "//iframe[@title='Secure card payment input frame']")
    public WebElement iframeCardHome;




































    //starbucks locate kesin
    @FindBy (xpath = "//h5[text()='Starbucks']")
    public WebElement starbucksLocate;

    @FindBy (xpath = "( //a[text()=' Add to cart '])[2]")
    public WebElement kahveAddToCartTestItem1Home1;

    //become a partner linki güncel
    @FindBy (id = "yw1")
    public WebElement BecomeAPartner1;




}
















