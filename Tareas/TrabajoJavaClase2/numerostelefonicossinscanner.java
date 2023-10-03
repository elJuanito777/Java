
public class numerostelefonicossinscanner {
    public static void main(String[] args) {

        String usuario = "ADMIN";
        String clave = "123";

        if ("ADMIN".equals(usuario) && "123".equals(clave)) {

            System.out.println("Acceso concedido.");

            String numeroCelular = "51987654321";

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
    }
}