package ObjectOrientedProgramming._6_Abstraction;

abstract class Employee {
    String name;
    String address;

    void setName(String name) {
        this.name = name;
    }
    void setAddress(String address){
        this.address = address;
    }

    abstract void getName();
    abstract void getAddress();
}

class Manager extends Employee {
    public void getName() {
        System.out.println(this.name);
    }
    public void getAddress() {
        System.out.println(this.address);
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setAddress("B-113 Sector-40 Noida 201301");
        manager.setName("Rahul");
        manager.getAddress();
        manager.getName();
    }
}
