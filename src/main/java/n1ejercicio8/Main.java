package n1ejercicio8;

import java.lang.*;

public class Main {

    public static void main(String[] args) {

        InterfazFuncional reversa = a -> {
            StringBuilder alRevez = new StringBuilder(a);
            return alRevez.reverse().toString();
        };

        String texto = "Hola Mundo";
        String textoInvertido = reversa.reversa(texto);

        System.out.println("Cadena Original: " + texto);
        System.out.println("Cadena Invertida: " + textoInvertido);
    }
}
