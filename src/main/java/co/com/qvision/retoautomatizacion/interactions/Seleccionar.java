package co.com.qvision.retoautomatizacion.interactions;

import co.com.qvision.retoautomatizacion.ui.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Interaction {

    private final String ciudad;

    public Seleccionar(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PaginaInicial.LOCACION),
                Click.on(PaginaInicial.VARIABLE.of(ciudad)));

    }

    public static Seleccionar ciudad(String ciudad) {
        return Tasks.instrumented(Seleccionar.class, ciudad);
    }
}
