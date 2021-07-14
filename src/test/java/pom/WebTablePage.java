package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends BasePage{

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//*[@id='item-3' and contains (.,'Web Tables')]")
    private WebElement tableLocator;

    @FindBy(id = "searchBox")
    private WebElement searchBoxLocator;

    @FindBy(id = "delete-record-1")
    private WebElement deleteButtonLocator;

    @FindBy(id= "edit-record-1")
    private WebElement editButtonLocator;

    @FindBy(xpath = "//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[3]")
    private WebElement noFoundRegisterMessage;

    @FindBy(xpath = "//*[@id='firstName']")
    private WebElement textFirstNameLocator;

    @FindBy(xpath = "//*[@id='submit']")
    private WebElement submitButton;

    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    public void clickSelectWebTable() throws Exception {
        scroll(tableLocator);
        click(tableLocator);

    }

    public void findName(){

        type(searchBoxLocator, "Cierra");
    }

    public void deleteRegister() throws Exception {
        click(deleteButtonLocator);
    }

    public boolean isVisibleButton(){
        return deleteButtonLocator.isEnabled();
    }

    public void isVisibleSearchBox(){
       waitForVisibility(searchBoxLocator);

    }

    public void isVisibleSectionTable(){

        waitForVisibility(tableLocator);
    }
    public void isVisibleNoFoundRegMessage(){

        waitForVisibility(noFoundRegisterMessage);
    }

    public void scroll (WebElement element) {

        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clearField(){
        textFirstNameLocator.clear();
    }

    public void typeFirstName(){
        type(textFirstNameLocator, "Cierra modificado");

    }
    public void clickEdit() throws Exception {
        click(editButtonLocator);
    }
    public void clickSubmit() throws Exception {
        click(submitButton);
    }


}
