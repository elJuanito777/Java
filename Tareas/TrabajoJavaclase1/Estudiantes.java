package estudiantes;

public class Estudiante {
    private int EstudianteID;
    private String Nombre;
    private String ssn;
    private double gpa;
    public final int SCHCODE = 34958;

    public Estudiante() {
    }

    public Estudiante(int EstudianteID, String Nombre, String ssn, double gpa) {
        this.EstudianteID = EstudianteID;
        this.Nombre = Nombre;
        this.ssn = ssn;
        this.gpa = gpa;
    }

    public int getEstudianteID() {
        return EstudianteID;
    }

    public void setEstudianteID(int EstudianteID) {
        this.EstudianteID = EstudianteID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void displayStudentInfo(int studentNumber) {
        System.out.println("Datos del Estudiante " + studentNumber + ":");
        System.out.println("ID del Estudiante: " + EstudianteID);
        System.out.println("Nombre: " + Nombre);
        System.out.println("SSN: " + ssn);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase student
        Estudiante miEstudiante1 = new Estudiante(123456, "Juanito", "123-45-6789", 3.5);
        Estudiante miEstudiante2 = new Estudiante(789012, "Juanita", "987-65-4321", 3.90);
        Estudiante miEstudiante3 = new Estudiante(456789, "Pepe", "456-78-9012", 3.2);

        // Mostrar información de todos los estudiantes
        miEstudiante1.displayStudentInfo(1);
        miEstudiante2.displayStudentInfo(2);
        miEstudiante3.displayStudentInfo(3);
    }
}

