package Lesson2_OpenClosePrinciple.TakeHomeTask.Task2.BetterCode;

// ✅ Main Class: Simulates user selection and evaluation
// 📌 Demonstrates the use of Strategy pattern in runtime
public class Main {
    public static void main(String[] args) {
        // Creating car and truck
        Vehicle car = new Car("Toyota Fortuner");
        Vehicle truck = new Truck("Volvo Truck");

        // Evaluating car insurance using car strategy
        VehicleInsuranceEvaluator carEvaluator = new VehicleInsuranceEvaluator(new CarInsuranceStrategy());
        InsuranceQuote carQuote = carEvaluator.evaluateInsurance(car);
        System.out.println(carQuote);

        // Evaluating truck insurance using truck strategy
        VehicleInsuranceEvaluator truckEvaluator = new VehicleInsuranceEvaluator(new TruckInsuranceStrategy());
        InsuranceQuote truckQuote = truckEvaluator.evaluateInsurance(truck);
        System.out.println(truckQuote);
    }
}