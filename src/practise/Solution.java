package practise;

interface LoanApprovalRule{
    public boolean approve(LoanApplication la);
}


class LoanApplication{
    double income;
    int creditScore;
    double amountRequested;

    LoanApplication(double income, int creditScore, double amountRequested){
        this.income = income;
        this.creditScore = creditScore;
        this.amountRequested = amountRequested;
    }
}

public class Solution{
    public static void main(String args[]){
        double income = 60000;
        int creditScore = 720;
        double amountRequested = 36000;

        LoanApplication application = new LoanApplication(income, creditScore, amountRequested);


        LoanApprovalRule creditScoreRule = (la) -> la.creditScore >= 700;
        LoanApprovalRule incomeRule = (la) -> la.income >= 50000;

        LoanApprovalRule safeBorrowRule = (la) -> la.amountRequested <= la.income * 0.30;

        System.out.println("Credit Score Rule: " + (checkApproval(application, creditScoreRule) ? "Approved" : "Rejected"));
        System.out.println("Income Rule: " + (checkApproval(application, incomeRule) ? "Approved" : "Rejected"));
        System.out.println("Safe Borrow Rule: " + (checkApproval(application, safeBorrowRule) ? "Approved" : "Rejected"));

    }

    public static boolean checkApproval(LoanApplication la, LoanApprovalRule rule) {
    	return rule.approve(la);
	}

	}




