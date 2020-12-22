package co.com.qvision.retoautomatizacion.questions;

import co.com.qvision.retoautomatizacion.ui.PaginaHotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorA implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {

        return PaginaHotel.TOTAL_PAGAR.resolveFor(actor).getText().replace("$","")
                .trim();
    }

    public static ValorA pagar(){
        return new ValorA();

    }
}
