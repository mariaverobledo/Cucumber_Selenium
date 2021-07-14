package seleniumgluecode;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.lang.Thread.sleep;

public class TestFile extends TestBase{
    @When("^Click on the Upload/Download Section$")
    public void clickOnTheUploadDownloadSection() throws Throwable {
        filepage.scrollDown();
        filepage.clickSection();
    }

    @When("^click on button download$")
    public void clickOnButtonDownload() throws Throwable {
        filepage.clickDownload();
    }

    @Then("^file is downloaded$")
    public void fileIsDownloaded() throws Throwable {
        filepage.download();
        sleep(5000);
    }


}
