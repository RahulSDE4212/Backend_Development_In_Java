package Lesson2_OpenClosePrinciple.TakeHomeTask.Task2.BetterCode;

// ✅ Class: CarInsuranceStrategy
// 📌 Car-specific logic for insurance
// 🔄 Follows SRP, OCP
class CarInsuranceStrategy implements InsuranceStrategy {
    @Override
    public InsuranceQuote evaluate(Vehicle vehicle) {
        return new InsuranceQuote("Car insurance for model: " + vehicle.getModel());
    }
}