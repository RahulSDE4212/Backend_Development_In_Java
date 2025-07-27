package ObjectOrientedProgramming._1_ClassesAndObjects;

import ObjectOrientedProgramming._3_AccessModifier.Employee;

public class Lamp {
    boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("lamp is turned on.");
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        // System.out.println(emp.id); as employee.id has protected access modifier, it cannot be accessed outside its package.

    }
}
