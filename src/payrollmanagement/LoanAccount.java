package payrollmanagement;

public class LoanAccount extends Account{

    private double rate;
    private int years;

    public LoanAccount(int id,String holder,String branch,double principal,double rate,int years) throws InvalidAccountException{

        super(id,holder,branch,principal);

        this.rate=rate;
        this.years=years;
    }

    @Override
    public double calculateBalance(){
        // TODO:
        // interest = principal * rate * years
    	double interest = super.balance * rate * years;
        // return principal + interest
        return super.balance + interest;
    }
}

