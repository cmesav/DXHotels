package co.com.qvision.retoautomatizacion.tasks;

import co.com.qvision.retoautomatizacion.interactions.Agregar;
import co.com.qvision.retoautomatizacion.interactions.Elegir;
import co.com.qvision.retoautomatizacion.interactions.Ingresar;
import co.com.qvision.retoautomatizacion.interactions.Seleccionar;
import co.com.qvision.retoautomatizacion.models.BuscarHotel;
import co.com.qvision.retoautomatizacion.ui.PaginaInicial;
import co.com.qvision.retoautomatizacion.utils.Cantidad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.text.ParseException;
import java.util.List;

public class RealizarBusqueda implements Task {

    private final List<BuscarHotel> datos;

    public RealizarBusqueda(List<BuscarHotel> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Seleccionar.ciudad(datos.get(0).getCiudad()),
                Ingresar.fecha(datos.get(0).getFechaInicio(), "checkIn"),
                Ingresar.fecha(datos.get(0).getFechaFin(), "checkOut"),
                Elegir.habitaciones(datos.get(0).getHabitaciones()),
                Agregar.personas("adults", datos.get(0).getNumeroAdultos()),
                Agregar.personas("children", datos.get(0).getNumeroNinos()),
                Click.on(PaginaInicial.BTN_BUSCAR));

        try {
            actor.remember("dias", Cantidad.deDias(datos.get(0).getFechaInicio(),
                    datos.get(0).getFechaFin()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static RealizarBusqueda conLos(List<BuscarHotel> datos) {
        return Tasks.instrumented(RealizarBusqueda.class, datos);
    }

}
