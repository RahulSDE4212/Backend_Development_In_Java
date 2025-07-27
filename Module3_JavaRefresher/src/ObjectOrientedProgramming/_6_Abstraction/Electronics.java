package ObjectOrientedProgramming._6_Abstraction;

public class Electronics extends Product{
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.1;
    }

    @Override
    double calculateShippingCosts() {
        return 10.4;
    }

    @Override
    double calculateTax() {
        return price * 0.15;
    }
}
