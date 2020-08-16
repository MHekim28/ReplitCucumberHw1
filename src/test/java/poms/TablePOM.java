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

    @FindBy (css = ".icon-lock")
    public WebElement signInForCredentialsButton;
}

