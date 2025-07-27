package ObjectOrientedProgramming;

public class Constructor {
    public static void main(String[] args) {
        Employee rahul = new Employee(1, "rahul", 18, "b-113 sector 40 noida");
        Employee rohit = new Employee();

        System.out.println(rahul.address);
        System.out.println(rohit.address);
    }
}
