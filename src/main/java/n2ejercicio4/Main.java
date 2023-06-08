package n2ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("anguila");
        lista.add("elote");
        lista.add("amigo");
        lista.add("elefante");
        lista.add("perro");
        lista.add("4a");//44
        lista.add("casa");
        lista.add("antilope");
        lista.add("enano");
        lista.add("equino");
        lista.add("antena");
        lista.add("e4");

        // Ordenar alfabéticamente por el primer carácter
        lista.sort(Comparator.comparingInt(s -> s.charAt(0)));

        // Ordenar cadenas con 'e' primero, luego el resto de cadenas
        lista.sort((s1, s2) -> {
            boolean s1E = s1.contains("e");
            boolean s2E = s2.contains("e");
            return Boolean.compare(s2E, s1E);
        });

        // Modificar elementos que contienen 'a' por '4'
        lista.replaceAll(s -> s.replace("a", "4"));

        //mostrar solo los elementos numéricos
        lista.stream()
                .flatMap(s -> Stream.of(s.split("\\D+")))
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);

        // Mostrar las cadenas que tengan elementos numéricos
        //lista.stream().filter(s -> s.contains("4")).forEach(System.out::println);

    }
}

