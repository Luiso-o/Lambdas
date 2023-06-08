package n1ejercicio3;

import java.util.*;

public class Meses {
    public static void main(String[] args) {

        ArrayList<String>lista = new ArrayList<>();
        lista.add("Enero");
        lista.add("Febrero");
        lista.add("Marzo");
        lista.add("Abril");
        lista.add("Mayo");
        lista.add("Junio");
        lista.add("Julio");
        lista.add("Agosto");
        lista.add("Septiembre");
        lista.add("Octubre");
        lista.add("Noviembre");
        lista.add("Diciembre");

       lista.forEach((mes) ->System.out.println(mes));

    }
}
