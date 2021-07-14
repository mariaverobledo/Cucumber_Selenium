package seleniumgluecode;

import javafx.scene.control.RadioButton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pom.*;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homepage = PageFactory.initElements(driver, HomePage.class);
    protected TextBoxPage textBoxPage = PageFactory.initElements(driver, TextBoxPage.class);
    protected RadioPage radioPage = PageFactory.initElements(driver, RadioPage.class);
    protected WebTablePage tablepage = PageFactory.initElements(driver, WebTablePage.class );
    protected ButtonPage buttonpage = PageFactory.initElements(driver, ButtonPage.class );
    protected FilePage filepage = PageFactory.initElements(driver, FilePage.class );
    protected BrowserWinPage browserpage = PageFactory.initElements(driver, BrowserWinPage.class );

}
