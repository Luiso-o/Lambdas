package n3ejercicio1;

public class Alumno {
    private final String nombre;
    private final int edad;
    private final String curso;
    private final int nota;

    public Alumno(String nombre, int edad, String curso, int nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nombre + ", " + edad + " años " +
                ", curso " + curso + ", nota " + " " + nota + " puntos.";
    }
}
