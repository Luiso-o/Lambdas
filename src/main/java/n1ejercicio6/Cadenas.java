package n1ejercicio6;

import java.util.ArrayList;
import java.util.Comparator;

public class Cadenas {
    public static void main(String[] args) {
        ArrayList<String>nombresYCadenas = new ArrayList<>();

        nombresYCadenas.add("Marcos");
        nombresYCadenas.add("Me gusta comer fruta");
        nombresYCadenas.add("Alex");
        nombresYCadenas.add("Las camisas azules son mis favoritas");
        nombresYCadenas.add("Felix");
        nombresYCadenas.add("Soy Estudiante de programación");
        nombresYCadenas.add("Martha");
        nombresYCadenas.add("Soy Doctora");
        nombresYCadenas.add("Alicia");
        nombresYCadenas.add("Adoro salir cada dia a caminar");
        nombresYCadenas.add("José");
        nombresYCadenas.add("Salí de la universidad hace más de 10 añosa");

        //comparando las cadenas desde las más cortas a más largas
        nombresYCadenas.sort(Comparator.comparingInt(String::length));
        //Imprimo resultado en consola
        nombresYCadenas.forEach(System.out::println);

    }
}
