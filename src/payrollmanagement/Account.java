package payrollmanagement;

public abstract class Account implements Comparable<Account>{

    protected int id;
    protected String holder;
    protected String branch;
    protected double balance;

    public Account(int id,String holder,String branch,double balance)
            throws InvalidAccountException {

        if(id<=0) throw new InvalidAccountException("Invalid ID");

        // TODO:
        // holder length >=3
        if(holder.length() < 3) {
        	throw new InvalidAccountException("invalid account");
        }
        // branch not empty
        if(branch == null) {
        	throw new InvalidAccountException("invalid account");
        }
        // balance >=0
        if(balance < 0) {
        	throw new InvalidAccountException("invalid account");
        }

        this.id=id;
        this.holder=holder;
        this.branch=branch;
        this.balance=balance;
    }

    public abstract double calculateBalance()
            throws InvalidBalanceException;

    @Override
    public int compareTo(Account o){
        // TODO:
        // sort descending by calculateBalance()
        try {
			return Double.compare(o.calculateBalance(), this.calculateBalance());
		} catch (InvalidBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return 0;
    }

    public String getBranch(){
        return branch;
    }
}
