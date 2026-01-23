package inheritance;

public class Task10CurrentAccount extends Task10Account {

    double overdraftLimit = 5000;

    Task10CurrentAccount(long accNo, double balance) {
        super(accNo, balance);
    }

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Current withdrawal successful");
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded");
        }
    }
}
