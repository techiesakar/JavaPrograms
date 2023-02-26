interface A {
    void display1();
}

interface B {
    void display2();
}

class Test implements A, B {
    public void display1() {
        System.out.println("Interface A");
    }

    public void display2() {
        System.out.println("Interface B");
    }
}

public class MultiInheritance {
    public static void main(String args[]) {
        Test t = new Test();
        t.display1();
        t.display2();
    }
}