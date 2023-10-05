import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("inserte un numero: ");
        double a = entrada.nextDouble();

        System.out.println("inserte el segundo numero");
        double b = entrada.nextDouble();

        double suma = suma (a, b);
        double resta = resta (a, b);
        double multiplicacion = multiplicacion (a, b);
        double division = division (a, b);


        System.out.println("el resultado de la suma es " + suma );
        System.out.println("el resultado de la resta es " + resta );
        System.out.println("el resultado de la multiplicación es " + multiplicacion);
        System.out.println("el resultado de la división es " + division );



    }

    public static double suma(double x, double y) {

        double z = x + y;
        return z;
    }
    public static double resta (double x, double y) {

        double z = x - y;
        return z;
    }
    public static double multiplicacion (double x, double y){

        double z = x * y;
        return z;
    }
    public static double division (double x, double y){

        double z = x / y;
        return z;
    }

}