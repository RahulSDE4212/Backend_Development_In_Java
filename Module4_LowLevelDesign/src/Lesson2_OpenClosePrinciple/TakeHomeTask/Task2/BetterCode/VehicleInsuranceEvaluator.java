package Lesson2_OpenClosePrinciple.TakeHomeTask.Task2.BetterCode;

// ✅ Class: VehicleInsuranceEvaluator
// 📌 Uses strategy to evaluate insurance
// 🔄 DIP (Dependency Inversion Principle) — depends on abstraction
class VehicleInsuranceEvaluator {
    private final InsuranceStrategy strategy;

    public VehicleInsuranceEvaluator(InsuranceStrategy strategy) {
        this.strategy = strategy;
    }

    public InsuranceQuote evaluateInsurance(Vehicle vehicle) {
        return strategy.evaluate(vehicle);
    }
}