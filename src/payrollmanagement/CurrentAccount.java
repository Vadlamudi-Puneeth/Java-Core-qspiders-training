package payrollmanagement;

public class CurrentAccount extends Account{

    public CurrentAccount(int id,String holder,
                          String branch,double balance)
            throws InvalidAccountException{
        super(id,holder,branch,balance);
    }

    @Override
    public double calculateBalance(){
        // TODO:
        // if balance < 10000 deduct 500
    	if(balance < 10000) {
    		return balance - 500;
    	}
        return balance;
    }
}

