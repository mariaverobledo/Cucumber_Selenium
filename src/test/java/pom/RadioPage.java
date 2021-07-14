package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RadioPage extends BasePage{

    @FindBy(xpath = "//*[@class='text' and contains (.,'Radio Button')]")
    private WebElement radioLocator;

    @FindBy(xpath= "//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]")
    private WebElement yesRadioLocator;

    @FindBy(xpath="//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[4]")
    private WebElement noRadioLocator;

    @FindBy(xpath="//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]")
    private WebElement impressiveLocator;

    @FindBy(className = "text-success")
    private WebElement textSuccessLocator;

    public RadioPage(WebDriver driver) {
        super(driver);
    }

    public void clickRadioButton() throws Exception {
        click(radioLocator);
    }

    public void selectYes() throws Exception {
        click(yesRadioLocator);
    }

    public void selectNo() throws Exception {
        click(noRadioLocator);
    }
    public boolean isSelect() throws Exception {
        return noRadioLocator.isSelected();
    }

    public void selectImpressive() throws Exception {
        click(impressiveLocator);
    }

    public void waitTextSuccess(){
        waitForVisibility(textSuccessLocator);
    }

    public void waitRadioYes(){
       waitForVisibility(yesRadioLocator);
    }

    public void waitRadioNo(){
        waitForVisibility(noRadioLocator);
    }
    public boolean isVisibleYes() throws Exception {
        return isDisplayed(textSuccessLocator);
    }
    public boolean isVisibleImpressive() throws Exception {
        return isDisplayed(textSuccessLocator);
    }
    public String getTextMessage(){
        return getText(textSuccessLocator);
    }
}
