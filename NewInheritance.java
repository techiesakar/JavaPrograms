// Implementing Multiple Inheritance using Interface
interface GrandFather {
    void myGrandFather();
}

interface GrandMother {
    void myGrandMother();
}

public class NewInheritance implements GrandFather, GrandMother {
    public void myGrandFather() {
        System.out.println("Grandfather: Daljit Singh");
    }

    public void myGrandMother() {
        System.out.println("GrandMother: Tara Singh");
    }

    public static void main(String[] args) {
        NewInheritance PR = new NewInheritance();
        PR.myGrandFather();
        PR.myGrandMother();
    }
}