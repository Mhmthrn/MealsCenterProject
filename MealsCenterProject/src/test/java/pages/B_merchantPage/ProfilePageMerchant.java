package pages.B_merchantPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProfilePageMerchant {


    public ProfilePageMerchant (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Merchant page sayfasinda sag üstte girilen kullanici isimini tiklayinca
    // acilan sayfadaki basic details elementi

    @FindBy(xpath = "(//*[text()='Basic Details'])[1]")
    public WebElement basicDetailsMerchantP;

    // Merchant page sayfasinda sag üstte girilen kullanici isimini tiklayinca acilan

    // sayfadaki basic details'taki first name elementi
    @FindBy (id = "AR_merchant_user_first_name")
    public WebElement firstNameMerchantP;

    // Merchant page sayfasinda sag üstte girilen kullanici isimini tiklayinca acilan
    // sayfadaki basic details'taki last name elementi

    @FindBy (id = "AR_merchant_user_last_name")
    public WebElement lastNameMerchantP;


    // Merchant page sayfasinda sag üstte girilen kullanici isimini tiklayinca acilan
    // sayfadaki basic details'taki Email box elementi

    @FindBy (id = "AR_merchant_user_contact_email")
    public WebElement emailBoxMerchantP;

    // Merchant page sayfasinda sag üstte girilen kullanici isimini tiklayinca acilan
    // sayfadaki basic details'taki contact number elementi

    @FindBy (id = "AR_merchant_user_contact_number")
    public WebElement contactNumberMerchantP;

    // Merchant page sayfasinda sag üstte girilen kullanici isimini tiklayinca acilan sayfadaki
    // basic details'taki user name elementi

    @FindBy (id = "AR_merchant_user_username")
    public WebElement userNamebasicMerchantP;

    // Merchant page sayfasinda sag üstte girilen kullanici isimini tiklayinca acilan sayfadaki
    // basic details'taki Browse elementi

    @FindBy (xpath = "//button[@class='btn btn-info']")
    public WebElement browseMerchantP;


    // Merchant page sayfasinda sag üstte girilen kullanici isimini tiklayinca
    // acilan sayfadaki basic details'taki Browse'a tiklayinca acilan sayfadaki uploadnew elementi

    @FindBy (linkText = "Upload New")
    public WebElement uploadNewMerchantP;

    // Merchant page sayfasinda sag üstte girilen kullanici isimini tiklayinca
    // acilan sayfadaki basic details'taki Browse'a ve upload'a tiklayinca acilan sayfadaki
    // Select files elementi

    @FindBy (xpath = "//a[@class='btn btn-green fileinput-button dz-clickable']")
    public WebElement selectFilesMerchantP;

    // Merchant page sayfasinda sag üstte girilen kullanici isimini tiklayinca
    // acilan sayfadaki basic details'taki Browse'a  ve upload'a tiklayinca acilan sayfadaki Select files'tan sonra Add Files elementi

    @FindBy (xpath = "(//button[@class='btn btn-green'])[2]")
    public WebElement addFilesMerchantP;

    // Merchant page sayfasinda sag üstte girilen kullanici isimini tiklayinca
    // acilan sayfadaki save elementi

    @FindBy (xpath = "(//input[@class='btn btn-green btn-full mt-3']")
    public WebElement saveMerchantP;

    // YENI LOCATE LERI ASAGIYA EKLEYELIM:

    @FindBy (xpath = "(//*[@class='m-0'])[3]")
    public WebElement fotoAddProfilMerchant;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement saveProfilMerchant;


}
