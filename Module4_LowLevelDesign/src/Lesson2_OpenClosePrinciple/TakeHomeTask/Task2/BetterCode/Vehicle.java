package Lesson2_OpenClosePrinciple.TakeHomeTask.Task2.BetterCode;

// ✅ Abstract Class: Vehicle
// 📌 Responsibility: Base class for all vehicles
// 🔄 LSP (Liskov Substitution Principle) - Car and Truck can replace Vehicle
abstract class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}