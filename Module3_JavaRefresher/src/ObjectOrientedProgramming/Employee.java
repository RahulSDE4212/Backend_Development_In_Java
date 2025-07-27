package ObjectOrientedProgramming;

public class Employee {
    protected int id;
    protected String name;
    protected int age;
    protected String address;

    public Employee() {
        age = 18;
    }
    public Employee(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.id);
    }
}