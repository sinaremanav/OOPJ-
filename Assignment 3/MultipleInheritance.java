interface Work {
    void doWork();
}

interface Payment {
    void getPayment();
}

class Freelancer implements Work, Payment {
    public void doWork() {
        System.out.println("Freelancer is doing the assigned work.");
    }
    public void getPayment() {
        System.out.println("Freelancer has received payment for the work.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Freelancer f = new Freelancer();
        f.doWork();
        f.getPayment();
    }
}
