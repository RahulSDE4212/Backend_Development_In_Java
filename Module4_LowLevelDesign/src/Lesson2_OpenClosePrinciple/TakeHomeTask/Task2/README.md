---

# ✅ SOLID Principles Explained With Real-Life Examples and Violations

### 🧩 What is the SOLID Principle?

The SOLID principles are **five golden rules** that help us write better object-oriented code. If you follow them, your code becomes easier to read, test, change, and scale.

> "Think of SOLID like the rules of building LEGO blocks. Each block (class) should be strong, reusable, and not break other blocks."

---

## 1. ❌ Single Responsibility Principle (SRP)

### 📜 **Definition:**

> A class should do **only one job**. It should have just **one reason to change**.

### 💬 Simple Explanation:

If a class is doing too many things — it's like a person trying to be a chef, a pilot, and a doctor all at once. That's messy and confusing.

### 🔍 Violation in Your Code:

In your `VehicleInsuranceEvaluator` class, you're:

* Checking the **type** of vehicle.
* Calculating **insurance quotes**.

So this one class is doing multiple jobs → ❌ violates SRP.

### ✅ Better:

* Let each **Vehicle** (Car, Truck) have its own logic.
* One class = one job.

---

## 2. ❌ Open/Closed Principle (OCP)

### 📜 **Definition:**

> Code should be **open for extension**, but **closed for modification**.

### 💬 Simple Explanation:

You should be able to add **new features** without changing old code.

### 🍕 Real-Life Example:

Imagine a pizza chef. When he adds a new pizza, he writes a new recipe. He doesn't rewrite the whole recipe book.

### 🔍 Violation in Your Code:

```java
if (vehicle instanceof Car) { ... }
else if (vehicle instanceof Truck) { ... }
```

When you add a new vehicle (like Bike), you'll have to go back and **change this logic**.

### ✅ Better:

Use **polymorphism**. Each vehicle should provide its own insurance logic via `getInsuranceQuote()` method.

---

## 3. ❌ Liskov Substitution Principle (LSP)

### 📜 **Definition:**

> Subclasses should be usable **anywhere** their parent class is used — without breaking the code.

### 💬 Simple Explanation:

If you say something is a vehicle, then **any subclass** (Car, Truck) should behave like a vehicle.

### 🍔 Real-Life Example:

If a parent class is "Food", and a subclass is "Burger", then Burger should be edible. If you subclass "Food" as "Stone", and you can't eat it, that's wrong.

### 🔍 Violation:

In your example, if a new `Vehicle` subclass doesn’t implement insurance properly or throws an error, then it breaks LSP.

### ✅ Better:

Ensure all subclasses implement logic without needing to check their type.

---

## 4. ❌ Interface Segregation Principle (ISP)

### 📜 **Definition:**

> Clients shouldn't be forced to implement interfaces they **don't use**.

### 💬 Simple Explanation:

Don't give someone a remote with 100 buttons if they only need 2. Give a simpler remote.

### 🔍 How it could be violated:

If your `Vehicle` interface had methods like `fly()`, `sail()`, then `Car` or `Truck` would be forced to implement things they don't need.

### ✅ Better:

Break down big interfaces into smaller ones.

---

## 5. ❌ Dependency Inversion Principle (DIP)

### 📜 **Definition:**

> High-level modules shouldn't depend on low-level modules. Both should depend on **abstractions**.

### 💬 Simple Explanation:

Big boss (main class) shouldn't depend on tiny workers directly. Both should follow a **contract (interface)**.

### 🔍 Violation:

If `VehicleInsuranceEvaluator` is directly using `Car`, `Truck`, etc., then it's tightly coupled. This makes testing and replacing logic hard.

### ✅ Better:

Use interfaces like `IVehicle` or `IInsuranceProvider` so that the main class doesn’t depend on actual implementations.

---

# 🧠 Design Pattern: Strategy Pattern

### 📜 **Definition:**

> Use the Strategy Pattern when you want to select a behavior (algorithm) at runtime.

### 🍕 Real-Life Example:

In a food delivery app:

* You can choose delivery by bike, car, or drone.
* The app doesn't care *how* you deliver — it just calls the strategy you chose.

### ✅ In Your Case:

Each vehicle should have a `getInsuranceQuote()` method. That way, the strategy (insurance logic) is **selected by the object itself**.

```java
Vehicle car = new Car();
InsuranceQuote quote = car.getInsuranceQuote();
```

No need for `if/else` logic anymore!

---

# ✅ Summary Table

| Principle | Meaning                                    | Current Problem                                        | Better Design                       |
| --------- | ------------------------------------------ | ------------------------------------------------------ | ----------------------------------- |
| SRP       | One class = one job                        | Evaluator is doing type check + quote logic            | Move logic to each vehicle          |
| OCP       | Don’t modify existing code to add features | Adding new vehicle needs `if`                          | Use polymorphism                    |
| LSP       | Subclasses should behave like parent       | Some vehicles may not support insurance                | Enforce interface in all subclasses |
| ISP       | Don’t force unused methods                 | All vehicles share same interface (possible violation) | Split interfaces                    |
| DIP       | High-level code depends on abstraction     | Evaluator knows about all types                        | Use interfaces/abstract class       |

---