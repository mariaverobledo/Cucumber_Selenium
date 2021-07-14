package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Thread.sleep;

public class TestWebTable extends TestBase{


    @When("^Click on the Web Tables Section$")
    public void click_on_the_Web_Tables_Section() throws Throwable {
        tablepage.clickSelectWebTable();

    }

    @When("^Enter name in search field$")
    public void enter_name_in_search_field() throws Throwable {
        tablepage.findName();
    }

    @When("^Click on 'Delete'$")
    public void click_on_Delete() throws Throwable {
        tablepage.deleteRegister();
    }

    @Then("^Register is deleted$")
    public void register_is_deleted() throws Throwable {
        tablepage.isVisibleNoFoundRegMessage();


    }

    @When("^Click on 'Edit'$")
    public void click_on_Edit() throws Throwable {
        tablepage.clickEdit();
    }

    @When("^Enter name to edit in search field$")
    public void enter_name_in_Name_Field() throws Throwable {
        tablepage.clearField();
        tablepage.typeFirstName();


    }

    @When("^Enter salary in field Name$")
    public void enter_salary_in_Name_Salary() throws Throwable {

    }

    @When("^Click on 'Submit'$")
    public void click_on_Submit() throws Throwable {
        tablepage.clickSubmit();

    }

    @Then("^Register is modified$")
    public void register_is_modified() throws Throwable {

    }

    @When("^Click on 'Add'$")
    public void click_on_Add() throws Throwable {

    }

    @When("^Enter last name in Last Name Field$")
    public void enter_last_name_in_Last_Name_Field() throws Throwable {

    }

    @When("^Enter email in$")
    public void enter_email_in() throws Throwable {
;
    }

}
