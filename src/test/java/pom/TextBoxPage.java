package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage{

    @FindBy(xpath = "//*[@id='item-0' and @class='btn btn-light '  and contains (.,'Text Box')]")
    private WebElement textBoxLocator;

    @FindBy(id = "userName")
    private WebElement fullNameLocator;

    @FindBy(id = "userEmail")
    private WebElement emailLocator;

    @FindBy(id = "currentAddress")
    private WebElement cAdressLocator;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddress;

    @FindBy(id = "submit")
    private WebElement buttonLocator;

    @FindBy(id = "output")
    private WebElement outPutLocator;

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }


    public void inputName(){
        type(fullNameLocator, "maria");
    }

    public void inputEmail(){
        type(emailLocator, "maria@prueba.com");
    }

    public void inputCurrentAdress(){
        type(cAdressLocator, "Gral Paz 265");
    }

    public void inputPermanetAdress(){
        type(permanentAddress, "Delfin Gallo");
    }

    public void clickSubmit() throws Exception {
        click(buttonLocator);
    }

    public void isVisible() throws Exception {
        isDisplayed(outPutLocator);
    }

    public void clickSectionText() throws Exception {
        click(textBoxLocator);
    }

    public void waitForOutPut(){
        waitForVisibility(outPutLocator);
    }
}

