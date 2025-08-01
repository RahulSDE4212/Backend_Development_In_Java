package Lesson2_OpenClosePrinciple.TakeHomeTask.Task1.BetterCode;

// If i add more discount strategy then there is no need to change the existing code
// Hence my all modules are following Open-Closed Principle

public class BookDiscountStrategy implements DiscountStrategy {
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.05;
    }
}
