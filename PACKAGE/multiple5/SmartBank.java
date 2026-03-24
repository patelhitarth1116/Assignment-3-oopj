package multiple5;

public class SmartBank implements AccountOperations, LoanService {
    protected double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void calculateLoanEligibility(double salary) {
        if (salary >= 30000)
            System.out.println("Loan Eligible");
        else
            System.out.println("Loan Not Eligible");
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}