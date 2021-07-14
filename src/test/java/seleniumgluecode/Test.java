package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.lang.Thread.sleep;

public class Test extends TestBase {


    @Given("^El usuario se encuentra en la página Home de ToolsQa$")
    public void el_usuario_se_encuentra_en_la_página_Home_de_ToolsQa() throws Throwable {
            homepage.clickSectionElements();

    }

    @When("^Hace clic en la seccion TextBox$")
    public void hace_clic_en_la_seccion_TextBox() throws Throwable {
            textBoxPage.clickSectionText();

    }

    @When("^Ingresa su nombre en el campo Full Name$")
    public void ingresa_su_nombre_en_el_campo_Full_Name() throws Throwable {
        textBoxPage.inputName();

    }

    @When("^Ingresa su emails en el campo Email$")
    public void ingresa_su_emails_en_el_campo_Email() throws Throwable {
        textBoxPage.inputEmail();

    }

    @When("^Ingresa su direccion actual en el campo Current Address$")
    public void ingresa_su_direccion_actual_en_el_campo_Current_Address() throws Throwable {

        textBoxPage.inputCurrentAdress();
    }

    @When("^Ingresa su dirección permanente en el campo Current Address$")
    public void ingresa_su_dirección_permanente_en_el_campo_Current_Address() throws Throwable {

        textBoxPage.inputPermanetAdress();

    }

    @When("^Se presiona el boton 'Submit'$")
    public void se_presiona_el_boton_Submit() throws Throwable {
        textBoxPage.clickSubmit();


    }

    @Then("^Se debe mostrar sección con todos los datos ingresados$")
    public void se_debe_mostrar_sección_con_todos_los_datos_ingresados() throws Throwable {
        textBoxPage.waitForOutPut();
        textBoxPage.isVisible();
    }

}
