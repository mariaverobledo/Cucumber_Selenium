package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;


public class BrowserWinPage extends BasePage{

    JavascriptExecutor js = (JavascriptExecutor) driver;

    String title = "https://demoqa.com/sample";

    @FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[3]/div/div[3]/h5")
    private WebElement frameSection;

    @FindBy(xpath = "//*[@class='text' and contains (.,'Browser Windows')]")
    private WebElement browserSection;

    @FindBy(id="tabButton")
    private WebElement buttonNewTab;


    public BrowserWinPage(WebDriver driver) {
        super(driver);
    }

     public void clickFrameSection() throws Exception {
        click(frameSection);
    }

    public void scroll(){
        js.executeScript("arguments[0].scrollIntoView();", frameSection);
    }

    public void clickBrowserSection() throws Exception {
        click(browserSection);


    }

    public String clickNewTab() throws Exception {
        //se guarda string con la ventana activa
        String actualWindow = driver.getWindowHandle();

        click(buttonNewTab);
        sleep(5000);
        //se instancia array con el manejador de ventanas activas
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());

        //se remueve el foco de la primera ventana
        newTab.remove(actualWindow);

        //se cambia el foco a la nueva ventana
        driver.switchTo().window(newTab.get(0));

        String urltab = driver.getCurrentUrl();
        System.out.println("se imprime primera ventana " +urltab);

        return urltab;
    }

    public String getTitle(){
        return title;
    }
}
