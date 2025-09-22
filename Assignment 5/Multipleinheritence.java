// Interface 1
interface Animal {
    void eat();
}

// Interface 2
interface Bird {
    void fly();
}

// Class implementing both interfaces
class Bat implements Animal, Bird {
    // Implement methods from both interfaces
    public void eat() {
        System.out.println("Bat eats insects.");
    }

    public void fly() {
        System.out.println("Bat can fly at night.");
    }
}

// Main class
public class Multipleinheritence {
    public static void main(String[] args) {
        Bat b = new Bat();
        b.eat();
        b.fly();
    }
}