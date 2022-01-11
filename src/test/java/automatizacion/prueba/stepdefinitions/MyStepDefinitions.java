package automatizacion.prueba.stepdefinitions;

import automatizacion.prueba.tasks.AbrirTask;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class MyStepDefinitions {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast()) ;
    }

    @Dado("^que Christopher ingresa a la app Davivienda$")
    public void queChristopherIngresaALaAppDavivienda() {
        OnStage.theActorCalled("Christopher").wasAbleTo(AbrirTask.appDavivienda());
    }

    @Cuando("^digita sus credenciales$")
    public void digitaSusCredenciales() {
    }

    @Entonces("^Verifica que sus productos aparezcan$")
    public void verificaQueSusProductosAparezcan() {
    }

    @Dado("^que Christopher ingresa a la app davivienda cliente$")
    public void queChristopherIngresaALaAppDaviviendaCliente() {
    }

    @Cuando("^digita las credenciales de logueo$")
    public void digitaLasCredencialesDeLogueo() {
    }

    @Entonces("^Verifica que no puede acceder a los productos$")
    public void verificaQueNoPuedeAccederALosProductos() {
    }
}
