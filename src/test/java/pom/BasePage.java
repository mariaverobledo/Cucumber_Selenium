package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public class BasePage {

  //  private WebDriver driver;
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    //metodo para obtener el texto de un elemento
    public String getText(WebElement element){

        return element.getText();
    }

    public void click(WebElement element) throws Exception {
        try{
             element.click();
        }catch (Exception e){
            throw new Exception("No se pudo clickear el elmento " + element);
        }

    }
    public boolean isDisplayed(WebElement element) throws Exception {
        try {
         return element.isDisplayed();
        } catch (Exception e) {
            throw new Exception("No se encuentra visible el elemento " + element);
        }

    }

    public WebElement waitForVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void type(WebElement element, String texto){
        element.sendKeys(texto);

    }

}

