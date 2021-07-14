package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy (xpath = "//*[@id='app']/div/div/div[2]/div/div[1]")
    private WebElement sectionLocator;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSectionElements() throws Exception {
        click(sectionLocator);
    }

    public void clickSectionRadio() throws Exception {
        click(sectionLocator);
    }

    }

