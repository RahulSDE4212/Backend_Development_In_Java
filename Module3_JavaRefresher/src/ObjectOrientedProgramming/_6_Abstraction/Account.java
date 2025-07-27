package ObjectOrientedProgramming._6_Abstraction;

abstract public class Account {
    protected  String accountNo;
    protected  double balance;

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void showBalance() {
        System.out.println(balance);
    }
}
