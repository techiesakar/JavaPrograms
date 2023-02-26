
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

public class Inheritance {
    public static void main(String[] args) {
        newFruits nf = new newFruits();
        nf.winterFruit();
        nf.summerFruit();
    }
}
