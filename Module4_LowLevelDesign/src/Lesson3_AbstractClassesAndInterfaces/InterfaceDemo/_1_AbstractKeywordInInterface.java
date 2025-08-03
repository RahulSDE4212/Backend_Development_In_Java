package Lesson3_AbstractClassesAndInterfaces.InterfaceDemo;

interface A {
    default void foo() {
        System.out.println("in interface A");
    }
}

interface B {
    default void foo() {
        System.out.println("in interface B");
    }
}


class C implements A, B {
    public void foo() {
//        B.super.foo();
        B.super.foo();
    }
}
public class _1_AbstractKeywordInInterface {
    public static void main(String[] args) {
        C obj = new C();
        obj.foo();
    }
}
