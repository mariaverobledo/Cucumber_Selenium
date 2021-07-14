package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pom.RadioPage;

import static java.lang.Thread.sleep;

public class TestRadioBox extends TestBase {

    @Given("^User on the ToolsQA Home Page$")
    public void user_on_the_ToolsQA_Home_Page() throws Throwable {
        homepage.clickSectionElements();
    }

    @When("^Click on the Radio Button section$")
    public void click_on_the_Radio_Button_section() throws Throwable {
        radioPage.clickRadioButton();

    }

    @When("^Click on 'Yes'$")
    public void click_on_Yes() throws Throwable {
        radioPage.selectYes();

    }

    @Then("^Should display messagge 'You have selected Yes'$")
    public void should_display_messagge_You_have_selected_Yes() throws Throwable {
        radioPage.waitTextSuccess();
        radioPage.isVisibleYes();
        Assert.assertEquals("Yes", radioPage.getTextMessage());

    }

    @When("^Click on 'Impressive'$")
    public void click_on_Impressive() throws Throwable {
        radioPage.selectImpressive();
    }

    @Then("^Should display message 'Impressive'$")
    public void should_display_message_Impressive() throws Throwable {
        radioPage.waitTextSuccess();
        radioPage.isVisibleImpressive();
        Assert.assertEquals("Impressive", radioPage.getTextMessage());
    }

    @When("^Click on 'No'$")
    public void click_on_No() throws Throwable {
        radioPage.selectNo();
    }

    @Then("^It should not allow to select 'No'$")
    public void it_should_not_allow_to_select_No() throws Throwable {
        System.out.println(radioPage.isSelect());
        Assert.assertFalse("False", radioPage.isSelect());
    }
}
