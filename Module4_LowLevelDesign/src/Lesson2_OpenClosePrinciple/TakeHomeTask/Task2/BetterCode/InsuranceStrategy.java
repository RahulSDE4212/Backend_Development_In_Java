package Lesson2_OpenClosePrinciple.TakeHomeTask.Task2.BetterCode;

// ✅ Interface: InsuranceStrategy
// 📌 Used for different insurance evaluation logics
// 🔄 ISP (Interface Segregation Principle) — small, focused interface
// 🔄 OCP (Open/Closed Principle) — add new logic without modifying existing
interface InsuranceStrategy {
    InsuranceQuote evaluate(Vehicle vehicle);
}