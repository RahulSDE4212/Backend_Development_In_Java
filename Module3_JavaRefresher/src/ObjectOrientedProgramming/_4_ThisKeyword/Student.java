package ObjectOrientedProgramming._4_ThisKeyword;

public class Student {
    String name;
    int age;
    int rollNo;
    String address;

    Student(String name, int age, int rollNo, String address) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.address = address;
    }

    Student(String name) {
        // It calls the desired constructor mapped with the arguments given
        this(name, 18, 12, "b-113 sector 40 noida");
    }

    Student() {
        this("notknown", 0, 0, "not known");
    }

    public String toString(){
        return this.name + " " + this.age + " " + this.rollNo + " " + this.address;
    }
    public static void main(String[] args) {
        Student st = new Student("rahul");
        System.out.println(st);
    }
}
