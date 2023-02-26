
class fruits {
    void winterFruit() {
        System.out.println("Orange");
    }
}

class newFruits extends fruits {
    void summerFruit() {
        System.out.println("Grapes");
    }
}

class anotherFruits extends newFruits {
    void rainnyFruit() {
        System.out.println("WaterMelon");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        anotherFruits nf = new anotherFruits();
        nf.winterFruit();
        nf.summerFruit();
        nf.rainnyFruit();
    }
}
