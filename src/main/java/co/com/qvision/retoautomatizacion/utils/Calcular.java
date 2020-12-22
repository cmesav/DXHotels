package co.com.qvision.retoautomatizacion.utils;

import java.util.ArrayList;
import java.util.List;

public class Calcular {

    static double value = 0;
    private static String retun;
    static int posicion = 1;

    public static List<String> menorPrecio(ArrayList<ArrayList<String>> list1) {
        List<String> resultado = new ArrayList<>();
        value = Double.parseDouble(list1.get(0).get(0).replace("$", ""));

        for (int j = 0; j < list1.size(); j++) {
            if (Double.parseDouble(list1.get(j).get(0).replace("$", "")) <= value) {
                retun = list1.get(j).get(0);
                posicion = j + 1;

            }
        }
//        }
        resultado.add(String.valueOf(posicion));
        resultado.add(retun);

        return resultado;
    }

}
