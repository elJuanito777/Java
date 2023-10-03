import java.util.Scanner;

public class numerotelefonicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese la clave: ");
        String clave = scanner.nextLine();

        if (usuario.equals("ADMIN") && clave.equals("123")) {
            System.out.println("Acceso concedido.");

            System.out.print("Ingrese el número de celular (11 dígitos): ");
            String numeroCelular = scanner.nextLine();

            if (numeroCelular.length() <= 11) {

                if (numeroCelular.startsWith("51")) {
                    System.out.println("País: Perú");
                } else {
                    System.out.println("Otra ciudad");
                }
            } else {
                System.out.println("Error: Ingrese un número menor o igual a 11 dígitos.");
            }
        } else {

            System.out.println("Acceso denegado.");
        }

        scanner.close();
    }
}