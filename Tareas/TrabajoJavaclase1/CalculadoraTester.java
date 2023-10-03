package operaciones;
import java.util.Scanner;

public class CalculadoraTester {
    public static void main(String[] args) {

        System.out.println("Calculadora");

        System.out.println("Seleccione:");

        System.out.println("1.-Sumar");

        System.out.println("2.-Restar");

        System.out.println("3.-Multiplicar");

        System.out.println("4.-Dividir");

        System.out.println("Opcion : ");

        Scanner in = new Scanner(System.in);

        int opcion = in.nextInt();

        System.out.println("Ingrese a:");

        Scanner in2 = new Scanner(System.in);

        double a = in2.nextDouble();

        System.out.println("Ingrese b:");

        Scanner in3 = new Scanner(System.in);

        double b = in3.nextDouble();

        Calculadora calculadora = new Calculadora();

        double r = 0;

        if(opcion == 1) {

            r = calculadora.sumar(a, b);

        }

        if(opcion == 2) {

            r = calculadora.restar(a, b);

        }

        if(opcion == 3) {

            r = calculadora.multiplicar(a, b);

        }

        if(opcion == 4) {

            r = calculadora.dividir(a, b);

        }



        System.out.println("El resultado es "+ r);

    }
}
