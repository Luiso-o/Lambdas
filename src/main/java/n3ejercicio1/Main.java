package n3ejercicio1;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Alumno>AlumnosQueComienzanPorA = new ArrayList<>();

        ArrayList<Alumno> misAlumnos = new ArrayList<>(Arrays.asList(
                new Alumno("José Mendoza", 23, "Java", 7),
                new Alumno("Maria Jimenez", 21, "PHP", 9),
                new Alumno("Martin Guitierres", 17, "C++", 8),
                new Alumno("Ana Ramires", 23, "PHYTON", 7),
                new Alumno("Sandra Ortiz", 17, "Java", 5),
                new Alumno("Pedro Treminio", 24, "PHP", 6),
                new Alumno("Joaquin Castillo", 23, "PHP", 3),
                new Alumno("Rebeca Urrutia", 21, "C++", 5),
                new Alumno("Juan Gomes", 23, "C++", 8),
                new Alumno("Victoria Batlle", 21, "Java", 7)));

        System.out.println("Lista de alumnos: \n ");
        listaAlumnos(misAlumnos);

        System.out.println("-----------------------------------------\nAlumnos cuyo nombre comienza por A:\n");
        listaA(misAlumnos,AlumnosQueComienzanPorA);

        notaSuperior(misAlumnos);

        System.out.println("-----------------------------------------\nAlumnos de PHP con notas superiores a 4\n");
        estudiantesPhp(misAlumnos);

        System.out.println("-----------------------------------------\nAlumnos de Java mayores de edad\n");
        javaMayoresEdad(misAlumnos);


    }

    static void listaAlumnos(ArrayList<Alumno>lista){
        IntStream.range(0, lista.size()).mapToObj(i -> (1 + i) + "-" + lista.get(i)).forEachOrdered(System.out::println);
    }

    static void listaA(ArrayList<Alumno>lista, ArrayList<Alumno>AlumnosQueComienzanPorA){

        lista.stream().filter(alumno -> alumno.getNombre().charAt(0) == 'A').forEach(alumno -> {
            AlumnosQueComienzanPorA.add(alumno);
            System.out.println(alumno);
        });
    }

    static void notaSuperior(ArrayList<Alumno>lista){
        IntStream.range(0, lista.size()).filter(i -> lista.get(i).getNota() > 5).mapToObj(lista::get).forEachOrdered(System.out::println);

    }

    static void estudiantesPhp(ArrayList<Alumno>lista){
        IntStream.range(0, lista.size()).filter(i -> lista.get(i).getNota() >= 5 && lista.get(i).getCurso().equals("PHP")).mapToObj(lista::get).forEachOrdered(System.out::println);

    }

    static void javaMayoresEdad(ArrayList<Alumno>lista){
        IntStream.range(0, lista.size()).filter(i -> lista.get(i).getCurso().equals("Java") && lista.get(i).getEdad() >= 18).mapToObj(lista::get).forEach(System.out::println);

    }

}
