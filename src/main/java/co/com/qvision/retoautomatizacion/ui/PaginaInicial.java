package co.com.qvision.retoautomatizacion.ui;

import net.serenitybdd.screenplay.targets.Target;


public class PaginaInicial {

    private PaginaInicial() {
    }

    public static final Target LOCACION = Target.the("Locacion")
            .locatedBy("//input[contains(@id,'_location')]");

    public static final Target VARIABLE = Target.the("{0}")
            .locatedBy("//*[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-dropdownlist-popup-wrapper dx-selectbox-popup-wrapper']//*[@class='dx-scrollview-content']//*[text()='{0}']");

    public static final Target FECHA = Target.the("{0}")
            .locatedBy("//input[contains(@id,'_{0}')]");

    public static final Target CUARTOS = Target.the("Cuartos")
            .locatedBy("//input[contains(@id,'_rooms')]");

    public static final Target PERSONAS = Target.the("{0}")
            .locatedBy("//input[contains(@id,'_{0}')]");

    public static final Target BTN_BUSCAR = Target.the("Boton Buscar")
            .locatedBy("//span[contains(text(),'SEARCH')]");


}
