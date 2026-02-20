package payrollmanagement;

class InvalidBalanceException extends BankException {
    public InvalidBalanceException(String msg){
        super(msg);
    }
}
