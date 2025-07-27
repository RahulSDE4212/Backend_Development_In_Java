package ObjectOrientedProgramming;

import IntroTopics.*;
public class _1_ClassAndObjects {
    public static void main(String[] args) {
        _2_Bicycle mountain2Bicycle = new _2_Bicycle("decath", 8000, "red");
//        System.out.println(mountainBicycle);  It prints the address of the object.
        mountain2Bicycle.braking();
        mountain2Bicycle.accelerating();

        Lamp  newLamp = new Lamp();
        newLamp.turnOn();
    }
}
