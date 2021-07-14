package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.HashMap;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class FilePage extends BasePage{

    private String downloadFilePath = "C:\\Users\\Veronica\\Downloads\\Descarga";

    JavascriptExecutor js = (JavascriptExecutor) driver;


    @FindBy(id = "downloadButton")
    private WebElement downloadButtonLocator;

    @FindBy(xpath = "//*[@class='text' and contains (.,'Upload and Download')]")
    private WebElement sectionDownLoadFile;

    public FilePage(WebDriver driver) {
        super(driver);
    }


    public void clickSection() throws Exception {
        click(sectionDownLoadFile);
    }

    public void scrollDown(){
        js.executeScript("arguments[0].scrollIntoView();", sectionDownLoadFile);
    }

    public void clickDownload() throws Exception {
        click(downloadButtonLocator);
        sleep(9000);
    }

    public void download() throws InterruptedException {

        File file = new File(downloadFilePath);

        File [] listofFiles = file.listFiles();
        assertTrue("not found", listofFiles.length>0);
    }
}
