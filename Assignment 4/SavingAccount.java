abstract class BankAccount {
    public abstract void deposit(double amount);
    public abstract void withdrawal(double amount);
    public abstract void getBalance();

    public void getDetails() {
        System.out.println("Enter \n Name: xyz \t, Mobile no.: 1231231231 \t Address: Kopargaon \t Etc");
    }
}

class SavingAccount extends BankAccount {
    static double balance;

    
    public void deposit(double amount) {
        System.out.println("Deposited: " + amount);
        balance += amount;
    }

    
    public void withdrawal(double amount) {
        if (balance >= amount) {
            System.out.println("Withdrawn: " + amount);
            balance -= amount;
        } else {
            System.out.println("Insufficient balance to withdraw");
        }
    }

    
    public void getBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String args[]) {
        SavingAccount s = new SavingAccount();
        s.deposit(5000);
        s.withdrawal(1000);
        s.getBalance();
        s.getDetails();
    }
}
