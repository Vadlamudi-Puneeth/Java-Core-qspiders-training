package payrollmanagement;

public class SavingsAccount extends Account{

    public SavingsAccount(int id,String holder,
                          String branch,double balance)
            throws InvalidAccountException{
        super(id,holder,branch,balance);
    }

    @Override
    public double calculateBalance(){
        // TODO:
        // return balance + 4% interest
    	
    	double balanc = balance + 0.04 * balance;
    	return balanc;
    }
}

