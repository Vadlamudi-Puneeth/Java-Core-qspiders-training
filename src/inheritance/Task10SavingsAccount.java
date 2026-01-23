package inheritance;

public class Task10SavingsAccount extends Task10Account {

    Task10SavingsAccount(long accNo, double balance) {
        super(accNo, balance);
    }

    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Savings withdrawal successful");
        } else {
            System.out.println("Withdrawal denied! Minimum balance ₹1000 required");
        }
    }
}
