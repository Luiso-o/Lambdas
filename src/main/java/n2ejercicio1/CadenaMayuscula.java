package n2ejercicio1;

import java.util.ArrayList;

public class CadenaMayuscula {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("alejandro");
        nombres.add("ana");
        nombres.add("Arc");
        nombres.add("arc");
        nombres.add("Antonio");
        nombres.add("and");
        nombres.add("And");
        nombres.add("Ariel");
        nombres.add("ariel");
        nombres.add("Ant");

        /*1-convertir la lista en una secuencia de elementos (stream)
          2-filtrar los elementos con las codiciones que necesitamos (filter)
          3-imprimir en consola (forEach) (lambda ::) */

        nombres.stream().filter(nombre -> nombre.length() == 3 && nombre.charAt(0) == 'A').forEachOrdered(System.out::println);

    }

}
