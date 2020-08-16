package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import poms.BasePOM;
import poms.TablePOM;

public class MyPersonalInfoStep {

    BasePOM base = new BasePOM();
    TablePOM page = new TablePOM();

    @Then("^Click on the \"([^\"]*)\"$")
    public void clickOnThe(String newName) {
        base.waitAndClick(page.myPersonalInfoButton);

    }

    @When("^I change the Name to \"([^\"]*)\"$")
    public void iChangeTheNameTo(String newName) {
        base.waitAndSendKeys(page.firstNameTextBox, newName);
    }


    @And("^I change the password to \"([^\"]*)\"$")
    public void iChangeThePasswordTo(String newPassword)  {
        base.waitAndSendKeys(page.currentPasswordTextBox, "gY1aB9xQ2xB4sG4d");
        base.waitAndSendKeys(page.passwordButton, newPassword);
        base.waitAndSendKeys(page.passwordConfirmationTextBox, newPassword);
    }

    @Then("^Click on the save button$")
    public void clickOnTheSaveButton() {
        base.waitAndClick(page.saveButton);
    }

    @Then("^Verify the name it is not \"([^\"]*)\"$")
    public void verifyTheNameItIsChangedTo(String newName)  {
        Assert.assertNotEquals(page.accountButton.getText().toUpperCase(), newName);
    }

    @Then("^Verify the name is \"([^\"]*)\"$")
    public void verifyTheNameIs(String name) {
        Assert.assertEquals(page.accountButton.getText().toUpperCase(), name);

    }

    @Then("^go back to account page again$")
    public void goBackToAccountPageAgain() {
        base.waitAndClick(page.backToyourAccountButton);
    }
}
