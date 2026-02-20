package payrollmanagement;

class InvalidAccountException extends BankException {
    public InvalidAccountException(String msg){
        super(msg);
    }
}
