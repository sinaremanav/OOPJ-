// Demonstrates Inheritance.

class Student {
    int fee;
    public void get() {
        System.out.println("In parent class");
    }
}

public class IT_Student extends Student {
    int iterafee = 200;
    public void display() {
        System.out.println("In display of IT_Student");
    }
    public static void main(String args[]) {
        IT_Student i = new IT_Student();
        i.fee = 91000;
        i.get();
        i.display();
        System.out.println("IT Student Fee is :" + i.fee);
        System.out.println("IT Student iterafee is :" + i.iterafee);
    }
}