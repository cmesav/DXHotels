package co.com.qvision.retoautomatizacion.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaHotel {

    private PaginaHotel() {
    }

    public static final Target TOTAL_PAGAR = Target.the("{0}")
            .locatedBy("//h4[@class='total-price']");

}
