abstract class Account {
    private String accountName;
    private String accountBranch;
    private String accountNumber;

    public Account(String accountName, String accountBranch, String accountNumber) {
        this.accountName = accountName;
        this.accountBranch = accountBranch;
        this.accountNumber = accountNumber;
    }
    public abstract void withdraw(double amount);

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountBranch() {
        return accountBranch;
    }

    public void setAccountBranch(String accountBranch) {
        this.accountBranch = accountBranch;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

class SavingsAccount extends Account {
    private double balance;

    public SavingsAccount(String accountName, String accountBranch, String accountNumber, double balance) {
        super(accountName, accountBranch, accountNumber);
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance is " + balance);
        }
    }
       
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new SavingsAccount("Ravi Varma", "Kumar", "1234567890", 1000.0);
        account.withdraw(500.0);
    }
}
