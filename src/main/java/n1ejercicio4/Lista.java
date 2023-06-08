package n1ejercicio4;

import java.util.ArrayList;
public class Lista {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
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

        lista.forEach(System.out::println);
    }

}

