package ObjectOrientedProgramming;

import IntroTopics.*;
public class ClassAndObjects {
    public static void main(String[] args) {
        Bicycle mountain2Bicycle = new Bicycle("decath", 8000, "red");
//        System.out.println(mountainBicycle);  It prints the address of the object.
        mountain2Bicycle.braking();
        mountain2Bicycle.accelerating();

        Lamp  newLamp = new Lamp();
        newLamp.turnOn();
    }
}
