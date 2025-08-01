package Lesson2_OpenClosePrinciple.TakeHomeTask.Task1.BetterCode;

public class ClothingDiscountStrategy implements DiscountStrategy {
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.20;
    }
}
