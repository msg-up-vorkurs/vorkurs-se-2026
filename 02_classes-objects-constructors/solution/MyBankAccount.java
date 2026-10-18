package solution;

public class MyBankAccount {

    int accountNumber;
    double balance;
    double overdraftLimit;
    double monthlyFee;
    double interestRate;

    public MyBankAccount(int accountNumber, double balance, double overdraftLimit, double monthlyFee, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
        this.monthlyFee = monthlyFee;
        this.interestRate = interestRate;
    }

    static void main() {
        MyBankAccount account = new MyBankAccount(1, 1000.0, 2000.0, 0.99, 0.005);
        IO.println("Account number: " + account.accountNumber);
        IO.println("Balance: " + account.balance);
        IO.println("Overdraft limit: " + account.overdraftLimit);
        IO.println("Monthly fee: " + account.monthlyFee);
        IO.println("Interest rate: " + account.interestRate);
    }

}
