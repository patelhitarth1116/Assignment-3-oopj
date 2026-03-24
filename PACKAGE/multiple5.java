

import multiple5.SmartBank;

public class multiple5 {
    public static void main(String[] args) {

        SmartBank bank = new SmartBank();

        bank.deposit(5000);
        bank.showBalance();

        bank.calculateLoanEligibility(35000);
    }
}