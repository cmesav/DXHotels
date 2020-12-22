package co.com.qvision.retoautomatizacion.interactions;

import co.com.qvision.retoautomatizacion.ui.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Agregar implements Interaction {

    private final String tipo;
    private final String cantidad;

    public Agregar(String tipo, String cantidad) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaInicial.PERSONAS.of(tipo)),
                Click.on(PaginaInicial.VARIABLE.of(cantidad)));
    }

    public static Agregar personas(String tipo, String cantidad){
        return Tasks.instrumented(Agregar.class, tipo, cantidad);
    }
}
