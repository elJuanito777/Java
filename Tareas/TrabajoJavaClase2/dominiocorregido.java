public class dominiocorregido {


    public static void main(String[] args) {

        String correoElectronico = "juanitoelinsano@hotmail.pe";

        String simboloA = "@";

        if (correoElectronico.equals(simboloA)) {

        } else {

            String[] partes = correoElectronico.split(simboloA);

            if (partes.length == 2) {

                String dominioCompleto = partes[1];

                String[] dominioPartes = dominioCompleto.split("\\.");

                String dominio = dominioPartes[0];

                System.out.println("Nombre del dominio: " + dominio);
            } else {
                System.out.println("El correo electrónico no contiene un dominio válido");
            }
        }
    }
}






