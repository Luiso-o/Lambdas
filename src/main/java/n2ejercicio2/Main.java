package n2ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(55);
        numeros.add(44);
        numeros.add(2);
        numeros.add(35);
        numeros.add(88);
        numeros.add(30);
        numeros.add(29);
        numeros.add(71);

        String resultado = filtrarCadenas(numeros);
        System.out.println(resultado);
    }

    public static String filtrarCadenas(List<Integer> numeros) {
        StringBuilder cadenas = new StringBuilder();

        numeros.forEach(numero -> {
            if (numero % 2 == 0) {
                cadenas.append("e").append(numero);//si el numero es par se la agrega al inicio una e
            } else {
                cadenas.append("o").append(numero);//de lo contrario agregará una o
            }
            cadenas.append(", ");//agregamos una coma a continuación de cada numero
        });

        if (cadenas.length() > 2) {
            cadenas.setLength(cadenas.length() - 2); // eliminamos la última coma y espacio
            cadenas.append("."); // agregamos un punto al final de la cadena
        }

        return cadenas.toString();
    }
}
