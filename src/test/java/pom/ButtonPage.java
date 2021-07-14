package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static java.lang.Thread.sleep;

public class ButtonPage extends BasePage{

    //private WebDriver driver;
    Actions builder = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//*[@class='text' and contains (.,'Buttons')]")
    private WebElement buttonSectionLocator;

    @FindBy(xpath="/html/body/div/div/div/div[2]/div[2]/div[1]/div[1]/button")
    private WebElement doubleButtonLocator;

    @FindBy(xpath="/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/button")
    private WebElement rightButtonLocator;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/button")
    private WebElement buttonLocator;

    @FindBy(id = "doubleClickMessage")
    private WebElement doubleClickMessage;

    @FindBy(id = "rightClickMessage")
    private WebElement rightClickMessage;

    @FindBy(id="dynamicClickMessage")
    private WebElement dynamicClickMessage;

    @FindBy (xpath = "//*[@id='app']/div/div/div[2]/div/div[1]")
    private WebElement sectionLocator;

    public ButtonPage(WebDriver driver) {
        super(driver);
    }

    public void clickSectionElements() throws Exception {
        click(sectionLocator);
    }
    public void clickSectionButton() throws Exception {
        scroll(buttonSectionLocator);
        click(buttonSectionLocator);
    }

    public void oneClick() throws Exception {
        click(buttonLocator);
    }

    public void rightClick() throws Exception {
        builder.contextClick(rightButtonLocator).perform();

    }

    public void doubleClick() throws InterruptedException {
        builder.doubleClick(doubleButtonLocator).perform();

    }
    public void isVisibleOneClickButton(){

        waitForVisibility(buttonLocator);
    }

    public void isVisibleRightButton(){

        waitForVisibility(rightButtonLocator);
    }

    public void isVisibleDobleButton(){

        waitForVisibility(doubleButtonLocator);
    }

    public void isVisibleMessageOneClick(){
        waitForVisibility(dynamicClickMessage);
    }

    public void isVisibleMessageDoubleClick(){

        waitForVisibility(doubleClickMessage);
    }

    public void isVisibleMessageRightClick(){

        waitForVisibility(rightClickMessage);
    }

    public String getTextMessageOneClick(){
      return
              getText(dynamicClickMessage);
    }

    public String getTextMessageDoubleClick(){
       return
               getText(doubleClickMessage);
    }

    public String getTextMessageRightClick(){
       return
               getText(rightClickMessage);
    }

    public void scroll(WebElement element){
        js.executeScript("arguments[0].scrollIntoView();", element );
    }
}
