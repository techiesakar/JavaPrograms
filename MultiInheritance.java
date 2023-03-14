interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("The bird is flying.");
    }
}

class Fish implements Swimmable {
    public void swim() {
        System.out.println("The fish is swimming.");
    }
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("The duck is flying.");
    }

    public void swim() {
        System.out.println("The duck is swimming.");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Swimmable fish = new Fish();
        Flyable swimmableDuck = new Duck();
        Swimmable flyableDuck = new Duck();
        bird.fly();
        fish.swim();
        swimmableDuck.fly();
        flyableDuck.swim();
    }
}
