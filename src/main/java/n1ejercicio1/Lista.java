package n1ejercicio1;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Oscar");
        lista.add("Camila");
        lista.add("Ofelia");
        lista.add("Mercedez");
        lista.add("Ortiz");
        lista.add("Marta");

        lista.stream().filter(s -> s.contains("O")).forEach(System.out::println);

    }

}

/*1-lista.stream() crea un stream a partir de la lista.

2-filter(s -> s.contains("O")) filtra los elementos del stream
para que solo aquellos que contengan la letra "O" sean incluidos.

3-forEach(System.out::println) itera sobre los elementos restantes
 del stream y los imprime en la consola utilizando System.out.println.*/