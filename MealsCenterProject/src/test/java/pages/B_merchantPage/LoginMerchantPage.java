package pages.B_merchantPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginMerchantPage {

    public LoginMerchantPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // merchant giris kullanici adi
    @FindBy(xpath = "(//label[@class='required'])[1]")
    public WebElement userNameMerchant;

    // merchant giris sifre
    @FindBy(xpath = "(//label[@class='required'])[2]")
    public WebElement passwordMerchant;

    // merchant giris Sign in
    @FindBy(xpath = "//input[@class='btn btn-green btn-full']")
    public WebElement signInButtonMerchant;

    // Merchant page sayfasinda sag üstte girilen kullanici isim elementi
    @FindBy (linkText = "Profile")
    public WebElement profileMerchantPage;

    // Merchant page sayfasina erisim sagladigini dogrulama elementi
    @FindBy (xpath = "(//a[@class='btn btn-sm dropdown-toggle text-truncate'])[1]")
    public WebElement loginTextVerifyMerchantPage;

    //Steve Bucks drop-down menu
    @FindBy(id = "dropdownMenuLink")
    public WebElement dropDownMerchant;

    //Steve Bucks drop-down menunun LOGOUT item
    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement DropDownLogoutMerchant ;

    // Meals Center > footer kismi-Become a Partner
    @FindBy(linkText = "Become a Partner")
    public WebElement footerBecomeaPartnerMerchant;

    // Become Restaurant partner sayfasinin logout oncesi Drop-Down i
    @FindBy(xpath = "//a[@class='btn btn-sm dropdown-toggle text-truncate shadow-none width-100']")
    public WebElement dropDownSignUpMerchant;

    // Become Restaurant partner sayfasinin LOGOUT ogesi
    @FindBy(xpath = "//a[@class='dropdown-item with-icon-logout']")
    public WebElement signUpLogoutMerchant;

    // Become Restaurant partner sayfasinin Store name box i
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement signUpStoreNameMerchant;

    // Become Restaurant partner sayfasinin Store address box i
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement signUpStoreAddressMerchant;

    // Become Restaurant partner sayfasinin Email address box i
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[3]")
    public WebElement signUpEmailAddressMerchant;

    // Become Restaurant partner sayfasinin Email address box i
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement signUpTelefonNoMerchant;

    // Become Restaurant partner sayfasinin commission button u
    @FindBy(xpath = "//label[@class='custom-control-label']")
    public WebElement signUpCommissionMerchant;

    // Become Restaurant partner sayfasinin submit button u
    @FindBy(xpath = "//button[@class='btn btn-green w-100 mt-3']")
    public WebElement signUpSubmitButtonMerchant;

    // Become Restaurant partner sayfasinin onayi sonucu gorunen yazi
    @FindBy(xpath = "//h5[@class='text-center mb-4']")
    public WebElement signUpAcceptanceVisibleTextMerchant;

    // Become Restaurant partner sayfasinin onayi sonucu gorunen yazi
    @FindBy(xpath = "//h5[@class='text-center mb-4']")
    public WebElement becomeRestaurantPartnerAcceptanceVisibleTextMerchant;

    ////////////////////////USER STORY 10 ENDE////////////////////////////

//°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°//

    ////////////////////////USER STORY 19 ////////////////////////////
    //Not: US19 daki locater lar asagida yazilidir. Yukarida zaten mevcut oldugundan tekraren
    //yazilmasindan imtina edilmistir.

    //Steve Bucks drop-down menu
    @FindBy(id = "dropdownMenuLink")
    public WebElement steveBucksDropDownMerchant ;

    //Steve Bucks drop-down menunun LOGOUT item
    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement steveBucksDropDownLogoutMerchant ;

//°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°//

    ////////////////////////USER STORY 20 ////////////////////////////

    // Merchant Login > Forgot password kismi
    @FindBy(xpath = "//a[@class='dim underline']")
    public WebElement loginForgotPasswordMerchant;

    /* Merchant Login > Forgot password click acilan sayfada Email Address box inin
    mevcut oldugunu dogrulama ("Request E-mail" locater)
    */
    @FindBy(xpath = "//input[@class='btn btn-green btn-full']")
    public WebElement loginForgotPasswordEmailVerifyPageDisplayedMerchant;

    // Acilan "Forgot Password" sayfasindaki 'Email Address' Box i
    @FindBy(xpath = "//label[@class='required']")
    public WebElement loginForgotPasswordEmailAddressBoxMerchant;

////////////////////////////// US20 ENDE //////////////////////////////////

    //////////////YENI EKLEMELER ASAGIYA YAPILMALIDIR

    // loginmerchantUsername locate islemi icin ihtiyac duyulmustur
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement loginmerchantUsername;


    // loginmerchantPassword locate islemi icin ihtiyac duyulmustur
    @FindBy(id = "AR_merchant_login_password")
    public WebElement loginmerchantPassword;



    //***********************************US 34*********************************


    @FindBy(linkText = "Order Type")
    public WebElement orderTypeElementi;


    @FindBy(linkText = "Delivery")
    public WebElement deliveryElementi;

    @FindBy(xpath = "(//div[@class='card'])[1]")
    public WebElement verifyDeliveryItem;

    //Merchant sayfası Forgot password daki email textbox locate
    @FindBy (id = "AR_merchant_login_email_address")
    public WebElement loginForgotPasswordEmailAddressBoxMerchant1;

    //forgot password processing is done
    @FindBy (xpath = "//*[@id=\"login-form\"]/div[1]")
    public WebElement loginforgotPasswordProcessingisDone;

    //all orders sayfasına ekleme işleminin gerçekleşip gerçekleşmediği
    @FindBy (xpath = "(//h5[@class='m-0'])[1]")
    public WebElement orders;

}
