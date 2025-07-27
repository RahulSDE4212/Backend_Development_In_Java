package ObjectOrientedProgramming;

class Bicycle {
    private String name;
    private int price;
    private String color;

    public Bicycle(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public void braking() {
        System.out.println("break lg gya bhai, thukne se bach gya !!!!");
    }

    public void accelerating() {
        System.out.println("hero mat bn, thuk jayega to mat boliyo ki bataya nhi tha");
    }
}