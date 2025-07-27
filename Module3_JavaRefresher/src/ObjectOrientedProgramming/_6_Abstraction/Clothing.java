package ObjectOrientedProgramming._6_Abstraction;

public  class Clothing extends Product{
    public Clothing(String name, double price) {
       super(name, price);
    }
    @Override
    double calculateDiscount() {
        return price * 0.2;
    }

    @Override
    double calculateTax() {
        return price * 0.08;
    }

    @Override
    double calculateShippingCosts() {
        return 5.0;
    }
}
