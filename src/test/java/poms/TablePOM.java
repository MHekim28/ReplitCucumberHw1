package poms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablePOM extends BasePOM{
    public TablePOM() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = ".login")
    public WebElement signInButton;

    @FindBy (id = "email")
    public WebElement emailAddressButton;

    @FindBy (id = "passwd")
    public WebElement passwordButton;

    @FindBy (id = "confirmation")
    public WebElement passwordConfirmationTextBox;

    @FindBy (css = ".icon-lock")
    public WebElement signInForCredentialsButton;

    @FindBy (css = ".icon-user")
    public WebElement myPersonalInfoButton;

    @FindBy (id = "firstname")
    public WebElement firstNameTextBox;

    @FindBy (id = "old_passwd")
    public WebElement currentPasswordTextBox;

    @FindBy (css = "[name='submitIdentity']")
    public WebElement saveButton;

    @FindBy (css = ".account")
    public WebElement accountButton;

    @FindBy (xpath = "//i[@class='icon-chevron-left']")
    public WebElement backToyourAccountButton;



}

