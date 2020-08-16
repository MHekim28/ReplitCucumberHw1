package steps;

import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import poms.BasePOM;
import poms.TablePOM;
import utils.BaseDriver;

public class LoginStep {

    private WebDriver driver;
    BasePOM base = new BasePOM();
   TablePOM page = new TablePOM();

    @Given("^Navigate to:  http://automationpractice\\.com/index\\.php$")
    public void navigate_to_http_automationpractice_com_index_php()  {
        driver = BaseDriver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^Click on first sign in button$")
    public void click_on_first_sign_in_button()  {
        base.waitAndClick(page.signInButton);
    }

    @Then("^Enter the Email Address and Password$")
    public void enter_the_Email_Address_and_Password()  {
        base.waitAndSendKeys(page.emailAddressButton, "sseagle@gmail.com");
        base.waitAndSendKeys(page.passwordButton, "KafkasKartali1978@");
    }

    @And("^Click on sign in button$")
    public void click_on_sign_in_button()  {
        base.waitAndClick(page.signInForCredentialsButton);
    }
}
