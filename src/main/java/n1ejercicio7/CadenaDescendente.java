package n1ejercicio7;

import java.util.ArrayList;

public class CadenaDescendente {
    public static void main(String[] args) {
        ArrayList<String> nombresYCadenas = new ArrayList<>();

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

        nombresYCadenas.sort((s1,s2) -> Integer.compare(s2.length(),s1.length()));
        nombresYCadenas.forEach(System.out::println);

    }
}
