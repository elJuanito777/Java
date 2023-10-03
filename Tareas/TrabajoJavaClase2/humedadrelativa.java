import java.util.Scanner;
public class humedadrelativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la densidad del vapor de agua: ");
        double densidadVaporAgua = scanner.nextDouble();

        System.out.print("Ingrese la densidad del valor de agua al punto de saturación: ");
        double densidadValorAguaPuntoSaturacion = scanner.nextDouble();

        if (densidadValorAguaPuntoSaturacion == 0) {
            System.out.println("No puede ingresar la densidad del valor de agua al punto de saturación como 0");
        } else {
            double humedadRelativa = (densidadValorAguaPuntoSaturacion / densidadVaporAgua) * 100.0;
            System.out.println("La humedad relativa es: " + humedadRelativa + "%");
        }

        scanner.close();
    }
}