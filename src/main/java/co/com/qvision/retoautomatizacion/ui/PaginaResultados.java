package co.com.qvision.retoautomatizacion.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaResultados {

    private PaginaResultados() {
    }

    public static final Target COSTO_HOTEL = Target.the("Costo")
            .locatedBy("//*[@class='current-hotels']/*[{0}]//*[@class='rate-number']");

    public static final Target HOTEL_INFO = Target.the("Costo")
            .locatedBy("//*[@class='current-hotels']/*");

    public static final Target NOMBRE_HOTEL= Target.the("Nombre Hotel")
            .locatedBy("//*[@class='current-hotels']/*[{0}]//*[@class='name-hotel']");

    public static final Target BTN_MEJOR_PRECIO= Target.the("Boton Valor {0}")
            .locatedBy("//*[@class='current-hotels']//*[contains(text(),'{0}')]/ancestor::div[3]//*[@class='dx-button-content']");


}
