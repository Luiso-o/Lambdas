package n2ejercicio3;

public class Calculadora {

    public static void main(String[] args) {

        // Suma
        Funcional suma = () -> 2.5f + 3.7f;
        float resultadoSuma = suma.operacion();
        System.out.println("Resultado de la suma: " + resultadoSuma);

        // Resta
        Funcional resta = () -> 5.8f - 2.3f;
        float resultadoResta = resta.operacion();
        System.out.println("Resultado de la resta: " + resultadoResta);

        // Multiplicación
        Funcional multiplicacion = () -> 4.2f * 1.5f;
        float resultadoMultiplicacion = multiplicacion.operacion();
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);

        // División
        Funcional division = () -> 8.9f / 2.2f;
        float resultadoDivision = division.operacion();
        System.out.println("Resultado de la división: " + resultadoDivision);

    }

}
