package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WindowManager;

public class HomePage {

    private WebDriver driver;
    //private By formAuthenticationLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //1. Click Form Authentication
    public LoginPage ClickAuthenticationLink(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    //2. Click Dropdown
    public DropDownPage ClickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    //3.Click ForgotPassword
    public ForgotPassword clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }
    //4.Click Hovers
    public HoversPage clickHovers(){
    clickLink("Hovers");
    return new HoversPage(driver);
    }
    //5.Click KeyPressesPage
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    //6. Click HorizontalSlider
    public HorizontalSlider clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
    //7. Click JavaScriptAlerts
    public JavaScriptAlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    //8. Click ContextMenuPage
    public ContextMenuPage clickContextMenuLink(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    //9. Click ContextMenuPage
    public FileUploadPage  clickFileUploadPage(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    //10. Click EntryAd Link
    public EntryAdPage clickEntryAdPage(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }

    //11. Click  WYSIWYG Editor Link
    public WYSIWYGEditorPage clickWYSIWYGEditorLink(){
        clickLink("WYSIWYG Editor");
        return new  WYSIWYGEditorPage(driver);
    }

    //12 . Click Frames => Optional Independent Exercise
    public FramePage clickFramesLink(){
        clickLink("Frames");
        return new FramePage(driver);
    }
    //13. click Dynamic Loading
    public DynamicLoadingPage clickDynamicLoadingLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    //14. Click Large & Deep DOM
    public LargeDeepDOMPage clickLargeDeepDOMLink(){
        clickLink("Large & Deep DOM");
        return new LargeDeepDOMPage(driver);
    }

    //15. Click Infinite Scroll
    public InfiniteScrollPage clickInfiniteScrollLink(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    //16. Click ClickDropDown4JsExecutorUse
    public DropDownPage4JsExecutorUse clickDropDown4JsExecutorUse(){
        clickLink("Dropdown");
        return new DropDownPage4JsExecutorUse(driver);
    }
    //17. Click Multiple Windows
    public MultipleWindowsPage clickMultipleWindowsLink(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    //18. click Dynamic Loading link
    public NavigationDynamicLoadingPage clickDynamicLoadingLink2(){
        clickLink("Dynamic Loading");
        return new NavigationDynamicLoadingPage(driver);

    }
    //19. Click Checkboxes Link
    public CheckboxesPage clickCheckboxes(){
        clickLink("Checkboxes");
        return new CheckboxesPage(driver);
    }
    private void clickLink(String linkText){
    driver.findElement(By.linkText(linkText)).click();
    }

}
