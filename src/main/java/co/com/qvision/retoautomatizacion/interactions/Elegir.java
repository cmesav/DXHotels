package co.com.qvision.retoautomatizacion.interactions;

import co.com.qvision.retoautomatizacion.ui.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Elegir implements Interaction {

    private String cantidad;

    public Elegir(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaInicial.CUARTOS),
                Click.on(PaginaInicial.VARIABLE.of(cantidad)));

    }

    public static Elegir habitaciones(String cantidad) {
        return Tasks.instrumented(Elegir.class, cantidad);
    }
}
