package abstraction;

interface Task9PaymentGateWay {
	abstract void pay(double amount);
	abstract void refund(double amount);
	abstract void getTransactionStatus();
}
