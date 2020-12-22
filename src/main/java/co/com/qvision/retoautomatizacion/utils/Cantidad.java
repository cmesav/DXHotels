package co.com.qvision.retoautomatizacion.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Cantidad {

    private Cantidad() {
    }

    public static int deDias(String fechaInicial, String fechaFinal) throws ParseException {

        SimpleDateFormat dateFormat= new SimpleDateFormat("MM/dd/yyyy");
        Date fechaIni =dateFormat.parse(fechaInicial);
        Date fechaFin =dateFormat.parse(fechaFinal);
        return (int)((fechaFin.getTime()-fechaIni.getTime())/86400000)+1;

    }


}
