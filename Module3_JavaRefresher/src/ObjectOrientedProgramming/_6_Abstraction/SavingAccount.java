package ObjectOrientedProgramming._6_Abstraction;

public class SavingAccount extends Account{
    private static final double MIN_BALANCE = 500.0;

    public SavingAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". Updated balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (balance - amount < MIN_BALANCE) {
            System.out.println("Withdrawal denied. Minimum balance of ₹" + MIN_BALANCE + " must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". Updated balance: ₹" + balance);
        }
    }
}
