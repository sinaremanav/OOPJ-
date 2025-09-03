class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks!");
    }
    
 
}

public class Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        
        myAnimal.makeSound();

        System.out.println("---");

        Dog myDog = new Dog();
       
        myDog.makeSound();

        System.out.println("---");
    }
}