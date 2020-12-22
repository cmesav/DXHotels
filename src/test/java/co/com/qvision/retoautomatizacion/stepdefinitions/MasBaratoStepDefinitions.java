package co.com.qvision.retoautomatizacion.stepdefinitions;

import co.com.qvision.retoautomatizacion.models.BuscarHotel;
import co.com.qvision.retoautomatizacion.questions.TotalPor;
import co.com.qvision.retoautomatizacion.questions.ValorA;
import co.com.qvision.retoautomatizacion.tasks.ElegirHotelPor;
import co.com.qvision.retoautomatizacion.tasks.RealizarBusqueda;
import co.com.qvision.retoautomatizacion.utils.Cantidad;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.text.ParseException;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MasBaratoStepDefinitions {

    @Managed
    private static WebDriver suNavegador;

    @Before
    public void setUpOneStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(suNavegador)));
        theActorCalled("Cmesa");
    }

    @Dado("^que el agente se encuentra en la pagina inicial$")
    public void queElAgenteSeEncuentraEnLaPaginaInicial() {

        theActorInTheSpotlight().wasAbleTo(Open.
                url("https://js.devexpress.com/Demos/DXHotels/#home"));
    }

    @Cuando("^el busca el destino con los datos$")
    public void elBuscaElDestinoConLosDatos(List<BuscarHotel> datos) {
        theActorInTheSpotlight().attemptsTo(RealizarBusqueda.conLos(datos));
        System.out.println(theActorInTheSpotlight().recall("dias").toString());
    }

    @Y("^selecciona el hotel con menor precio$")
    public void seleccionaElHotelConMenorPrecio() {

        theActorInTheSpotlight().attemptsTo(ElegirHotelPor.menorPrecio());
    }

    @Entonces("^el vera el \"([^\"]*)\"$")
    public void elVeraEl(String totalPagar) {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TotalPor.dias(),
                Matchers.equalTo(totalPagar)),GivenWhenThen.seeThat(ValorA.pagar(),
                Matchers.equalTo(totalPagar)));

    }

    @After
    public void cerrarElEscenario() {
        OnStage.drawTheCurtain();
    }
}
