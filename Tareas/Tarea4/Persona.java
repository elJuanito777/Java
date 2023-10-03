public class Persona {
    private double peso;
    private double estatura;
    public Persona(double peso, double estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }
    public double calcularIMC() {
        if (estatura != 0) {
            return peso / (estatura * estatura);
        } else {
            return Double.NaN;
        }
    }
    public String determinarCategoriaPeso() {
        double imc = calcularIMC();
        if (imc < 16) {
            return "Delgadez severa";
        } else if (imc < 17) {
            return "Delgadez moderada";
        } else if (imc < 18.5) {
            return "Delgadez leve";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidad leve";
        } else if (imc < 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida";
        }
    }
}