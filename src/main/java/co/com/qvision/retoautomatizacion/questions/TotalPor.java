package co.com.qvision.retoautomatizacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.text.DecimalFormat;

public class TotalPor implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {

        int dias = actor.recall("dias");
        double total=Double.parseDouble(actor.recall("barato"));
        total=total*dias;

        return decimales(total).replace(",",".");
    }

    private String decimales(double total){
        DecimalFormat mf = new DecimalFormat("0.00");
        mf.setMinimumFractionDigits(2);
        return mf.format(total);

    }

    public static TotalPor dias() {
        return new TotalPor();
    }
}
