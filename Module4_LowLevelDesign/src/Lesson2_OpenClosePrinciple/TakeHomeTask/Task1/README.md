# SOLID Principles and Strategy Design Pattern Explanation

---

## ❌ 1. Open/Closed Principle (OCP)

**🔴 Problem:**
Every time you want to support a new product, like `BOOKS`, you must go back and change your `DiscountCalculator` class.

Example:

```java
else if (product.getType() == ProductType.BOOKS) {
    return product.getPrice() * 0.05;
}
```

And then again for `GROCERY`, `FURNITURE`, etc...

**🍕 Real-life Example:**
Imagine a pizza shop. The chef shouldn't have to rewrite the whole recipe book just to add one more pizza.
He should just add a new recipe, not edit all the old ones.

**✅ Better Idea:**
Just create a new class for each discount type. No need to touch old code.

---

## ❌ 2. Single Responsibility Principle (SRP)

**🔴 Problem:**
Your `DiscountCalculator` is doing too many jobs:

* It checks the product type.
* It applies discount logic.

**🧠 Real-life Example:**
You wouldn’t ask the receptionist to also cook food, right?
**One person = one job.**

**✅ Better Idea:**
Let each class do just one thing:

* One class just holds price (`Product`)
* One class just applies discount
* One class just selects which logic to use

---

## 🟡 3. ❌ Liskov Substitution Principle (LSP)

**🔍 Definition (Simple Words):**
If class B is a subclass of class A, then we should be able to replace object A with B without breaking the application.

### 🎯 Real-Life Analogy:

* Suppose you have a class `Bird` with a method `fly()`.
* You create a subclass `Penguin` that also extends `Bird`.

**Problem:** Penguins can't fly!
If your code expects all Birds to fly, and you pass a Penguin, your program breaks.

**🔥 This breaks the Liskov Substitution Principle.**

### 💥 Problem in DiscountCalculator Example:

```java
public double calculateDiscount(Product product) {
    if (product.getType() == ProductType.ELECTRONICS) {
        return product.getPrice() * 0.10;
    } else if (product.getType() == ProductType.CLOTHING) {
        return product.getPrice() * 0.20;
    }
    return 0;
}
```

* This logic is tightly coupled to specific product types.
* You cannot extend it by just adding a new class.
* You have to go back and change this method (which breaks OCP too).
* It makes assumptions about the input — not safe for substitution.

### ✅ Better Design with LSP in Mind:

```java
interface DiscountStrategy {
    double calculateDiscount(Product product);
}

class ElectronicsDiscount implements DiscountStrategy {
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.10;
    }
}

class ClothingDiscount implements DiscountStrategy {
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.20;
    }
}
```

Now you can safely substitute any `DiscountStrategy` implementation.

```java
DiscountStrategy strategy = new ElectronicsDiscount();
strategy.calculateDiscount(product); // ✅ Works

strategy = new ClothingDiscount();
strategy.calculateDiscount(product); // ✅ Still works
```

**🔁 No assumptions are broken. The base class contract is respected.**

### 🧠 Simple Analogy:

A universal remote should work with any TV — Sony, LG, Samsung — as long as they follow the same protocol.
If a TV needs a special remote just for basic functions — **LSP is broken**.

---

## 🔍 4. Dependency Inversion Principle (DIP)

**✅ What DIP means:**
"High-level code should depend on abstract things, not on specific details."

**🧠 Real-life Analogy:**
Imagine you're a boss.

* **Bad way:**
  You say: "Go to Market Street, buy this exact brand of vegetables, cut them like this, and cook them exactly this way."

* **Good way:**
  You say: "I need a vegetable curry." You let the cook figure it out.

**❌ Violation in your code:**

```java
if (product.getType() == ProductType.ELECTRONICS) {
    return product.getPrice() * 0.10;
}
```

Main class directly depends on low-level details.

**✅ DIP-compliant version:**

```java
DiscountStrategy strategy = new ElectronicsDiscountStrategy();
strategy.calculateDiscount(product);
```

Now main code trusts the **abstraction (strategy)**, not the detail.

**✅ Bottom Line:**

* ❌ Micromanaging logic inside high-level class
* ✅ Delegating through abstraction (interface)

---

## 🔍 5. Liskov Substitution Principle (LSP) — Recap

**✅ What LSP means:**
"If something works with a parent class or interface, it should work with any of its children."

**🧠 Real-life Analogy:**
You have a universal USB-C charger. You expect it to work with any phone that supports USB-C.

**❌ Violation in your code:**
Hardcoded logic:

```java
if (product.getType() == ProductType.ELECTRONICS) { ... }
```

You're not substituting; you're hardcoding logic per case.

**✅ LSP-friendly version:**

```java
interface DiscountStrategy {
    double calculateDiscount(Product product);
}

DiscountStrategy strategy = new ClothingDiscountStrategy();
strategy.calculateDiscount(product);
```

**✅ Bottom Line:**

* ❌ Tightly glued to specific cases
* ✅ Easily swappable logic with consistent interface

---

## 🔍 6. Strategy Design Pattern

**✅ What it means:**
"Put different behaviors (strategies) in separate classes — and pick the one you want at runtime."

**🧠 Real-life Analogy:**
At a restaurant:

* Pizza Chef makes pizza
* Burger Chef makes burgers

Waiter just hands the order to the right chef. Doesn't cook.

**❌ In your code:**

```java
if (product.getType() == ProductType.ELECTRONICS) {
    return product.getPrice() * 0.10;
}
```

This is like waiter trying to cook everything.

**✅ With Strategy Pattern:**

```java
interface DiscountStrategy {
    double calculateDiscount(Product product);
}

// Each product has its own DiscountStrategy class

DiscountStrategy strategy = getStrategy(productType);
strategy.calculateDiscount(product);
```

**✅ Bottom Line:**

* ❌ You’re doing everything in one class
* ✅ Strategy Pattern is like hiring a team of specialists and plugging in the right one

