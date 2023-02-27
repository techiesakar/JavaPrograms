class GrandFather {
    String Parent1 = "Daljit Singh";
}

class Father extends GrandFather {
    public void myGrandFather() {
        System.out.println("My GrandFather is " + Parent1);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Father FT = new Father();
        FT.myGrandFather();
    }
}