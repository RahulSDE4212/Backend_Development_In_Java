package Lesson2_OpenClosePrinciple.TakeHomeTask.Task1.BetterCode;

public class DiscountService {
    public double calculateDiscount(Product product, DiscountStrategy strategy) {
        return strategy.calculateDiscount(product);
    }
}
