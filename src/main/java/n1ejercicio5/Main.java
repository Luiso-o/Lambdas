package n1ejercicio5;

public class Main {
    public static void main(String[] args) {

        //instancia la interficie y asignale el valor 3.1415
        InterfazFuncional encuentraPi = () -> 3.1415;

        //invoca el metodo getPiValue
        double valorDePI = encuentraPi.getPiValue();

        //Imprime el resultado
        System.out.println("El valor de Pi es : " + valorDePI);


    }
}
