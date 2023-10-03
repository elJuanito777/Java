package Calculadorapremium;

import java.util.Scanner;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora Avanzada");
            System.out.println("Elija una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Salir");

            int opcion = input.nextInt();

            if (opcion == 7) {
                System.out.println("¡Hasta luego!");
                break;
            }

            double resultado = 0;

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer número: ");
                    double num1 = input.nextDouble();
                    System.out.println("Ingrese el segundo número: ");
                    double num2 = input.nextDouble();
                    resultado = num1 + num2;
                    break;
                case 2:
                    System.out.println("Ingrese el primer número: ");
                    num1 = input.nextDouble();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = input.nextDouble();
                    resultado = num1 - num2;
                    break;
                case 3:
                    System.out.println("Ingrese el primer número: ");
                    num1 = input.nextDouble();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = input.nextDouble();
                    resultado = num1 * num2;
                    break;
                case 4:
                    System.out.println("Ingrese el numerador: ");
                    num1 = input.nextDouble();
                    System.out.println("Ingrese el denominador: ");
                    num2 = input.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                        continue; // Vuelve al inicio del bucle
                    }
                    break;
                case 5:
                    System.out.println("Ingrese la base: ");
                    num1 = input.nextDouble();
                    System.out.println("Ingrese el exponente: ");
                    num2 = input.nextDouble();
                    resultado = Math.pow(num1, num2);
                    break;
                case 6:
                    System.out.println("Ingrese el número: ");
                    num1 = input.nextDouble();
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                        continue; // Vuelve al inicio del bucle
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    continue; // Vuelve al inicio del bucle
            }

            System.out.println("Resultado: " + resultado);
        }

        input.close();
    }
}

