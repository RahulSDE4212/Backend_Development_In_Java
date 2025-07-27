package ObjectOrientedProgramming;

public class ConstructorOverloading {
    static class Main {
        int age;
        String name;
        String address;
        int id;

        Main() {
            age = 18;
            name = "unknown";
            address = "not known";
            id = 0;
        }
        Main(int age, String name) {
            this.age = age;
            this.name = name;
            address = "not known";
            id = 0;
        }
        Main(int age, String name, String address){
            this.age = age;
            this.name = name;
            this.address = address;
            this.id = 0;
        }
        Main(int age, String name, String address, int id){
            this.age = age;
            this.name = name;
            this.address = address;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        Main n = new Main(17, "rahul");
        Main o = new Main(19, "khushboo", "b-113 sector 40 noida");
        Main p = new Main(21, "rohit", "lashkarganj gaya bihar", 23);
    }
}
