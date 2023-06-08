package n1ejercicio2;

import java.util.*;

public class Lista2 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Karla");
        lista.add("Oscar");
        lista.add("Maria");
        lista.add("Ofelia");
        lista.add("Mercedez");
        lista.add("Ortiz");
        lista.add("Marta");
        lista.add("Sandra");
        lista.add("Alejandro");
        lista.add("Martin");

        lista.stream().filter(s -> s.contains("O") || s.length() == 5).forEach(System.out::println);

    }

}
