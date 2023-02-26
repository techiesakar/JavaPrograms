interface A {
    void display1();
}

interface B {
    void display2();
}

interface C {
    void display3();
}

class Test implements A, B, C {
    public void display1() {
        System.out.println("Display 1");
    }

    public void display2() {
        System.out.println("Display 2");
    }

    public void display3() {
        System.out.println("Display 3");
    }

}

public class MultiInheritance {
    public static void Main(String[] args) {
        Test mt = new Test();
        mt.display1();
        mt.display2();
        mt.display3();
    }
}
