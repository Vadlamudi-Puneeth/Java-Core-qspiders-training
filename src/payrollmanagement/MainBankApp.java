package payrollmanagement;

public class MainBankApp {

    public static void main(String[] args) throws Exception{

        BankService s = new BankService();

        s.addAccount(new SavingsAccount(1,"Arjun","Chennai",50000));
        s.addAccount(new CurrentAccount(2,"Ravi","Delhi",8000));
        s.addAccount(new LoanAccount(3,"Meera","Chennai",
                                     100000,0.1,2));

        s.report();
    }
}

