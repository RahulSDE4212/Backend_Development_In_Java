package Lesson3_AbstractClassesAndInterfaces.AbstractClassDemo;

public  class Macbook extends Product{
    @Override
    public double calculateDiscount() {
        return 0;
    }

    public void termsAndConditions() {
        System.out.println("Some terms of macbook!!!");
    }
}
