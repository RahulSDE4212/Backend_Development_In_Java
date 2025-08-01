package Lesson2_OpenClosePrinciple.TakeHomeTask.Task1.BetterCode;

// Only contains the structure and information of product
// Following "Single Responsibility Principle as well as Open-Closed principle"

public class Product {
    private final double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
