package Lesson1_SingleResponsibilityPrinciple.Example2.ProlematicCode;

public class Employee {
    private  int id;

    public int getId() {
        return this.id;
    }

    public String fetchBioData() {
        return "Some bio data";
    }

    public double calculateSalary() {
         return 0;
    }

    public void printPerfomanceData() {
        System.out.println("some perfomance related data");
    }

}
