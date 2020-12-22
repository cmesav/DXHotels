package co.com.qvision.retoautomatizacion.tasks;

import co.com.qvision.retoautomatizacion.ui.PaginaResultados;
import co.com.qvision.retoautomatizacion.utils.Calcular;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.ArrayList;
import java.util.List;

public class ElegirHotelPor implements Task {

    private ArrayList<String> values = new ArrayList<>();
    ArrayList<ArrayList<String>> list1 = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int i = 0; i < PaginaResultados.HOTEL_INFO.resolveAllFor(actor).size(); i++) {
            values.add(PaginaResultados.COSTO_HOTEL.of(String.valueOf(i + 1)).resolveFor(actor)
                    .getText());
            list1.add(i, values);
            values=new ArrayList<>();
        }
        List<String> resultado =Calcular.menorPrecio(list1);

        //actor recuerda el precio mas barato por noche
        actor.remember("barato",resultado.get(1).replace("$",""));

        actor.attemptsTo(
                WaitUntil.the(PaginaResultados.BTN_MEJOR_PRECIO.of(resultado.get(1)
                        .replace("$","")),
                WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PaginaResultados.BTN_MEJOR_PRECIO.of(resultado.get(1)
                .replace("$",""))));

    }

    public static ElegirHotelPor menorPrecio() {
        return Tasks.instrumented(ElegirHotelPor.class);

    }

}
