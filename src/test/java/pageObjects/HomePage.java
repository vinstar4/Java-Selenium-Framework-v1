package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    
    //a[@title='My Account']
    //@FindBy(xpath="//span[normalize-space()='My Account']")
    @FindBy(xpath="//a[@title='My Account']")
    WebElement lnkMyaccount;

    @FindBy(xpath="//a[normalize-space()='Register']")
    WebElement lnkRegister;
    
    @FindBy(linkText = "Login")
    WebElement linkLogin;
    
    

    public void clickMyAccount()
    {
        lnkMyaccount.click();
    }

    public void clickRegister()
    {
        lnkRegister.click();
    }
    
    public void clickLogin()
    {
        linkLogin.click();
    }
}