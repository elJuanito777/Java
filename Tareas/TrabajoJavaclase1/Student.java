package mijava;

public class Student {
    private int studentId;
    private String name;
    private String ssn;
    private double gpa;
    public final int SCHCODE = 34958;

    public Student() {
    }

    public Student(int studentID, String name, String ssn, double gpa) {
        this.studentId = studentID;
        this.name = name;
        this.ssn = ssn;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentID) {
        this.studentId = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("GPA: " + gpa);
    }


}


