import java.util.Scanner;

public class PersonaTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su estatura en metros: ");
        double estatura = scanner.nextDouble();

        Persona persona = new Persona(peso, estatura);

        double imc = persona.calcularIMC();
        String categoria = persona.determinarCategoriaPeso();

        System.out.println("Su índice de masa corporal (IMC) es: " + imc);
        System.out.println("Categoría de peso: " + categoria);

        scanner.close();
    }
}
