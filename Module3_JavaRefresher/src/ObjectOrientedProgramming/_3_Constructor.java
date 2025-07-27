package ObjectOrientedProgramming;

class Employee {
    int id;
    String name;
    int age;
    String address;

    Employee() {
        age = 18;
    }
    Employee(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
public class _3_Constructor {
    public static void main(String[] args) {
        Employee rahul = new Employee(1, "rahul", 18, "b-113 sector 40 noida");
        Employee rohit = new Employee();

        System.out.println(rahul.address);
        System.out.println(rohit.address);
    }
}
