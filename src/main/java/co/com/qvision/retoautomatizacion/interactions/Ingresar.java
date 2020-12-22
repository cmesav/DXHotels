package co.com.qvision.retoautomatizacion.interactions;

import co.com.qvision.retoautomatizacion.ui.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Interaction {

    private String fecha;
    private String inOut;

    public Ingresar(String fecha, String inOut) {
        this.fecha = fecha;
        this.inOut = inOut;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PaginaInicial.FECHA.of(inOut)),
                Enter.theValue(fecha).into(PaginaInicial.FECHA.of(inOut)));

    }

    public static Ingresar fecha(String fecha, String inOut) {
        return Tasks.instrumented(Ingresar.class, fecha, inOut);
    }
}
