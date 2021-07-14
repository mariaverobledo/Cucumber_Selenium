package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static java.lang.Thread.sleep;

public class TestBrowserWin extends TestBase{

    @Given("^User on the ToolsQA Home Page Frame$")
    public void userOnTheToolsQAHomePageFrame() throws Exception {
        browserpage.scroll();
        browserpage.clickFrameSection();
    }

    @When("^Click on the Browser Window section$")
    public void click_on_the_Browser_Window_section() throws Throwable {
        sleep(5000);
        browserpage.clickBrowserSection();

    }

    @When("^Click on New Tab Button$")
    public void click_on_New_Tab_Button() throws Throwable {
        browserpage.clickNewTab();
    }

    @Then("^Should it open new tab$")
    public void should_it_open_new_tab() throws Throwable {
        sleep(5000);

        Assert.assertEquals(browserpage.getTitle(), "https://demoqa.com/sample");
    }


}
