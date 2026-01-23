package inheritance;

public class Task10Main {
    public static void main(String args[]) {

        Task10SavingsAccount sa =
                new Task10SavingsAccount(101, 5000);
        sa.display();
        sa.withdraw(3500);
        sa.display();

        System.out.println("--------------------");

        Task10CurrentAccount ca =
                new Task10CurrentAccount(201, 3000);
        ca.display();
        ca.withdraw(7000);
        ca.display();
    }
}
