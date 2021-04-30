package com.ispeakbetter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.ispeakbetter.base.BasePage.driver;
import org.openqa.selenium.support.PageFactory;
import com.ispeakbetter.utils.HelperMethods;


public class LoginPage {

    // locators
@FindBy(xpath= "//*[@id=\"cmdSiginLink\"]")
public static WebElement loginBtn;

@FindBy(xpath= "//*[@id=\"_email\"]")
public static WebElement EmailTxt;

@FindBy(xpath = " //*[@id=\"_password\"]")
public static WebElement PasswordTxt;


@FindBy(xpath= "//*[@id=\"cmdSignin\"]")
public static WebElement SingInBtn;
// 2. Test case
    @FindBy(xpath= "//*[@id=\"navbar-collapse2\"]/ul/li[1]/a")
    public static WebElement dictionaryBtn;

@FindBy(xpath = "//*[@id=\"dict_selectlang\"]")
public static WebElement Dropdown;
    @FindBy(xpath = "//*[@id=\"getword\"]")
    public static WebElement wordtxt;
    @FindBy(xpath = "//*[@id=\"dialogbox-btn-0\"]")
    public static  WebElement searchBtn;
    // 3. Test Case
    @FindBy(xpath = "//*[@id=\"navbar-collapse2\"]/ul/li[3]/a")
    public static WebElement MessagesBTN;
    @FindBy(xpath = "//*[@id=\"subpages\"]/div/div[2]/a")
    public static WebElement composeBTN;
    @FindBy(xpath = "/html/body/div[2]/div/form[2]/select")
    public static WebElement WhoDropdown;
    @FindBy(xpath = "/html/body/div[2]/div/form[2]/select/option[2]")
    public static WebElement selectAdmin;
    @FindBy(xpath = "/html/body/div[2]/div/form[2]/input")
    public static WebElement EnterTitle;
    @FindBy(xpath = "/html/body")
    public static WebElement TextMessage;
    @FindBy(xpath = "/html/body/div[2]/div/form[2]/button")
    public static WebElement SendBTN;
    @FindBy(xpath = "//*[@id=\"subpages\"]/div/div[2]/div[1]")
    public static WebElement successfullySend;
// 4. Test Case Locators
@FindBy(xpath = "//*[@id=\"main\"]/div[3]/div/div/div[2]/div/div/center[2]/a")
public static WebElement ShowVocabularyBTN;
@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/form/div[1]/input")
public static WebElement enterWord;
@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/form/button")
public static WebElement searchWordBTN;
@FindBy(xpath = "/html/body/div[3]/div/div[1]")
public static WebElement Results;
// 5. Test Case Locators
@FindBy(xpath = "//a[contains(text(),'Redeem demo class')]")
public static WebElement redeemDemoClassBTN;
@FindBy(xpath = "/html/body/form/div/div/div/div[3]/div[2]/div/div/select")
public static WebElement timezoneSelect;
@FindBy(xpath = "/html/body/form/div/div/div/div[4]/div[2]/div/div/input")
public static WebElement referralCode;
@FindBy(xpath = "/html/body/form/div/div/div/span/button")
public static WebElement nextBTN;
@FindBy(xpath ="//*[@id=\"modal_democlass\"]/div/div/div[1]/div[2]/button")
public static WebElement closeBTN;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
public static Object verifyTitle (){
HelperMethods.doGetPageTitle();

    return null;
}

public static void clickLoginBtn(){
HelperMethods.doClick(loginBtn);
}
public static void enterEmail(String email){
HelperMethods.sendText(EmailTxt,email);
}
public static void enterPassword(String password){
        HelperMethods.sendText(PasswordTxt,password);

}
public static void clickSignIn(){
HelperMethods.doClick(SingInBtn);
}
public static String VerifyUrl(){
        return HelperMethods.getCurrentURL();
}
public static void clickDictionaryBtn(){
        HelperMethods.doClick(dictionaryBtn);
}
    public static void selectedDropdown(){
HelperMethods.dropDownMenu(Dropdown);
    }
    public static void enterWord(String Nword){
        HelperMethods.sendText(wordtxt,Nword);
    }
    public static void clickSearchBtn(){
        HelperMethods.doClick(searchBtn);
    }
    //3.Test Case Methods

    public static  void  clickMessagesBTN(){
        HelperMethods.doClick(MessagesBTN);
    }

    public static void  clickComposeBTN(){
        HelperMethods.doClick(composeBTN);
    }
    public static void clickWhoSend(){
        HelperMethods.doClick(WhoDropdown);
    }
    public  static  void setSelectAdmin(){
        HelperMethods.dropDownMenu(WhoDropdown);
    }
    public static void setEnterTitle(String Title){
        HelperMethods.sendText(EnterTitle,Title);
    }
    public static void enterMessegeText(String text){
        HelperMethods.sendText(TextMessage,text);
    }
    public static void clickSendBTN(){
        HelperMethods.doClick(SendBTN);
    }
    public static String getText(){
return HelperMethods.doGetText(successfullySend);
    }
   // 4. Test Case Methods
   public static void clickShowVocBTN(){
       HelperMethods.doClick(ShowVocabularyBTN);
   }
    public static void setEnterWord(String wordTXT){
        HelperMethods.sendText(enterWord,wordTXT);
    }
    public static void clickSearchWordBTN(){
        HelperMethods.doClick(searchWordBTN);
    }
    public static  String getResults(){
        return HelperMethods.doGetText(Results);
}
    // 5. Test Case Methods
    public static  void  clickRedeemClassBTN(){
        HelperMethods.doClick(redeemDemoClassBTN);
    }
    public static void selectedTimezone(){
        HelperMethods.dropDownMenu(timezoneSelect);
    }
    public static void enterRefferralCode(String text){
        HelperMethods.sendText(referralCode,text);
    }
    public static  void  clickNextBTN(){
        HelperMethods.doClick(nextBTN);
    }
    public static  void  clickCloseTN(){
        HelperMethods.doClick(closeBTN);
    }
}



