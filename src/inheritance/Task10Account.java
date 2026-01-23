package inheritance;

public class Task10Account {
    long accNo;
    double balance;

    Task10Account(long accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}
