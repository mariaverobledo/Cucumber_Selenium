package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static java.lang.Thread.sleep;

public class TestButton extends TestBase{

    @Given("^User on the ToolsQA Home Page Elements$")
    public void userOnTheToolsQAHomePageElements() throws Throwable {
        buttonpage.clickSectionElements();

    }

    @When("^Click on the Button section$")
    public void click_on_the_Button_section() throws Throwable {
        buttonpage.clickSectionButton();
    }

    @When("^Double click on the button 'Double Click Me$")
    public void double_click_on_the_button_Double_Click_Me() throws Throwable {
        buttonpage.isVisibleRightButton();
        buttonpage.doubleClick();

    }

    @Then("^Should display message 'You have done a double click'$")
    public void should_display_message_You_have_done_a_double_click() throws Throwable {
        buttonpage.isVisibleMessageDoubleClick();
        Assert.assertEquals("You have done a double click", buttonpage.getTextMessageDoubleClick());
    }


    @When("^Right click on the button 'Right Click Me$")
    public void right_click_on_the_button_Right_Click_Me() throws Throwable {
        buttonpage.isVisibleRightButton();
        buttonpage.rightClick();

    }

    @Then("^Should display message 'You have done a right click'$")
    public void should_display_message_You_have_done_a_right_click() throws Throwable {
        buttonpage.isVisibleMessageRightClick();
        Assert.assertEquals("You have done a right click", buttonpage.getTextMessageRightClick());
    }

    @When("^Click on the button 'Click Me$")
    public void click_on_the_button_Click_Me() throws Throwable {
        buttonpage.isVisibleOneClickButton();
        buttonpage.oneClick();
    }

    @Then("^Should display message 'You have done a dynamic click'$")
    public void should_display_message_You_have_done_a_dynamic_click() throws Throwable {
        buttonpage.isVisibleMessageOneClick();
        Assert.assertEquals("You have done a dynamic click", buttonpage.getTextMessageOneClick());

    }

}
