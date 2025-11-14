import java.util.*;
class BankAccount {
    String name;
    double balance;
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Deposited Successfully");
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println(amount + " Withdrawn Successfully");
        }
    }
    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Current Balance: " + balance);
    }
}
public class BankMain {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Saniya", 1000);
        b.display();
        b.deposit(500);
        b.withdraw(300);
        b.display();
    }
}

output:
Account Holder: Saniya
Current Balance: 1000.0
500.0 Deposited Successfully
300.0 Withdrawn Successfully
Account Holder: Saniya
Current Balance: 1200.0
