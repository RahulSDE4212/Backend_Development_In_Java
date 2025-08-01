package Lesson2_OpenClosePrinciple.TakeHomeTask.Task1.BetterCode;

// Interface which contains the logic to calculate discount
// Every discountStrategy needs to override this code

public interface DiscountStrategy {
    double calculateDiscount(Product product);
}
