package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberCase = 0;
    private String downloadFilePath = "C:\\Users\\Veronica\\Downloads\\Descarga";

    @Before
    public void setUp(){
        numberCase++;
        System.out.println("Se esta ejecutando el escenario: " + numberCase);
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");

        //se mapea path de descarga
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("download.default_directory", downloadFilePath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        driver = new ChromeDriver(options);
     //   driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        //se define la carpeta de descarga downloadFilePath


    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image.png");
        }
        System.out.println("El escenario nro " + numberCase + " se ejecutó correctamente");

        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}
