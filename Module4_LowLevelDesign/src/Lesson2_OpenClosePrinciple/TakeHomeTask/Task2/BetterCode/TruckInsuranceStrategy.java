package Lesson2_OpenClosePrinciple.TakeHomeTask.Task2.BetterCode;

// ✅ Class: TruckInsuranceStrategy
// 📌 Truck-specific logic for insurance
// 🔄 Follows SRP, OCP
class TruckInsuranceStrategy implements InsuranceStrategy {
    @Override
    public InsuranceQuote evaluate(Vehicle vehicle) {
        return new InsuranceQuote("Truck insurance for model: " + vehicle.getModel());
    }
}